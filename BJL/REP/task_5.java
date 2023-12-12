package BJL.REP;

import java.util.Scanner;

public class task_5 {
    
    public static void main(String[] args) {
        int N=0;
        Boolean bool = true;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira um numero:");
            N = scnr.nextInt();
        } 
        for (int i = 2; i <= Math.sqrt(N); i++){ 
            if (N % i == 0){ 
                System.out.printf("%d nao e primo\n", N);
                bool = false;}
        }
        if(bool){
            System.out.printf("%d e primo\n", N);
        }
    }
}
