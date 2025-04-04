package Formulario;
import SistemaEscolar.SistemaEscolar;
import java.util.Scanner;
public class Formulario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para entrada de dados do teclado
        SistemaEscolar aluno = new SistemaEscolar(); // Criação de um objeto da classe SistemaEscolar

        // Solicita e armazena o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine()); // Lê a entrada do usuário e define o nome

        // Solicita e armazena o RG do aluno
        System.out.print("Digite o RG do aluno: ");
        aluno.setRg(scanner.nextInt()); // Lê um número inteiro para o RG

        // Solicita e armazena o número de celular do aluno
        System.out.print("Digite o número de celular: ");
        aluno.setCelular(scanner.nextInt()); // Lê um número inteiro para o celular
        scanner.nextLine(); // Consome a quebra de linha pendente após nextInt()

        // Solicita e armazena o nome da mãe do aluno
        System.out.print("Digite o nome da mãe: ");
        aluno.setNomeMae(scanner.nextLine()); // Lê a entrada do usuário para o nome da mãe

        System.out.print("Digite o numero da fila aqui: ");
        aluno.setFila(scanner.nextInt());
        aluno.verPosicao();
        
        // Exibe os dados cadastrados do aluno
        System.out.println("\nCadastro do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("RG: " + aluno.getRg());
        System.out.println("Celular: " + aluno.getCelular());
        System.out.println("Nome da Mãe: " + aluno.getNomeMae());
        System.out.println("Sobre sua posição !: " + aluno.verPosicao());

        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}
