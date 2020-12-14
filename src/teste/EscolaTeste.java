package teste;

import escola.Aluno;
import escola.Pessoa;
import escola.Diretor;
import escola.Instituto;

public class EscolaTeste {
    public static void main(String[] args) {
        System.out.println("Classe (Pessoa).");
        Pessoa p1 = new Pessoa("João", "Masculino", 46);
        p1.informacoesPessoais();

        System.out.println("Classe (Aluno).");
        Aluno p2 = new Aluno("Rodrigo", "Masculino", 25, 542398, "ADS");
        p2.trancarMatricula();

        System.out.println("Classe (Diretor).");
        Diretor p3 = new Diretor("Paulo", "Masculino", 53, "Programação");
        p3.informacoesPessoais(); //usando o método que foi sobrescrito.
        p3.receber();
        p3.receber(2); // usando o método sobrecarregado
        

        System.out.println("Classe (Instituto).");
        Instituto instituto1 = new Instituto("IFTM", "LONGE PRA KARALEO");
        instituto1.entrarVerba();
        instituto1.sairVerba();
        instituto1.promoverEvento();

    }

}
