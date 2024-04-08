package aulas.aula2.atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.print("Input first number: ");
        calc.nmbA = sc.nextDouble();
        System.out.print("Input second number: ");
        calc.nmbB = sc.nextDouble();
        System.out.print("Select the operation (+ - / *)");
        char resp = sc.next().charAt(0);
        double result;
        if (resp == '+'){
            result = calc.somar();
            System.out.println("Sum: " + result);
        } else if (resp == '-') {
            result = calc.subtrair();
            System.out.println("Sub: " + result);
        } else if (resp == '*'){
            result = calc.multiplicar();
            System.out.println("Mul: " + result);
        } else {
            result = calc.dividir();
            System.out.println("Div: " + result);
            System.out.println("teste");
        }
        boolean primo = calc.verificarNmrPrimo(sc.nextInt());
        System.out.println(primo);


        sc.close();
    }
}
