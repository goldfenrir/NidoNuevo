/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nidonuevo.app;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
/**
 *
 * @author TOSHIBA
 */
public class Display {
    private JFrame frame;
    private String title;
    private int width, height;
    private Canvas canvas;
    
    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height =height;
        createDisplay();
    }
    private void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ico_NN.jpg"));
        frame.setIconImage(icon);
        frame.setVisible(true);
        canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
    }
    public JFrame getFrame(){
        return frame;
    }
    public Canvas getCanvas(){
		return canvas;
	}
	

}