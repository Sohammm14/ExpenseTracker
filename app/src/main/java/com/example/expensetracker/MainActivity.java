package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text1,text2,reg;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        logindetails();
    }
    private void logindetails()
    {
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        reg=findViewById(R.id.reg);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lemail=text1.getText().toString().trim();
                String lpass=text2.getText().toString().trim();

                if (TextUtils.isEmpty(lemail))
                {
                    text1.setError("Enter a username");
                }
                if (TextUtils.isEmpty(lpass))
                {
                    text2.setError("Enter password");
                }
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Registration.class);
                startActivity(i);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
}