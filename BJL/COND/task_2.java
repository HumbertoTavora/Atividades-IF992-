package BJL.COND;

import java.util.Scanner;

public class task_2 {
    public static void main(String []args){
        int num1;
        int num2;
        int num3;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o primeiro número:");
            num1 = scnr.nextInt();
            System.out.println("Insira o segundo número:");
            num2 = scnr.nextInt();
            System.out.println("Insira o terceiro número:");
            num3 = scnr.nextInt(); 
 
            if((num1 > num2 && num1 > num3) && (num1 != num2 && num1 != num3)){
                System.out.println("Condição satisfeita");
            }else{
                System.out.println("Erro");
            }
        }
    }
}
