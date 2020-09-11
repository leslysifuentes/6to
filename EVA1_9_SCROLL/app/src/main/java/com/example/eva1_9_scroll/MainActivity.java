package com.example.eva1_9_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_menasaje;
    final String mostrar = "¿Sabías que en México 1 millón 600 mil niños tienen Trastorno de Déficit de Atención e Hiperactividad (TDAH)?  Es decir, que un 6% de la población de menores entre 6 a 16 años tiene TDAH y de ese 6% solo el 8% es atendido. Se indica que 3 a 5% de los niños en edad escolar pueden recibir este diagnóstico, incluso de una manera más sencilla de diagnosticar, ya que es la edad en la que se refleja más en sus actitudes. Se dice que el TDAH tiene más prevalencia en niños que en niñas. Esto genera un grave problema, ya que esas actitudes también se reflejan en la adultez, debido a que es un trastorno que no se cura, solo se controla. Para esto es necesario el consumo de ciertos medicamentos en conjunto con ejercicios cognitivos y de acuerdo a las estadísticas no todos los niños son atendidos, ya sea por falta de información o por cuestiones económicas. \n" +
            "\n" +
            "El TDAH es un trastorno neurológico que se origina en la infancia, este implica un patrón de déficit de atención, hiperactividad y/o impulsividad. Pero, aunque este se origine en la infancia se sigue teniendo toda la vida, aún en la vida adulta, por eso es importante que las personas con TDAH inicien sus tratamientos desde la niñez, pero no todos tienen las posibilidades. \n" +
            "\n" +
            "Los síntomas de este trastorno pueden variar depende de la persona, pero hay algunos síntomas que son más frecuentes en la mayoría de las personas. Algunos de estos síntomas son la falta de atención predominante, es decir les cuesta enfocarse, poner atención ante cualquier situación y esto suele ser un problema en cuestión de enseñanza, algunas personas suelen tener problemas a la hora de organizar tareas y actividades debido a que se distraen con cualquier cosa, aparte evitan actividades que requieran esfuerzo mental, como la tarea y tienen problemas para seguir instrucciones. Tienden a presentar una conducta hiperactiva/impulsiva predominante, esto se refiere a la manera en que las personas con TDAH actúan, es decir, todo el tiempo pueden estar activas debido a la hiperactividad y causar problemas a las demás personas.\n" +
            "\n" +
            "En México existe un gran número de personas que no le dan tanta importancia a la salud mental como a la salud física, algunos padres de familia no le presten tanta atención al comportamiento de sus hijos y piensen que es normal esas actitudes en un menor y no toman las medidas necesarias o simplemente después de un tiempo en tratamiento lo suspenden y afectan el método de aprendizaje de sus hijos, y en algunos casos, provocando que en un futuro se les dificulte aún más aprender cosas nuevas. Estos niños tienen una mayor dificultad en la edad adulta y es por eso que en este proyecto nos queremos enfocar más en crear un software que sea capaz de brindar ayuda a las personas adultas con TDAH, para que sea un apoyo para las terapias y que les ayude a organizarse y enfocarse más en lo que estén haciendo.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_menasaje = findViewById(R.id.tv_mensaje);
        tv_menasaje.setText(mostrar);
    }
}
