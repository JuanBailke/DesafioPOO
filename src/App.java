public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.exibirPagina("https://github.com/JuanBailke");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Minha Música Favorita");
    }
}
