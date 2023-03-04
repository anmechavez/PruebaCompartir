/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberesconjaxb2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryzen
 */
public class Traspaso {
    
    
//PORQUE COÑO PONE AL ALUMNO BRUCE CON LAS NOTAS DEL ALUMNO BRUCE DEL MODULO M03. NO LO ENTIENDO
//1 COMENTA Y ENTIENDE TODO EL CODIGO
//2 PIENSA UNA SOLUCIÓN
//3 APLICA Y REVISA
//REVISA TODO Y MIRA LAS POSIBLES SOLUCIONES A ESTE PROBLEMA
//MIREMOS LA CLASE DE LA PROFE PORQUE NO ME VOY A QUEDAR CON ESTE PROBLEMA DE MIERDA PARA SIEMPRE
//DEJEMOSLO ESTAR. YA SABEMOS CUAL ES EL BUG. AHORA LO MEJOR QUE PUEDO HACER ES 
    static ModuloSJ M01, M02, M03;
    static AlumnoSJ Steve, Bruce, Bruce2, Bruce3, Tony,alumnoMultiforma;
    static String linea;
    static int ordenDeAlumnosM1;
    static int ordenDeAlumnosM3;
    static BufferedReader br;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Creamos las variables
        File datos = null;
        datos = new File("C:\\Users\\Ryzen\\Desktop\\M6\\notas.txt");

        M01 = new ModuloSJ();
        M02 = new ModuloSJ();
        M03 = new ModuloSJ();
        
        String variableDePruebaParaGIT = "";
        
        alumnoMultiforma = new AlumnoSJ();
        
