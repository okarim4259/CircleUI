package com.example.omar.circle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    private static final String TAG = "SignUpActivity";

    private Button submitButton;
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText password;

    private String firstNameVal, lastNameVal, emailVal, passwordVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        submitButton = (Button)findViewById(R.id.submitButton);
        firstName = (EditText)findViewById(R.id.firstname);
        lastName = (EditText)findViewById(R.id.lastname);
        email = (EditText)findViewById(R.id.emailAddress);
        password = (EditText)findViewById(R.id.password);

        submitButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        firstNameVal = firstName.getText().toString();
                        lastNameVal = lastName.getText().toString();
                        emailVal = email.getText().toString();
                        passwordVal = password.getText().toString();


                        Log.v(TAG, firstNameVal);
                        Log.v(TAG, lastNameVal);
                        Log.v(TAG, emailVal);
                        Log.v(TAG, passwordVal);

                    }
                });
    } //End of onCreate Method
}
