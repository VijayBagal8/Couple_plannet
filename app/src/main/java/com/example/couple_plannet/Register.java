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

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_login=findViewById(R.id.btn_login1);

        TextView tv_signin=findViewById(R.id.tv_signin);

        TextView tv_forgotpass=findViewById(R.id.tv_forgot_password);

        EditText edtpassword=findViewById(R.id.edt_pass);

        EditText edtconpassword=findViewById(R.id.edt_con_pass);


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

        ImageView imageshowHidepwd1 = findViewById(R.id.img_pass_show1);
        imageshowHidepwd1.setImageResource(R.drawable.ic_baseline_eye);
        imageshowHidepwd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtconpassword.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())){
                    edtconpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    imageshowHidepwd1.setImageResource(R.drawable.ic_baseline_eye);

                }else {
                    edtconpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    imageshowHidepwd1.setImageResource(R.drawable.hidden_eye_icon);
                }
            }
        });

        tv_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this,Login_with_option.class);
                startActivity(i);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login= new Intent(Register.this,Home_Activity.class);
                startActivity(login);
            }
        });
        tv_forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forpass= new Intent(Register.this,Forgot_password.class);
                startActivity(forpass);
            }
        });


    }
}