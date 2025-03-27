 import java.util.Scanner;

 public class App {
    public static void main(String[] args) throws Exception {
       /* 
        * Condicionales 
        * Simple -> Si (if)
        * Compuesto -> Si, Sino (if, else)
        * Multiple -> En caso de (switch)
        * Anidado -> Si, Entonces si (if, else if)
        */
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        if(edad <= 10){
            System.out.println("Usted es un niño, niña o niñe");
        } else if (edad <= 20){
            System.out.println("Usted no es un niño, niña o niñe, es un joven");
        } else if (edad <= 50){
            System.out.println("Usted no es un niño, niña o niñe, es un Adulto");
        } else {
            System.out.println("Usted no es un niño, niña o niñe, es un Anciano");
        }
}
