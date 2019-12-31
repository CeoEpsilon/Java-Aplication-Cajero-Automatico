
package clases;

public class Consulta extends PrincipalPadre{
 
    @Override
    public void Transaccion() {
        System.out.println("-------------------------------");
        System.out.println("tu saldo Actual es: "+getSaldo());
        System.out.println("-------------------------------");
    }
}
