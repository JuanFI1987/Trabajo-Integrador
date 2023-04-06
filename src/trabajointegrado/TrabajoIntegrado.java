
package trabajointegrado;

import java.util.ArrayList;
import static trabajointegrado.lecturaArchivosCSV.obtener;



public class TrabajoIntegrado {


    public static void main(String[] args) {
        ArrayList<Partido> partidos = obtener();
        for(int x=0; x < partidos.size(); x++){
            Partido partido = partidos.get(x);
            System.out.println(partido.getEquipo1() + partido.getGolesEquipo1() + " vs " + partido.getGolesEquipo2()+ partido.getEquipo2());
        }
        
    }
    
}
