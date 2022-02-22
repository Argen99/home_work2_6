package com.geektech.home_work2_6;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText, password;
    private LinearLayout container;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = findViewById(R.id.button);
        editText = findViewById(R.id.et_text);
        password = findViewById(R.id.et_password);
        container = findViewById(R.id.container);
        text = findViewById(R.id.tv_text1);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().trim().length()>0){
                    button.setBackgroundColor(Color.RED);
                }else {
                    button.setBackgroundColor(Color.GRAY);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("Admin") && password.getText().toString().equals("Admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались",
                            Toast.LENGTH_SHORT).show();
                    container.setVisibility(View.INVISIBLE);
                    text.setVisibility(View.INVISIBLE);
                }else{
                    Toast.makeText(MainActivity.this, "Вы ввели неправельный логин или пароль",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}