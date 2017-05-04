package programacion;
 class CuentaBancaria {
        public int saldo;
    }
public class variables {

    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo +=10;
    }
    
    public static void sumarSaldo(int saldo){
        saldo +=10;
    }
    public static void main(String[] args) {
    CuentaBancaria ct1 = new CuentaBancaria();
    CuentaBancaria ct2 = new CuentaBancaria();
    CuentaBancaria ct3 = new CuentaBancaria();
    CuentaBancaria ct4 = new CuentaBancaria();
    CuentaBancaria ct5 = new CuentaBancaria();
    CuentaBancaria ct6 = new CuentaBancaria();
    CuentaBancaria ct7 = new CuentaBancaria();
    CuentaBancaria ct8 = new CuentaBancaria();
    CuentaBancaria ct9 = new CuentaBancaria();
    CuentaBancaria ct10 = new CuentaBancaria();
    
    ct1.saldo = 1000; 
    ct2.saldo = 656; 
    ct3.saldo = 233; 
    ct4.saldo = 9000; 
    ct5.saldo = 788799; 
    ct6.saldo = 567; 
    ct7.saldo = 8999; 
    ct8.saldo = 150; 
    ct9.saldo = 7687; 
    ct10.saldo = 54667; 
     
    sumarSaldo(ct1);
    sumarSaldo(ct2);
    sumarSaldo(ct3);
    sumarSaldo(ct4);
    sumarSaldo(ct5);
    ct5 = ct3;
    sumarSaldo(ct6);
    sumarSaldo(ct7);
    ct7 = ct2;
    sumarSaldo(ct8);
    sumarSaldo(ct9);
    sumarSaldo(ct10);
    ct10 = ct4;
    System.out.println(ct1.saldo);
    System.out.println(ct2.saldo);
    System.out.println(ct3.saldo);
    System.out.println(ct4.saldo);
    System.out.println(ct5.saldo);
    System.out.println(ct6.saldo);
    System.out.println(ct7.saldo);
    System.out.println(ct8.saldo);
    System.out.println(ct9.saldo);
    System.out.println(ct10.saldo);
    }
    
}
