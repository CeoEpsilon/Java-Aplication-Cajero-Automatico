package clases;

import java.util.Scanner;

public abstract class PrincipalPadre {

    protected int transacciones;
    protected int retiro;
    protected int deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Por favor selecione una opcion;");
                System.out.println("     1. Consulta de saldo.");
                System.out.println("     2. Retiro de efectivo.");
                System.out.println("     3. Deposito de efectivo.");
                System.out.println("     4. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {

                    bandera = 1;
                } else {
                    System.out.println("------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentarlo.");
                    System.out.println("------------------------------------------");
                }

            } while (bandera == 0);

            switch (seleccion) {

                case 1:
                    PrincipalPadre cargar = new Consulta();
                    cargar.Transaccion();
                    break;
                case 2:
                    PrincipalPadre cargar1 = new Retiro();
                    cargar1.Transaccion();
                    break;
                case 3:
                    PrincipalPadre cargar2 = new Deposito();
                    cargar2.Transaccion();
                    break;
                case 4:
                    System.out.println("----------------------------");
                    System.out.println("Gracias!!! vuelva pronto");
                    System.out.println("----------------------------");
                    bandera = 2;
                    break;

            }
        } while (bandera != 2);
    }

    // Metodo solicitar retiro
    public void Retiro() {
        retiro = entrada.nextInt();
    }

    // Metodo realizar Deposito
    public void Deposito() {
        deposito = entrada.nextInt();
        if(deposito<0){
        System.out.println("ingrese solo numeros positivos ");
        deposito = entrada.nextInt();
        }
    }

    // Metodo Abstracto
    public abstract void Transaccion();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
