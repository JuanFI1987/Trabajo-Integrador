
package trabajointegrado;


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
    
    
    
}
