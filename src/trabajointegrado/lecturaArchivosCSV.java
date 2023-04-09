
package trabajointegrado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class lecturaArchivosCSV {
    
    
    public static ArrayList<Partido> obtener(){
        final String archivoResultados = "resultados.csv";
        final String separadorComa = ";";
        //final String rutaDeAccesoResultados = "C:\\Users\\feder\\OneDrive\\Documents\\NetBeansProjects\\TrabajoIntegrado\\resultados.csv";
        //Path resultados = Paths.get(rutaDeAccesoResultados);
    
        ArrayList <Partido> partidos = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(archivoResultados);
            bufferedReader = new BufferedReader (fileReader);
            String linea;
            while((linea = bufferedReader.readLine()) !=null){
                //System.out.println(linea);
                String[] partidoComoArreglo = linea.split(separadorComa);
                    //for (String prueba : partidoComoArreglo){
                    //    System.out.println(prueba);
                    //}
                partidos.add(new Partido(partidoComoArreglo[0], Integer.valueOf(partidoComoArreglo[1]), Integer.valueOf(partidoComoArreglo[2]), partidoComoArreglo[3]));
                System.out.println(partidos);
            }
        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    if (bufferedReader != null){
                        bufferedReader.close();
                    }
            } catch (IOException e){
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            
        }
        return partidos;
    }
    
    public static ArrayList<Pronostico> obtenerPronostico() {
        final String archivoPronosticos = "pronostico.csv";
        final String separadorComa = ";";
        //final String rutaDeAccesoResultados = "C:\\Users\\feder\\OneDrive\\Documents\\NetBeansProjects\\TrabajoIntegrado\\resultados.csv";
        //Path resultados = Paths.get(rutaDeAccesoResultados);

        ArrayList<Pronostico> pronosticos = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(archivoPronosticos);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                //System.out.println(linea);
                String[] pronosticoComoArreglo = linea.split(separadorComa);
                //for (String prueba : partidoComoArreglo){
                //    System.out.println(prueba);
                //}
                pronosticos.add(new Pronostico(pronosticoComoArreglo[1].charAt(0), pronosticoComoArreglo[2].charAt(0), pronosticoComoArreglo[3].charAt(0) ));
                //System.out.println(pronosticos);
            }
        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            
        }
        return pronosticos;
    }
    
}
