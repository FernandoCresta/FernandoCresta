public class Laboratorio{
    public static void main(String[] args) {
        
		// --------------------------------------------------
		//Laboratorio Estructura de control FOR 
		// --------------------------------------------------
         System.out.println("");
         System.out.println("empezamos con el 1");
        //Ejercicio 1
        // Imprimir los números del 1 al 10 uno abajo del otro
 
        for (int i= 1; i<= 10; i++){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("empezamos con el 2");
        //Ejercicio 2
        // Imprimir los números del 1 al 10 uno abajo del otro
        // salteando de a dos
        for (int i= 1; i<= 10; i+=2){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("empezamos con el 3");
        // Ejercicio 3
        // Imprimir los números del 10 al 1 uno abajo del otro
        for (int i= 10; i>= 1; i--){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("empezamos con el 4");
        // Ejercicio 4
        // Imprimir la suma de números impares del 1 al 10
         int suma= 0;
         for (int i= 1; i<= 10; i++){
            if (i%2 == 1){
                suma+= i;
            }
        }
        System.out.println("la suma de los impares es "+suma);
        System.out.println("");
        System.out.println("empezamos con el 5");
        // Ejercicio 5
        // Imprimir la suma de la multiplicación de los números del 1 al 5
        // con la resta de los números del 1 al 5
        int multi5= 1;
        int resta5= 0;
        for (int i= 1; i<= 5; i++){
            multi5*= i;
            resta5-= i;
        }
        System.out.println("la multiplicación de los numeros del 1 al 5 es "+ multi5);
        System.out.println("la resta de los numeros del 1 al 5 es "+ resta5);
        System.out.println("");
        System.out.println("empezamos con el 6");
        // Ejercicio 6
        // @
        // @
        // @
        // @
        // @
        for (int i= 1; i<= 5; i++){
            System.out.println("@");
        }
        System.out.println("");
        System.out.println("empezamos con el bonus");
        // Ejercicio bonus
        // @@@@@
        for (int i= 1; i<= 5; i++){
            System.out.print("@");
        }
        System.out.println("");
        System.out.println("empezamos con el ejercicio 7");
        // Ejercicio 7
        // @
        // @@
        // @
        // @@
        // @
        for (int i= 1; i<= 5; i++){
            if (i%2 == 1){
                System.out.println("@");
            }
            else{
                System.out.println("@@");
            }
        }
        System.out.println("");
        System.out.println("empezamos con el ejercicio bonus 2");
        // Ejercicio bonus
        // @@@@@
        // @@@@@
        // @@@@@
        // @@@@@
        // @@@@@
        for (int i= 1; i<= 5; i++){
            for(int j=1; j<= 4; j++){
                System.out.print("@");
            }
            System.out.println("@");
        }
        System.out.println("");
        System.out.println("empezamos con el ejercicio 8");
        // Ejercicio 8
        // @
        // @@
        // @@@
        // @@@@
        // @@@@@
        for (int i= 1; i<= 5; i++){
            for(int j=1; j< i; j++){
                System.out.print("@");
            }
            System.out.println("@");
        }
        System.out.println("");
        System.out.println("empezamos con el ejercicio 9");
        //Ejercicio 9
        // @@@@@
        // @@@@
        // @@@
        // @@
        // @
        for (int i= 5; i>= 1; i--){
            for(int j=i; j > 1; j--){
                System.out.print("@");
            }
            System.out.println("@");
        }

    }
}