package POO.Tareas;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Número Telefónico" );
        //frame.setPreferredSize(new Dimension(640, 480 ));
        frame.setSize(new Dimension(640,480));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       // frame.setLayout( new FlowLayout( FlowLayout.CENTER, 150, 100));

        JPanel panel = new JPanel ();
        frame.add (panel);
        //MyTextField Myt = new MyTextField();
        //Myt.setMaximumSize(new Dimension(300,50));

        setComponents(panel);
        frame.setVisible(true);
    }

    public static void setComponents(JPanel panel){
        panel.setLayout (null);
        MyTextField myt = new MyTextField();

        panel.add(myt);

    }
}
