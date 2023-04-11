
package trabajointegrado;

import java.util.ArrayList;
import static trabajointegrado.lecturaArchivosCSV.obtener;
import static trabajointegrado.lecturaArchivosCSV.obtenerPronostico;



public class TrabajoIntegrado {


    public static void main(String[] args) {
        
        System.out.println("El resultado de los partidos fue: ");       
                
        ArrayList<Partido> partidos = obtener();
        for(int x=0; x < partidos.size(); x++){
            Partido partido = partidos.get(x);
            System.out.println(partido.getEquipo1() + " " + partido.getGolesEquipo1() + " vs " + partido.getGolesEquipo2()+ " " + partido.getEquipo2());
        }
        /*
        ArrayList<Pronostico> pronosticos = obtenerPronostico();
        for(int x=0; x < pronosticos.size(); x++){
            Pronostico pronostico = pronosticos.get(x);
            System.out.println(pronostico.getGanador1() + " - " + pronostico.getGanador2() + " - " + pronostico.getEmpate());
        }
        */
        
        System.out.println("Tu puntaje total es de: " + Pronostico.calcularPuntajePronostico());
    }
    
}
