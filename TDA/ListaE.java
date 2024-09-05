package TDA;


public class ListaE<T> 
{
    private Nodo<T> cabeza;
    private int tamaño;

    public ListaE() {
        cabeza = null;
        tamaño = 0;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public int getElemento() {
        return tamaño;
    }

    public Nodo<T> inicio() {
        return cabeza;
    }

    public void agregarAlFinal(T dato) 
    {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (esVacia()) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }
    
    

    public void borrarEnIndice(int indice) 
    {
        if (indice < 0 || indice >= tamaño) 
        {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        if (indice == 0) 
        {
            cabeza = cabeza.getSiguiente();
        } else 
        {
            Nodo<T> actual = cabeza;
            Nodo<T> previo = null;
            int contador = 0;

            while (contador < indice) 
            {
                previo = actual;
                actual = actual.getSiguiente();
                contador++;
            }

            previo.setSiguiente(actual.getSiguiente());
        }

        tamaño--;
    }

    public void mostrar() 
    {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}
