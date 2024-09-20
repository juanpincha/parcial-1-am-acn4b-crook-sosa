package com.example.appturnos;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appturnos.models.Turno;

import java.util.Arrays;
import java.util.List;

public class Turnos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turnos);

        LinearLayout container = findViewById(R.id.linearTurnos);

        List<Turno> turnos = Arrays.asList(
                new Turno("Tomás Sosa - 41684756 #594525484", "8:00 AM - 9:00 AM", "Dirección 1"),
                new Turno("Turno 2", "9:00 AM - 10:00 AM", "Dirección 2"),
                new Turno("Turno 3", "10:00 AM - 11:00 AM", "Dirección 3"),
                new Turno("Turno 4", "10:00 AM - 11:00 AM", "Dirección 4"),
                new Turno("Turno 5", "10:00 AM - 11:00 AM", "Dirección 5"),
                new Turno("Turno 6", "10:00 AM - 11:00 AM", "Dirección 6"),
                new Turno("Turno 7", "10:00 AM - 11:00 AM", "Dirección 7"),
                new Turno("Turno 8", "10:00 AM - 11:00 AM", "Dirección 8"),
                new Turno("Turno 9", "10:00 AM - 11:00 AM", "Dirección 9"),
                new Turno("Turno 10", "10:00 AM - 11:00 AM", "Dirección 10"),
                new Turno("Turno 11", "10:00 AM - 11:00 AM", "Dirección 11"),
                new Turno("Turno 12", "10:00 AM - 11:00 AM", "Dirección 12"),
                new Turno("Turno 13", "10:00 AM - 11:00 AM", "Dirección 13")
        );

        for (Turno turno : turnos) {
            LinearLayout turnoLayout = new LinearLayout(this);
            turnoLayout.setOrientation(LinearLayout.VERTICAL);

            TextView titulo = new TextView(this);
            titulo.setText(turno.getTitulo());
            titulo.setTextSize(18f);
            titulo.setTypeface(null, Typeface.BOLD);

            TextView subtitulo = new TextView(this);
            subtitulo.setText(turno.getHorario());
            subtitulo.setTextSize(16f);

            TextView body = new TextView(this);
            body.setText(turno.getDireccion());
            body.setTextSize(14f);

            turnoLayout.addView(titulo);
            turnoLayout.addView(subtitulo);
            turnoLayout.addView(body);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(40, 20, 0, 20);
            turnoLayout.setLayoutParams(layoutParams);

            container.addView(turnoLayout);
        }
    }
}
