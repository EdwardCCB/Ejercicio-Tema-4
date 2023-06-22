public class Main {
    public static void main(String[] args) {
        var numeroIf = 5;

        if(numeroIf >= 0){
            System.out.println("Es positivo");
        }

        else{
            System.out.println("Es negativo");
        }

        var numeroWhile = -1;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        var numeroDoWhile = 2;

        do {
            numeroWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroWhile < 3);

        for (; numeroWhile <= 3; numeroWhile++){
            System.out.println(numeroWhile);
        }

        var estacion = "Verano";
        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;

            case "Verano":
                System.out.println("Es verano");
                break;

            case "Invierno":
                System.out.println("Es invierno");
                break;

            case "Otoño":
                System.out.println("Es otoño");
                break;

            default:
                System.out.println("NO es ninguna estación");
                break;
        }
    }
}