package com.example.jogodacapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    List<Object> citysAndStates = new ArrayList<Object>();
    int[] num = new int[5];
    Random r;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountListCityAndStates();
        sortNumbers();

        TextView estado1 = findViewById(R.id.estado1);
        TextView estado2 = findViewById(R.id.estado2);
        TextView estado3 = findViewById(R.id.estado3);
        TextView estado4 = findViewById(R.id.estado4);
        TextView estado5 = findViewById(R.id.estado5);

        estado1.setText(String.valueOf(((CitysAndStates) citysAndStates.get(num[0])).getStateName()));
        estado2.setText(String.valueOf(((CitysAndStates) citysAndStates.get(num[1])).getStateName()));
        estado3.setText(String.valueOf(((CitysAndStates) citysAndStates.get(num[2])).getStateName()));
        estado4.setText(String.valueOf(((CitysAndStates) citysAndStates.get(num[3])).getStateName()));
        estado5.setText(String.valueOf(((CitysAndStates) citysAndStates.get(num[4])).getStateName()));
    }

    public void mountListCityAndStates() {
        citysAndStates.add(new CitysAndStates("Curitiba", "Paraná"));
        citysAndStates.add(new CitysAndStates("São Paulo", "São Paulo"));
        citysAndStates.add(new CitysAndStates("Rio de Janeiro", "Rio de Janeiro"));
        citysAndStates.add(new CitysAndStates("Porto Alegre", "Rio Grande do Sul"));
        citysAndStates.add(new CitysAndStates("Florianópolis", "Santa Catarina"));
        citysAndStates.add(new CitysAndStates("Belo Horizonte", "Minas Gerais"));
        citysAndStates.add(new CitysAndStates("Vitória", "Espírito Santo"));
        citysAndStates.add(new CitysAndStates("Recife", "Pernambuco"));
        citysAndStates.add(new CitysAndStates("Natal", "Rio Grande do Norte"));
        citysAndStates.add(new CitysAndStates("Belém", "Pará"));
    }

    public void sortNumbers() {
        r = new Random();
        for(int i = 0; i <= 4; i++) {
            num[i] = r.nextInt(5) + 1;
        }
    }

    public void resposta(View view) {
        EditText city1 = findViewById(R.id.inputCity1);
        EditText city2 = findViewById(R.id.inputCity2);
        EditText city3 = findViewById(R.id.inputCity3);
        EditText city4 = findViewById(R.id.inputCity4);
        EditText city5 = findViewById(R.id.inputCity5);
        TextView resposta = findViewById(R.id.result);

        if(city1.getText().toString().equals(((CitysAndStates) citysAndStates.get(num[0])).getCityName())) {
            result ++;
        }

        if(city2.getText().toString().equals(((CitysAndStates) citysAndStates.get(num[1])).getCityName())) {
            result ++;
        }

        if(city3.getText().toString().equals(((CitysAndStates) citysAndStates.get(num[2])).getCityName())) {
            result ++;
        }

        if(city4.getText().toString().equals(((CitysAndStates) citysAndStates.get(num[3])).getCityName())) {
            result ++;
        }

        if(city5.getText().toString().equals(((CitysAndStates) citysAndStates.get(num[4])).getCityName())) {
            result ++;
        }

        resposta.setText("Voce acertou " + String.valueOf(result));
    }

}
