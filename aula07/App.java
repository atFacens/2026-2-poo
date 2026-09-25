import java.util.Scanner;

import base.Pessoa;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();

        pessoa.setNome("Emerson");

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        aluno.setNome(nome);
        aluno.setRa(12345);

        System.out.println(aluno.getNome() + ": " + aluno.getRa());

        scanner.close();
    }
}
