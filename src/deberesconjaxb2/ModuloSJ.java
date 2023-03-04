/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberesconjaxb2;

/**
 *
 * @author Ryzen
 */
public class ModuloSJ {
        String nombre;
    AlumnoSJ[] alumno;
    
    ModuloSJ(){
    alumno = new AlumnoSJ[3]; //crear un array de 3 alumnos
    }
    
    ModuloSJ(String n){
        this.nombre = n;
    }
    
    String getNombre(){
        return nombre;
    }
    
    void setNombre(String n){
        nombre = n;
    }
    
    AlumnoSJ[] getAlumno(){
        return alumno;
    }
    
    void setAlumno(AlumnoSJ a, int posicion){
       alumno[posicion] = a; 
    }
    
    void setAlumno1(AlumnoSJ a){
        alumno[0] = a;
    }
    
    void setAlumno2(AlumnoSJ a){
        alumno[1] = a;
    }
    
    void setAlumno3(AlumnoSJ a){
        alumno[2] = a;
    }
}
