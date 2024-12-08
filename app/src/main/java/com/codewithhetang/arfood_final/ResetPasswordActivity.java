package com.codewithhetang.arfood_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    private EditText resetEmailEditText;
    private Button resetPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password); // Ensure this matches your layout file

        resetEmailEditText = findViewById(R.id.reset_email);
        resetPasswordButton = findViewById(R.id.reset_password_button);

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = resetEmailEditText.getText().toString().trim();

                if (email.isEmpty()) {
                    Toast.makeText(ResetPasswordActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else {
                    // Here you can add your logic to handle the password reset, like sending a request to your server.
                    Toast.makeText(ResetPasswordActivity.this, "Password reset link sent to " + email, Toast.LENGTH_SHORT).show();
                    // Optionally, navigate back to the login screen
                    finish(); // Close this activity and return to the previous one
                }
            }
        });
    }
}
