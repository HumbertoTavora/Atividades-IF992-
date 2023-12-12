package BJL.REP;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int A=0;
        int B=0;
        int i;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o valor de A:");
            A = scnr.nextInt();
            System.out.println("Insira o valor de B:");
            B = scnr.nextInt();
        }
        for(i=A;i<=B;i++){
            if(i%2!=0){
                System.out.printf("E impar: %d\n", i);
            }
        }

    }
}
