public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private Arbitro arbrito;
    private boolean ganhador;
    private boolean status;
    private byte rounds;
    private int id;

    public Luta(byte rounds, int id, Lutador desafiado, Lutador desafiante) {
        this.rounds = rounds;
        this.id = id;
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }

    public void statusLuta(){
        if (isStatus()){
            System.out.println("Luta realizada!");
        } else {
            System.out.println("Luta não realizada!");
        }
    }
    public void apresentarLuta(){

    }
    public void verLuta(){
        System.out.println("Desafiante -> " + this.desafiante.statusLutador() + "\n VS \n" + "Desafiado -> " + this.desafiado.statusLutador());

    }

    public void realizarLuta(){
        this.arbrito.aumentarArbitragens();
        //se desafiante ganhar ganhador = true e status = true
        //se desafiado ganhar ganhador = false e status = true

    }

    public Lutador retornarGanhador(){
        if (ganhador){
            return this.desafiante;
        } else {
            return this.desafiado;
        }

    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Arbitro getArbrito() {
        return arbrito;
    }

    public void setArbrito(Arbitro arbrito) {
        this.arbrito = arbrito;
    }

    private boolean isGanhador() {
        return ganhador;
    }

    public void setGanhador(boolean ganhador) {
        this.ganhador = ganhador;
    }

    public byte getRounds() {
        return rounds;
    }

    public void setRounds(byte rounds) {
        this.rounds = rounds;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
