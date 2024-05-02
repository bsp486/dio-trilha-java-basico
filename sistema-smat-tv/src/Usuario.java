public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.statusTV();

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.statusTV();

        smartTv.aumentarVolume();
        smartTv.statusTV();

        smartTv.mudarCanal(26);
        smartTv.statusTV();

    }
}
