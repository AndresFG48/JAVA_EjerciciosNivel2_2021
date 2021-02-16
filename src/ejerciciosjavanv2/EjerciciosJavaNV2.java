/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanv2;

/**
 * Ejercicos Java NV2. EJER 1 Escalera de palabras.
 *
 * @author Andrés
 */
public class EjerciciosJavaNV2 {

    public boolean esEscaleraDePalabras(char[][] listaPalabras) {
        
        int contador1 = 0;
        for (int i = 0; i < listaPalabras.length - 1; i++) { //El bucle que procesa todas las filas.
            contador1 = 0; //Inicializa el contador de diferencias antes de empezar el bucle interno.
            for (int j = 0; j < listaPalabras[0].length; j++) {
                if (listaPalabras[i][j] == listaPalabras[i + 1][j]) {
                    System.out.println("SON IGUALES");
                } else {
                    System.out.println("SON DISTINTOS");
                    contador1++; //Las letras son diferentes.
                }
            }

            System.out.println("" + contador1);
            if (contador1 != 1) {
                return false; //Si en algun momento las palabras se diferencian en mas de un 
                // carecter, devuelve false.
            }
        }

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjerciciosJavaNV2 ejercicio = new EjerciciosJavaNV2();
        char[][] listaPalabras = {
            {'P', 'A', 'T', 'A'},
            {'P', 'A', 'T', 'O'},
            {'R', 'A', 'T', 'O'},
            {'R', 'A', 'M', 'O'},
            {'G', 'A', 'M', 'O'},
            {'G', 'A', 'T', 'O'},
            {'M', 'A', 'T', 'O'},};
        System.out.println(ejercicio.esEscaleraDePalabras(listaPalabras));
    }

}
