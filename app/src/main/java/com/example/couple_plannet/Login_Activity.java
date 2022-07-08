package com.example.couple_plannet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView tv_register=findViewById(R.id.tv_register);

        TextView tv_forgotpassword=findViewById(R.id.tv_forgot_password);

        Button btn_login=findViewById(R.id.btn_login);

        EditText edtpassword=findViewById(R.id.edt_pass);


        ImageView imageshowHidepwd = findViewById(R.id.img_pass_show);

        imageshowHidepwd.setImageResource(R.drawable.ic_baseline_eye);
        imageshowHidepwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtpassword.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())){
                    edtpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    imageshowHidepwd.setImageResource(R.drawable.ic_baseline_eye);

                }else {
                    edtpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    imageshowHidepwd.setImageResource(R.drawable.hidden_eye_icon);
                }
            }
        });

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_Activity.this,Register.class);
                startActivity(i);
            }
        });


        tv_forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this,Forgot_password.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login= new Intent(Login_Activity.this,Home_Activity.class);
                startActivity(login);
            }
        });
    }
}