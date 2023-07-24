public class ProyPila {
    public static void main(String[] args) throws Exception {
        Pila P = new Pila();
        P.cargar(4);
        System.out.println(P);
        int suma = 0;
        while (!P.vacia()) {
            int a = P.pop();
            suma += a;
        }
        System.out.println("La suma es: " + suma);
        //te voy a preñar en julio, julio 
    }
}
