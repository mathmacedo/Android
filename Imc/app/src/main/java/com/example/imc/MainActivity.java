package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleCalcular(View view) {
        EditText inputPeso = findViewById(R.id.inputPeso);
        EditText inputAltura = findViewById(R.id.inputAltura);
        RadioButton homem = findViewById(R.id.radioHomen);
        TextView resultado = findViewById(R.id.resultado);

        double peso = Double.parseDouble(inputPeso.getText().toString());
        double altura = Double.parseDouble(inputAltura.getText().toString());
        double imc = calcImc(peso, altura);
        String msg;

        if(homem.isChecked()) {
            if(imc < 20.7) {
                msg = "Abaixo do peso";
            } else if(imc >= 20.8 && imc <= 26.4) {
                msg = "No peso normal";
            } else if(imc >= 26.5 && imc <= 27.8) {
                msg = "Marginalmente acima do peso";
            } else if(imc >= 27.9 && imc <= 31.1) {
                msg = "Acima do peso ideal";
            } else {
                msg = "Obeso";
            }
        } else {
            if(imc < 19.1) {
                msg = "Abaixo do peso";
            } else if(imc >= 19.2 && imc <= 25.8) {
                msg = "No peso normal";
            } else if(imc >= 25.9 && imc <= 27.3) {
                msg = "Marginalmente acima do peso";
            } else if(imc >= 27.4 && imc <= 32.3) {
                msg = "Acima do peso ideal";
            } else {
                msg = "Obeso";
            }
        }

        resultado.setText("Seu IMC é" + imc + " e voce está " +  msg);
    }

    public double calcImc(double peso, double altura) {
        double imc = (peso/(altura * altura));
        return imc;
    }
}
