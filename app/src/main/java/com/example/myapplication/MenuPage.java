package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuPage extends AppCompatActivity {
    ImageButton homeBtn, profBtn;
    Button inputDataBtn, patientHistoryBtn, contactDctrBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
        homeBtn =(ImageButton) findViewById(R.id.homeBtn);
        profBtn =(ImageButton) findViewById(R.id.profilepic);
        inputDataBtn =(Button) findViewById(R.id.menu_inputDataBtn);
        patientHistoryBtn =(Button) findViewById(R.id.menu_patientHistoryBtn);
        contactDctrBtn=(Button) findViewById(R.id.menu_contactDctrBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home=new Intent(getApplicationContext(),MenuPage.class);
                startActivity(home);

            }
        });
        inputDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login=new Intent(getApplicationContext(),InputData.class);
                startActivity(Login);

            }
        });
        patientHistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //nanti
            }
        });
        contactDctrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //nanti
            }
        });


        }
    }
