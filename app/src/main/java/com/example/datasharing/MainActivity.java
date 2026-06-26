package com.example.datasharing;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.edittxt);
        btnsend = findViewById(R.id.btn);

        btnsend.setOnClickListener(view ->{
            String text = edit.getText().toString();
            if (text.isEmpty()){
                Toast.makeText(MainActivity.this,"Enter text to go to the second activity",Toast.LENGTH_SHORT).show();
            }else {

            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("text",text);
            startActivity(intent);
        }});
    }
    }