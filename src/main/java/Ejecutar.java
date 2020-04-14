import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejecutar{
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        list.add("Bart");
        list.add("Lisa");
        list.add("Marge");
        list.add("Barney");
        list.add("Homer");
        list.add("Maggie");

        Iterator<String> recorrer = list.iterator();

        while (recorrer.hasNext())
        {
            String nombre = recorrer.next();
            if (nombre.equals("Barney")) {
                recorrer.remove();
            }else
            if(nombre != "Barney"){System.out.println(nombre);}/* Si no se incluye esta condición, pues también se imprimirá "Barney" puesto que la variable (nombre) hasta que
      no se inicie el siguiente ciclo, luego de la eliminación de "Barney" en la colección "list" mediante el Iterator "recorrer" tiene como valor "Barney"

      Esto es una solución alternativa para mostrar por pantalla los elementos de la colección, así que podrían considerarse otras opciones.*/
        }
        System.out.println("\nEsta colección ahora contiene: " + list.size() + " objetos." );
    }
}