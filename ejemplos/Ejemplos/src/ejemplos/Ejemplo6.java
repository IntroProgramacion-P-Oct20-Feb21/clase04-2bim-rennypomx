/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo6 {
    static int suma = 0; // variable de alcance  global
                        // se la puede usar e cualquier método
                        // hemos declarado la variable statica
                        // porque estamos usando método staticos
                           
    public static void main(String[] args) {
        // 
        System.out.printf("Valor de variable suma (main): %d\n", suma);
        obtenerSuma(10, 30);
        obtenerSumaDos();
        
    }
        
    public static void obtenerSuma(int a, int b){
        
        suma = a + b;
        System.out.printf("Valor de variable suma (obtenerSuma): %d\n", suma);
        
    }
    
    public static void obtenerSumaDos(){
        
        suma = suma + 100;
        System.out.printf("Valor de variable suma (obtenerSumaDos): %d\n", suma);
        
    }
    
}
