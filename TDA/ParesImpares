package TDA;

import TDA.ListaE;
import java.lang.Math;
import TDA.Nodo;

public class ParesImpares
{
    ListaE<Integer> listaEnteros = new ListaE<>();
	
    public static void main(String[] args) {
        ParesImpares app = new ParesImpares();
        app.poblarLista();
        System.out.println("Lista original:");
        app.listaEnteros.mostrar();
        app.procesarLista();
        System.out.println("Lista después del procesamiento:");
        app.listaEnteros.mostrar();
    }


    
    public void poblarLista() {
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 50);
            listaEnteros.agregarAlFinal(n);
        }
    }
	
    public int[] sumarParesImpares() {
        Nodo auxiliar = listaEnteros.inicio();
        int sumaPares = 0;
        int sumaImpares = 0;
        int posicion = 1;

        while (auxiliar != null) {
            if (posicion % 2 == 0) {
                sumaPares += (int) auxiliar.getDato();
            } else {
                sumaImpares += (int) auxiliar.getDato();
            }
            auxiliar = auxiliar.getSiguiente();
            posicion++;
        }

        return new int[]{sumaPares, sumaImpares};
    }
    
    public void borrarPares() {
        int posicion = 0;  // Índice de la posición del nodo, comenzamos en 0 (para indexar pares e impares)
        
        // Recorremos de manera inversa para evitar problemas de desplazamiento de índices al borrar
        for (int i = listaEnteros.getElemento() - 1; i >= 0; i--) {
            if (posicion % 2 == 0) {  // Si la posición es par
                listaEnteros.borrarEnIndice(i);  // Borra el nodo en esa posición
            }
            posicion++;
        }
    }    
    
    public void borrarImpares() {
        int posicion = 0;  // Índice de la posición del nodo, comenzamos en 0
    
        // Recorremos de manera inversa para evitar problemas de desplazamiento de índices al borrar
        for (int i = listaEnteros.getElemento() - 1; i >= 0; i--) {
            if (posicion % 2 != 0) {  // Si la posición es impar
                listaEnteros.borrarEnIndice(i);  // Borra el nodo en esa posición
            }
            posicion++;
        }
    }    

    public void procesarLista() {
        if (listaEnteros.esVacia()) {
            System.out.println("Lista vacía.");
            return;
        }

        if (listaEnteros.getElemento() == 1) {
            System.out.println("Lista con único nodo.");
            return;
        }

        // Sumar los valores en posiciones pares e impares
        int[] sumas = sumarParesImpares();
        int sumaPares = sumas[0];
        int sumaImpares = sumas[1];

        System.out.println("Suma Pares: " + sumaPares);
        System.out.println("Suma Impares: " + sumaImpares);

        // Decidir si se eliminan pares o impares según la suma
        if (sumaPares != sumaImpares) {
            System.out.println("Eliminando nodos en posiciones pares...");
            borrarPares();  // Si la suma de pares e impares es diferente, elimina los pares
        } else {
            System.out.println("Eliminando nodos en posiciones impares...");
            borrarImpares();  // Si son iguales, elimina los impares
        }
    }
    
    
}
