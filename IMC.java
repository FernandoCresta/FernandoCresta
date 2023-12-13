/* Cálculo de Indice de masa corporal 
 * programador: Fernando Cresta
 * Centro de Formación profesional Nro 6
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        char continuar=' ';
        /*  hacemos un bucle repetitivo para ingresar todos los datos que querramos hasta tocar otra letra 
        que no sea s */
        do {
            System.out.println("");
            System.out.println("");
            System.out.print("Ingrese peso en kg: ");
            double peso = new Scanner(System.in).nextDouble();
            System.out.print("Ingrese altura en cm: ");
            double altura = new Scanner(System.in).nextDouble();
            altura/=100;
            // ahora calculamos el  
            double imc= peso/Math.pow(altura, 2); 
            String msg="";
            String color="";
            //ahora calculamos en base al imc en que catergoría cae
            //seteamos el color según la categoria 
            if (imc > 18.4 && imc <= 24.9){
                msg= "peso correcto";
                color= ANSI_BLUE;
            }
            else if (imc <15) {
                msg= "delgadez muy severa";
                color= ANSI_WHITE;
            }
            else if (imc >= 15 && imc <= 15.9){
                msg= "delgadez severa";
                color= ANSI_CYAN;
            }
            else if (imc > 15.9 && imc <= 18.4){
                msg= "delgadez";
                color= ANSI_PURPLE;
            }
            else if (imc > 24.9 && imc <= 29.9){
                msg= "sobrepeso";
                color= ANSI_YELLOW;
            }
            else if (imc > 29.9 && imc <= 34.9){
                msg= "obesidad moderada";
                color= ANSI_GREEN;
            } 
            else if (imc >= 35 && imc <= 39.9){
                msg= "obesidad severa";
                color= ANSI_RED;
            } 
            else if (imc > 39.9){
                msg= "obesidad mórbida";
                color= ANSI_WHITE;
            }   
            DecimalFormat df=new DecimalFormat("###.0");
            System.out.println(color);
            System.out.println("El IMC calculado: "+df.format(imc)+" corresponde al estado "+msg);
            System.out.println(ANSI_RESET);

            System.out.print("¿Desea cálcular de nuevo? (s/n): ");
            continuar = new Scanner(System.in).next().charAt(0);
            

            } while (continuar == 's' || continuar == 'S');
        System.out.println("Gracias por usar nuestro calculardor IMC");   
        System.out.println("");
        System.out.println("");
    }
}