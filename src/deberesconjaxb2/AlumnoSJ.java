/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberesconjaxb2;

/**
 *
 * @author Ryzen
 */
public class AlumnoSJ {
    String nombre;
    //Tendriamos que poner un array de notas para cada modulo.
    //O mirate tambien la clase de la profe porque usa JAXB y no tienes ni puta idea de como coño funciona la mierda esa de JAXB
    //tu por querer complicarte la vida has hecho una puta mierda super compleja para inicializar a cada puto estudiante. 
    
    //No sabes ni siquiera como funciona la mierda esa de JAXB
    
    //Mirate la clase mañana
    double UF1,UF2,UF3;
    
    AlumnoSJ(){}
    
    AlumnoSJ(String n, double uf1, double uf2,double uf3){
        this.nombre = n;
        this.UF1 = uf1;
        this.UF2= uf2;
        this.UF3 = uf3;
    }
    
    String getNombre(){
        return this.nombre;
    }
    void setNombre(String n){
        this.nombre = n;
    }
    
    double getUF1(){
        return this.UF1;
    }
    
    void setUF1(double u){
        this.UF1 = u;
    }
    
    double getUF2(){
        return this.UF2;
    }
    
    void setUF2(double u){
        this.UF2 = u;
    }
    
    double getUF3(){
        return this.UF3;
    }
    
    void setUF3(double u){
        this.UF3 = u;
    }
    
}
