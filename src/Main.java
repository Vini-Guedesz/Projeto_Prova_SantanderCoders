import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salario[];
        float valorInss[];
        float impostoDeRenda[];
        float salarioLiquido[];

        salario = new float[5];
        valorInss = new float[salario.length];
        impostoDeRenda = new float[salario.length];
        salarioLiquido = new float[salario.length];

        for (int i = 0; i < salario.length; i++) {
            System.out.println("Coloque o valor do " + (i + 1) + "º" + " salario:");
            salario[i] = sc.nextFloat();
        }

        for (int i = 0; i < salario.length; i++){

            //usar apenas if deixa o codigo mais legivel e mais facil manutencao.

            if (salario[i] < 0){
               valorInss[i] = 0f;
            }
            if (salario[i] <= 1212.00){
                valorInss[i] = (salario[i] * 0.075f);
            }
            if (salario[i] > 1212.01 && salario[i] < 2427.35){
                valorInss[i] = (salario[i] * 0.09f);
            }
            if (salario[i] > 2427.36 && salario[i] < 3641.03){
                valorInss[i] = (salario[i] * 0.12f);
            }
            if (salario[i] > 3641.04){
                valorInss[i] = (salario[i] * 0.14f);
            }


            if (salario[i] <= 1903.98){
                impostoDeRenda[i] = (0f);
            }
            if (salario[i] > 1903.99 && salario[i] < 2826.65){
                impostoDeRenda[i] = (salario[i] * 0.075f);
            }
            if (salario[i] > 2826.66 && salario[i] < 3751.05){
                impostoDeRenda[i] = (salario[i] * 0.15f);
            }
            if (salario[i] > 3751.06 && salario[i] <= 4664.68){
                impostoDeRenda[i] = (salario[i] * 0.2250f);
            }
            if (salario[i] > 3641.04){
                impostoDeRenda[i] = (salario[i] * 0.2750f);
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