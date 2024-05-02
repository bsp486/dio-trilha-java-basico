public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume aumentado");
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("volume diminuido");
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("canla"+this.canal);
    }

    public void statusTV(){
        System.out.println("TV Ligada ?: "+this.ligada);
        System.out.println("Canal Atual ?: "+this.canal);
        System.out.println("Volume Atual ?: "+this.volume);
    }
}
