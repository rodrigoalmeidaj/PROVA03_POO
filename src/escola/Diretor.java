package escola;

    //classe final, nao podendo ser herdada por nenhuma outra classe
public final class Diretor extends Pessoa { //CLASSE FILHA DE PESSOA
    private String especialidade;
    private double salario;

    //construtor
    public Diretor(String nome, String sexo, int idade, String especialidade){
        super(nome, sexo, idade); //usando método super dentro do construtor
        this.especialidade = especialidade;
    }

    public void receber(){
        salario = 18530;
        System.out.format("O Salario atual do %s é %.2f.\n", getNome(), salario);
    }
    //Sobrecarga de método
    public void receber(double aumento){
        aumento = 1280;
        salario = 18530+ aumento;
        System.out.format("O %s recebeu um aumento de R$%.2f e seu salario atual é: R$%.2f.\n\n\n", getNome(), aumento, salario);
    }
    //sobrescrita de método.
    public void informacoesPessoais(){
        System.out.format("Nome: %s\nIdade: %d\nSexo: %s\nSalario: %.2f\n", getNome(), getIdade(), getSexo(), salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}