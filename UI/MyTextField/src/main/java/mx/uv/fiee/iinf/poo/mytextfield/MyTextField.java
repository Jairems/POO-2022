package POO.Tareas;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JTextField;

public class MyTextField extends JTextField implements KeyListener {
    public MyTextField () {
        this.addKeyListener (this);
       setBounds(30,30,150,25);
        Font fuente = new Font("Arial", Font.PLAIN, 12);
        this.setFont(fuente);


       //setSize(30,200);

    }


    @Override
    public void keyTyped (KeyEvent e) {
        if ( (!((e.getKeyChar () >= '0' && e.getKeyChar () <= '9')
                || (e.getKeyChar() =='(' )
                || (e.getKeyChar () == ')') || e.getKeyChar() == ' '))
                || (e.getKeyChar () == '-' && this.getText ().contains ("-")) || this.getText().length()>12) {

            e.consume ();
            Toolkit.getDefaultToolkit().beep();

            if (this.getText().length() < 12 || !(this.getText().charAt(0) == '(' && this.getText().charAt(4) == ')'
                    && this.getText().charAt(5) == ' ')){
                this.setBackground(Color.RED);
                this.setForeground(Color.WHITE);
                Font fuente = new Font("Arial", Font.BOLD, 15);
                this.setFont(fuente);
            }else {
                Font fuente = new Font("Arial", Font.PLAIN, 12);
                this.setFont(fuente);
                this.setBackground(Color.WHITE);
                this.setForeground(Color.BLACK);
            }



        }
    }

   // public void testValidation ();

    @Override
    public void keyPressed (KeyEvent e) {
    }

    @Override
    public void keyReleased (KeyEvent e) {
    }

    @Override
    public void paint (Graphics g) {
        super.paint (g);

        g.setColor (Color.BLUE);
        g.drawRect (getSize ().width-149, getSize ().height -24, 148, 23);

        //g.setColor(Color.red);
        //g.fillRect (getSize ().width - 74, getSize ().height - 74, 24, 24);


        g.dispose ();

        /*try {

            URL url = getClass().getResource("image/ico.png");
            File file = new File(url.getPath());
            BufferedImage img = ImageIO.read (file);
            g.drawImage (img, getSize ().width - 30, getSize ().height - 30, null);
        }
        catch (IOException ex) {
            System.out.println (ex.getMessage ());
        }*/
    }
}

