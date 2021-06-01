import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelikiOthoni extends JFrame{
	
	private JLabel university;
	private JPanel panel;
	private JLabel name;
	private BackgroundPane bg;
	private Image img;
	
	public TelikiOthoni(String aUniveristy,String aName) {
		
		
		try {
			img = ImageIO.read(new File("p1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bg = new BackgroundPane(img);
		name = new JLabel("Η καλύτερες επιλογή για εσένα " + aName + " είναι:");
		name.setFont(new Font("Bold",5,25));
		name.setHorizontalAlignment(JLabel.CENTER);
		
		university = new JLabel(aUniveristy);
		university.setFont(new Font("Bold",5,30));
		university.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
		GridLayout grid = new GridLayout(4,1);
		bg.setLayout(grid);
		
		
		bg.add(name);
		bg.add(university);
		
		
		
		this.setContentPane(bg);
		
		
		
		this.setTitle("Τελικη Οθόνη");
		this.setVisible(true);
		this.setSize(250,250);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
	}
	
	class BackgroundPane extends JPanel {
	    Image image;

	    public BackgroundPane(Image backGroundImage) {
	        super();
	        image = backGroundImage;
	        setPreferredSize(new Dimension(image.getWidth(this), image.getHeight(this)));
	    }

	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, null);

	    }

	}
	
	
	
	
}
