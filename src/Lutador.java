public class Lutador extends Pessoa{
    private String categorias;
    private double peso;
    private byte vitorias;
    private byte derrotas;
    private byte empates;

    public Lutador(String nome, String nacionalidade, byte idade, double altura, double peso, byte vitorias, byte derrotas, byte empates) {
        super(nome, nacionalidade, idade, altura);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        setPeso(peso);
    }

    public void empatarLuta(){
        setEmpates((byte)(getEmpates() + 1));
    }

    public void perderLuta(){
       setDerrotas((byte)(getDerrotas() + 1));
    }

    public void ganharLuta(){
        setVitorias((byte)(getVitorias() + 1));
    }

    public void apresentarLutador(){
        System.out.printf("Nome: %s Nacionalidade: %s Idade: %d Altura: %.2f Peso: %.2f Categoria: %s Vitorias: %d Derrotas: %d Empates: %d",getNome(), getNacionalidade(),getIdade(), getAltura(), getPeso(), getCategorias(), getVitorias(), getDerrotas(), getEmpates());
    }
    public String statusLutador() {
        return String.format(
                "Nome: %s Altura: %.2f Peso: %.2f Categoria: %s",
                getNome(),
                getAltura(),
                getPeso(),
                getCategorias()
        );
    }
    public String getCategorias() {
        return categorias;
    }

    private void setCategorias(double peso) {
        if (peso > 56.7 && peso <= 61.2){
            this.categorias = "Galo";
        } else if (peso <= 65.8) {
            this.categorias = "Pena";
        } else if (peso <= 70.3) {
            this.categorias = "Leve";
        } else if (peso <= 77.1) {
            this.categorias = "Meio-Médio";
        } else if (peso <= 83.9) {
            this.categorias = "Médio";
        } else if (peso <= 93.0) {
            this.categorias = "Meio-Pesado";
        } else if (peso <= 120.2) {
            this.categorias = "Pesado";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategorias(this.peso);
    }

    public byte getVitorias() {
        return vitorias;
    }

    private void setVitorias(byte vitorias) {
        this.vitorias = vitorias;
    }

    public byte getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(byte derrotas) {
        this.derrotas = derrotas;
    }

    public byte getEmpates() {
        return empates;
    }

    private void setEmpates(byte empates) {
        this.empates = empates;
    }
}
