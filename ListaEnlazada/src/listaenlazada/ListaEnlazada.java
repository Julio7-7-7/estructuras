package listaenlazada;

import javax.swing.JOptionPane;

public class ListaEnlazada {

    public static void main(String[] args) {
        
        /*
        //Simple impresión
        Nodo L,P,Q;
        
        L = new Nodo();
        P = new Nodo();
        Q = new Nodo();
        
        L.ponerData(1);
        L.ponerLink(P);
        
        P.ponerData(2);
        P.ponerLink(Q);
        
        Q.ponerData(3);
        Q.ponerLink(Nodo.TIERRA);
        
        Nodo R = L;
        while(R!=Nodo.TIERRA){
            System.out.print(R.data()+" , ");
            R = R.link();
        }
        System.out.println("");
        */
        
        //Mostrar y cargar nodo
        /*
        int n;
        int val;
        
        Nodo L = Nodo.TIERRA;
        Nodo Aux;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));
        
        for(int i=1; i<=n;i++){
            val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            Aux = new Nodo();
            Aux.ponerData(val);
            Aux.ponerLink(L);
            L = Aux;
        }
        Nodo R = L;
        while(R!=Nodo.TIERRA){
            System.out.print(R.data()+" , ");
            R = R.link();
        }
        System.out.println("");
        */
       
        
       /*
       Nodo L=new Nodo(), Aux, Ult=new Nodo();
       int n;
       int val;
       n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));
        
        for(int i=1; i<=n;i++){
            val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            Aux = new Nodo();
            Aux.ponerData(val);
            if (i==1)
               L = Aux;                      
            else
                Ult.ponerLink(Aux);           
            Ult = Aux;                        
        }
        Nodo R = L;
        while(R!=Nodo.TIERRA){
            System.out.print(R.data()+" , ");
            R = R.link();
        }
        System.out.println("");
        */
        
        Nodo q = new Nodo();
        q.ponerData(1);
        q.ponerData(2);
        q.ponerData(3);
        q.ponerData(4);
        q.ponerData(5);
        
        
        
    }    
    
    
    
}
