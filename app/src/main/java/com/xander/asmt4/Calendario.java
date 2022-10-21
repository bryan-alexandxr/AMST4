package com.xander.asmt4;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class Calendario extends AppCompatActivity {
    CalendarView calendario;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        calendario = findViewById(R.id.calendario);
        texto = findViewById(R.id.txtView);

        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int anio, int mes, int dia) {
                String fecha = dia+"/"+mes+"/"+anio;
                texto.setText(fecha);
            }
        });
    }

}