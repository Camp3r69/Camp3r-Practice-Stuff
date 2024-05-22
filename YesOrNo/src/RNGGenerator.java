import javax.swing.*;

public class RNGGenerator {
    private int RNGValue;
    public RNGGenerator(){
        this.RNGValue = (int) (Math.random() * 5) + 1;
    }

    public void programStartRNG(){
        switch(this.RNGValue){
            case(1):
                JOptionPane.showMessageDialog(null, "Yes");
                break;
            case(2):
                JOptionPane.showMessageDialog(null, "No");
                break;
            case(3):
                JOptionPane.showMessageDialog(null, "Maybe");
                break;
            case(4):
                JOptionPane.showMessageDialog(null, "Unsure");
                break;
            case(5):
                JOptionPane.showMessageDialog(null, "Ask again later...");
                break;
        }
    }
}
