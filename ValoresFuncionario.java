package valoresempregado;
import java.util.Scanner;

public class ValoresEmpregado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeHoras;
        double salarioMinimo, salarioTotal, valorHora, descontoImposto, salarioReceber;
        System.out.println("Informe o salário mínimo: ");
        salarioMinimo = input.nextDouble();
        System.out.println("Informe a quantidade de horas: ");
        quantidadeHoras = input.nextInt();
        valorHora = 0.05 * salarioMinimo;
        salarioTotal = valorHora * quantidadeHoras;
        descontoImposto = salarioTotal * 0.075;
        if (salarioTotal > 1500){
            salarioReceber = salarioTotal - descontoImposto;
    }
        else {
            salarioReceber = salarioTotal;
        }
        System.out.println("O salário total é de: R$" + salarioTotal);
        System.out.println("O desconto do imposto é de: R$" + descontoImposto);
        System.out.println("O salário a receber é de: R$" + salarioReceber);

    }
    
}
