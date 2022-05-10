public abstract class LavaJato {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void molhar() {
        System.out.println("Lavando...");
    }

    public void secar() {
        System.out.println("Secando...");
    }

    public void passarPretinho() {
        System.out.println("Passando Pretinho...");
    }

    public void encerar() {
        System.out.println("Encerando...");
    }

    public void aspirar() {
        System.out.println("Aspirando...");
    }

    public void lavar(Carro car) {
        molhar();
        secar();
        aspirar();
        encerar();
        passarPretinho();
        efetuarPagamento();

    }

    public void lavar(Carro car, boolean polir) {
        lavar(car);
        System.out.println("Polindo carro...");

    }

    public void lavar(Moto moto) {
        molhar();
        secar();
        passarPretinho();
    }

    public abstract void efetuarPagamento();

}
