package com.freshcipher.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    EditText TextName;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextName = findViewById(R.id.text_name);
        Result = findViewById(R.id.text_results);
    }

    @SuppressLint("SetTextI18n")
    public void showName(View view){
        Result.setText("Nama Anda : " + TextName.getText());
        TextName.getText().clear();
    }
}