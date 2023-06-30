package classes;

import interfaces.IPessoa;

public class PessoaQueAnda extends Pessoa implements IPessoa {
    String sexo = "M";

    public PessoaQueAnda(String nome, int idade, float altura) {
        super(nome, idade, altura);
    }

    public void andar() {
        System.out.println("Oto andando");
    }

    public void falar() {
        System.out.println("Oto Hablando");
    }

    public void teste() {
        System.out.println("sexo: " + this.sexo);
    }

    public void pegaNomeDaClasse() {
        System.out.println(this.getClass().toGenericString());
    }
}
