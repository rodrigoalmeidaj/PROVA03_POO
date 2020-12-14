package escola;

public class Aluno extends Pessoa{ //CLASSE FILHA DE PESSOA
    private int matricula;
    private String curso;

    //contrutor
    public Aluno(String nome, String sexo, int idade, int matricula, String curso){
        super(nome, sexo, idade); //usando super no constructor da classe filha
        this.matricula = matricula;
        this.curso = curso;
    }

    public void trancarMatricula(){
        String identidade = pegarIdentidade();
        super.informacoesPessoais(); //super em um metodo fora do construtor(específico)
        System.out.format("%s trancou a matrícula.\n\n", identidade);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}