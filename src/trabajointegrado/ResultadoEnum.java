
package trabajointegrado;

import java.util.ArrayList;
import static trabajointegrado.lecturaArchivosCSV.obtener;


public class ResultadoEnum {
     private String resultado1;
     ArrayList<Partido> partidos = obtener();
     Partido partido1 = partidos.get(0);
        if (partido1.getGolesEquipo1()>partido1.getGolesEquipo2()){
            resultado1 = 'Ganador1';
        }
        else if(partido1.getGolesEquipo1()<partido1.getGolesEquipo2()){
            resultado1 = 'Ganador2';
        }
        else {
            resultado1 = 'Empate';
        }
    String resultado2;
     ArrayList<Partido> partidos = obtener();
     Partido partido2 = partidos.get(0);
        if (partido2.getGolesEquipo1()>partido2.getGolesEquipo2()){
            resultado2 = 'Ganador1';
        }
        else if(partido1.getGolesEquipo1()<partido1.getGolesEquipo2()){
            resultado2 = 'Ganador2';
        }
        else {
            resultado2 = 'Empate';
        }
    System.out.println(resultado1);
    System.out.println(resultado2);
    }
}
