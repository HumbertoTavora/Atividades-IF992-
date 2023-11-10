package BJL;

import java.util.InputMismatchException;
import java.util.Scanner;

class task_4 {
        public static void main(String []args){
        int base;
        int altura;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira a base:");
            base = scnr.nextInt();
            System.out.println("Insira a altura:");
            altura = scnr.nextInt();
            
    
            System.out.printf("Area do triangulo: %d\n", (base * altura)/2);
        }
        catch (InputMismatchException e) { 
            System.out.println("Entrada inválida. Certifique-se de inserir números inteiros.");
        }
    }

}
