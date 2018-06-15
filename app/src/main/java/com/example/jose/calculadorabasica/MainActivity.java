package com.example.jose.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.numero1);
        num2=(EditText)findViewById(R.id.numero2);
        res=(TextView)findViewById(R.id.Resultado);
    }

    public void sumar(View v){

        if ((num1.getText().toString().trim().equalsIgnoreCase(""))||(num2.getText().toString().trim().equalsIgnoreCase(""))){
            res.setText("Error");
            Toast toast= Toast.makeText(this, "Complete ambos campos", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.show();
        }
        else {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double suma = n1 + n2;

            res.setText(suma + "");
        }
    }

    public void restar(View v){

        if ((num1.getText().toString().trim().equalsIgnoreCase(""))||(num2.getText().toString().trim().equalsIgnoreCase(""))){
            res.setText("Error");
            Toast toast= Toast.makeText(this, "Complete ambos campos", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.show();
        }
        else {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double resta = n1 - n2;

            res.setText(resta + "");
        }

    }

    public void multiplicar(View v){

        if ((num1.getText().toString().trim().equalsIgnoreCase(""))||(num2.getText().toString().trim().equalsIgnoreCase(""))){
            res.setText("Error");
            Toast toast= Toast.makeText(this, "Complete ambos campos", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.show();
        }
        else {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double mul = n1 * n2;

            res.setText(mul + "");
        }
    }

    public void dividir(View v){

        if ((num1.getText().toString().trim().equalsIgnoreCase(""))||(num2.getText().toString().trim().equalsIgnoreCase(""))){
            res.setText("Error");
            Toast toast= Toast.makeText(this, "Complete ambos campos", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.show();
        }
        else {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double aviso = 0;
            double div = n1 / n2;
            if (n2 == 0) {
                res.setText("Error");
                Toast toast= Toast.makeText(this, "No se puede dividir entre 0.", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
            } else
                res.setText(div + "");
        }
    }
}