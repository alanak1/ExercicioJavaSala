/*import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    //Atributo da classe disciplina
    private String nome;
    //Objeto associado à classe disciplina (disciplina têm obrigatóriamente um professor)
    private Professor professor;
    private List<Alunos> alunos;

    //Construtor que recebe um objeto do tipo Professor por cópia
    public Disciplina(String nome, Professor professor, Alunos alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }


    //Construtor que recebe os atributos de um professor e instancia o objeto professor dentro da classe
    public Disciplina(String nome, String nomeProf, String codRh) {
        this.nome = nome;
        this.professor = new Professor(nomeProf, codRh);
    }

    public int getQuantidadeAlunos() {
        return alunos.size();
    }
    
    public void adicionarAluno(Alunos aluno) {
        if (alunos.size() < 10) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado à disciplina " + nome);
        } else {
            System.out.println("A disciplina já possui 10 alunos e não pode aceitar mais alunos.");
        }
    }


    public void listarAlunos() {
        System.out.println("Lista de alunos na disciplina " + nome + ":");
        for (Alunos aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
    

    //Método que imprime informações da disciplina, acessa informação do professor pelo método getNome()
    public void imprimirInfo() {
        System.out.print("\n--------INFO DISCIPLINA--------\n");
        System.out.print("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome() + "\n");
        listarAlunos(); // Chama o método para listar os alunos
        System.out.print("-------------------------------\n\n");
    }

    //Método que recebe as informações do novo professor e substitui a instância associada à classe
    public void substituirProfessor(String codRh, String nome) {
        this.professor.setCodRh(codRh);
        this.professor.setNome(nome);
        //this.professor = new Professor(nome, codRh);
    }

    public void alunosDisciplina (String nome, String codigoId) {

    }

    public Professor getProfessor() {
        return professor;
    }
}*/
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    // Atributo da classe disciplina
    private String nome;
    // Objeto associado à classe disciplina (disciplina têm obrigatóriamente um professor)
    private Professor professor;
    private List<Alunos> alunos;

    // Construtor que recebe um objeto do tipo Professor por cópia
    public Disciplina(String nome, Professor professor, Alunos alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Construtor que recebe os atributos de um professor e instancia o objeto professor dentro da classe
    public Disciplina(String nome, String nomeProf, String codRh) {
        this.nome = nome;
        this.professor = new Professor(nomeProf, codRh);
        this.alunos = new ArrayList<>();
    }

    // Método para adicionar aluno à disciplina
    public void adicionarAluno(Alunos aluno) {
        if (alunos.size() < 10) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado à disciplina " + nome);
        } else {
            System.out.println("A disciplina só pode conter dez alunos!");
        }
    }

    // Método para imprimir informações da disciplina
    public void imprimirInfo() {
        System.out.print("\n--------INFO DISCIPLINA--------\n");
        System.out.print("Disciplina: " + this.nome + "\n");
        System.out.print("Professor: " + this.professor.getNome() + "\n");
        System.out.print("Código RH do Professor: " + this.professor.getCodRh() + "\n");
        System.out.print("Alunos em sala: ");
        for (Alunos aluno : alunos) {
            System.out.print(aluno.getNome() + ", ");
        }
        System.out.print("\n-------------------------------\n\n");
    }

    // Método para substituir o professor
    public void substituirProfessor(String codRh, String nome) {
        this.professor.setCodRh(codRh);
        this.professor.setNome(nome);
    }

    // Método para obter o professor da disciplina
    public Professor getProfessor() {
        return professor;
    }

    // Método para obter a quantidade de alunos na disciplina
    public int getQuantidadeAlunos() {
        return alunos.size();
    }
}
