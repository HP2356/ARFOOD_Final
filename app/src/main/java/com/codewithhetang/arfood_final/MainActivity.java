package com.codewithhetang.arfood_final; // Update with your package name

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username; // Changed from email to username for consistency
    private EditText password;
    private EditText rePassword;
    private Button registerButton; // Changed from submitButton to registerButton
    private Button registerWithGoogleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        startActivity(new Intent(this, UnityHandlerActivity.class));

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.re_password);
        registerButton = findViewById(R.id.register_button);
        registerWithGoogleButton = findViewById(R.id.register_with_google);

        // Registration button click listener
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if fields are filled
                String userInput = username.getText().toString().trim();
                String passInput = password.getText().toString().trim();
                String rePassInput = rePassword.getText().toString().trim();

                if (TextUtils.isEmpty(userInput) || TextUtils.isEmpty(passInput) || TextUtils.isEmpty(rePassInput)) {
                    Toast.makeText(MainActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                } else if (!passInput.equals(rePassInput)) {
                    Toast.makeText(MainActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    // Redirect to the blank page
                    Intent intent = new Intent(MainActivity.this, BlankActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Google registration button click listener
        registerWithGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // For now, show a simple toast for Google registration
                Toast.makeText(MainActivity.this, "Google registration not implemented", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
