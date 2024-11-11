import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>> INÍCIO SOFTWARE ALUNO <<<");
        
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Informe o sexo (M/F): ");
        String sexo = scanner.nextLine();

        System.out.print("Informe a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Informe o Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Informe o ano de início: ");
        int anoInicio = scanner.nextInt();

        System.out.print("Informe a Nota da Prova 1: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Informe a Nota da Prova 2: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Informe a média dos Trabalhos: ");
        double mediaTrabalhos = scanner.nextDouble();

        // Criação do objeto Aluno
        Aluno aluno = new Aluno(nome, matricula, sexo, dataNascimento, curso, anoInicio, notaProva1, notaProva2, mediaTrabalhos);

        // Cálculo da média final
        double mediaFinal = aluno.calcularMediaFinal();
        String situacao = aluno.estaAprovado() ? "Aprovado" : "Reprovado";

        // Exibição das informações
        System.out.println("\n ##INFORMAÇÕES## ");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome do curso: " + aluno.getCurso());
        System.out.printf("Situação: %s com média %.2f%n", situacao, mediaFinal);
        
        System.out.println(">>> Fim da execução do software <<<");

        scanner.close();
    }
}
