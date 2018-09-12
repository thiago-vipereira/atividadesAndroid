package com.example.opet.exercicio7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText edit_a, edit_b, edit_c;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_a = findViewById(R.id.edit_a);
        edit_b = findViewById(R.id.edit_b);
        edit_c = findViewById(R.id.edit_c);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calc(View view){
        Float a = edit_a.getText().toString().length() > 0 ? Float.parseFloat( edit_a.getText().toString() ) : 0;
        Float b = edit_b.getText().toString().length() > 0 ? Float.parseFloat( edit_b.getText().toString() ) : 0;
        Float c = edit_c.getText().toString().length() > 0 ? Float.parseFloat( edit_c.getText().toString() ) : 0;
        Float delta, x1, x2;

        delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            textViewResult.setText(" x' = " + x1 + " e x'' = " + x2);
        } else {
            textViewResult.setText("Erro");
        }
    }
}
