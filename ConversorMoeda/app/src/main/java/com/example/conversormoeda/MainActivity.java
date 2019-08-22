package com.example.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        RadioButton toDolar = findViewById(R.id.radioDolar);
        EditText input = findViewById(R.id.inputedValue);
        TextView output = findViewById(R.id.result);

        if(input.length() == 0) {
            Toast.makeText( this, "Forneça um valor !", Toast.LENGTH_LONG).show();
            return;
        }

        double inputValue = Double.parseDouble(input.getText().toString());
        if(toDolar.isChecked()) {
            output.setText("Resultado : " + String.valueOf(RealToDolar(inputValue)));
        } else {
            output.setText("Resultado : " + String.valueOf(RealToEuro(inputValue)));
        }

    }

    private double RealToDolar(double real) {
        return real * 3.80;
    }

    private double RealToEuro(double real) {
        return real * 4.60;
    }
}
