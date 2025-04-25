import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class extendableJFrame_1 extends JFrame{
 
    public extendableJFrame_1(){
        // JFrame this = new JFrame(); //create JFrame object
        this.setSize(400,600); //sets x,y dimension
        this.setResizable(false);
        this.setTitle("CSE20D"); //sets frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit app

        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //funny

        ImageIcon img = new ImageIcon("1.png"); //get image
        this.setIconImage(img.getImage()); //set it as icon
        // this.getContentPane().setBackground(Color.GREEN);
        // this.getContentPane().setBackground(new Color(0,50,50));
        this.getContentPane().setBackground(new Color(0x1f1f1f));


        this.setVisible(true); //make the frame visible
    }
}