        //Ejecución
        leerArchivo(datos);

    }

    //Metodo que lee el archivo y lo muestra por pantalla
    static void leerArchivo(File datos) throws FileNotFoundException, IOException {
        //Creamos el BufferedReader que nos servirá para leer el archivo
        //Y le pasamos por parametro el File para que pueda ser leido
        br = new BufferedReader(new FileReader(datos));
        //Leemos el archivo y lo mostramos por pantalla

        ordenDeAlumnosM1 = 0;
        ordenDeAlumnosM3 = 0;


        linea = br.readLine();

        //Este bucle funciona gracias a que cada vez que se llama a .readline() lee la siguiente linea de texto.
        while (linea != null) {

            if (linea.contains("M01")) {
                recorrerModulo(M01, 3);

            } else if (linea.contains("M02")) {
                recorrerModulo(M02, 1);

            } else if (linea.contains("M03")) {
                recorrerModulo(M03, 2); //EN LA EJECUCIÓN DEL M03 ESTA EL ERROR 
                //HAY QUE PROBAR A QUITAR EL CODIGO DE AHI Y EXPORTARLO A UN METODO DIFERENTE
                //POR EJEMPLO RECORRER MODULO 3
            }

            linea = br.readLine();

        }
        
        
        br.close();

        System.out.println("----------------------");
        System.out.println("Modulos inicializados:");

        System.out.println(M01.nombre);
        System.out.println(M01.alumno[0].nombre);
        System.out.println(M01.alumno[0].UF1);
        System.out.println(M01.alumno[0].UF2);
        System.out.println(M01.alumno[0].UF3);
        System.out.println(M01.alumno[1].nombre);
        System.out.println(M01.alumno[1].UF1);
        System.out.println(M01.alumno[1].UF2);
        System.out.println(M01.alumno[1].UF3);
        System.out.println(M01.alumno[2].nombre);
        System.out.println(M01.alumno[2].UF1);
        System.out.println(M01.alumno[2].UF2);
        System.out.println(M01.alumno[2].UF3);

        System.out.println("");
        System.out.println(M02.nombre);
        System.out.println(M02.alumno[0].nombre);
        System.out.println(M02.alumno[0].UF1);
        System.out.println(M02.alumno[0].UF2);
        System.out.println(M02.alumno[0].UF3);

        System.out.println("");
        System.out.println(M03.nombre);
        System.out.println(M03.alumno[0].nombre);
        System.out.println(M03.alumno[0].UF1);
        System.out.println(M03.alumno[0].UF2);
        System.out.println(M03.alumno[0].UF3);
        System.out.println(M03.alumno[1].nombre);
        System.out.println(M03.alumno[1].UF1);
        System.out.println(M03.alumno[1].UF2);
        System.out.println(M03.alumno[1].UF3);

    }
    static void recorrerModulo2(ModuloSJ m, int cantidadDeAlumnos) throws IOException {
        alumnoMultiforma = new AlumnoSJ();
        
        for(int i = 0; i<cantidadDeAlumnos;i++){
            if(i==0){
                System.out.println("-------------------");
                m.setNombre(linea.substring(12, 15));
                System.out.println(m.nombre);
                System.out.println("-------------------");
            }
            recorrerAlumno(m, alumnoMultiforma, ordenDeAlumnosM1);
            if((cantidadDeAlumnos-1)!=i){
                ordenDeAlumnosM1++;
            }
            
        }
    }

    static void recorrerModulo(ModuloSJ m, int cantidadDeAlumnos) throws IOException {
        alumnoMultiforma = new AlumnoSJ();
  
        switch (cantidadDeAlumnos) {
            case 1:
                System.out.println("-------------------");
                m.setNombre(linea.substring(12, 15));
                System.out.println(m.nombre);
               
                recorrerAlumno(m, alumnoMultiforma, 0);
                System.out.println("-------------------");
                break;
            case 2:
                switch (ordenDeAlumnosM3) {
                    case 0:
                        m.setNombre(linea.substring(12, 15));
                        System.out.println(m.nombre);
                        recorrerAlumno(m, alumnoMultiforma, ordenDeAlumnosM3); //Recorre todo el modulo que son solo 4 lineas
                        ordenDeAlumnosM3++;
                        break;
                    case 1:
                        recorrerAlumno(m, alumnoMultiforma, ordenDeAlumnosM3); //Recorre todo el modulo que son solo 4 lineas
                        break;
                }
                break;
            case 3:
                switch (ordenDeAlumnosM1) {
                    case 0:
                        m.setNombre(linea.substring(12, 15));
                        System.out.println(m.nombre);
                        recorrerAlumno(m, alumnoMultiforma, ordenDeAlumnosM1); //Recorre todo el modulo que son solo 4 lineas
                        ordenDeAlumnosM1++;
                        break;
                    case 1:
                        recorrerAlumno(m, alumnoMultiforma, ordenDeAlumnosM1); //Recorre todo el modulo que son solo 4 lineas
                        ordenDeAlumnosM1++;
                        break;
                    case 2:
                        recorrerAlumno(m, alumnoMultiforma, ordenDeAlumnosM1);
                        break;
                }
                break;
        }

    }

    //Recorre el modulo e inicializa el objeto alumno y el objeto modulo,
    //Lo que hay que hacer ahora es que pase para todos los modulos y todos los alumnos y los inicialize
    static void recorrerAlumno(ModuloSJ m, AlumnoSJ a, int posicion) throws IOException {
        for (int i = 0; i < 4; i++) {
            linea = br.readLine();
            switch (i) {
                case 0:
                    a.setNombre(linea);
                    System.out.println(a.getNombre());
                    break;
                case 1:
                    a.setUF1(Double.parseDouble(linea.substring(4, 8)));
                    System.out.println(a.getUF1());
                    break;
                case 2:
                    a.setUF2(Double.parseDouble(linea.substring(4, 8)));
                    System.out.println(a.getUF2());
                    break;
                case 3:
                    a.setUF3(Double.parseDouble(linea.substring(4, 8)));
                    System.out.println(a.getUF3());
                    m.setAlumno(a, posicion);
                    break;

            }

        }
    }

}
    

