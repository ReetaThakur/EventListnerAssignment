package com.example.eventlistnerassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editmsg;
    private Button button1;
    private TextView view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editmsg = findViewById(R.id.msg);
        editmsg.addTextChangedListener(textWatcher);
        button1=findViewById(R.id.btn1);
        view1=findViewById(R.id.view);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText("ButtonClicked");
            }
        });
    }


    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            Log.d("Masai School", "characters");
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.d("Masai School", "characters");

        }

        @Override
        public void afterTextChanged(Editable s) {
            Log.d("Masai School",s.toString());
            if(s.toString().length()>6){
                Toast.makeText(MainActivity.this,"MasaiSchool", Toast.LENGTH_LONG).show();
            }

        }

    };
}

