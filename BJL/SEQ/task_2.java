package BJL.SEQ;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2{

    public static void main(String []args){
        float grade1, grade2, grade3;
        try (Scanner scnr = new Scanner(System.in)) {
            grade1 = scnr.nextFloat();
            grade2 = scnr.nextFloat();
            grade3 = scnr.nextFloat();

            System.out.printf("Média aritmética: %.2f\n", (grade1+grade2+grade3)/3);
        }
        catch (InputMismatchException e) { 
            System.out.println("Entrada inválida. Certifique-se de inserir números inteiros.");
        }
    }

}