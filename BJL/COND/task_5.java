package BJL.COND;

import java.util.Scanner;

public class task_5 {
        public static void main(String []args){
        int codigo;
        int num1;
        int num2;

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Digite 1 para somar;");
            System.out.println("Digite 2 para subtrair;");
            System.out.println("Digite 3 para multiplicar;");
            System.out.println("Digite 4 para dividir;");
            codigo = scnr.nextInt();
            System.out.println("Insira o primeiro valor:");
            num1 = scnr.nextInt();
            System.out.println("Insira o segundo valor:");
            num2 = scnr.nextInt();
            
            if(codigo == 1){
                System.out.printf("Soma: %d\n", num1+num2);
            }else if(codigo == 2){
                System.out.printf("Subtração: %d\n", num1-num2);
            }else if(codigo == 3){
                System.out.printf("Multiplicação: %d\n", num1*num2);
            }else if(codigo == 4){
                if(num2 == 0){
                    System.out.println("Divisão por zero.");    
                }else{
                    System.out.printf("Divisão: %d\n", num1/num2);
                }
            }
        }
    }
}
