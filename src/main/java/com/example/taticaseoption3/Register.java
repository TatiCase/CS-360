package com.example.taticaseoption3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText username, password;
    Button register, login;
    DataBaseLogin DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginreg);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
        DB = new DataBaseLogin(this);

        register.setOnClickListener(view -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();

            Boolean checkUser = DB.VerifyCred(user);
            if(checkUser==false){
                Boolean insert = DB.AddData(user, pass);
                if(insert==true){
                    Toast.makeText(Register.this, "Sign up complete", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
            else{
                Toast.makeText(Register.this, "User Already in DB", Toast.LENGTH_SHORT).show();
            }
        });
        login.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        });
    }
}
