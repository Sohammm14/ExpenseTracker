package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    private TextView email,pass,reg2;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        registrationdetails();
    }
    private void registrationdetails()
    {
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        button2=findViewById(R.id.button2);
        reg2=findViewById(R.id.reg2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String remail=email.getText().toString().trim();
                String rpass=pass.getText().toString().trim();

                if (TextUtils.isEmpty(remail))
                {
                    email.setError("Enter a username");
                }
                if (TextUtils.isEmpty(rpass))
                {
                    pass.setError("Enter password");
                }
            }
        });
        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Registration.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}