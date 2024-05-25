package ex1;

public class Fatorial {
    public static long calcularFatorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

