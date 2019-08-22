package com.example.biscoitodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> luckyPhrase = new ArrayList<String>();
    int num;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();
        num = r.nextInt(10) + 1;
        luckyPhrase.add("A vida trará coisas boas se tiveres paciência.");
        luckyPhrase.add("Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.");
        luckyPhrase.add("Não compense na ira o que lhe falta de razão.");
        luckyPhrase.add("Defeitos e virtudes são apenas dois lados da mesma moeda.");
        luckyPhrase.add("A maior de todas as começa no solo.");
        luckyPhrase.add("Não há que ser forte. Há que ser flexível.");
        luckyPhrase.add("Gente todo dia arruma os cabelos, por que não o coração ?");
        luckyPhrase.add("Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.");
        luckyPhrase.add("A juventude não é uma época da vida, é um estado de espírito.");
        luckyPhrase.add("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.");

        System.out.println("Número sorteado é " + num);
    }

    public void guess(View view) {
        TextView output = findViewById(R.id.luckyText);

        String phrase;
        phrase = luckyPhrase.get(num);
        output.setText(phrase);
    }
}
