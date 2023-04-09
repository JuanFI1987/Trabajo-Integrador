package trabajointegrado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import trabajointegrado.ResultadoEnum.resultadoEnum;
import static trabajointegrado.ResultadoEnum.resultadoEnum.EMPATE;
import static trabajointegrado.ResultadoEnum.resultadoEnum.GANA_EQUIPO_1;
import static trabajointegrado.ResultadoEnum.resultadoEnum.GANA_EQUIPO_2;
import static trabajointegrado.lecturaArchivosCSV.obtenerPronostico;

public class Pronostico {
    private Partido equipo1;//le cambié la clase por Partido en lugar de String para que no vuelva a crear un objeto porque ya existe.
    private char ganador1;
    private char empate;
    private char ganador2;
    private Partido equipo2;//le cambié la clase por Partido en lugar de String para que no vuelva a crear un objeto porque ya existe.
    
    
    public Pronostico(char ganador1, char empate, char ganador2){
        
        this.ganador1 = ganador1;
        this.empate = empate;
        this.ganador2 = ganador2;
        
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

    public static int calcularPuntajePronostico(){
        int puntaje = 0;
        ArrayList<Pronostico> pronosticos = obtenerPronostico();
        Pronostico pronostico1 = pronosticos.get(0);
        
        switch (Partido.decidirResultado1()){
            case GANA_EQUIPO_1 -> {
                if (pronostico1.ganador1 == 'x'){
                    puntaje += 1;
                }
            }
            case GANA_EQUIPO_2 -> {
                if (pronostico1.ganador2 == 'x'){
                    puntaje +=1;
                }
            }
            case EMPATE -> {
                if (pronostico1.empate == 'x'){
                    puntaje += 1;
                }
            }      
        }
        
        Pronostico pronostico2 = pronosticos.get(1);
        
        switch (Partido.decidirResultado2()){
            case GANA_EQUIPO_1 -> {
                if (pronostico2.ganador1 == 'x'){
                    puntaje += 1;
                }
            }
            case GANA_EQUIPO_2 -> {
                if (pronostico2.ganador2 == 'x'){
                    puntaje +=1;
                }
            }
            case EMPATE -> {
                if (pronostico2.empate == 'x'){
                    puntaje += 1;
                }
            }      
        }
        return puntaje;
    }
    
    }
