public class Iphone {
    private boolean ligado;

    public Iphone() {
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O celular está ligado.");
    }
    public void desligar() {
        ligado = false;
        System.out.println("O celular está desligado.");
    }
    public boolean estaLigado() {
        return ligado;
    }

    public boolean isLigado() {
        return ligado;
    }
}