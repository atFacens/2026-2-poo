public class App {
    public static void main(String[] args) {
        // int idade;

        // idade = 18;

        // if(idade >= 18) {
        //     System.out.println("Maior de idade");
        // } else {
        //     System.out.println("Menor de idade");
        // }

        Pessoa p = new Pessoa();
        p.idade = 23;
        p.nome = "Marcos";
        p.apresentar();
        p.classificarIdade();

        Pessoa p2 = new Pessoa();
        p2.idade = 17;
        p2.nome = "Ana";
        p2.apresentar();
        p2.classificarIdade();

    }
}
