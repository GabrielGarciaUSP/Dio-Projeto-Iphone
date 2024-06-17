public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String modelo;
    private String numeroSerie;

    //Construtor
    public Iphone(String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    // Métodos do Reprodutor Musical
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos do Aparelho Telefonico

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }


    public void atender() {
        System.out.println("Atendendo chamada.");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do Navegador de Internet

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }


    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Métodos get e set 
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}

