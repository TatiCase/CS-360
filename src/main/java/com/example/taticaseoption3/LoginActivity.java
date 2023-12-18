package com.example.taticaseoption3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button LoginButton;
    DataBaseLogin DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmain);
        username = findViewById(R.id.username1);
        password = findViewById(R.id.password1);
        LoginButton = findViewById(R.id.login1);
        DB = new DataBaseLogin(this);
        LoginButton.setOnClickListener(view -> {

            String user = username.getText().toString();
            String pass = password.getText().toString();

            Boolean ValidatePassword = DB.VerifyLoginCred(user, pass);
            if(ValidatePassword==true) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(LoginActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

