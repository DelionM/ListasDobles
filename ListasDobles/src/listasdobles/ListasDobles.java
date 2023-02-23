package listasdobles;
public class ListasDobles {

    public static void main(String[] args) {
        lista_doble Id = new lista_doble();
        Id.insertarInicio("a");
        Id.insertarInicio("b");
        Id.insertarInicio("c");
        Id.insertarInicio("d");
        Id.insertarInicio("e");
        Id.insertarInicio("f");
        Id.insertarInicio("g");
        Id.insertarInicio("h");
        
        Id.MostrarAdelante();
        System.out.println("------------");
        Id.MostrarAtras();
        System.out.println("------------");
        System.out.println("Elemento al incio de mi lista");
        System.out.println(Id.ExtraerInicio());
        System.out.println("Elemento al final de mi lista");
        System.out.println(Id.ExtraerFin());
        System.out.println("Buscamos la letra f");
        System.out.println(Id.Buscar("f"));
    }
    
}
