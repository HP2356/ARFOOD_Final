package com.codewithhetang.arfood_final; // Update with your package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BlankActivity extends AppCompatActivity {

    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        messageTextView = findViewById(R.id.message_text_view);

        setButtonClickListener(R.id.button_italian, "Italian");
        setButtonClickListener(R.id.button_mexican, "Mexican");
        setButtonClickListener(R.id.button_chinese, "Chinese");
        setButtonClickListener(R.id.button_indian, "Indian");
        setButtonClickListener(R.id.button_japanese, "Japanese");
        setButtonClickListener(R.id.button_spanish, "Spanish");
    }

    private void setButtonClickListener(int buttonId, String cuisine) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("You selected " + cuisine + ". Best choice!");
            }
        });
    }

    private void showMessage(String message) {
        messageTextView.setText(message);
        messageTextView.setVisibility(View.VISIBLE);

        // Hide message after 3 seconds
        messageTextView.postDelayed(new Runnable() {
            @Override
            public void run() {
                messageTextView.setVisibility(View.GONE);
            }
        }, 3000);
    }
}
