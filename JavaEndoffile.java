// El desafia como tal es imprimir de manera enumerada 
// todas las las posibles lineas posibles que tengamos como entrada.


// Como recomendacion nos dicen que hagamos uso del metodo 
// de la clase Scanner hashNext()

// El metodo nos permite evaluar si hay mas linea que procesar.

//====================
// Formato de Entrada
//====================
/*

Hello world
I am a file
Read me until end-of-file.


*/

//====================
// Formato de Salida
//====================
/*
1 Hello world
2 I am a file
3 Read me until end-of-file.
*/

import java.util.Scanner;

 class JavaEndoffile {

    public static void main(String args[]) throws Exception{

            Scanner scanner = new Scanner(System.in);
            int i = 1;
            while(scanner.hasNext()){
                System.out.println(i + " " + scanner.nextLine());
                i +=1;
            } 
            scanner.close();  
    }
}
