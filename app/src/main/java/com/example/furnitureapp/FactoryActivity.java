package com.example.furnitureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        // Отримання повідомлення з першого екрану
        // та зберігаємо його у змінній message
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Через вказівник на компонент екрану textView2 передаємо текст
        TextView textView1 = (TextView)findViewById(R.id.textView);
        textView1.setText(message);
    }
}
