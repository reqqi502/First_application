package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity2.this, "Add Informations Successfully", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity2.this, "ondestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(MainActivity2.this, "onPause", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(MainActivity2.this, "Pause", Toast.LENGTH_SHORT).show();
    }
}
