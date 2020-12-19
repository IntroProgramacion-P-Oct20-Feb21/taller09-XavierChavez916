/*
 Analizar el ejercicio, identificar la problemática.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En esta poblematica  cada vez que iteremos en el cilo for se 
        // va sumando mas 1 segun las condiciones y el arreglo de respuestas
        int[] respuestas = {1, 10, 11, 12, 12, 13, 16, 17, 18, 8, 9, 10};
        String[] rangos = {"1-5", "6-10", "11-15", "16-20"};
        int[] valoresRangos = new int[4];
        int respuesta;

        for (int i = 0; i < respuestas.length; i++) {
            respuesta = respuestas[i];
            if ((respuesta >= 1) && (respuesta <= 5)) {
                valoresRangos[0] = valoresRangos[0] + 1;
            } else {
                if ((respuesta >= 6) && (respuesta <= 10)) {
                    valoresRangos[1] = valoresRangos[1] + 1;
                } else {
                    if ((respuesta >= 11) && (respuesta <= 15)) {
                        valoresRangos[2] = valoresRangos[2] + 1;
                    } else {
                        if ((respuesta >= 16) && (respuesta <= 20)) {
                            valoresRangos[3] = valoresRangos[3] + 1;
                        }

                    }
                }

            }
        }

        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("Rango %s - valor %d\n", rangos[i],
                    valoresRangos[i]);
        }

    }

}
