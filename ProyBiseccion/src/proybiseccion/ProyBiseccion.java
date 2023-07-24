package proybiseccion;

public class ProyBiseccion {

    public static void main(String[] args) {
        
        Biseccion B = new Biseccion();
        B.setIntervalo(0.1, 0.5);
        B.setEs(0.01);
        B.biseccion(20);        
        System.out.println("La raiz es: "+ B.getRaiz());
    }    
}
