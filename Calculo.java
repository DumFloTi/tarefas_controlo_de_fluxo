package tarefas_controlo_fluxo;
/**
 * Pedimos as 4 notas ao usuario, depois mostramos a media da notas
 */
import java.util.Scanner;

public class Calculo {
    public static void main(String args[]){
        Operadores operadores = new Operadores();
        //Com o scanner conseguimos usar o que for inserido pelo usuario
        Scanner scanner = new Scanner(System.in);

        //Pedir cada nota, usando a validação
        operadores.setNota1(lerNota(scanner, "primeira"));
        operadores.setNota2(lerNota(scanner, "segunda"));
        operadores.setNota3(lerNota(scanner, "terceira"));
        operadores.setNota4(lerNota(scanner, "quarta"));

        //Calcular a média
        double media = operadores.calcularMedia();

        //Devolver a média, com mensagem de apoio ou felicitação, dependendo da media
        System.out.println("A média das notas é: " + media);
        operadores.mensagemMediaZero();
        operadores.mensagemMediaMaiorOuIgualSete();
        operadores.mensagemMediaMaiorOuIgualCinco();
        operadores.mensagemMediaMenorCinco();

        scanner.close();
    }

    //Método para validar, se a nota é menor que 0 ou maior que 20 e exibir uma mensagem de erro, caso seja o caso
    private static double lerNota(Scanner scanner, String ordemNota) {
        double nota;
        while (true) {
            System.out.println("Digite a " + ordemNota + " nota:");
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 20) {
                return nota;
            } else {
                System.out.println("Nota inválida. A nota deve estar entre 0 e 20. Tente novamente.");
            }
        }
    }
}