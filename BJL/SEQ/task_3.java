package BJL.SEQ;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_3 {
    
    public static void main(String []args){
        double salary;
        double increase = 0.25;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o salário:");
            salary = scnr.nextDouble();
    
            System.out.printf("Novo salário: %.2f\n", salary*(1+increase));
        }
        catch (InputMismatchException e) { 
            System.out.println("Entrada inválida. Certifique-se de inserir números inteiros.");
        }
    }
}
