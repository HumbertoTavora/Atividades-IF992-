package BJL.REP;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        int input; 
        int acc=0;

        do{
            Scanner scnr = new Scanner(System.in);
            input = scnr.nextInt();
            
            if(input > 0){
                acc++;
            }
        }while(input != 0);      

        System.out.printf("Quantidade de positivos: %d", acc);
    }
}
