
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author arif049
 */

public class Splash extends JFrame implements ActionListener{
    
    Splash()
    {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//not using swing's layout defining my own
        
        JLabel heading =new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        
        JButton clickhere=new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);//button added respect to image and not application window;
        
        
        setSize(1170,650);
        // by default it opens in left top corner so set location of open
        setLocation(300,50);
        // by default its visibility is hidden
        setVisible(true);
        
        while(true)
        {
            heading.setVisible(false);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                
            }
            heading.setVisible(true);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                
            }
            
        }
    }
    
    //overriding actionperformer due to it have unimplemented abstract method
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);//shut down current frame
        new Login();//next frame;
    }
    
    public static void main(String args[])
    {
        // call to new object of class and call to constructor
        new Splash();
    }
}
