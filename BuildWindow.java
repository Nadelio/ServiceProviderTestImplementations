import javax.swing.JFrame;
import javax.swing.JLabel;

public class BuildWindow implements Service {
    public void execute() {
        System.out.println("Building window");
    
        JLabel label = new JLabel("Hello, World!");
        JFrame frame = new JFrame("JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);

        System.out.println("Window built");
    }
}