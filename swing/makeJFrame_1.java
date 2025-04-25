// package swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class makeJFrame_1 {
    public static void main(String[] args){
        // JFrame: window to add components

        
        JFrame mainFrame = new JFrame(); //create JFrame object
        mainFrame.setSize(400,600); //sets x,y dimension
        mainFrame.setResizable(false);
        mainFrame.setTitle("CSE20D"); //sets frame title
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit app

        // mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //funny

        ImageIcon img = new ImageIcon("1.png"); //get image
        mainFrame.setIconImage(img.getImage()); //set it as icon
        // mainFrame.getContentPane().setBackground(Color.GREEN);
        // mainFrame.getContentPane().setBackground(new Color(0,50,50));
        mainFrame.getContentPane().setBackground(new Color(0x1f1f1f));


        mainFrame.setVisible(true); //make the frame visible
        

        // extendableJFrame_1 frame1 = new extendableJFrame_1(); 
    }
    
}
