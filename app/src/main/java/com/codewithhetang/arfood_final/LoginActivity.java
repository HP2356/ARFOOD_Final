package com.codewithhetang.arfood_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button submitButton;
    private Button forgotPasswordButton; // Add this line

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Ensure this matches your layout file

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        submitButton = findViewById(R.id.submit_button);
        forgotPasswordButton = findViewById(R.id.forgot_password_button); // Initialize the Forgot Password button

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // You can add validation here if needed
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Optional: Add any validation logic here
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Redirect to BlankActivity
                    Intent intent = new Intent(LoginActivity.this, BlankActivity.class);
                    startActivity(intent);
                    finish(); // Optional: Close the current activity
                }
            }
        });

        // Set up the click listener for the Forgot Password button
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onForgotPasswordClicked(v);
            }
        });
    }

    public void onForgotPasswordClicked(View view) {
        Intent intent = new Intent(this, ResetPasswordActivity.class);
        startActivity(intent);
    }
}
