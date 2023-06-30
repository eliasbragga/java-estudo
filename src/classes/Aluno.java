package classes;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String curso) {
        super("Pedrinho", 24, 1.60f);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
