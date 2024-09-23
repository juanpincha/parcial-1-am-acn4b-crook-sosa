package com.example.appturnos;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
                new Turno("Tomás Sosa - 41684756", "8:00 AM - 9:00 AM", "Dirección 1"),
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
            turnoLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.turno_background));
            turnoLayout.setPadding(20, 30, 20, 30);

            // Crea un GradientDrawable
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(this, R.color.turno_background)); // Establece el color de fondo
            drawable.setCornerRadius(20f); // Establece el radio de las esquinas (20dp en este caso)
            drawable.setStroke(2, ContextCompat.getColor(this, R.color.black)); // Establece el borde (2px de grosor, color negro)

            turnoLayout.setBackground(drawable);

            TextView titulo = new TextView(this);
            titulo.setText(turno.getTitulo());
            titulo.setTextSize(18f);
            titulo.setTextColor(ContextCompat.getColor(this, R.color.white));
            titulo.setTypeface(null, Typeface.BOLD);

            TextView subtitulo = new TextView(this);
            subtitulo.setText(turno.getHorario());
            subtitulo.setTextSize(16f);
            subtitulo.setTextColor(ContextCompat.getColor(this, R.color.white));


            TextView body = new TextView(this);
            body.setText(turno.getDireccion());
            body.setTextSize(14f);
            body.setTextColor(ContextCompat.getColor(this, R.color.white));


            turnoLayout.addView(titulo);
            turnoLayout.addView(subtitulo);
            turnoLayout.addView(body);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(50, 10, 50, 0);
            turnoLayout.setLayoutParams(layoutParams);

            container.addView(turnoLayout);
        }
    }
}
