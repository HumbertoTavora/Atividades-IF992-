package BJL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1{

    public static void main(String []args){
        int num1, num2, num3, num4;
        try (Scanner scnr = new Scanner(System.in)) {
            num1 = scnr.nextInt();
            num2 = scnr.nextInt();
            num3 = scnr.nextInt();
            num4 = scnr.nextInt();
            System.out.printf("Resultado da soma: %d\n", num1+num2+num3+num4);
        }
        catch (InputMismatchException e) { 
            System.out.println("Entrada inválida. Certifique-se de inserir números inteiros.");
        }
    }

}