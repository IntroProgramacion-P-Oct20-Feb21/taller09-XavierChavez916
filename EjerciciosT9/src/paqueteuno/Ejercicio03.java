/*
 Dado el arreglo; determinar cuantos elementos están arriba de la media 
 aritmética y cuantos están por debajo de la medía aritmética.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        int suma = 0;
        double media = 0;
        // En este for se suma cada valor del arreglo
        for (int indice = 0; indice < arreglo.length; indice++) {
            // en la variable suma se va almacenando la suma del arreglo
            suma = suma + arreglo[indice];
        }
        /*
           En la variable media se almacena la suma de todos los valores del 
           arreglo y lo dividimos por el numero de elementos que tiene el arreglo
         */
        media = (double) suma / arreglo.length;
        /*
           Se utiliza un ciclo for para recorrer el arreglo para poder 
           identificar cuantos numeros estan arriba de la media y cuantos \
           estan abajo de la media
         */
        for (int indice = 0; indice < arreglo.length; indice++) {
            /* 
               Se pone una condicion de si arreglo es mayor que la media
               entonces se le suma a 1 a elemetos arriba de la media de lo 
               contrario se le suma 1 a elemmentos abajo de la media
             */
            if (arreglo[indice] > media) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                elementosAbajoMedia = elementosAbajoMedia + 1;

            }

        }

        System.out.printf("Elementos arriba de la media aritmetica: %s\n"
                + "Elementos por debajo de la media aritmetica: %s\n",
                elementosArribaMedia, elementosAbajoMedia);

    }
}
