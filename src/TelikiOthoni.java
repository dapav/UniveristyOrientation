import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelikiOthoni extends JFrame{
	
	private JLabel university;
	private JPanel panel;
	private JLabel name;
	
	public TelikiOthoni(String aUniveristy,String aName) {
	
		panel = new JPanel();
		name = new JLabel("Η καλύτερες επιλογή για εσένα " + aName + " είναι:");
		university = new JLabel(aUniveristy);
		
		
		GridLayout grid = new GridLayout(4,1);
		panel.setLayout(grid);
		
		panel.add(name);
		panel.add(university);
		
		
		
		this.setContentPane(panel);
		
		
		
		this.setTitle("Τελικη Οθόνη");
		this.setVisible(true);
		this.setSize(350,550);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
