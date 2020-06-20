import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static String quote = "Now rise, and show your strength. Be eloquent, and deep, and tender; see, with a clear eye, into Nature, and into life:  spread your white wings of quivering thought, and soar, a god-like spirit, over the whirling world beneath you, up through long lanes of flaming stars to the gates of eternity!";
    public static void main(String[] args) {

        Tea tea = new Tea("And is there honey still for tea?".getBytes());

        byte[] original = quote.getBytes();

        /* Run it through the cipher... and back */
        byte[] crypt = tea.encrypt(original);
        byte[] result = tea.decrypt(crypt);

        /* Ensure that all went well */
        String test1=new String(crypt);
        String test = new String(result);
        if (!test.equals(quote))
            throw new RuntimeException("Fail");



        JFrame f=new JFrame("TEA  Algorithm");
        String tox="abc";
        final JTextField tf=new JTextField();
        final JTextField tf2=new JTextField();
        final JTextField t1=new JTextField("Tox="+quote);
        t1.setBounds(250,150, 200,25);
        tf.setBounds(150,250, 150,25);
        tf2.setBounds(400,250, 150,25);
        JButton b=new JButton("Encrypt");
        JButton b2=new JButton("Descript");
        b.setBounds(150,300,95,30);
        b2.setBounds(400,300,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(test1);
            }
        });


        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf2.setText(test);
            }
        });


        f.add(b);f.add(tf);
        f.add(b2); f.add(tf2); f.add(t1);
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);


    }
}
