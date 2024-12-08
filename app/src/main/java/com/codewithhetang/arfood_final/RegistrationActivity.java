package com.codewithhetang.arfood_final; // Update with your package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText email, password, rePassword;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Initialize UI elements
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.re_password);
        messageTextView = findViewById(R.id.message_text_view);

        Button registerButton = findViewById(R.id.register_button);
        Button registerWithGoogleButton = findViewById(R.id.register_with_google);
        Button loginButton = findViewById(R.id.login_button);

        // Implement Google registration logic
        registerWithGoogleButton.setOnClickListener(view -> {
            // Add your Google registration code here
            Toast.makeText(RegistrationActivity.this, "Google registration not implemented", Toast.LENGTH_SHORT).show();
        });

        // Implement registration logic
        registerButton.setOnClickListener(view -> {
            // Here you can add your actual registration logic
            // For now, we just display a success message
            showMessage("Registration Successful");
        });

        // Redirect to login activity
        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

    private void showMessage(String message) {
        messageTextView.setText(message);
        messageTextView.setVisibility(View.VISIBLE);

        // Hide the message after 3 seconds
        messageTextView.postDelayed(() -> messageTextView.setVisibility(View.GONE), 3000);
    }
}
