public class ClasseMain {

    public static void main (String... args) {
        System.out.println("Carro: Minivan Citroën Jumpy");
        Carro minivan = new Carro(4, 4, 69, "Diesel", 2018, "9 BW SU19F0 8 B302158" );
        minivan.setCor(Carro.PRETO);
        minivan.setArCondicionado("Sem");
        minivan.imprimeValores();

        System.out.println("Carro: Sportscar BMW I8");
        Carro sportscar = new Carro(4, 2, 30, "Híbrido (elétrico/gasolina)", 2020, "9 BW HE21J X 24060831");
        sportscar.setCor(Carro.VERMELHO);
        sportscar.setArCondicionado("Com");
        sportscar.imprimeValores();

        System.out.println("Avião: Boeing 737-800");
        Aviao boeing = new Aviao (34.30, 39.50);
        boeing.setEmpresaAerea(Aviao.BOEING);
        boeing.setMilitar("não");
        boeing.imprimeValores();

        System.out.println("Avião: Embraer C-390 Millennium");
        Aviao embraer = new Aviao(35.00,35.20);
        embraer.setEmpresaAerea(Aviao.EMBRAER);
        embraer.setMilitar("sim");
        embraer.imprimeValores();

    }

}
