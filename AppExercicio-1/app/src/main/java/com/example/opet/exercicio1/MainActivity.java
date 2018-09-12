package com.example.opet.exercicio1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    private EditText editLimite, editPedido;
    private TextView textViewSaldo, textViewTotal;
    private Double saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saldo = 0.0;
        editLimite = findViewById(R.id.editLimite);
        editPedido = findViewById(R.id.editPedido);
        textViewSaldo = findViewById(R.id.textViewSaldo);
        textViewTotal = findViewById(R.id.textViewTotal);
    }

    public void soma(View view){
        double limite = editLimite.getText().toString().length() > 0 ? Double.parseDouble( editLimite.getText().toString() ) : 0.0  ;
        double pedido = editPedido.getText().toString().length() > 0 ? Double.parseDouble( editPedido.getText().toString() ) : 0.0  ;
        DecimalFormat mFormat = new DecimalFormat(".00" );
        String toShow;

        saldo = saldo + pedido;
        double resultado = limite - saldo;


        if(resultado <= 0){

            toShow = "Saldo NEGATIVO de: " + mFormat.format(resultado);
        } else {
            toShow = "Saldo positivo de: " + mFormat.format(resultado);
        }

        textViewTotal.setText("Total pedido de: "+  mFormat.format(saldo));
        textViewSaldo.setText(toShow);
        editPedido.setText("");
    }
}
