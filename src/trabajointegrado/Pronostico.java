package trabajointegrado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pronostico {
    private String equipo1;
    private String ganador1;
    private String empate;
    private String ganador2;
    private String equipo2;
        
    public Partido(String equipo1, String ganador1, String empate, String ganador2, String equipo2){
        this.equipo1 = equipo1;
        this.ganador1 = ganador1;
        this.empate = empate;
        this.ganador2 = ganador2;
        this.equipo2 = equipo2;
    }

    public String getEquipo1() {
        return this.equipo1;
    }

    public String getEquipo2() {
        return this.equipo2;
    }

    public int getGanador1() {
        return this.ganador1;
    }
    
    public int getEmpate() {
        return this.empate;
    }

    public int getGanador2() {
        return this.ganador2;
    }

