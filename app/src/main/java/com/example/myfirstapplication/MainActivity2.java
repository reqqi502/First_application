package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView nom , prenom , address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        nom = findViewById(R.id.textViewnamess);
        prenom = findViewById(R.id.textprenoom);
        address = findViewById(R.id.textaddreees);

        String names = getIntent().getStringExtra("noms");
        String prenome = getIntent().getStringExtra("prenoms");
        String addresss = getIntent().getStringExtra("addresss");

        nom.setText(names);
        prenom.setText(prenome);
        address.setText(addresss);

    }
}