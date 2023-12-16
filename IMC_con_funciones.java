
/*  Trabajo 2
   Cálculo de Indice de masa corporal 
   programador: Fernando Cresta
   Centro de Formación profesional Nro 6
 
1 - Modificar el trabajo 1 para que permita el ingreso de parámetros por consola de sistema. (vector String[] args)
2 - Crear la función calcularMasaCorporal, en esta función ingresa como parámetro el peso y la altura,
	y devuelve el indice de masa corporal.
3 - Crear la función obtenerEstado, ingresa como parámetro el IMC y devuelve un String con el estado
	'Normal','SobrePeso','Obesidad' etc.

nota: en el alcance de este programa nos aseguramos que la cantidad de parámetros sea 2 o ninguno. No chequemos tipos de datos ingresados
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC_con_funciones {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * @param args
     */
    public static void main(String[] args) {
        // definición de variables
        double peso;
        double altura;
        double imc;
        boolean unicavez = true;
        char continuar;
        String msg;
        DecimalFormat df = new DecimalFormat("###.0");
        // fin definición de variables
        if (args.length == 1 || args.length >= 3) {
            mostrarCartel("Error en la cantidad de argumentos ingresados!!!. Reitere nuevamente la llamada",
                    ANSI_RED);

        } else {
            do {
                /*
                 * hacemos un bucle repetitivo para ingresar todos los datos que querramos hasta
                 * tocar otra letra
                 * que no sea s
                 */
                mostrarCartel("Bienvenido al Calculardor ICM", ANSI_GREEN);
                continuar = ' ';
                if (args.length == 2 && unicavez) {
                    peso = Double.parseDouble(args[0]);
                    altura = Double.parseDouble(args[1]);
                    unicavez = false; // bandera booleana para entrar por unica vez en caso de 2 parámetros en la
                                      // llamada inicial
                } else { // sólo entra aquí si se invoca con 0 argumentos
                    System.out.print("Ingrese peso en kg: ");
                    peso = new Scanner(System.in).nextDouble();
                    System.out.print("Ingrese altura en cm: ");
                    altura = new Scanner(System.in).nextDouble();
                }
                // anidamos funciones para ahorrar el uso de variables y simplificar codigo
                msg = "El IMC calculado: " + df.format(imc = calcularMasaCorporal(peso, altura)) +
                      " corresponde al estado " + obtenerEstado(imc);
                mostrarCartel(msg, ANSI_YELLOW);

                System.out.print("¿Desea cálcular de nuevo? (s/n): ");
                continuar = new Scanner(System.in).next().charAt(0);

            } while (continuar == 's' || continuar == 'S');
            mostrarCartel("Gracias por usar nuestro calculardor IMC", ANSI_PURPLE);

        }
    }

    /*
     * función que calcula el IMC.
     * Devuelve el IMC como tipo double sin formato de 2 decimales que lo
     * ajustaremos
     * en la futura impresión para mejorar la presentación.
     */
    public static double calcularMasaCorporal(double peso, double altura) {
        // ahora calculamos el
        return peso / Math.pow(altura / 100, 2);
    }

    /*
     * función que devuelve el estado correspondiente al IMC.
     */
    public static String obtenerEstado(double imc) {
        String estado = "";
        // con el imc calculamos la correspondencia con su peso
        if (imc < 15) {
            estado = "delgadez muy severa";
        } else if (imc >= 15 && imc <= 15.9) {
            estado = "delgadez severa";
        } else if (imc > 15.9 && imc <= 18.4) {
            estado = "delgadez";
        } else if (imc > 18.4 && imc <= 24.9) {
            estado = "peso normal";
        } else if (imc > 24.9 && imc <= 29.9) {
            estado = "sobrepeso";
        } else if (imc > 29.9 && imc <= 34.9) {
            estado = "obesidad moderada";
        } else if (imc >= 35 && imc <= 39.9) {
            estado = "obesidad severa";
        } else if (imc > 39.9) {
            estado = "obesidad mórbida";
        }
        return estado;
    }

    /*
     * función que imprime un cartelito, con un color seleccionado.
     */
    public static void mostrarCartel(String msg, String color) {
        String str = "*";
        String lineaAsteriscos = str.repeat(msg.length());
        System.out.println("");
        System.out.println(color);
        System.out.println(lineaAsteriscos);
        System.out.println(msg);
        System.out.println(lineaAsteriscos);
        System.out.println(ANSI_RESET);
        System.out.println("");
    }

}