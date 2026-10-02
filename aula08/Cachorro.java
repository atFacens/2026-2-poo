public class Cachorro extends Animal {
    private boolean adestrado;

    public Cachorro(String nome, String raca, boolean adestrado) {
        super(nome, raca); // super == Animal (super classe do Cachorro)
        this.adestrado = adestrado;
    }

    
    @Override // sobrescrita
    public String exibirDados() {
        return "Nome: " + getNome() + " raça: " + getRaca() + " adestrado: " + adestrado;
    }

    @Override
    public String toString() {
        return exibirDados();
    }
}
