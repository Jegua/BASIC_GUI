import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    public GUI(){
        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("CLICK ME");
        button.addActionListener(this);

        label = new JLabel("num of clicks: 0");


        panel.setBorder(BorderFactory.createEmptyBorder(30 ,30 ,10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[]argz){
        new GUI();
    }

    public  void actionPerformed(ActionEvent e){
        count++;
        label.setText("num of clicks:" + count);
    }
}
