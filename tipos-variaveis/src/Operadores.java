public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero); //-5
        System.out.println(numero); //5
        numero = -numero;
        System.out.println(numero); //-5
        numero = +numero;
        System.out.println(numero); //-5
        numero = numero * -1;
        System.out.println(numero); //5
        numero = numero + 1;
        System.out.println(numero); //6
        numero++;
        System.out.println(numero); //7
        System.out.println(numero++); //7
        System.out.println(numero); //8
        System.out.println(++numero);//9
        System.out.println(numero);//9

        boolean falso = false;
        System.out.println(falso);
        System.out.println(!falso);

    }
}
