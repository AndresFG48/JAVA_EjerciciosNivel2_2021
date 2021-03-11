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
            }
            
            else {
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
        }

        return coste;
    }

    /**
     * Encuentra el numero que esta duplicado en una lista de ints usando el
     * algoritmo de floyd.
     *
     * @param listaNumeros
     * @return
     */
    //[1, 2, 3, 4, 4]
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
     * Metodo para quitar los acentos.
     *
     * @param cadena
     * @return
     */
    public String quitaAcentosV2(String cadena) {
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'á') {
                auxiliar = auxiliar + 'a';
            }
            
            else if (cadena.charAt(i) == 'é') {
                auxiliar = auxiliar + 'e';
            }
            
            else if (cadena.charAt(i) == 'í') {
                auxiliar = auxiliar + 'i';
            }
            
            else if (cadena.charAt(i) == 'ó') {
                auxiliar = auxiliar + 'o';
            }
            
            else if (cadena.charAt(i) == 'ú') {
                auxiliar = auxiliar + 'u';
            }
            
            else if (cadena.charAt(i) == 'ü') {
                auxiliar = auxiliar + 'u';
            }
            
            else if (cadena.charAt(i) == 'Á') {
                auxiliar = auxiliar + 'A';
            }
            
            else if (cadena.charAt(i) == 'É') {
                auxiliar = auxiliar + 'E';
            }
            
            else if (cadena.charAt(i) == 'Í') {
                auxiliar = auxiliar + 'I';
            }
            
            else if (cadena.charAt(i) == 'Ó') {
                auxiliar = auxiliar + 'O';
            }
            
            else if (cadena.charAt(i) == 'Ú') {
                auxiliar = auxiliar + 'U';
            } 
            
            else if (cadena.charAt(i) == 'Ü') {
                auxiliar = auxiliar + 'U';
            }
            
            else {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }

        return auxiliar;
    }

    /**
     * Ejercicos Java NV2. EJER 4 STRSTR
     * 
     * Metodo del STR complpeto.
     * @param str1
     * @param str2
     * @return
     */
    public int StrStr(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = quitaAcentosV2(str1);
        str2 = quitaAcentosV2(str2);
        int posicion = -1;

        //Suponemos que no hay acentos y ademas que todo esta en minusculas.
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                posicion = i;
                int j = 0; //Indice para buscar el str2
                while ((j < str2.length() && i < str1.length()) && str1.charAt(i) == str2.charAt(j)) {
                    j++;
                    i++;
                }

                //El while ha terminado y puede haber salido por varios motivos, la primera, que alguno de los dos length se haya termminado,
                // la segunda, que alguna letra sea distinta.
                if (j > str2.length()) {

                    //Si ha salido porque ya no tenia mas letras el str2; significa que el str2 esta dentro del str1, y ademas, su posicion esta
                    // guardada en posicion.
                    return posicion;
                }

                if (i >= str1.charAt(i)) {

                    //Si ha salido porque ya no tenia mas letras el str1, significa que el str2 de momento no esta dentro del str1.
                    return -1;
                }

                if (str1.charAt(i) != str2.charAt(j)) {
                    i = posicion;
                    posicion = -1;
                }
            }

        }

        return posicion;
    }
    
    /**
     * Ejercicos Java NV2. EJER 5 RPN
     * 
     * @param entrada
     * @return 
     */
    public String calculadoraRPN(String[] entrada) {
        String pila[] = new String[100];
        int posicionPila = 0; //indica el sitio de la pila en el que toca insertar o leer
        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i] != "+" && entrada[i] != "-" && entrada[i] != "*" && entrada[i] != "/") {
                
                //System.out.print(entrada [i] + " ");
                //es un operando, tengo que meterlo en la pila
                pila[posicionPila] = entrada[i];
                posicionPila++;
            }
            
            else { //es una operación
                if (posicionPila - 2 >= 0) {
                    Double operando1 = Double.valueOf(pila[posicionPila - 1]);
                    Double operando2 = Double.valueOf(pila[posicionPila - 2]);

                    if (entrada[i] == "+") {
                        operando1 = operando1 + operando2;
                    }
                    
                    if (entrada[i] == "*") {
                        operando1 = operando1 * operando2;
                    }
                    
                    if (entrada[i] == "-") {
                        operando1 = operando1 - operando2;
                    }
                    
                    if (entrada[i] == "/") {
                        if (operando2 == 0) {
                            return "ERROR";
                        }
                        
                        else {
                            operando1 = operando1 / operando2;
                        }
                    }
                    
                    posicionPila = posicionPila - 2;
                    pila[posicionPila] = operando1 + ""; //guardo el resultado en la casilla corespondiente
                    posicionPila++;
                }
                
                else return "ERROR";  
            }
        }
        
        return pila[0];
    }
    
    /**
     * Ejercicos Java NV2. EJER 3 MUDANZA
     * 
     * @param camion
     * @param anchoCaja
     * @param altoCaja
     * @return 
     */
    public boolean cabeUnaCaja (boolean [][] camion, int anchoCaja, int altoCaja) {
        int altoCamion = camion.length; // Cuantas filas hay en el array
        int anchoCamion = camion [0].length;
        for (int i = 0; i < altoCamion; i++) {
            for (int j = 0; j < anchoCamion; j++) {
                if (!camion [i][j]) { //Miro si el sitio esta vacio, si esta ocupado no hago nada.
                    int horizontal = j;
                    int vertical = i;
                    while (vertical - i < altoCaja && vertical < altoCamion && !camion [vertical][horizontal]) {
                        while (horizontal - j < anchoCaja && horizontal < anchoCamion && !camion[vertical][horizontal]) {
                            horizontal++;
                        }
                        
                        if (horizontal - j == anchoCaja) { //Si que cabe en esa fila.
                            vertical++;  //Vuelvo al inicio de la siguiente fila.
                            horizontal = j;
                        }
                        
                        else {
                            
                            //La caja no entra y hay que volver a los bucles for.
                            vertical = altoCamion * 2; //Esto es una argucia para indicarle al if de fuera del while que la 
                                                       // caja no entra aqui y hay que devolver el control a los bucles for.
                        }
                    }
                    
                    if (vertical - i == altoCaja) {
                        
                        //Si se cumple es que si cabe la caja entera.
                        return true;
                    }
                }
            }
        }
        
        return false;
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
            {'M', 'A', 'T', 'O'},
        };

