public class Carro {

    public static final String VERMELHO = "vermelha";
    public static final String PRETO = "preta";

    // Atributos

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusos;
    private String cor;
    private Integer quantidadePortas;
    private Integer capacidadeTanque;
    private String combustivel;
    private Integer anoFabricacao;
    private String numeroChassi;
    private String arCondicionado;

    // Construtor

    public Carro (Integer quantidadePneus, Integer quantidadePortas, Integer capacidadeTanque, String combustivel, Integer anoFabricacao, String numeroChassi) {
       setQuantidadePneus(quantidadePneus);
       setQuantidadePortas(quantidadePortas);
       setCapacidadeTanque(capacidadeTanque);
       setCombustivel(combustivel);
       setAnoFabricacao(anoFabricacao);
       setNumeroChassi(numeroChassi);

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

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
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
        System.out.println("Combustível " + getCombustivel());
        System.out.println("Ano de fabrição " + getAnoFabricacao());
        System.out.println("Número do chassi " + getNumeroChassi());
        System.out.println("Ar Condicionado " + getArCondicionado() + "\n");
    }
}
