package escola;

//RECEBE A CLASSE ABSTRATA (Verba), sendo obrigada a usar os métodos da classe abstrata

public class Instituto extends Verba {
    private String nome;
    private String endereco;

    public Instituto(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void entrarVerba() { //obrigatorio receber os mesmos métodos da classe abstrata na qual está herdada
        System.out.format("Entrou Verba no Instituto %s.\n", nome);
    }

    public void sairVerba() {
        System.out.format("Saiu Verba do Instituto %s.\n", nome);
    }
    //usando méodo FINAL, nao podendo ser alterado em nenhuma outra classe.
    public final void promoverEvento(){
        final String evento = "Arraiá Dos Federais";
        System.out.format("O %s promoveu o evento %s.",nome, evento);
    }
    
}
