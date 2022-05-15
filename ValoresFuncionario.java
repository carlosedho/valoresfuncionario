/*
The MIT License (MIT)
Copyright (c) 2022 Carlos Eduardo <cduhno@gmail.com>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package valoresfuncionario;
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