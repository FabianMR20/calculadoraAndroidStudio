package com.neptunosl.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {

    PrintWriter operando;

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;
    private Button btnPunto;
    private Button btnIgual;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    public void boton0(){
        edit_numero_uno.append("0");
    }
    public void boton1(){
        edit_numero_uno.setText("1");
    }
    public void boton2(){
        edit_numero_uno.append("2");
    }
    public void boton3(){
        edit_numero_uno.append("3");
    }
    public void boton4(){
        edit_numero_uno.append("4");
    }
    public void boton5(){
        edit_numero_uno.append("5");
    }
    public void boton6(){
        edit_numero_uno.append("6");
    }
    public void boton7(){
        edit_numero_uno.append("7");
    }
    public void boton8(){
        edit_numero_uno.append("8");
    }
    public void boton9(){
        edit_numero_uno.append("9");
    }
    public void botonPunto(){
        edit_numero_uno.append(".");
    }
/*    public void botonIgual(){
        finish();
    }
    public void finish(){
        Intent salida=new Intent( Intent.ACTION_MAIN);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);






        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( suma( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( division( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicacion( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( resta( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }


}