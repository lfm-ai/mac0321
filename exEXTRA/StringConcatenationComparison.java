package exEXTRA;

public class StringConcatenationComparison {
    public static void main(String[] args) {
        int n = 100000; // Número de concatenações a serem realizadas
        long startTime, endTime;
        
        // Usando a classe String
        startTime = System.currentTimeMillis(); // Obtém o tempo inicial
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a"; // Concatena a string "a" à string existente
        }
        endTime = System.currentTimeMillis(); // Obtém o tempo final
        System.out.println("Tempo de concatenação com String: " + (endTime - startTime) + " ms");
        
        /*
         * A concatenação de strings usando a classe String é menos eficiente
         * devido à imutabilidade das strings em Java. A cada iteração do loop,
         * uma nova cópia da string é criada para armazenar o resultado da concatenação.
         * Isso resulta em um custo computacional mais alto, especialmente para um grande
         * número de concatenações, como em loops.
         */

        // Usando a classe StringBuffer
        startTime = System.currentTimeMillis(); // Obtém o tempo inicial
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("a"); // Adiciona a string "a" ao buffer
        }
        endTime = System.currentTimeMillis(); // Obtém o tempo final
        System.out.println("Tempo de concatenação com StringBuffer: " + (endTime - startTime) + " ms");
        
        /*
         * A concatenação de strings usando a classe StringBuffer é mais eficiente
         * porque StringBuffer é mutável. Isso significa que você pode modificar o
         * conteúdo da string sem criar novos objetos. Em um loop, isso resulta em um
         * melhor desempenho, pois evita a criação repetida de novos objetos de string.
         */
    }
}
