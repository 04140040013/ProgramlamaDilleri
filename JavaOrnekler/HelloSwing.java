import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloSwing extends JFrame
{
JLabel label1;
public static void main(String[] args)
{
new HelloSwing();
}
public HelloSwing()
{
JPanel panel1=new JPanel();
label1=new JLabel("Hello");
JButton button1=new JButton("Tamam");
button1.addActionListener(new
ActionListener() {
public void actionPerformed(
ActionEvent e) {
label1.setText("Oldu");
}
});
panel1.add(label1);
panel1.add(button1);
this.add(panel1);
this.setTitle("Hello World");
this.setSize(500,500);
this.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
}

