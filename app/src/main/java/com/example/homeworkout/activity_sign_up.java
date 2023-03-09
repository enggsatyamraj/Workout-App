package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//3rd page
public class activity_sign_up extends AppCompatActivity {

    FirebaseDatabase rootnode;
    DatabaseReference reference;
    Button callSignUp , go;
    Animation top_animation, bottom_animation;
    ImageView my_applogo;
    TextView welcome , signuptostart;
    TextInputLayout name1 , username1 ,email1 , phone1 , password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Animation
        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        callSignUp = (Button) findViewById(R.id.callSignUp);
        go = (Button) findViewById(R.id.go);
        my_applogo = (ImageView) findViewById(R.id.my_applogo);
        welcome = (TextView) findViewById(R.id.welcome);
        signuptostart = (TextView) findViewById(R.id.signuptostart);
        name1 = findViewById(R.id.name);
        username1 =  findViewById(R.id.username);
        email1 = findViewById(R.id.email);
        phone1 = findViewById(R.id.phone);
        password1 =  findViewById(R.id.password);

        //Setting Animation(Bottom_animation):-
        callSignUp.setAnimation(bottom_animation);
        go.setAnimation(bottom_animation);
        name1.setAnimation(bottom_animation);
        username1.setAnimation(bottom_animation);
        email1.setAnimation(bottom_animation);
        phone1.setAnimation(bottom_animation);
        password1.setAnimation(bottom_animation);

        //Setting Top_animation:-
        my_applogo.setAnimation(top_animation);
        welcome.setAnimation(top_animation);
        signuptostart.setAnimation(top_animation);





            go.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rootnode = FirebaseDatabase.getInstance();
                    reference = rootnode.getReference("users");

                    if (!validateName() || !validateEmail() || !validatePassword() || !validatePhoneNo() || !validateUsername()){
                        return;
                    }

                    String name = name1.getEditText().getText().toString();
                    String username = username1.getEditText().getText().toString();
                    String email = email1.getEditText().getText().toString();
                    String phoneNo = phone1.getEditText().getText().toString();
                    String password = password1.getEditText().getText().toString();

                    UserHelperClass helperclass = new UserHelperClass(name , username , email , phoneNo , password);
                    reference.child(phoneNo).setValue(helperclass);
                }
            });

        callSignUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_sign_up.this , whatIsYourGoal.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private Boolean validateName() {
        String val = name1.getEditText().getText().toString();

        if (val.isEmpty()){
            name1.setError("Field cannot be empty");
            return false;
        }
        else{
            name1.setError(null);
            name1.setErrorEnabled(false);
            return true;
        }
    };
    private Boolean validateUsername(){
        String val = username1.getEditText().getText().toString();
        String noWhiteSpace = "\\A\\w{4,20}\\z";

        if (val.isEmpty()){
            username1.setError("Field cannot be empty");
            return false;
        }
        else if(val.length()>=15){
            username1.setError("Username cannot be empty");
            return false;
        }
        else if(!val.matches(noWhiteSpace)){
            username1.setError("White spaces are not allowed");
            return false;
        }
        else{
            username1.setError(null);
            username1.setErrorEnabled(false);
            return true;
        }
    };
    private Boolean validateEmail(){
        String val = email1.getEditText().getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (val.isEmpty()){
            email1.setError("Field cannot be empty");
            return false;
        }
        else if(!val.matches(emailPattern)){
            email1.setError("Invalid email address");
            return false;
        }
        else{
            email1.setError(null);
            email1.setErrorEnabled(false);
            return true;
        }
    };
    private Boolean validatePhoneNo(){
        String val = phone1.getEditText().getText().toString();

        if (val.isEmpty()){
            phone1.setError("Field cannot be empty");
            return false;
        }
        else{
            phone1.setError(null);
            phone1.setErrorEnabled(false);
            return true;
        }
    };
    private Boolean validatePassword(){
        String val = password1.getEditText().getText().toString();
        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                "(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (val.isEmpty()){
            password1.setError("Field cannot be empty");
            return false;
        }
        else if(!val.matches(passwordVal)){
            password1.setError("Password is too weak");
            return false;
        }
        else{
            password1.setError(null);
            password1.setErrorEnabled(false);
            return true;
        }
    };
}