public class main  {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 14 Pro Max","1420242301");

    //Reprodutor Musical
    iphone.selecionarMusica("The Last of the real Ones");
    iphone.tocar();
    iphone.pausar();

    //Navegador de Internet
    iphone.adicionarNovaAba();
    iphone.exibirPagina("https://github.com/GabrielGarciaUSP/Bootcamp-Santander");
    iphone.atualizarPagina();

    //Aparelho Telefônico 
    iphone.ligar("(18)912345678");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    //Métodos getters e setters 
    System.out.println("Modelo do iPhone: " + iphone.getModelo());
    iphone.setModelo("iPhone 15 Pro Max");
    System.out.println("Modelo do iPhone: " + iphone.getModelo());
    System.out.println("Número de série do iPhone: " + iphone.getNumeroSerie());
    iphone.setNumeroSerie("1520242301");
    System.out.println("Novo número de série do iPhone: " + iphone.getNumeroSerie());

    }
}
