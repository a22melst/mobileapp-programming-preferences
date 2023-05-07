package com.example.project;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText prefEditText;
    private Button savePref;
    private SharedPreferences preference;
    private SharedPreferences.Editor prefEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        prefEditText = new EditText(this);
        prefEditText = findViewById(R.id.editText);
        savePref = new Button(this);
        savePref = findViewById(R.id.savebtn);
        savePref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preference = getDefaultSharedPreferences(getApplicationContext());
                prefEditor = preference.edit();
                prefEditor.putString("PreferenceString", prefEditText.getText().toString());
                prefEditor.apply();
            }
        });




    }


}