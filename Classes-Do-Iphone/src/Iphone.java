/**
 * Iphone
 */
public class Iphone implements NavegadorDeinternet, ReproduzirMusica, DispositivoCelular{
    private String musica;

    public void setMusica(String musica) {
        this.musica = musica;
    }

   
    public void ligar(int numero) {
System.out.println("Ligando "+ numero);
    }

    
    public void atender() {
        System.out.println("ATENDENDO CHAMADA ");
    }

   
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

  
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

   
    public void adicionandoNovaAba() {
        System.out.print("NOVA ABA ADICIONADA");
    }

   
    public void atualiarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
    }

   
    public void tocar() {
        System.out.println("TOCANDO MÚSICA "+ this.musica);
    }

    
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");

    }

    
    public void selecionarMusica(String musica) {
        System.out.println("TOCANDO "+ musica);
    }  
}