package listasdobles;
public class lista_doble {
   private Nodo inicio;
   private Nodo fin;
   
   public lista_doble(){
       inicio = null;
       fin = null;
   }
   
   public void insertarInicio(String dato){
       if (inicio == null){
           inicio = new Nodo(dato, null, null);
           fin = inicio;
       }
       else 
       {
           Nodo nuevo = new Nodo (dato, null, inicio);
           inicio.setAnterior(nuevo);
           inicio = nuevo;
       }
      
   }
   
      public void insertarFin(String dato){
       if (inicio == null){
           fin = new Nodo(dato, null, null);
           fin = inicio;
       }
       else 
       {
           Nodo nuevo = new Nodo (dato, fin, inicio);
           fin.setSiguiente(nuevo);
           fin = nuevo;
       } 
   }
      
      public String ExtraerInicio(){
          String dato = inicio.getDato();
          inicio = inicio.getSiguiente();
          if (inicio !=null){
              inicio.setAnterior(null);
          }
          else 
          {
              fin = null;
          }
          return dato;
      }
      
         public String ExtraerFin(){
          String dato = fin.getDato();
          fin = fin.getAnterior();
          if (fin !=null){
              fin.setSiguiente(null);
          }
          else 
          {
              inicio = null;
          }
          return dato;
      } 

         public void MostrarAdelante(){
             Nodo temp = inicio;
             while (temp != null){
                 System.out.println(temp.getDato());
                 temp = temp.getSiguiente();
             }
         }
         
         public void MostrarAtras(){
             Nodo temp = fin;
             while (temp != null){
                 System.out.println(temp.getDato());
                 temp = temp.getAnterior();
             }
         }
         
         public Boolean Buscar (String dato){
             Nodo temp = inicio;
             while (temp != null){
                if (temp.getDato().equals(dato)){
                    return true;
                }
             }
             return false;
         }
}
