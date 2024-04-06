import javax.swing.JOptionPane
public class SomaDoisNumeros { 
     public class static void main (String[] args) {
        double primeiroValor, segundoValor, resultado; 
        primeiroValor = Double.parseDouble(JOptionPane.showInPutDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInPutDialog("Digite o segundo valor"));
        resultado = primeiroValor + segundoValor;
        JOptionPane.showMeesageDialog(null, "soma =" + resultado);

     }
      }
