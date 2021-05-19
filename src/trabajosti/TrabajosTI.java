/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosti;

/**
 *
 * @author Rafael Moreno
 */
public class TrabajosTI {
    
    
    private static String nombre;
    private static String descripción;
    private static String habilidades;
    private static Integer experiencia;
    private static String nivel;
    
    public TrabajosTI (String nombre, String descripción, String habilidades, Integer experiencia, String nivel){
     TrabajosTI.nombre = nombre;
     TrabajosTI.descripción = descripción;
     TrabajosTI.habilidades = habilidades;
     TrabajosTI.experiencia = experiencia;
     TrabajosTI.nivel = nivel;
}
    
    public static int sueldoTrab(){
        int sueldo = 0;
        
        switch (TrabajosTI.nivel) {
            case "jr":
                sueldo = 1000 * (1 + (experiencia / 10));
                break;
            case "sr":
                sueldo = 1500 * (1 + (experiencia / 10));
                break;
            case "Leader":
                sueldo = 2000 * (1 + (experiencia / 10));
            case "boss":
                sueldo = 2500 * (1 + (experiencia / 10));
                break;
            default:
                throw new AssertionError();
        }
        return sueldo;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        TrabajosTI trabaTI = new TrabajosTI("telecom" , "desarrollo de aplicaciones" , "base de datos" , 12, "Leader");
        System.out.println("El sueldo es: " + sueldoTrab());
    }
    
}
