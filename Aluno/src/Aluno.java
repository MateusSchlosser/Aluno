public class Aluno {
    private String nome;
    private String matricula;
    private String sexo;
    private String dataNascimento;
    private String curso;
    private int anoInicio;
    private double notaProva1;
    private double notaProva2;
    private double mediaTrabalhos;

    // Construtor
    public Aluno(String nome, String matricula, String sexo, String dataNascimento, 
                 String curso, int anoInicio, double notaProva1, 
                 double notaProva2, double mediaTrabalhos) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.anoInicio = anoInicio;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.mediaTrabalhos = mediaTrabalhos;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    // Método para calcular a média final
    public double calcularMediaFinal() {
        return (notaProva1 + notaProva2 + mediaTrabalhos) / 3.0;
    }

    // Método para verificar aprovação
    public boolean estaAprovado() {
        return calcularMediaFinal() >= 6.0;
    }
}
