import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario[];
        double valorInss[];
        double impostoDeRenda[];
        double salarioLiquido[];

        salario = new double[5];
        valorInss = new double[salario.length];
        impostoDeRenda = new double[salario.length];
        salarioLiquido = new double[salario.length];

        for (int i = 0; i < salario.length; i++) {
            System.out.println("Coloque o valor do " + (i + 1) + "º" + " salario(ex:1560,15):");
            salario[i] = sc.nextDouble();
        }

        for (int i = 0; i < salario.length; i++){

            //usar apenas if deixa o codigo mais legivel e mais facil manutencao.

            if (salario[i] < 0){
               valorInss[i] = 0;
            }
            if (salario[i] <= 1212.00){
                valorInss[i] = (salario[i] * 0.075);
            }
            if (salario[i] > 1212.01 && salario[i] < 2427.35){
                valorInss[i] = (salario[i] * 0.09);
            }
            if (salario[i] > 2427.36 && salario[i] < 3641.03){
                valorInss[i] = (salario[i] * 0.12);
            }
            if (salario[i] > 3641.04){
                valorInss[i] = (salario[i] * 0.14);
            }


            if (salario[i] <= 1903.98){
                impostoDeRenda[i] = (0);
            }
            if (salario[i] > 1903.99 && salario[i] < 2826.65){
                impostoDeRenda[i] = (salario[i] * 0.075);
            }
            if (salario[i] > 2826.66 && salario[i] < 3751.05){
                impostoDeRenda[i] = (salario[i] * 0.15);
            }
            if (salario[i] > 3751.06 && salario[i] <= 4664.68){
                impostoDeRenda[i] = (salario[i] * 0.2250);
            }
            if (salario[i] > 3641.04){
                impostoDeRenda[i] = (salario[i] * 0.2750);
            }

        }

        for (int i = 0; i < salario.length; i++){
            salarioLiquido[i] = salario[i] - (valorInss[i] + impostoDeRenda[i]);
        }

        for(int i = 0; i < salario.length; i++){
            System.out.println((i + 1) + "º" + " salario");
            System.out.printf("salario bruto: %.2f\n", salario[i]);
            System.out.printf("INSS pago: %.2f\n", valorInss[i] );
            System.out.printf("Imposto de renda: %.2f\n", impostoDeRenda[i]);
            System.out.printf("Salario liquido: %.2f\n", salarioLiquido[i]);
            System.out.println("==================");
        }

        sc.close();

    }
}