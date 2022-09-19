package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData extends AppCompatActivity {
    ImageButton homeBtn, profBtn;
    EditText tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);
        tanggal = (EditText) findViewById((R.id.tanggal));
        homeBtn =(ImageButton) findViewById(R.id.homeBtn);
        profBtn =(ImageButton) findViewById(R.id.profilepic);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home=new Intent(getApplicationContext(),MenuPage.class);
                startActivity(home);
            }
        });
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm, dd/MM/yyyy");
        tanggal.setText(dateFormat.format(new Date()));
    }
}