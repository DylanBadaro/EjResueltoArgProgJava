package EjArgProg.Clase1;

public class Main {
    public static void main(String[] args) {
        //1a
        int start = 0, fin = 10;
        while (start <= fin){
            System.out.println(start);
            start += 1;
        }

        //1b
        /*int start = 0, fin = 10;
        while (start <= fin){
            if(start%2==0){
            System.out.println(start);}
            start += 1;
        }*/

        //1c
        /*Scanner s = new Scanner(System.in);
        int start = 0, end = 10, option = 1;
        switch (option){
            case 1 :
                while (start <= end){
                    if(start%2==1){
                        System.out.println(start);}
                    start += 1;
                }
                break;
            case 0:
                while (start <= end){
                    if(start%2==0){
                        System.out.println(start);}
                    start += 1;
                }
                break;
            default:
                System.out.println("Ingreso mal el numero");
        }*/

        //1d

        /*Scanner s = new Scanner(System.in);
        int start = 0, end = 10, option;
        System.out.println("Ingrese su eleccion");
        System.out.println("0 = par    1 = impar");
        option = s.nextInt();
        switch (option){
            case 1 :
                while (start <= end){
                    if(start%2==1){
                        System.out.println(start);}
                    start += 1;
                }
                break;
            case 0:
                while (start <= end){
                    if(start%2==0){
                        System.out.println(start);}
                    start += 1;
                }
                break;
            default:
                System.out.println("Ingreso mal el numero");
        }*/

        /*
        for(int i = 10; i >= 0;i-- ) {
            if (i%2==0) {
                System.out.println(i);
            }
        }*/


        //        PUNTO 2|
        /*
        Scanner s = new Scanner(System.in);
        int ingresos = 0, nVehiculo = 0,antiguedadVehiculo = 0,nInmuebles = 0, lujo = 0;

        System.out.println("Escriba los ingresos mensuales totales del hogar");
        ingresos = s.nextInt();
        System.out.println("Ingrese la cantidad de vehiculos adquiridos actualmente");
        nVehiculo = s.nextInt();
        System.out.println("Ingrese la antiguedad del vehiculo en anios");
        antiguedadVehiculo = s.nextInt();
        System.out.println("Ingrese la cantidad de inmuebles adquiridos actualmente");
        nInmuebles = s.nextInt();
        System.out.println("Seleccione una opcion adquirida\n" +
                        "0: Ninguno de estos\n" +
                "1: Embarcacion\n" +
                "2: Aeronave de lujo\n" +
                "3: Activos societarios"
                );
        lujo = s.nextInt();

        if(ingresos >= 489083){System.out.println("Forma parte de el segmento de ingresos altos");}
        else if(nVehiculo >= 3 && antiguedadVehiculo <= 5)System.out.println("Forma parte de el segmento de ingresos altos");
        else if(nInmuebles >= 3)System.out.println("Forma parte de el segmento de ingresos altos");
        else if(lujo > 0)System.out.println("Forma parte de el segmento de ingresos altos");
        else System.out.println("No forma parte de el segmento de ingresos altos");
        */

        /*
        if((ingresos >= 489083) || ((nVehiculo >= 3) && (antiguedadVehiculo <= 5)) || (nInmuebles >= 3) || (lujo > 0)){
            System.out.println("Forma parte de el segmento de ingresos altos");
        }
        else System.out.println("No forma parte de el segmento de ingresos altos");*/



    }
}
