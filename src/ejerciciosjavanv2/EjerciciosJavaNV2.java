/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanv2;

/**
 * @author Andrés
 */
public class EjerciciosJavaNV2 {

    /**
     * Ejercicos Java NV2. EJER 1 Escalera de palabras.
     *
     * @param listaPalabras
     * @return
     */
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
     * Ejercicos Java NV2. EJER 2 ADN
     *
     * @param uno
     * @param dos
     * @return
     */
    public int costeErroresADN(String uno, String dos) {

        //primera versión, usando los dos Strings que me pasan
        int coste = 0;  // coste de los errores
        for (int i = 0; i < uno.length(); i++) {
            if (uno.charAt(i) == '-' || dos.charAt(i) == '-') {
                coste = coste + 2; // coste += 2;
            } else {
                if (uno.charAt(i) == 'G' && dos.charAt(i) != 'C') {
                    coste++;
                }

                if (uno.charAt(i) == 'C' && dos.charAt(i) != 'G') {
                    coste++;
                }

                if (uno.charAt(i) == 'A' && dos.charAt(i) != 'T') {
                    coste++;
                }

                if (uno.charAt(i) == 'T' && dos.charAt(i) != 'A') {
                    coste++;
                }
            }

            //siguiente if
        }

        return coste;
    }

    /**
     * Encuentra el numero que esta duplicado en una lista de ints usando el algoritmo de floyd.
     * @param listaNumeros
     * @return 
     */
    public int finDuplicate(int[] listaNumeros) {
        int tortuga = listaNumeros[0];
        int liebre = listaNumeros[0];
        boolean iguales = false;
        while (!iguales) {
            tortuga = listaNumeros[tortuga];
            liebre = listaNumeros[listaNumeros[liebre]];
            if (tortuga == liebre) {
                iguales = true;
            }
        }

        int auxiliar1 = listaNumeros[0];
        int auxiliar2 = tortuga;
        while (auxiliar1 != auxiliar2) {
            auxiliar1 = listaNumeros[auxiliar1];
            auxiliar2 = listaNumeros[auxiliar2];
        }
        
        return auxiliar1;
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
