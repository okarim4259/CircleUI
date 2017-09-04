package com.example.omar.circle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button signInButton;
    private Button signUpButton;

    private EditText userName;
    private EditText password;
    private String userNameVal, passwordVal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInButton = (Button)findViewById(R.id.signinbutton);
        userName = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        

    }

    public void signUpNewUser(View view){
        Intent signUpintent = new Intent(this, SignUpActivity.class);
        startActivity(signUpintent);

    }

    /**Called when user clicks signIn button**/
    public void goToMyProfile(View view){
        Intent goToProfile = new Intent(this, UserProfile.class);
        startActivity(goToProfile);
    }











}
