//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Figuras figurin = new Figuras();
            boolean salir;
            Scanner sc= new Scanner(System.in);

            System.out.println("Escribe el tamaño del lado");
            int altura= sc.nextInt();
            System.out.println("Escriba la opcion que quiere dibujar: 1:Cuadrado " +
                    "\n 2:Triangulo Rectangulo " +
                    "\n 3:Triangulo Rectangulo invertido " +
                    "\n 4:Triangulo Equilatero " +
                    "\n 5:Triangulo Rectangulo Espejo " +
                    "\n 6:Triangulo Rectangulo Inverso Espejo " +
                    "\n 7:Rombo ");
            int opciones = sc.nextInt();
            while (opciones <1 ||opciones>7)
            {
                System.out.println("Valor no admitido, vuelva a introducirlo");
                opciones = sc.nextInt();
            }
            do
            {
                salir = false;
                switch (opciones)
                {
                    case 1:

                        System.out.println("Dibujando cuadrado...");
                        System.out.println();
                        figurin.Cuadrado(altura);


                        break;

                    case 2:
                        System.out.println("Dibujando Triangulo Rectangulo...");
                        System.out.println();
                        figurin.Triangulo(altura);


                        break;

                    case 3:

                        System.out.println("Dibujando Triangulo Rectangulo Inverso...");
                        System.out.println();
                        figurin.TrianguloInver(altura);


                        break;

                    case 4:

                        System.out.println("Dibujando Triangulo Eqilatero...");
                        System.out.println();
                        figurin.TrianguloEqui(altura);


                        break;

                    case 5:

                        System.out.println("Dibujando Triangulo Rectangulo Espejo...");
                        System.out.println();
                        figurin.TrianguloEspj(altura);


                        break;

                    case 6:

                        System.out.println("Dibujando Triangulo Rectangulo Inverso Espejo...");
                        System.out.println();
                        figurin.TrianguloInverEspj(altura);


                        break;
                    case 7:
                        System.out.println("Dibujando rombo...");
                        System.out.println();
                        figurin.Rombo(altura);
                        break;

                }
                System.out.println();
                System.out.println("Pulsa s y enter si quiere continuar o cualquier otra tecla y enter para salir");
                System.out.println();
                String cadena=sc.next();
                if (cadena == "s")
                {
                    System.out.println("Vuelva a seleccionar un numero entre 1 y 6");
                    opciones = sc.nextInt();
                }
                else
                {
                    System.out.println("Saliendo...");
                    salir = true;
                }

            } while (salir == false);
        }
    }
}