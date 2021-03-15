public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";

    // Atributos

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusos;
    private String cor;
    private Integer quantidadePortas;
    private String arCondicionado;
    private Integer capacidadeTanque;

    // Construtor

    public Carro (Integer quantidadePneus, Integer quantidadePortas, Integer capacidadeTanque) {
       setQuantidadePneus(quantidadePneus);
       setQuantidadePortas(quantidadePortas);
       setCapacidadeTanque(capacidadeTanque);

    }

    // Métodos

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;

    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        quantidadeCalotas = quantidadePneus;
        quantidadeParafusos = quantidadePneus * 4;
        this.quantidadePneus = quantidadePneus;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;

    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;

    }

    public Integer getQuantidadeParafusos() {
        return quantidadeParafusos;

    }

    public void setQuantidadeParafusos(Integer quantidadeParafusos) {
        this.quantidadeParafusos = quantidadeParafusos;

    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void imprimeValores() {
        System.out.println("Quantidade Pneus " + getQuantidadePneus());
        System.out.println("Quantidade de calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos pneu " + getQuantidadeParafusos());
        System.out.println("Cor " + getCor());
        System.out.println("Quantidade de portas " + getQuantidadePortas());
        System.out.println("Capacidade do tanque " + getCapacidadeTanque() + "L");
        System.out.println("Ar Condicionado " + getArCondicionado() + "\n");
    }
}
