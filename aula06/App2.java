import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        // Estrutura dinâmica
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p = new Pessoa();
        p.nome = "Emerson";

        listaPessoas.add(p);

        System.out.println("Quantidade de pessoas: " + listaPessoas.size());
        System.out.println("Nome 1: " + listaPessoas.get(0).nome);
        
        listaPessoas.remove(0);
        
        System.out.println("Quantidade de pessoas: " + listaPessoas.size());
        System.out.println("Nome 1: " + listaPessoas.get(0).nome);
    }
}
