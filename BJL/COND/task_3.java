package BJL.COND;

import java.util.Scanner;

public class task_3 {
    public static void main(String []args){
        int num;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira um número:");
            num = scnr.nextInt();
            
            if(num%2 == 0){
                System.out.printf("%d é par.\n", num);
            }else{
                System.out.printf("%d é impar.\n", num);
            }
        }
    }
}
