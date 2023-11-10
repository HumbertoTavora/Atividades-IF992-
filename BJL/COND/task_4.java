package BJL.COND;

import java.util.Scanner;

public class task_4 {
    public static void main(String []args){
        int num1;
        int num2;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o primeiro valor:");
            num1 = scnr.nextInt();
            System.out.println("Insira o segundo valor:");
            num2 = scnr.nextInt();
 
            if(num1==num2){
                System.out.printf("Multiplicação: %d\n", num1*num2);
            }else if(num1>num2){
                System.out.printf("Subtração: %d\n", num1-num2);
            }else{
                System.out.printf("Soma: %d\n", num1+num2);
            }
        }
    }
}
