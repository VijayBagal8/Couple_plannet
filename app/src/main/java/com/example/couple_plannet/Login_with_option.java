package com.example.couple_plannet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login_with_option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_option);

        TextView tv_phonelogin=findViewById(R.id.tv_phone_login);
        TextView tv_emaillogin=findViewById(R.id.tv_email_login);
        TextView tv_fblogin=findViewById(R.id.tv_fb_login);

        TextView tv_register=findViewById(R.id.tv_register);

        tv_phonelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phonelogin= new Intent(Login_with_option.this,Login_Activity.class);
                startActivity(phonelogin);
            }
        });
        tv_emaillogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emaillogin= new Intent(Login_with_option.this,Login_Activity.class);
                startActivity(emaillogin);
            }
        });
        tv_fblogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fblogin= new Intent(Login_with_option.this,Login_Activity.class);
                startActivity(fblogin);
            }
        });
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Login_with_option.this,Register.class);
                startActivity(i);
            }
        });



    }
}