public class Professor {
    //Atributos da classe Professor
    private String codRh;
    private String nome;

    //Construtor que recebe os valores e os insere nos atributos da classe
    public Professor(String nome, String codRh) {
        this.nome = nome;
        this.codRh = codRh;
    }

    //Getters e Setters dos atributos de professor
    public String getCodRh() {
        return codRh;
    }

    public void setCodRh(String codRh) {
        this.codRh = codRh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
