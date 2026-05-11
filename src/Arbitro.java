public class Arbitro extends Pessoa{
    private byte arbitragens;

    public Arbitro(String nome, String nacionalidade, byte idade, byte altura, byte arbitragens) {
        super(nome, nacionalidade, idade, altura);
        this.arbitragens = arbitragens;
    }
    public void aumentarArbitragens(){
        setArbitragens((byte)(getArbitragens() + 1));
    }

    public byte getArbitragens() {
        return arbitragens;
    }

    public void setArbitragens(byte arbitragens) {
        this.arbitragens = arbitragens;
    }
}
