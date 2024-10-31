/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VistaController {

    @FXML
    private TextField pantalla;
    
    private double operando1 = 0;
    private String operador = "";
    private boolean inicio = true;

    @FXML
    private void manejarNumero(ActionEvent event) {
        if (inicio) {
            pantalla.clear();
            inicio = false;
        }
        String valor = ((Button)event.getSource()).getText();
        pantalla.appendText(valor);
    }

    @FXML
    private void manejarOperador(ActionEvent event) {
        String valor = ((Button)event.getSource()).getText();
        if (!valor.equals("=")) {
            if (!operador.isEmpty()) return;
            operador = valor;
            operando1 = Double.parseDouble(pantalla.getText());
            pantalla.clear();
        } else {
            if (operador.isEmpty()) return;
            double operando2 = Double.parseDouble(pantalla.getText());
            double resultado = calcular(operando1, operando2, operador);
            pantalla.setText(String.valueOf(resultado));
            operador = "";
            inicio = true;
        }
    }

    @FXML
    private void limpiarPantalla(ActionEvent event) {
        pantalla.clear();
        operando1 = 0;
        operador = "";
        inicio = true;
    }

    private double calcular(double operando1, double operando2, String operador) {
        switch (operador) {
            case "+": return operando1 + operando2;
            case "-": return operando1 - operando2;
            case "x": return operando1 * operando2;
            case "/": 
                if (operando2 == 0) return 0; // Evita división por cero
                return operando1 / operando2;
            default: return 0;
        }
    }
}

