package com.example.opet.exercicio2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    private EditText editIdade;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editIdade = findViewById(R.id.editIdade);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void soma(View view){
        int limite = editIdade.getText().toString().length() > 0 ? Integer.parseInt( editIdade.getText().toString() ) : 0  ;
        String toShow;

        if(limite >= 8 && limite <= 12){

            toShow = "Categoria Infantil";
        } else if(limite >= 13 && limite <= 17) {

            toShow = "Categoria Juvenil";
        } else if(limite >= 18) {

            toShow = "Categoria Adulto";
        } else {
            toShow = "Idade Inválida";
        }

        textViewResult.setText(toShow);
    }
}
