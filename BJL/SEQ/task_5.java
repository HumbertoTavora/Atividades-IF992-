package BJL.SEQ;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class task_5 {
    
        public static void main(String []args){
        double base;
        double expoente;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o primeiro número:");
            base = scnr.nextDouble();
            System.out.println("Insira o segundo número:");
            expoente = scnr.nextDouble();
            
            System.out.printf("Area do triangulo: %.0f\n", Math.pow(base,expoente));
        }
        catch (InputMismatchException e) { 
            System.out.println("Entrada inválida. Certifique-se de inserir números inteiros.");
        }
    }

}
