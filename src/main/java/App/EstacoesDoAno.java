package App;
import java.util.Scanner;

public class EstacoesDoAno {

    public static void main(String[] args) {

        System.out.println("Digite o número do mês (de 1-12) que deseja saber qual estação é! ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        switch (mes) {
            case 12, 1, 2:
                System.out.println("É verão!");
                break;
            case 3, 4, 5:
                System.out.println("É outono!");
                break;
            case 6, 7, 8:
                System.out.println("É inverno!");
                break;
            case 9, 10, 11:
                System.out.println("É primavera!");
                break;
            default:
                System.out.println("Mês inválido, digite um mê do 1 ao 12.");
        }

        System.out.println("Obrigada por utilizar o mini sistema :)");
    }
}

