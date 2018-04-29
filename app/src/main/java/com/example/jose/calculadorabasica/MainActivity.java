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

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int suma=n1+n2;

        res.setText(suma+"");
    }

    public void restar(View v){

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int resta=n1-n2;

        res.setText(resta+"");

    }

    public void multiplicar(View v){

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int mul=n1*n2;

        res.setText(mul+"");
    }

    public void dividir(View v){

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int aviso=0;
        if (n2!=0){
            int div = n1 / n2;
            res.setText(div+"");
        }
        else
            res.setText("Error");
            mostrar(aviso);
    }

    private void mostrar(int res){

        Toast toast= Toast.makeText(this, "No se puede dividir entre 0.", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();
    }
}
