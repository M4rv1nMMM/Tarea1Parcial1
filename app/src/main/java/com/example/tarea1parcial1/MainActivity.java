package com.example.tarea1parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etxtNum1;
    private EditText etxtNum2;
    private TextView etxtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtNum1 = (EditText) findViewById(R.id.txtNum1);
        etxtNum2 = (EditText) findViewById(R.id.txtNum2);
        etxtResultado = (TextView) findViewById(R.id.lblResultado);
    }

    //este metodo hace la suma
    public void Sumar(View view){
        String valor1 = etxtNum1.getText().toString();
        String valor2 = etxtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = "Resultado: " + String.valueOf(suma);
        etxtResultado.setText(result);
    }
    //este metodo hace la resta
    public void Restar(View view){
        String valor1 = etxtNum1.getText().toString();
        String valor2 = etxtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 - num2;

        String result = "Resultado: " + String.valueOf(suma);
        etxtResultado.setText(result);
    }
    //este metodo hace la multiplicacion
    public void Multi(View view){
        String valor1 = etxtNum1.getText().toString();
        String valor2 = etxtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 * num2;

        String result = "Resultado: " + String.valueOf(suma);
        etxtResultado.setText(result);
    }
    //este metodo hace la division
    public void Dividir(View view){
        String valor1 = etxtNum1.getText().toString();
        String valor2 = etxtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 / num2;

        String result = "Resultado: " + String.valueOf(suma);
        etxtResultado.setText(result);
    }
}