package com.example.birdwatching;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BirdSearch extends AppCompatActivity implements View.OnClickListener {

    EditText getEditTextZipCode, editTextBirdName;
    Button buttonSearch, buttonGotoReport;
    TextView TextViewBirdName, TextViewPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_search);
        getEditTextZipCode = findViewById(R.id.editTextZipCode);
        editTextBirdName = findViewById(R.id.editTextBirdName);
        buttonGotoReport = findViewById(R.id.buttonGotoReport);
        buttonSearch = findViewById(R.id.buttonSearch);
        TextViewBirdName = findViewById(R.id.textViewBirdName);
        TextViewPersonName = findViewById(R.id.textViewPersonName);

        buttonSearch.setOnClickListener(this);
        buttonGotoReport.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


    }
}
