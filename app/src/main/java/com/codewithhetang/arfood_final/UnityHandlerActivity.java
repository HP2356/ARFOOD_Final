package com.codewithhetang.arfood_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.unity3d.player.UnityPlayerActivity;

public class UnityHandlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_unity_handler);

        // Initialize the Italian button
        Button italianButton = findViewById(R.id.button_italian);

        // Set a click listener on the Italian button
        italianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Unity platform (launch UnityPlayerActivity)
                Intent intent = new Intent(UnityHandlerActivity.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });

        // Handle window insets for system bars (like status bar, navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        // UnityPlayer.pause() would be needed if you had a UnityPlayer instance here.
        // Since UnityPlayerActivity handles its lifecycle, it's not required in this class.
    }

    @Override
    protected void onResume() {
        super.onResume();
        // UnityPlayer.resume() would be needed if you had a UnityPlayer instance here.
        // Since UnityPlayerActivity handles its lifecycle, it's not required in this class.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // UnityPlayer.quit() would be needed if you had a UnityPlayer instance here.
        // Since UnityPlayerActivity handles its lifecycle, it's not required in this class.
    }
}
