package com.example.taticaseoption3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    Button AddButton, NotifyButton, ChangeButton, DeleteButton;
    EditText date, weight;
    ListView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AddButton = findViewById(R.id.guide);
        ChangeButton = findViewById(R.id.change);
        DeleteButton = findViewById(R.id.remove);
        NotifyButton = findViewById(R.id.Notify);
        date = findViewById(R.id.editTextDate);
        weight = findViewById(R.id.weight);
        log = findViewById(R.id.weight_list);

        DatabaseController databaseController = new DatabaseController(MainActivity.this);
        List<ViewModel> everyone = databaseController.GetAll();

        ArrayAdapter userArrayAdapter = new ArrayAdapter<ViewModel>(MainActivity.this, android.R.layout.simple_list_item_1, everyone);
        log.setAdapter(userArrayAdapter);



        AddButton.setOnClickListener(view -> {


            ViewModel viewModel;
            try {
                viewModel = new ViewModel(-1,
                        date.getText().toString(),
                        Integer.parseInt(weight.getText().toString()));
                Toast.makeText(MainActivity.this, viewModel.toString(), Toast.LENGTH_SHORT).show();
            }
            catch (Exception e) {
                viewModel = new ViewModel(-1, "error", 0);
            }

            DatabaseController databaseController12 = new DatabaseController(MainActivity.this);
            boolean success = databaseController12.Add(viewModel);
            Toast.makeText(MainActivity.this, "completed = " + success, Toast.LENGTH_SHORT).show();


        });

        DeleteButton.setOnClickListener(view -> {
            ViewModel viewModel;
            try {
                viewModel = new ViewModel(-1,
                        date.getText().toString(),
                        Integer.parseInt(weight.getText().toString()));
                Toast.makeText(MainActivity.this, viewModel.toString(), Toast.LENGTH_SHORT).show();
            }
            catch (Exception e) {
                viewModel = new ViewModel(-1, "error", 0);
            }

            DatabaseController databaseController1 = new DatabaseController(MainActivity.this);
            boolean success = databaseController1.Remove(viewModel);


        });
        NotifyButton.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Notify.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Notify button", Toast.LENGTH_SHORT).show();
        });




    }
}