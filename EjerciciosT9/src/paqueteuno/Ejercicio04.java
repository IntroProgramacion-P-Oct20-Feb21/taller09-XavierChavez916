/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        /* 
           Se utiliza un ciclo for para recorrer el arreglo promedio y se añade 
           condiciones para darle un valor al arreglo promediosCualitativos 
           segun el valor del arreglo promedios
         */
        for (int indice = 0; indice < promedios.length; indice++) {
            if ((promedios[indice] >= 0) && (promedios[indice] <= 5.9)) {
                promediosCualitativos[indice] = "Regular";
            } else {
                if ((promedios[indice] >= 6) && (promedios[indice] <= 8.9)) {
                    promediosCualitativos[indice] = "Bueno";
                } else {
                    if ((promedios[indice] >= 9) && (promedios[indice] <= 10)) {
                        promediosCualitativos[indice] = "Sobresaliente";
                    }
                }
            }

        }
        for (int i = 0; i < promediosCualitativos.length; i++) {
            System.out.printf("%spromedio: %.2f promedio cualitativo %s\n",
                    estudiantes[i], promedios[i], promediosCualitativos[i]);

        }
    }
}
