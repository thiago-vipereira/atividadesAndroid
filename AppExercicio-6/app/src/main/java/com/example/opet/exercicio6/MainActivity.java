package com.example.opet.exercicio6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private EditText editAlt1, editAlt2, editAlt3, editAlt4, editAlt5, editAlt6;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlt1 = findViewById(R.id.editAlt1);
        editAlt2 = findViewById(R.id.editAlt2);
        editAlt3 = findViewById(R.id.editAlt3);
        editAlt4 = findViewById(R.id.editAlt4);
        editAlt5 = findViewById(R.id.editAlt5);
        editAlt6 = findViewById(R.id.editAlt6);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calc(View view){
        Double altura1 = editAlt1.getText().toString().length() > 0 ? Double.parseDouble( editAlt1.getText().toString() ) : 0;
        Double altura2 = editAlt2.getText().toString().length() > 0 ? Double.parseDouble( editAlt2.getText().toString() ) : 0;
        Double altura3 = editAlt3.getText().toString().length() > 0 ? Double.parseDouble( editAlt3.getText().toString() ) : 0;
        Double altura4 = editAlt4.getText().toString().length() > 0 ? Double.parseDouble( editAlt4.getText().toString() ) : 0;
        Double altura5 = editAlt5.getText().toString().length() > 0 ? Double.parseDouble( editAlt5.getText().toString() ) : 0;
        Double altura6 = editAlt6.getText().toString().length() > 0 ? Double.parseDouble( editAlt6.getText().toString() ) : 0;

        if(altura1 == 0 || altura2 == 0 || altura3 == 0 || altura4 == 0 || altura5 == 0 || altura6 == 0 ){
            textViewResult.setText("Falta inserir corretamente alguma altura");
        } else {
            Double media = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6) / 6;

            List<Double> numeros = new ArrayList<Double>();
            numeros.add(altura1);
            numeros.add(altura2);
            numeros.add(altura3);
            numeros.add(altura4);
            numeros.add(altura5);
            numeros.add(altura6);

            int tam = numeros.size();
            Double desvPadrao = 0D;
            for (Double vlr : numeros) {
                Double aux = vlr - media;
                desvPadrao += aux * aux;
            }
            Double mediaDesviosShow = Math.sqrt(desvPadrao / (tam - 1));

            textViewResult.setText("Média: "+ media + " Desvio Padrão: " + mediaDesviosShow );
        }
    }
}
