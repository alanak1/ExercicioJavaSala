//Classe de exemplo utilizada para mostrar a associação do mesmo objeto à diferentes classes
public class EscolaPolitecnica {
    private Professor professor;

    public EscolaPolitecnica(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeProfessor() {
        return this.professor.getNome();
    }

    




}
