package ex1;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JTextField inputField;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public View() {
        super("Cálculo de Fatorial");

        // Configurações da janela
        setLayout(new FlowLayout());
        setSize(500, 175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes
        inputField = new JTextField(10);
        calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel("Resultado: ");

        // Adiciona componentes à janela
        add(new JLabel("Número: "));
        add(inputField);
        add(calcularButton);
        add(resultadoLabel);
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JButton getCalcularButton() {
        return calcularButton;
    }

    public JLabel getResultadoLabel() {
        return resultadoLabel;
    }
}

