// Objetivo:
// Imprimir la serie fibonacci "0 1 1 2 3 ..."
// hasta el número 1597.
public class Fibonacci {
    public static void main(String[] args) {
		int actual = 0;
		int siguiente = 1;
		int nuevo = 0;
		for (int i = 0; actual <= 1597; i++) {
			System.out.println(actual);
			nuevo = siguiente + actual;
			actual = siguiente;
			siguiente = nuevo;
		}
    }
}
