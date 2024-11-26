package com.example.myfirstapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Result;
    private EditText Peso;
    private EditText Altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = findViewById(R.id.Result);
        Peso = findViewById(R.id.Peso);
        Altura = findViewById(R.id.Altura);



    }

    public void Calculo(View view) {

        double peso = Double.parseDouble(Peso.getText().toString());
        double altura = Double.parseDouble(Peso.getText().toString());
        double result = peso / (altura * altura);


        if (result < 19){
            Result.setText("Abaixo do Peso");
        }

        else if (result > 19 && result < 25) {
            Result.setText("Peso normal");
        }
        else {
            Result.setText("Acima do peso");
        }
    }
}