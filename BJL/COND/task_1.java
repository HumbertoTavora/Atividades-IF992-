package BJL.COND;
import java.util.Scanner;

public class task_1 {
    public static void main(String []args){
        int num1;
        int num2;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o primeiro número:");
            num1 = scnr.nextInt();
            System.out.println("Insira o segundo número:");
            num2 = scnr.nextInt();
            
            if(num1 == num2){
                System.out.println("Os números são iguais");
            }else{
                if(num1>num2){
                    System.out.printf("O maior é: %d\n", num1);
                }else{
                    System.out.printf("O maior é: %d\n", num2);
                }}
        }
    }
}
