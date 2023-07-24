package com.example.testingapp.networking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testingapp.R;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button myButton = findViewById(R.id.Button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ButtonActivity.this, ActivityRvProducts.class);
                startActivity(intent);
                Toast.makeText(ButtonActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}