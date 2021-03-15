public class Aviao {

    public static final String BOEING = "Boeing";
    public static final String EMBRAER = "Embraer";

    // Atributos

    private Double envergadura;
    private String empresaAerea;
    private Double comprimento;
    private String militar;

    // Construtor

    public Aviao (Double envergadura, Double comprimento) {
        setEnvergadura(envergadura);
        setComprimento(comprimento);

    }

    // Métodos

    public Double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public String getEmpresaAerea() {
        return empresaAerea;
    }

    public void setEmpresaAerea(String empresaAerea) {
        this.empresaAerea = empresaAerea;
    }

    public String getMilitar() {
        return militar;
    }

    public void setMilitar(String militar) {
        this.militar = militar;
    }

    public void imprimeValores() {
        System.out.println("Envergadura " + getEnvergadura() + "m");
        System.out.println("Empresa " + getEmpresaAerea());
        System.out.println("Comprimento " + getComprimento() + "m");
        System.out.println("Militar " + getMilitar() + "\n");
    }
}
