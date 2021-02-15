package calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        // TODO code application logic here
        double n1,n2;
        int op;
        Scanner entrada = new Scanner(System.in);
        while (true){
        System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
        op = entrada.nextInt();
        if (op==5)
            break;
        if (op<1 || op>6){
            System.out.println("Opção do menu invalida");
            continue;
        }
        System.out.println("Digite 2 números: ");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        
        switch (op){
            case 1: System.out.println("Soma =" +(n1+n2));
                   break;
                
            case 2: System.out.println("Subtração ="+(n1-n2));
                   break;                   
            
           }
                
        }
    }
}
