package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nom = (EditText) findViewById(R.id.editTextTextPersonName);
                EditText prenom = (EditText) findViewById(R.id.editetextprenom);
                EditText address = (EditText) findViewById(R.id.editetextAddress);

                String names =nom.getText().toString();
                String prenome =prenom.getText().toString();
                String addres =address.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("noms", nom.getText().toString());
                intent.putExtra("prenoms", prenom.getText().toString());
                intent.putExtra("addresss", address.getText().toString());
                startActivity(intent);
            }
        });

    }
}