public class ClasseMain {

    public static void main (String... args) {
        System.out.println("Minivan");
        Carro minivan = new Carro(4, 4, 69);
        minivan.setCor(Carro.PRETO);
        minivan.setCombustivel(Carro.DIESEL);
        minivan.setArCondicionado("Sem");
        minivan.imprimeValores();

        System.out.println("Sportscar");
        Carro sportscar = new Carro(4, 2, 30);
        sportscar.setCor(Carro.VERMELHO);
        sportscar.setCombustivel(Carro.HIBRIDO);
        sportscar.setArCondicionado("Com");
        sportscar.imprimeValores();
    }
}
