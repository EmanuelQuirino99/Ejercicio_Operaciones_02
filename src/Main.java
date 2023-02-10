import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        Operaciones ope = new Operaciones();


            ope.numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el primer numero:"));
            ope.numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el segundo numero:"));


            JOptionPane.showMessageDialog(null, ope);



    }
}





