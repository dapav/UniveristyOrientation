import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {
	
	//Δηλωση των components
	private JButton buttonAnthrwpistikwn;
	private JButton buttonYgeias;
	private JButton buttonThetikwn;
	private JButton buttonOikonomikwn;
	
	
	
	private JLabel H1;
	private JLabel nameRequest;
	
	private JTextField nameBox;
	
	private JPanel centralPanel;
	private JPanel aPanel;
	
	
	public Menu() {
		//Δημιουργια των components
		buttonAnthrwpistikwn = new JButton("Κλασικών και Ανθρωπιστικών Σπουδών");
		buttonYgeias = new JButton("Επιστήμες Υγείας");
		buttonThetikwn = new JButton("Θετικών Επιστημών – Βιοεπιστημών – Πληροφορικής – Τεχνολογίας");
		buttonOikonomikwn = new JButton("Οικονομικών Επιστημών");
		
		H1 = new JLabel("ΑΡΧΙΚΗ ΣΕΛΙΔΑ");
		H1.setFont(new Font("Tahoma", 1, 18));
		H1.setLocation(400/2, 1);
		
		nameRequest = new JLabel("Παρακαλώ δώστε Όνομα:");
		nameRequest.setFont(new Font("Tahoma" , 1, 12));
		
		nameBox = new  JTextField();
		nameBox.setSize(10, 50);
		
		//Δημιουργία των Panel και εισαγωγη των components
		aPanel = new JPanel();
		GridLayout grid = new GridLayout(3,2,10,10);
		aPanel.setLayout(grid);
		
		
		aPanel.add(nameRequest);
		aPanel.add(nameBox);
		aPanel.add(buttonYgeias);
		aPanel.add(buttonAnthrwpistikwn);
		aPanel.add(buttonOikonomikwn);
		aPanel.add(buttonThetikwn);
		
		
		
		
		centralPanel = new JPanel();
		BorderLayout border = new BorderLayout();
		centralPanel.setLayout(border);
		
		
		centralPanel.add(H1,BorderLayout.NORTH);
		centralPanel.add(aPanel,BorderLayout.CENTER);
		
		
		//Δημιουργια του ActionListener για κάθε κουμπι
		ButtonListener listener = new ButtonListener();
		buttonYgeias.addActionListener(listener);
		buttonAnthrwpistikwn.addActionListener(listener);
		buttonOikonomikwn.addActionListener(listener);
		buttonThetikwn.addActionListener(listener);
		
		//Τοποθέτηση των componets στο frame
		this.setLocation(250, 200);
		this.setContentPane(centralPanel);
		this.setTitle("Uni Orient");
		this.setVisible(true);
		this.setSize(600,600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
	
	//Κλαση Listener που δημιουργει την αναλογη φορμα καθε φορα
	class ButtonListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			String name = nameBox.getText();
			User u = new User(name);
			
			if(e.getSource() == buttonAnthrwpistikwn) {
				new FormaAntrwpistikwn(name);
			}else if(e.getSource() == buttonOikonomikwn) {
				new FormaOikonomikwn();
			}else if(e.getSource() == buttonYgeias) {
				new FormaYgeias();
			}else if(e.getSource() == buttonThetikwn) {
				new FormaThetikwn();
			}
			
		}
		
	}
}
