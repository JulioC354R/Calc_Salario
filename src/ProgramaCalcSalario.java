/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: ProgramaCalcSalario
 * Descrição: Desenvolva um programa que funcione como uma calculadora de valor a receber para 
 * um professor. O programa deve solicitar ao usuário o nome do professor e seu regime 
 * de pagamento, que pode ser: CLT, Horista ou PJ. 
 * Data: 16/06/2023
 */
import java.util.Scanner;

public class ProgramaCalcSalario {
    public static void main(String[] args) throws Exception {

        System.out.println("Programa cálculo de salario Professor");
        System.out.println("Insira o nome do Professor:");
        Scanner input =  new Scanner(System.in);
        String nomeProf = input.nextLine();

        System.out.println("Insira o Regime de Pagamento:");
        System.out.println("1 - CLT");
        System.out.println("2 - Horista");
        System.out.println("3 - PJ");
        int regimeEscolhido = input.nextInt();
        double ValorAReceber = 0;
        String NomeDoRegime = "";

        switch (regimeEscolhido) {
            case 1:
                System.out.println("Insira seu salário mensal:");
                Double salarioMensal = input.nextDouble();
                NomeDoRegime ="CLT";
                ValorAReceber = salarioMensal;
                break;

            case 2:
                System.out.println("Insira o quantidade de horas trabalhadas:");
                Double horas = input.nextDouble();
                NomeDoRegime ="Horista";

                System.out.println("Insira o valor hora de trabalho:");
                Double ValorHora = input.nextDouble();
                ValorAReceber = ValorHora * horas;

                break;

            case 3:
                System.out.println("Insira o valor do contrato:");
                Double ValorContrato = input.nextDouble();
                ValorAReceber = ValorContrato;
                    NomeDoRegime = "PJ";

                break;
            
            default:
            System.out.println("Ocorreu um erro, tente novamente mais tarde...");
                break;
        }

        System.out.printf("Nome: " + nomeProf + " \nRegime: " + NomeDoRegime + "\nValor a Receber: R$ %.2f" , ValorAReceber);
        input.close();
    }


}
