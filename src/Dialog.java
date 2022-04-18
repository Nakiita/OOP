import javax.swing.*;

public class Dialog{
    public static void main(String[] args){
        int num1, num2, answer;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a first number"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a second number"));
        answer=num1+num2;
        JOptionPane.showMessageDialog(null,"The sum is"+answer);
    }
}

class SI{
    public static void main(String[] args){
        Double p,t,r,si;
        p=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter principle"));
        t=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a rate"));
        r=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter time"));
        si=(p*r*t)/100;
        JOptionPane.showInputDialog(null,"SI is:" +si+".");
    }
}