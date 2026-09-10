public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Carlos";
        p1.idade = 23;

        System.out.println(p1.nome + " - " + p1.idade);

        p1 = new  Pessoa();
        p1.nome = "Daniel";

        System.out.println(p1.nome + " - " + p1.idade);

        Endereco ender = new Endereco();
        ender.nome = "Av Paulista";
        ender.numero = 123;
        ender.cidade = "São Paulo";

        p1.endereco = ender;

        System.out.println("O " + p1.nome + " mora em " + p1.endereco.cidade);
    }
}
