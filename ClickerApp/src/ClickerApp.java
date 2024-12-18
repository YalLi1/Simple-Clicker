import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickerApp extends JFrame {

    private int clickCount = 0;
    private JLabel label; private
    JButton button;

    public ClickerApp(){

        setTitle("Clicker App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        label = new JLabel("Click Count: 0");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        button = new JButton("Click");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                clickCount++;
                label.setText("Click Count: " + clickCount);
            }
        });

        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setVisible(true);
    }

}
