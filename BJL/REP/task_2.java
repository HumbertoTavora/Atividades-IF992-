package BJL.REP;
import java.util.Scanner;


public class task_2 {
    public static void main(String[] args) {
        int A=0;
        int B=0;
        int i;
        String out = "";
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Insira o valor de A:");
            A = scnr.nextInt();
            System.out.println("Insira o valor de B:");
            B = scnr.nextInt();
        }
        i = A+1;
        while(i<B){
            out = out + " " + Integer.toString(i);
            i++;
        }

        System.out.printf("Serie numérica:%s\n", out);
        

    }
}
