import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o professor
        Professor professor = new Professor("Marina", "74123698");

        // Cria a disciplina e passa o nome da disciplina e o professor como parâmetro
        Disciplina disciplina = new Disciplina("POO", professor, null);

        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while (option != 4) {
            // Exibe o menu
            System.out.println("\n------SISTEMA DE DISCIPLINAS-------");
            System.out.println("Menu:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Exibir alunos");
            System.out.println("3. Exibir informações da disciplina");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Verifica se já foram adicionados 10 alunos
                    if (disciplina.getQuantidadeAlunos() < 10) {
                        // Adiciona aluno à disciplina
                        System.out.print("Digite o nome do aluno: ");
                        String nomeAluno = scanner.next();
                        System.out.print("Digite o ID do aluno: ");
                        int idAluno = scanner.nextInt();
                        Alunos aluno = new Alunos(nomeAluno, idAluno);
                        disciplina.adicionarAluno(aluno);
                    } else {
                        System.out.println("A disciplina só pode conter dez alunos!");
                    }
                    break;
                case 2:
                    // Exibe os alunos da disciplina
                    disciplina.imprimirInfo();
                    break;
                case 3:
                    // Exibe informações da disciplina
                    System.out.println("Informações da disciplina:");
                    disciplina.imprimirInfo();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma das opções informadas.");
                    break;
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
