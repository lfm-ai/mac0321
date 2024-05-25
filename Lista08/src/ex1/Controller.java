package ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;

        // Adiciona listener ao botão calcular
        this.view.getCalcularButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        });
    }

    private void run() {
        try {
            calcularFatorial();
        } catch (NumberFormatException ex) {
            view.getResultadoLabel().setText("Insira um número inteiro não-negativo.");
        } catch (IllegalArgumentException ex) {
            view.getResultadoLabel().setText(ex.getMessage());
        } catch (Overflow ex) {
            view.getResultadoLabel().setText("O fatorial de números acima de 20 geram overflow");
        }
    }

    private void calcularFatorial() throws Overflow {
        String inputText = view.getInputField().getText();
        int numero = Integer.parseInt(inputText);
        if (numero > 20)
            throw new Overflow(numero);
        long resultado = Fatorial.calcularFatorial(numero);
        view.getResultadoLabel().setText("Resultado: " + resultado);
    }

    class Overflow extends Exception {
        private int check;

        Overflow(int n) {
            this.check = n;
        }

        public String toString() {
            return "Overflow [" + check + "]\n" + super.toString();
        }
    }

    public static void main(String[] args) {
        View view = new View();
        new Controller(view);
        view.setVisible(true);
    }
}
