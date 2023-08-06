package moedas;
import javax.swing.JOptionPane;

public class Moedas {
    public static void main(String[] args) {
        int q5, q10, q25, q50, q100,q200,q20000;
        double total;
        q5 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas de 5 centavos: "));
        q10 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas de 10 centavos: "));
        q25 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas de 25 centavos: "));
        q50 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas de 50 centavos: "));
        q100 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas de 1 real: "));
        q200 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas ou notas de 2 reais: "));
        q20000 = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com a quantidade de moedas ou notas de 200 reais: "));
        total = q5*0.05+q10*0.10+q25*0.25+q50*0.50+q100*1.00+q200*2.00+q20000*200.00;
        JOptionPane.showMessageDialog(null, String.format("Total em R$: %.2f",total));
    }
    
}
