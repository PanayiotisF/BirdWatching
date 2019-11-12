package com.example.birdwatching;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText editTextName,editTextZipCode, editTextBirdName;
Button buttonSubmit, buttonGoToSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextBirdName = findViewById(R.id.editTextBirdName);
        editTextZipCode = findViewById(R.id.editTextZipCode);
        buttonGoToSearch = findViewById(R.id.buttonGoToSearch);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(this);
        buttonGoToSearch.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //you don't need to write path you just have to put write "Bird" and (path) will appear automatically
        final DatabaseReference myRef = database.getReference("Bird");

        if(buttonSubmit == v) {
            String name = editTextName.getText().toString();
            String birdName = editTextBirdName.getText().toString();
            String zipCode = editTextZipCode.getText().toString();

            Bird myBird = new Bird(name,birdName,zipCode);
            myRef.push().setValue(myBird);


        } else if(buttonGoToSearch == v){

            }
        }
    }
