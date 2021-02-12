/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanv2;

/**
 *
 * @author Andrés
 */
public class EjerciciosJavaNV2 {

    public boolean esEscaleraDePalabras(char[][] listaPalabras) {
        for (int i = 0; i < listaPalabras [0].length - 1; i++) {
            if (listaPalabras[0][0] == listaPalabras[i + 1][0]) {
                System.out.println("SON IGUALES");
            }
            
            else {
                System.out.println("SON DISTINTOS");
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
