/* Testes de unidade, como o nome indica, testam as unidades do código, avaliando cada parte dele
   individualmente. Testes de aceitação, por outro lado, visam simular a operação real do programa
   pelo usuário final, servindo para o cliente decidir se aceitará ou não o código entregue como
   solução para seus problemas. Os testes que fazíamos anteriormente utilizando o JUnit eram testes
   de unidade, que garantiam a operação correta do sistema.
   Neste caso, em que trabalhamos com uma interface gráfica, usamos testes de aplicação para
   garantir que o usuário final consiga utilizar a interface da forma como foi projetada, sem
   problemas. Nos testes descritos a seguir, o código fará uma série de testes explorando diferentes
   tipos de entradas que podem ser feitas por um usuário, cabendo àquele que fará os testes
   determinar se as saídas estão corretas ou não.
 */

package ex2;

import ex1.Controller;
import ex1.Fatorial;
import ex1.View;

import javax.swing.*;

public class ViewTest {
    private View view = new View();
    private Controller controller = new Controller(view);
    private JFrame frame = new JFrame();

    public void testeFatorial() {
        view.getInputField().setText("7");
        view.getCalcularButton().doClick();

        if (!view.getResultadoLabel().getText().equals("5040"))
            System.err.println("Teste 1: 7! falhou");
        else
            System.out.println("Teste 1: 7! passou");
    }

    public void testeNegativo() {
        view.getInputField().setText("-1");
        view.getCalcularButton().doClick();

        if (!view.getResultadoLabel().getText().equals("Insira um número inteiro não-negativo."))
            System.err.println("Teste 2: -1! falhou");
        else
            System.out.println("Teste 2: -1! passou");
    }

    public void testeDecimal() {
        view.getInputField().setText("1.2");
        view.getCalcularButton().doClick();

        if (!view.getResultadoLabel().getText().equals("Insira um número inteiro não-negativo."))
            System.err.println("Teste 2: 1.2! falhou");
        else
            System.out.println("Teste 2: 1.2! passou");
    }

    public void testeChar() {
        view.getInputField().setText("!");
        view.getCalcularButton().doClick();

        if (!view.getResultadoLabel().getText().equals("Insira um número inteiro não-negativo."))
            System.err.println("Teste 2: !! falhou");
        else
            System.out.println("Teste 2: !! passou");
    }

    public void testeOverflow() {
        view.getInputField().setText("22");
        view.getCalcularButton().doClick();

        if (!view.getResultadoLabel().getText().equals("O fatorial de números acima de 20 geram overflow"))
            System.err.println("Teste 2: 22! falhou");
        else
            System.out.println("Teste 2: 22! passou");
    }

    public static void main(String[] args) throws InterruptedException {
        ViewTest run = new ViewTest();
        run.getView().setVisible(true);

        run.testeFatorial();
        Thread.sleep(1000);
        run.testeNegativo();
        Thread.sleep(1000);
        run.testeDecimal();
        Thread.sleep(1000);
        run.testeChar();
        Thread.sleep(1000);
        run.testeOverflow();
    }

    public View getView() {
        return this.view;
    }
}
