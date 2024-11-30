package App;
import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: R$");

        double valorDaCompra = sc.nextDouble();

        double desconto;

        if (valorDaCompra > 100) {
            desconto = valorDaCompra * 0.10;
        } else {
            desconto = 0;
        }

        double valorFinal = valorDaCompra - desconto;
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}