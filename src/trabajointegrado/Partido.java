
package trabajointegrado;

import java.util.ArrayList;
import trabajointegrado.ResultadoEnum.resultadoEnum;
import static trabajointegrado.lecturaArchivosCSV.obtener;


public class Partido {
    private String equipo1;
    private String equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    
    public Partido(String equipo1, int golesEquipo1, int golesEquipo2, String equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipo1() {
        return this.equipo1;
    }

    public String getEquipo2() {
        return this.equipo2;
    }

    public int getGolesEquipo1() {
        return this.golesEquipo1;
    }

    public int getGolesEquipo2() {
        return this.golesEquipo2;
    }
    
    public static resultadoEnum decidirResultado1() {

        ArrayList<Partido> partidos = obtener();
        Partido partido1 = partidos.get(0);
        if (partido1.getGolesEquipo1() > partido1.getGolesEquipo2()) {
            resultadoEnum resultado1 = resultadoEnum.GANA_EQUIPO_1;
            return resultado1;
        }
        else if (partido1.getGolesEquipo1() < partido1.getGolesEquipo2()) {
            resultadoEnum resultado1 = resultadoEnum.GANA_EQUIPO_2;
            return resultado1;
        }
        else {
            resultadoEnum resultado1 = resultadoEnum.EMPATE;
            return resultado1;
        }
    }
    
    public static resultadoEnum decidirResultado2() {
        
        ArrayList<Partido> partidos = obtener();
        Partido partido2 = partidos.get(1);
        if (partido2.getGolesEquipo1() > partido2.getGolesEquipo2()) {
            resultadoEnum resultado2 = resultadoEnum.GANA_EQUIPO_1;
            return resultado2;
        }
        else if (partido2.getGolesEquipo1() < partido2.getGolesEquipo2()) {
            resultadoEnum resultado2 = resultadoEnum.GANA_EQUIPO_2;
            return resultado2;
        }
        else {
            resultadoEnum resultado2 = resultadoEnum.EMPATE;
            return resultado2;
        }
    
    }
    
        
    
}