//        System.out.println(ejercicio.esEscaleraDePalabras(listaPalabras));

//      System.out.println(ejercicio.findDuplicate(new int[] {3,2,3,4,1}));
//      System.out.println(ejercicio.findDuplicate(new int[] {4,2,3,4,1}));
//      System.out.println(ejercicio.findDuplicate(new int[] {1,1,3,4,1}));

//        System.out.println(ejercicio.StrStr("hola Helios!", "el"));
//        System.out.println(ejercicio.StrStr("hola Mundo", "Mun"));
//        System.out.println(ejercicio.StrStr("hola MynMu", "Mun"));
//        System.out.println(ejercicio.StrStr("hola MMunn", "Mun"));
//        System.out.println(ejercicio.StrStr("hola MuMun", "Mun"));
//        System.out.println(ejercicio.StrStr("hola MuMu", "Mun"));
//        System.out.println(ejercicio.StrStr("hola MMunn", "Mun"));
//        System.out.println(ejercicio.StrStr("Mumn", "Mun"));
//        
//      System.out.println(ejercicio.calculadoraRPN(new String []{"2", "4" ,"/", "7", "*"}));
//      System.out.println(ejercicio.calculadoraRPN(new String[] {"3", "2" ,"+", "7", "*"}));
//      ejercicio.calculadoraRPN(new String[] {"3", "2" ,"+", "7", "*", "15", "21", "+", "-"});

        boolean[][] camion = {{true, true, true, false, false, true, true, true},
            {true, true, true, false, false, true, true, true},
            {true, true, true, false, false, true, true, true},
            {true, true, true, true, true, true, false, false},
            {true, true, true, true, true, true, false, false}
        };
        
        System.out.println(ejercicio.cabeUnaCaja(camion, 2, 2));
        System.out.println(ejercicio.cabeUnaCaja(camion, 3, 2));
        System.out.println(ejercicio.cabeUnaCaja(camion, 1, 2));
        System.out.println(ejercicio.cabeUnaCaja(camion, 1, 3));
        System.out.println(ejercicio.cabeUnaCaja(camion, 3, 3));
    }
}
