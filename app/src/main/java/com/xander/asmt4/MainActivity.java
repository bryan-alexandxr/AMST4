package com.xander.asmt4;
import static com.xander.asmt4.R.id.btnlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import
        android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {
    private EditText txtNombre, txtApellido, txtUsuario, txtPassword;
    private Button btnLogin, btnRegistro;


    FloatingActionsMenu grupodebotones;
    FloatingActionButton youtube, calendario, maps, grafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsuario = (EditText) findViewById(R.id.editUsuario);
        txtPassword = (EditText) findViewById(R.id.editClave);

        btnLogin = (Button) findViewById(btnlogin);
        btnRegistro = (Button) findViewById(R.id.btnregistrarse);

        grupodebotones = findViewById(R.id.grupoFlotante);
        youtube = findViewById(R.id.videoview);
        calendario = findViewById(R.id.calendarview);
        maps = findViewById(R.id.mapsview);
        grafico = findViewById(R.id.linealview);

        youtube.setOnClickListener(this::youtube);
        calendario.setOnClickListener(this::calendario);
        maps.setOnClickListener(this::maps);
        grafico.setOnClickListener(this::grafico);


    }

    public void registrarse(View view) {
        Intent intent = new Intent(this, formulario_registro.class);startActivity(intent);
    }

    public void login(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Usted no cuenta con un usuario", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClick(View v){
        if(v.getId() == btnlogin){
            Log.d("Mensaje", "ingreso");
        }
        else if(v.getId()==R.id.btnregistrarse){

        }
    }

    //Desafio

    public void youtube(View v){
        Intent intent = new Intent(this, Youtube.class);startActivity(intent);
    }
    public void calendario(View v){
        Intent intent = new Intent(this, Calendario.class);startActivity(intent);
    }
    public void maps(View v){
        Intent intent = new Intent(this, Maps.class);startActivity(intent);
    }
    public void grafico(View v){
        Intent intent = new Intent(this, Grafico.class);startActivity(intent);
    }

}