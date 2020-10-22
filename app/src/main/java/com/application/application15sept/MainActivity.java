package com.application.application15sept;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //generar un TAG para vincular mensaje entre activity
    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";



 //vincular componentes
    //Button btnEnviar = findViewById(R.id.btnEnviar);
    //EditText etMensaje = findViewById(R.id.etMensaje);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText etNombre = findViewById(R.id.etNombre),
                etEmail = findViewById(R.id.etEmail),
                etAsunto = findViewById(R.id.etAsunto),
                etMensaje = findViewById(R.id.etMensaje);
        final Intent enviarMensaje = new Intent(this, DisplayMessageActivity.class);
        String nombre = etNombre.getText().toString();
        String email = etEmail.getText().toString();
        String asunto = etAsunto.getText().toString();
        String mensaje = etMensaje.getText().toString();


        String message = "Nombre: " + nombre +
                "\nEmail: " + email +
                "\nAsunto: " + asunto +
                "\nMensaje: " + mensaje;

        enviarMensaje.putExtra(EXTRA_MESSAGE, message);
        startActivity(enviarMensaje);
    }


    public void LimpiarFormulario(View view){
        EditText etNombre = findViewById(R.id.etNombre),
                 etEmail = findViewById(R.id.etEmail),
                 etAsunto = findViewById(R.id.etAsunto),
                 etMensaje = findViewById(R.id.etMensaje);
        etNombre.setText("");
        etEmail.setText("");
        etAsunto.setText("");
        etMensaje.setText("");    }
}