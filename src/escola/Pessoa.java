package escola;

public class Pessoa { //CLASSE PAI
    private String nome;
    private String sexo;
    private int idade;

    //contrutor
    public Pessoa(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    //METODOS ESPECÍFICOS

    //protected -> o metodo ficará visivel para as classes descendentes
    protected String pegarIdentidade(){
        if(sexo.equalsIgnoreCase("masculino")){
            return String.format("O %s", nome);
        } else{
            return String.format("A %s", nome);
        }
    }

    public void fazerAniversario(){
        String identidade = pegarIdentidade();
        System.out.format("O %s fez aniversário! \n", nome);
    }

    public void informacoesPessoais(){
        System.out.format("Nome: %s\nIdade: %d\nSexo: %s\n\n", nome, idade, sexo);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}