import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;

public class FormaAntrwpistikwn extends JFrame  {
	
	//Ονομα του χρηστη που ερχεται απο την αρχικη οθονή 
	private String name;
	
	//Δημιουργια των components για την φόρμα
	
	private JScrollPane sheet;
	private JPanel central;//Το κεντρικο πανελ
	private JButton submit;//Για την τελικη υποβολή
	
	//Σχολη 1
	private JLabel question11;
	private JLabel question12;
	private JLabel question13;
	private JLabel question14;
	
	private JRadioButton choice1101;
	private JRadioButton choice1102;
	private JRadioButton choice1103;
	private JRadioButton choice1104;
	private JRadioButton choice1105;
	
	private JRadioButton choice1201;
	private JRadioButton choice1202;
	private JRadioButton choice1203;
	private JRadioButton choice1204;
	private JRadioButton choice1205;
	
	private JRadioButton choice1301;
	private JRadioButton choice1302;
	private JRadioButton choice1303;
	private JRadioButton choice1304;
	private JRadioButton choice1305;
	
	private JRadioButton choice1401;
	private JRadioButton choice1402;
	private JRadioButton choice1403;
	private JRadioButton choice1404;
	private JRadioButton choice1405;
	
	private JPanel choices11;
	private JPanel choices12;
	private JPanel choices13;
	private JPanel choices14;
	
	//Σχολη 2
	private JLabel question21;
	private JLabel question22;
	private JLabel question23;
	private JLabel question24;
	
	private JRadioButton choice2101;
	private JRadioButton choice2102;
	private JRadioButton choice2103;
	private JRadioButton choice2104;
	private JRadioButton choice2105;
	
	private JRadioButton choice2201;
	private JRadioButton choice2202;
	private JRadioButton choice2203;
	private JRadioButton choice2204;
	private JRadioButton choice2205;
	
	private JRadioButton choice2301;
	private JRadioButton choice2302;
	private JRadioButton choice2303;
	private JRadioButton choice2304;
	private JRadioButton choice2305;
	
	private JRadioButton choice2401;
	private JRadioButton choice2402;
	private JRadioButton choice2403;
	private JRadioButton choice2404;
	private JRadioButton choice2405;
	
	private JPanel choices21;
	private JPanel choices22;
	private JPanel choices23;
	private JPanel choices24;
	//Σχολη 3
	private JLabel question31;
	private JLabel question32;
	private JLabel question33;
	private JLabel question34;
	
	private JRadioButton choice3101;
	private JRadioButton choice3102;
	private JRadioButton choice3103;
	private JRadioButton choice3104;
	private JRadioButton choice3105;
	
	private JRadioButton choice3201;
	private JRadioButton choice3202;
	private JRadioButton choice3203;
	private JRadioButton choice3204;
	private JRadioButton choice3205;
	
	private JRadioButton choice3301;
	private JRadioButton choice3302;
	private JRadioButton choice3303;
	private JRadioButton choice3304;
	private JRadioButton choice3305;
		
	private JRadioButton choice3401;
	private JRadioButton choice3402;
	private JRadioButton choice3403;
	private JRadioButton choice3404;
	private JRadioButton choice3405;
		
	private JPanel choices31;
	private JPanel choices32;
	private JPanel choices33;
	private JPanel choices34;
	
	//Σχολη 4
	
	private JLabel question41;
	private JLabel question42;
	private JLabel question43;
	private JLabel question44;
	
	private JRadioButton choice4101;
	private JRadioButton choice4102;
	private JRadioButton choice4103;
	private JRadioButton choice4104;
	private JRadioButton choice4105;
	
	private JRadioButton choice4201;
	private JRadioButton choice4202;
	private JRadioButton choice4203;
	private JRadioButton choice4204;
	private JRadioButton choice4205;
	
	private JRadioButton choice4301;
	private JRadioButton choice4302;
	private JRadioButton choice4303;
	private JRadioButton choice4304;
	private JRadioButton choice4305;
		
	private JRadioButton choice4401;
	private JRadioButton choice4402;
	private JRadioButton choice4403;
	private JRadioButton choice4404;
	private JRadioButton choice4405;
		
	private JPanel choices41;
	private JPanel choices42;
	private JPanel choices43;
	private JPanel choices44;
	
	//Σχολη 5
	private JLabel question51;
	private JLabel question52;
	private JLabel question53;
	private JLabel question54;
	
	private JRadioButton choice5101;
	private JRadioButton choice5102;
	private JRadioButton choice5103;
	private JRadioButton choice5104;
	private JRadioButton choice5105;
	
	private JRadioButton choice5201;
	private JRadioButton choice5202;
	private JRadioButton choice5203;
	private JRadioButton choice5204;
	private JRadioButton choice5205;
	
	private JRadioButton choice5301;
	private JRadioButton choice5302;
	private JRadioButton choice5303;
	private JRadioButton choice5304;
	private JRadioButton choice5305;
		
	private JRadioButton choice5401;
	private JRadioButton choice5402;
	private JRadioButton choice5403;
	private JRadioButton choice5404;
	private JRadioButton choice5405;
		
	private JPanel choices51;
	private JPanel choices52;
	private JPanel choices53;
	private JPanel choices54;
	
	//Σχολη 6
	private JLabel question61;
	private JLabel question62;
	private JLabel question63;
	private JLabel question64;
	
	private JRadioButton choice6101;
	private JRadioButton choice6102;
	private JRadioButton choice6103;
	private JRadioButton choice6104;
	private JRadioButton choice6105;
	
	private JRadioButton choice6201;
	private JRadioButton choice6202;
	private JRadioButton choice6203;
	private JRadioButton choice6204;
	private JRadioButton choice6205;
	
	private JRadioButton choice6301;
	private JRadioButton choice6302;
	private JRadioButton choice6303;
	private JRadioButton choice6304;
	private JRadioButton choice6305;
		
	private JRadioButton choice6401;
	private JRadioButton choice6402;
	private JRadioButton choice6403;
	private JRadioButton choice6404;
	private JRadioButton choice6405;
		
	private JPanel choices61;
	private JPanel choices62;
	private JPanel choices63;
	private JPanel choices64;
	
	//Σχολη 7
	private JLabel question71;
	private JLabel question72;
	private JLabel question73;
	private JLabel question74;
	
	private JRadioButton choice7101;
	private JRadioButton choice7102;
	private JRadioButton choice7103;
	private JRadioButton choice7104;
	private JRadioButton choice7105;
	
	private JRadioButton choice7201;
	private JRadioButton choice7202;
	private JRadioButton choice7203;
	private JRadioButton choice7204;
	private JRadioButton choice7205;
	
	private JRadioButton choice7301;
	private JRadioButton choice7302;
	private JRadioButton choice7303;
	private JRadioButton choice7304;
	private JRadioButton choice7305;
		
	private JRadioButton choice7401;
	private JRadioButton choice7402;
	private JRadioButton choice7403;
	private JRadioButton choice7404;
	private JRadioButton choice7405;
		
	private JPanel choices71;
	private JPanel choices72;
	private JPanel choices73;
	private JPanel choices74;
	
	//Σχολη 8
	private JLabel question81;
	private JLabel question82;
	private JLabel question83;
	private JLabel question84;
	
	private JRadioButton choice8101;
	private JRadioButton choice8102;
	private JRadioButton choice8103;
	private JRadioButton choice8104;
	private JRadioButton choice8105;
	
	private JRadioButton choice8201;
	private JRadioButton choice8202;
	private JRadioButton choice8203;
	private JRadioButton choice8204;
	private JRadioButton choice8205;
	
	private JRadioButton choice8301;
	private JRadioButton choice8302;
	private JRadioButton choice8303;
	private JRadioButton choice8304;
	private JRadioButton choice8305;
		
	private JRadioButton choice8401;
	private JRadioButton choice8402;
	private JRadioButton choice8403;
	private JRadioButton choice8404;
	private JRadioButton choice8405;
		
	private JPanel choices81;
	private JPanel choices82;
	private JPanel choices83;
	private JPanel choices84;
	
	//Σχολη 9
	private JLabel question91;
	private JLabel question92;
	private JLabel question93;
	private JLabel question94;
	
	private JRadioButton choice9101;
	private JRadioButton choice9102;
	private JRadioButton choice9103;
	private JRadioButton choice9104;
	private JRadioButton choice9105;
	
	private JRadioButton choice9201;
	private JRadioButton choice9202;
	private JRadioButton choice9203;
	private JRadioButton choice9204;
	private JRadioButton choice9205;
	
	private JRadioButton choice9301;
	private JRadioButton choice9302;
	private JRadioButton choice9303;
	private JRadioButton choice9304;
	private JRadioButton choice9305;
		
	private JRadioButton choice9401;
	private JRadioButton choice9402;
	private JRadioButton choice9403;
	private JRadioButton choice9404;
	private JRadioButton choice9405;
		
	private JPanel choices91;
	private JPanel choices92;
	private JPanel choices93;
	private JPanel choices94;
	
	//Σχολη 10
	private JLabel question101;
	private JLabel question102;
	private JLabel question103;
	private JLabel question104;
	
	private JRadioButton choice10101;
	private JRadioButton choice10102;
	private JRadioButton choice10103;
	private JRadioButton choice10104;
	private JRadioButton choice10105;
	
	private JRadioButton choice10201;
	private JRadioButton choice10202;
	private JRadioButton choice10203;
	private JRadioButton choice10204;
	private JRadioButton choice10205;
	
	private JRadioButton choice10301;
	private JRadioButton choice10302;
	private JRadioButton choice10303;
	private JRadioButton choice10304;
	private JRadioButton choice10305;
		
	private JRadioButton choice10401;
	private JRadioButton choice10402;
	private JRadioButton choice10403;
	private JRadioButton choice10404;
	private JRadioButton choice10405;
		
	private JPanel choices101;
	private JPanel choices102;
	private JPanel choices103;
	private JPanel choices104;
	

	
	public FormaAntrwpistikwn(String aName) {
		
		this.name = aName;
		
		submit = new JButton("ΥΠΟΒΟΛΗ");
		circleListener listener = new circleListener();
		submit.addActionListener(listener);
		
		
		central = new JPanel(new GridLayout(81,1));
		sheet = new JScrollPane(central);
		sheet.getVerticalScrollBar().setUnitIncrement(10);
		
		
		
		//Καθορισμος των components για την σχολη 1
		//Ερωτηση 1
		question11 = new JLabel("1.Πόσο σου αρέσει το μάθημα ιστορία;");
		question11.setHorizontalAlignment(JLabel.CENTER);
		choice1101 = new JRadioButton("Καθόλου");
		choice1102 = new JRadioButton("Σχεδόν Καθόλου");
		choice1103 = new JRadioButton("Μέτρια");
		choice1104 = new JRadioButton("Αρκετά");
		choice1105 = new JRadioButton("Πόλυ");
		choices11 = new JPanel(new FlowLayout());
		choices11.add(choice1101);
		choices11.add(choice1102);
		choices11.add(choice1103);
		choices11.add(choice1104);
		choices11.add(choice1105);
		ButtonGroup group11 = new ButtonGroup();
		group11.add(choice1101);
		group11.add(choice1102);
		group11.add(choice1103);
		group11.add(choice1104);
		group11.add(choice1105);
		circleListener listener11 = new circleListener();
		choice1101.addActionListener(listener11);
		choice1102.addActionListener(listener11);
		choice1103.addActionListener(listener11);
		choice1104.addActionListener(listener11);
		choice1105.addActionListener(listener11);
		
		//Ερωτηση 2
		question12 = new JLabel("2.Πόσο καλά γνωρίζεις την ιστορία της Ελλάδας;");
		choice1201 = new JRadioButton("Καθόλου");
		choice1202 = new JRadioButton("Σχεδόν Καθόλου");
		choice1203 = new JRadioButton("Μέτρια");
		choice1204 = new JRadioButton("Αρκετά");
		choice1205 = new JRadioButton("Πόλυ");
		choices12 = new JPanel(new FlowLayout());
		choices12.add(choice1201);
		choices12.add(choice1202);
		choices12.add(choice1203);
		choices12.add(choice1204);
		choices12.add(choice1205);
		ButtonGroup group12 = new ButtonGroup();
		group12.add(choice1201);
		group12.add(choice1202);
		group12.add(choice1203);
		group12.add(choice1204);
		group12.add(choice1205);
		circleListener listener12 = new circleListener();
		choice1201.addActionListener(listener12);
		choice1202.addActionListener(listener12);
		choice1203.addActionListener(listener12);
		choice1204.addActionListener(listener12);
		choice1205.addActionListener(listener12);
		//Ερωτηση 3
		question13 = new JLabel("3.Πόσο καλά γνωρίζεις την ιστορία των άλλων πολιτισμών;");
		choice1301 = new JRadioButton("Καθόλου");
		choice1302 = new JRadioButton("Σχεδόν Καθόλου");
		choice1303 = new JRadioButton("Μέτρια");
		choice1304 = new JRadioButton("Αρκετά");
		choice1305 = new JRadioButton("Πόλυ");
		choices13 = new JPanel(new FlowLayout());
		choices13.add(choice1301);
		choices13.add(choice1302);
		choices13.add(choice1303);
		choices13.add(choice1304);
		choices13.add(choice1305);
		ButtonGroup group13 = new ButtonGroup();
		group13.add(choice1301);
		group13.add(choice1302);
		group13.add(choice1303);
		group13.add(choice1304);
		group13.add(choice1305);
		circleListener listener13 = new circleListener();
		choice1301.addActionListener(listener13);
		choice1302.addActionListener(listener13);
		choice1303.addActionListener(listener13);
		choice1304.addActionListener(listener13);
		choice1305.addActionListener(listener13);
		//Ερωτηση 4
		question14 = new JLabel("4.Πόσο πολύ σου αρέσει να διαβάζεις μυθιστορήματα;");
		choice1401 = new JRadioButton("Καθόλου");
		choice1402 = new JRadioButton("Σχεδόν Καθόλου");
		choice1403 = new JRadioButton("Μέτρια");
		choice1404 = new JRadioButton("Αρκετά");
		choice1405 = new JRadioButton("Πόλυ");
		choices14 = new JPanel(new FlowLayout());
		choices14.add(choice1401);
		choices14.add(choice1402);
		choices14.add(choice1403);
		choices14.add(choice1404);
		choices14.add(choice1405);
		ButtonGroup group14 = new ButtonGroup();
		group14.add(choice1401);
		group14.add(choice1402);
		group14.add(choice1403);
		group14.add(choice1404);
		group14.add(choice1405);
		circleListener listener14 = new circleListener();
		choice1401.addActionListener(listener14);
		choice1402.addActionListener(listener14);
		choice1403.addActionListener(listener14);
		choice1404.addActionListener(listener14);
		choice1405.addActionListener(listener14);
		
		//Σχολη 2
		//Ερωτηση 1
		question21 = new JLabel("5.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice2101 = new JRadioButton("Καθόλου");
		choice2102 = new JRadioButton("Σχεδόν Καθόλου");
		choice2103 = new JRadioButton("Μέτρια");
		choice2104 = new JRadioButton("Αρκετά");
		choice2105 = new JRadioButton("Πόλυ");
		choices21 = new JPanel(new FlowLayout());
		choices21.add(choice2101);
		choices21.add(choice2102);
		choices21.add(choice2103);
		choices21.add(choice2104);
		choices21.add(choice2105);
		ButtonGroup group21 = new ButtonGroup();
		group21.add(choice2101);
		group21.add(choice2102);
		group21.add(choice2103);
		group21.add(choice2104);
		group21.add(choice2105);
		circleListener listener21 = new circleListener();
		choice2101.addActionListener(listener21);
		choice2102.addActionListener(listener21);
		choice2103.addActionListener(listener21);
		choice2104.addActionListener(listener21);
		choice2105.addActionListener(listener21);
		//Ερωτηση 2
		question22 = new JLabel("6.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice2201 = new JRadioButton("Καθόλου");
		choice2202 = new JRadioButton("Σχεδόν Καθόλου");
		choice2203 = new JRadioButton("Μέτρια");
		choice2204 = new JRadioButton("Αρκετά");
		choice2205 = new JRadioButton("Πόλυ");
		choices22 = new JPanel(new FlowLayout());
		choices22.add(choice2201);
		choices22.add(choice2202);
		choices22.add(choice2203);
		choices22.add(choice2204);
		choices22.add(choice2205);
		ButtonGroup group22 = new ButtonGroup();
		group22.add(choice2201);
		group22.add(choice2202);
		group22.add(choice2203);
		group22.add(choice2204);
		group22.add(choice2205);
		circleListener listener22 = new circleListener();
		choice2201.addActionListener(listener22);
		choice2202.addActionListener(listener22);
		choice2203.addActionListener(listener22);
		choice2204.addActionListener(listener22);
		choice2205.addActionListener(listener22);
		//Ερωτηση 3
		question23 = new JLabel("7Πόσο σου αρέσει το μάθημα ιστορία;");
		choice2301 = new JRadioButton("Καθόλου");
		choice2302 = new JRadioButton("Σχεδόν Καθόλου");
		choice2303 = new JRadioButton("Μέτρια");
		choice2304 = new JRadioButton("Αρκετά");
		choice2305 = new JRadioButton("Πόλυ");
		choices23 = new JPanel(new FlowLayout());
		choices23.add(choice2301);
		choices23.add(choice2302);
		choices23.add(choice2303);
		choices23.add(choice2304);
		choices23.add(choice2305);
		ButtonGroup group23 = new ButtonGroup();
		group23.add(choice2301);
		group23.add(choice2302);
		group23.add(choice2303);
		group23.add(choice2304);
		group23.add(choice2305);
		circleListener listener23 = new circleListener();
		choice2301.addActionListener(listener23);
		choice2302.addActionListener(listener23);
		choice2303.addActionListener(listener23);
		choice2304.addActionListener(listener23);
		choice2305.addActionListener(listener23);
		//Ερωτηση 4
		question24 = new JLabel("8.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice2401 = new JRadioButton("Καθόλου");
		choice2402 = new JRadioButton("Σχεδόν Καθόλου");
		choice2403 = new JRadioButton("Μέτρια");
		choice2404 = new JRadioButton("Αρκετά");
		choice2405 = new JRadioButton("Πόλυ");
		choices24 = new JPanel(new FlowLayout());
		choices24.add(choice2401);
		choices24.add(choice2402);
		choices24.add(choice2403);
		choices24.add(choice2404);
		choices24.add(choice2405);
		ButtonGroup group24 = new ButtonGroup();
		group24.add(choice2401);
		group24.add(choice2402);
		group24.add(choice2403);
		group24.add(choice2404);
		group24.add(choice2405);
		circleListener listener24 = new circleListener();
		choice2401.addActionListener(listener24);
		choice2402.addActionListener(listener24);
		choice2403.addActionListener(listener24);
		choice2404.addActionListener(listener24);
		choice2405.addActionListener(listener24);
		
		//Σχολη 3 
		//Ερωτηση 1
		question31 = new JLabel("9.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice3101 = new JRadioButton("Καθόλου");
		choice3102 = new JRadioButton("Σχεδόν Καθόλου");
		choice3103 = new JRadioButton("Μέτρια");
		choice3104 = new JRadioButton("Αρκετά");
		choice3105 = new JRadioButton("Πόλυ");
		choices31 = new JPanel(new FlowLayout());
		choices31.add(choice3101);
		choices31.add(choice3102);
		choices31.add(choice3103);
		choices31.add(choice3104);
		choices31.add(choice3105);
		ButtonGroup group31 = new ButtonGroup();
		group31.add(choice3101);
		group31.add(choice3102);
		group31.add(choice3103);
		group31.add(choice3104);
		group31.add(choice3105);
		circleListener listener31 = new circleListener();
		choice3101.addActionListener(listener31);
		choice3102.addActionListener(listener31);
		choice3103.addActionListener(listener31);
		choice3104.addActionListener(listener31);
		choice3105.addActionListener(listener31);
		//Ερωτηση 2
		question32 = new JLabel("10.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice3201 = new JRadioButton("Καθόλου");
		choice3202 = new JRadioButton("Σχεδόν Καθόλου");
		choice3203 = new JRadioButton("Μέτρια");
		choice3204 = new JRadioButton("Αρκετά");
		choice3205 = new JRadioButton("Πόλυ");
		choices32 = new JPanel(new FlowLayout());
		choices32.add(choice3201);
		choices32.add(choice3202);
		choices32.add(choice3203);
		choices32.add(choice3204);
		choices32.add(choice3205);
		ButtonGroup group32 = new ButtonGroup();
		group32.add(choice3201);
		group32.add(choice3202);
		group32.add(choice3203);
		group32.add(choice3204);
		group32.add(choice3205);
		circleListener listener32 = new circleListener();
		choice3201.addActionListener(listener32);
		choice3202.addActionListener(listener32);
		choice3203.addActionListener(listener32);
		choice3204.addActionListener(listener32);
		choice3205.addActionListener(listener32);
		//Ερωτηση 3
		question33 = new JLabel("11.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice3301 = new JRadioButton("Καθόλου");
		choice3302 = new JRadioButton("Σχεδόν Καθόλου");
		choice3303 = new JRadioButton("Μέτρια");
		choice3304 = new JRadioButton("Αρκετά");
		choice3305 = new JRadioButton("Πόλυ");
		choices33 = new JPanel(new FlowLayout());
		choices33.add(choice3301);
		choices33.add(choice3302);
		choices33.add(choice3303);
		choices33.add(choice3304);
		choices33.add(choice3305);
		ButtonGroup group33 = new ButtonGroup();
		group33.add(choice3301);
		group33.add(choice3302);
		group33.add(choice3303);
		group33.add(choice3304);
		group33.add(choice3305);
		circleListener listener33 = new circleListener();
		choice3301.addActionListener(listener33);
		choice3302.addActionListener(listener33);
		choice3303.addActionListener(listener33);
		choice3304.addActionListener(listener33);
		choice3305.addActionListener(listener33);
		
		
		//Ερωτηση 4
		question34 = new JLabel("12.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice3401 = new JRadioButton("Καθόλου");
		choice3402 = new JRadioButton("Σχεδόν Καθόλου");
		choice3403 = new JRadioButton("Μέτρια");
		choice3404 = new JRadioButton("Αρκετά");
		choice3405 = new JRadioButton("Πόλυ");
		choices34 = new JPanel(new FlowLayout());
		choices34.add(choice3401);
		choices34.add(choice3402);
		choices34.add(choice3403);
		choices34.add(choice3404);
		choices34.add(choice3405);
		ButtonGroup group34 = new ButtonGroup();
		group34.add(choice3401);
		group34.add(choice3402);
		group34.add(choice3403);
		group34.add(choice3404);
		group34.add(choice3405);
		circleListener listener34 = new circleListener();
		choice3401.addActionListener(listener34);
		choice3402.addActionListener(listener34);
		choice3403.addActionListener(listener34);
		choice3404.addActionListener(listener34);
		choice3405.addActionListener(listener34);
		
		//Σχολη 4 
		//Ερωτηση 1
		question41 = new JLabel("13.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice4101 = new JRadioButton("Καθόλου");
		choice4102 = new JRadioButton("Σχεδόν Καθόλου");
		choice4103 = new JRadioButton("Μέτρια");
		choice4104 = new JRadioButton("Αρκετά");
		choice4105 = new JRadioButton("Πόλυ");
		choices41 = new JPanel(new FlowLayout());
		choices41.add(choice4101);
		choices41.add(choice4102);
		choices41.add(choice4103);
		choices41.add(choice4104);
		choices41.add(choice4105);
		ButtonGroup group41 = new ButtonGroup();
		group41.add(choice4101);
		group41.add(choice4102);
		group41.add(choice4103);
		group41.add(choice4104);
		group41.add(choice4105);
		circleListener listener41 = new circleListener();
		choice4101.addActionListener(listener41);
		choice4102.addActionListener(listener41);
		choice4103.addActionListener(listener41);
		choice4104.addActionListener(listener41);
		choice4105.addActionListener(listener41);
		//Ερωτηση 2
		question42 = new JLabel("14.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice4201 = new JRadioButton("Καθόλου");
		choice4202 = new JRadioButton("Σχεδόν Καθόλου");
		choice4203 = new JRadioButton("Μέτρια");
		choice4204 = new JRadioButton("Αρκετά");
		choice4205 = new JRadioButton("Πόλυ");
		choices42 = new JPanel(new FlowLayout());
		choices42.add(choice4201);
		choices42.add(choice4202);
		choices42.add(choice4203);
		choices42.add(choice4204);
		choices42.add(choice4205);
		ButtonGroup group42 = new ButtonGroup();
		group42.add(choice4201);
		group42.add(choice4202);
		group42.add(choice4203);
		group42.add(choice4204);
		group42.add(choice4205);
		circleListener listener42 = new circleListener();
		choice4201.addActionListener(listener42);
		choice4202.addActionListener(listener42);
		choice4203.addActionListener(listener42);
		choice4204.addActionListener(listener42);
		choice4205.addActionListener(listener42);
		//Ερωτηση 3
		question43 = new JLabel("15.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice4301 = new JRadioButton("Καθόλου");
		choice4302 = new JRadioButton("Σχεδόν Καθόλου");
		choice4303 = new JRadioButton("Μέτρια");
		choice4304 = new JRadioButton("Αρκετά");
		choice4305 = new JRadioButton("Πόλυ");
		choices43 = new JPanel(new FlowLayout());
		choices43.add(choice4301);
		choices43.add(choice4302);
		choices43.add(choice4303);
		choices43.add(choice4304);
		choices43.add(choice4305);
		ButtonGroup group43 = new ButtonGroup();
		group43.add(choice4301);
		group43.add(choice4302);
		group43.add(choice4303);
		group43.add(choice4304);
		group43.add(choice4305);
		circleListener listener43 = new circleListener();
		choice4301.addActionListener(listener43);
		choice4302.addActionListener(listener43);
		choice4303.addActionListener(listener43);
		choice4304.addActionListener(listener43);
		choice4305.addActionListener(listener43);
		
		
		//Ερωτηση 4
		question44 = new JLabel("16.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice4401 = new JRadioButton("Καθόλου");
		choice4402 = new JRadioButton("Σχεδόν Καθόλου");
		choice4403 = new JRadioButton("Μέτρια");
		choice4404 = new JRadioButton("Αρκετά");
		choice4405 = new JRadioButton("Πόλυ");
		choices44 = new JPanel(new FlowLayout());
		choices44.add(choice4401);
		choices44.add(choice4402);
		choices44.add(choice4403);
		choices44.add(choice4404);
		choices44.add(choice4405);
		ButtonGroup group44 = new ButtonGroup();
		group44.add(choice4401);
		group44.add(choice4402);
		group44.add(choice4403);
		group44.add(choice4404);
		group44.add(choice4405);
		circleListener listener44 = new circleListener();
		choice4401.addActionListener(listener44);
		choice4402.addActionListener(listener44);
		choice4403.addActionListener(listener44);
		choice4404.addActionListener(listener44);
		choice4405.addActionListener(listener44);
		
		//Σχολη 5
		//Ερωτηση 1
		question51 = new JLabel("17.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice5101 = new JRadioButton("Καθόλου");
		choice5102 = new JRadioButton("Σχεδόν Καθόλου");
		choice5103 = new JRadioButton("Μέτρια");
		choice5104 = new JRadioButton("Αρκετά");
		choice5105 = new JRadioButton("Πόλυ");
		choices51 = new JPanel(new FlowLayout());
		choices51.add(choice5101);
		choices51.add(choice5102);
		choices51.add(choice5103);
		choices51.add(choice5104);
		choices51.add(choice5105);
		ButtonGroup group51 = new ButtonGroup();
		group51.add(choice5101);
		group51.add(choice5102);
		group51.add(choice5103);
		group51.add(choice5104);
		group51.add(choice5105);
		circleListener listener51 = new circleListener();
		choice5101.addActionListener(listener51);
		choice5102.addActionListener(listener51);
		choice5103.addActionListener(listener51);
		choice5104.addActionListener(listener51);
		choice5105.addActionListener(listener51);
		//Ερωτηση 2
		question52 = new JLabel("18.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice5201 = new JRadioButton("Καθόλου");
		choice5202 = new JRadioButton("Σχεδόν Καθόλου");
		choice5203 = new JRadioButton("Μέτρια");
		choice5204 = new JRadioButton("Αρκετά");
		choice5205 = new JRadioButton("Πόλυ");
		choices52 = new JPanel(new FlowLayout());
		choices52.add(choice5201);
		choices52.add(choice5202);
		choices52.add(choice5203);
		choices52.add(choice5204);
		choices52.add(choice5205);
		ButtonGroup group52 = new ButtonGroup();
		group52.add(choice5201);
		group52.add(choice5202);
		group52.add(choice5203);
		group52.add(choice5204);
		group52.add(choice5205);
		circleListener listener52 = new circleListener();
		choice5201.addActionListener(listener52);
		choice5202.addActionListener(listener52);
		choice5203.addActionListener(listener52);
		choice5204.addActionListener(listener52);
		choice5205.addActionListener(listener52);
		//Ερωτηση 3
		question53 = new JLabel("19.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice5301 = new JRadioButton("Καθόλου");
		choice5302 = new JRadioButton("Σχεδόν Καθόλου");
		choice5303 = new JRadioButton("Μέτρια");
		choice5304 = new JRadioButton("Αρκετά");
		choice5305 = new JRadioButton("Πόλυ");
		choices53 = new JPanel(new FlowLayout());
		choices53.add(choice5301);
		choices53.add(choice5302);
		choices53.add(choice5303);
		choices53.add(choice5304);
		choices53.add(choice5305);
		ButtonGroup group53 = new ButtonGroup();
		group53.add(choice5301);
		group53.add(choice5302);
		group53.add(choice5303);
		group53.add(choice5304);
		group53.add(choice5305);
		circleListener listener53 = new circleListener();
		choice5301.addActionListener(listener53);
		choice5302.addActionListener(listener53);
		choice5303.addActionListener(listener53);
		choice5304.addActionListener(listener53);
		choice5305.addActionListener(listener53);
		
		
		//Ερωτηση 4
		question54 = new JLabel("20.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice5401 = new JRadioButton("Καθόλου");
		choice5402 = new JRadioButton("Σχεδόν Καθόλου");
		choice5403 = new JRadioButton("Μέτρια");
		choice5404 = new JRadioButton("Αρκετά");
		choice5405 = new JRadioButton("Πόλυ");
		choices54 = new JPanel(new FlowLayout());
		choices54.add(choice5401);
		choices54.add(choice5402);
		choices54.add(choice5403);
		choices54.add(choice5404);
		choices54.add(choice5405);
		ButtonGroup group54 = new ButtonGroup();
		group54.add(choice5401);
		group54.add(choice5402);
		group54.add(choice5403);
		group54.add(choice5404);
		group54.add(choice5405);
		circleListener listener54 = new circleListener();
		choice5401.addActionListener(listener54);
		choice5402.addActionListener(listener54);
		choice5403.addActionListener(listener54);
		choice5404.addActionListener(listener54);
		choice5405.addActionListener(listener54);
		
		//Σχολη 6
		//Ερωτηση 1
		question61 = new JLabel("21.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice6101 = new JRadioButton("Καθόλου");
		choice6102 = new JRadioButton("Σχεδόν Καθόλου");
		choice6103 = new JRadioButton("Μέτρια");
		choice6104 = new JRadioButton("Αρκετά");
		choice6105 = new JRadioButton("Πόλυ");
		choices61 = new JPanel(new FlowLayout());
		choices61.add(choice6101);
		choices61.add(choice6102);
		choices61.add(choice6103);
		choices61.add(choice6104);
		choices61.add(choice6105);
		ButtonGroup group61 = new ButtonGroup();
		group61.add(choice6101);
		group61.add(choice6102);
		group61.add(choice6103);
		group61.add(choice6104);
		group61.add(choice6105);
		circleListener listener61 = new circleListener();
		choice6101.addActionListener(listener61);
		choice6102.addActionListener(listener61);
		choice6103.addActionListener(listener61);
		choice6104.addActionListener(listener61);
		choice6105.addActionListener(listener61);
		//Ερωτηση 2
		question62 = new JLabel("22.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice6201 = new JRadioButton("Καθόλου");
		choice6202 = new JRadioButton("Σχεδόν Καθόλου");
		choice6203 = new JRadioButton("Μέτρια");
		choice6204 = new JRadioButton("Αρκετά");
		choice6205 = new JRadioButton("Πόλυ");
		choices62 = new JPanel(new FlowLayout());
		choices62.add(choice6201);
		choices62.add(choice6202);
		choices62.add(choice6203);
		choices62.add(choice6204);
		choices62.add(choice6205);
		ButtonGroup group62 = new ButtonGroup();
		group62.add(choice6201);
		group62.add(choice6202);
		group62.add(choice6203);
		group62.add(choice6204);
		group62.add(choice6205);
		circleListener listener62 = new circleListener();
		choice6201.addActionListener(listener62);
		choice6202.addActionListener(listener62);
		choice6203.addActionListener(listener62);
		choice6204.addActionListener(listener62);
		choice6205.addActionListener(listener62);
		//Ερωτηση 3
		question63 = new JLabel("23.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice6301 = new JRadioButton("Καθόλου");
		choice6302 = new JRadioButton("Σχεδόν Καθόλου");
		choice6303 = new JRadioButton("Μέτρια");
		choice6304 = new JRadioButton("Αρκετά");
		choice6305 = new JRadioButton("Πόλυ");
		choices63 = new JPanel(new FlowLayout());
		choices63.add(choice6301);
		choices63.add(choice6302);
		choices63.add(choice6303);
		choices63.add(choice6304);
		choices63.add(choice6305);
		ButtonGroup group63 = new ButtonGroup();
		group63.add(choice6301);
		group63.add(choice6302);
		group63.add(choice6303);
		group63.add(choice6304);
		group63.add(choice6305);
		circleListener listener63 = new circleListener();
		choice6301.addActionListener(listener63);
		choice6302.addActionListener(listener63);
		choice6303.addActionListener(listener63);
		choice6304.addActionListener(listener63);
		choice6305.addActionListener(listener63);
		
		
		//Ερωτηση 4
		question64 = new JLabel("24.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice6401 = new JRadioButton("Καθόλου");
		choice6402 = new JRadioButton("Σχεδόν Καθόλου");
		choice6403 = new JRadioButton("Μέτρια");
		choice6404 = new JRadioButton("Αρκετά");
		choice6405 = new JRadioButton("Πόλυ");
		choices64 = new JPanel(new FlowLayout());
		choices64.add(choice6401);
		choices64.add(choice6402);
		choices64.add(choice6403);
		choices64.add(choice6404);
		choices64.add(choice6405);
		ButtonGroup group64 = new ButtonGroup();
		group64.add(choice6401);
		group64.add(choice6402);
		group64.add(choice6403);
		group64.add(choice6404);
		group64.add(choice6405);
		circleListener listener64 = new circleListener();
		choice6401.addActionListener(listener64);
		choice6402.addActionListener(listener64);
		choice6403.addActionListener(listener64);
		choice6404.addActionListener(listener64);
		choice6405.addActionListener(listener64);
		
		//Σχολη 7
		
		//Ερωτηση 1
		question71 = new JLabel("25.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice7101 = new JRadioButton("Καθόλου");
		choice7102 = new JRadioButton("Σχεδόν Καθόλου");
		choice7103 = new JRadioButton("Μέτρια");
		choice7104 = new JRadioButton("Αρκετά");
		choice7105 = new JRadioButton("Πόλυ");
		choices71 = new JPanel(new FlowLayout());
		choices71.add(choice7101);
		choices71.add(choice7102);
		choices71.add(choice7103);
		choices71.add(choice7104);
		choices71.add(choice7105);
		ButtonGroup group71 = new ButtonGroup();
		group71.add(choice7101);
		group71.add(choice7102);
		group71.add(choice7103);
		group71.add(choice7104);
		group71.add(choice7105);
		circleListener listener71 = new circleListener();
		choice7101.addActionListener(listener71);
		choice7102.addActionListener(listener71);
		choice7103.addActionListener(listener71);
		choice7104.addActionListener(listener71);
		choice7105.addActionListener(listener71);
		//Ερωτηση 2
		question72 = new JLabel("26.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice7201 = new JRadioButton("Καθόλου");
		choice7202 = new JRadioButton("Σχεδόν Καθόλου");
		choice7203 = new JRadioButton("Μέτρια");
		choice7204 = new JRadioButton("Αρκετά");
		choice7205 = new JRadioButton("Πόλυ");
		choices72 = new JPanel(new FlowLayout());
		choices72.add(choice7201);
		choices72.add(choice7202);
		choices72.add(choice7203);
		choices72.add(choice7204);
		choices72.add(choice7205);
		ButtonGroup group72 = new ButtonGroup();
		group72.add(choice7201);
		group72.add(choice7202);
		group72.add(choice7203);
		group72.add(choice7204);
		group72.add(choice7205);
		circleListener listener72 = new circleListener();
		choice7201.addActionListener(listener72);
		choice7202.addActionListener(listener72);
		choice7203.addActionListener(listener72);
		choice7204.addActionListener(listener72);
		choice7205.addActionListener(listener72);
		//Ερωτηση 3
		question73 = new JLabel("27.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice7301 = new JRadioButton("Καθόλου");
		choice7302 = new JRadioButton("Σχεδόν Καθόλου");
		choice7303 = new JRadioButton("Μέτρια");
		choice7304 = new JRadioButton("Αρκετά");
		choice7305 = new JRadioButton("Πόλυ");
		choices73 = new JPanel(new FlowLayout());
		choices73.add(choice7301);
		choices73.add(choice7302);
		choices73.add(choice7303);
		choices73.add(choice7304);
		choices73.add(choice7305);
		ButtonGroup group73 = new ButtonGroup();
		group73.add(choice7301);
		group73.add(choice7302);
		group73.add(choice7303);
		group73.add(choice7304);
		group73.add(choice7305);
		circleListener listener73 = new circleListener();
		choice7301.addActionListener(listener73);
		choice7302.addActionListener(listener73);
		choice7303.addActionListener(listener73);
		choice7304.addActionListener(listener73);
		choice7305.addActionListener(listener73);
		
		
		//Ερωτηση 4
		question74 = new JLabel("28.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice7401 = new JRadioButton("Καθόλου");
		choice7402 = new JRadioButton("Σχεδόν Καθόλου");
		choice7403 = new JRadioButton("Μέτρια");
		choice7404 = new JRadioButton("Αρκετά");
		choice7405 = new JRadioButton("Πόλυ");
		choices74 = new JPanel(new FlowLayout());
		choices74.add(choice7401);
		choices74.add(choice7402);
		choices74.add(choice7403);
		choices74.add(choice7404);
		choices74.add(choice7405);
		ButtonGroup group74 = new ButtonGroup();
		group74.add(choice7401);
		group74.add(choice7402);
		group74.add(choice7403);
		group74.add(choice7404);
		group74.add(choice7405);
		circleListener listener74 = new circleListener();
		choice7401.addActionListener(listener74);
		choice7402.addActionListener(listener74);
		choice7403.addActionListener(listener74);
		choice7404.addActionListener(listener74);
		choice7405.addActionListener(listener74);
		
		//Σχολη 8
		question81 = new JLabel("29.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice8101 = new JRadioButton("Καθόλου");
		choice8102 = new JRadioButton("Σχεδόν Καθόλου");
		choice8103 = new JRadioButton("Μέτρια");
		choice8104 = new JRadioButton("Αρκετά");
		choice8105 = new JRadioButton("Πόλυ");
		choices81 = new JPanel(new FlowLayout());
		choices81.add(choice8101);
		choices81.add(choice8102);
		choices81.add(choice8103);
		choices81.add(choice8104);
		choices81.add(choice8105);
		ButtonGroup group81 = new ButtonGroup();
		group81.add(choice8101);
		group81.add(choice8102);
		group81.add(choice8103);
		group81.add(choice8104);
		group81.add(choice8105);
		circleListener listener81 = new circleListener();
		choice8101.addActionListener(listener81);
		choice8102.addActionListener(listener81);
		choice8103.addActionListener(listener81);
		choice8104.addActionListener(listener81);
		choice8105.addActionListener(listener81);
		//Ερωτηση 2
		question82 = new JLabel("30.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice8201 = new JRadioButton("Καθόλου");
		choice8202 = new JRadioButton("Σχεδόν Καθόλου");
		choice8203 = new JRadioButton("Μέτρια");
		choice8204 = new JRadioButton("Αρκετά");
		choice8205 = new JRadioButton("Πόλυ");
		choices82 = new JPanel(new FlowLayout());
		choices82.add(choice8201);
		choices82.add(choice8202);
		choices82.add(choice8203);
		choices82.add(choice8204);
		choices82.add(choice8205);
		ButtonGroup group82 = new ButtonGroup();
		group82.add(choice8201);
		group82.add(choice8202);
		group82.add(choice8203);
		group82.add(choice8204);
		group82.add(choice8205);
		circleListener listener82 = new circleListener();
		choice8201.addActionListener(listener82);
		choice8202.addActionListener(listener82);
		choice8203.addActionListener(listener82);
		choice8204.addActionListener(listener82);
		choice8205.addActionListener(listener82);
		//Ερωτηση 3
		question83 = new JLabel("31.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice8301 = new JRadioButton("Καθόλου");
		choice8302 = new JRadioButton("Σχεδόν Καθόλου");
		choice8303 = new JRadioButton("Μέτρια");
		choice8304 = new JRadioButton("Αρκετά");
		choice8305 = new JRadioButton("Πόλυ");
		choices83 = new JPanel(new FlowLayout());
		choices83.add(choice8301);
		choices83.add(choice8302);
		choices83.add(choice8303);
		choices83.add(choice8304);
		choices83.add(choice8305);
		ButtonGroup group83 = new ButtonGroup();
		group83.add(choice8301);
		group83.add(choice8302);
		group83.add(choice8303);
		group83.add(choice8304);
		group83.add(choice8305);
		circleListener listener83 = new circleListener();
		choice8301.addActionListener(listener83);
		choice8302.addActionListener(listener83);
		choice8303.addActionListener(listener83);
		choice8304.addActionListener(listener83);
		choice8305.addActionListener(listener83);
		
		
		//Ερωτηση 4
		question84 = new JLabel("32.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice8401 = new JRadioButton("Καθόλου");
		choice8402 = new JRadioButton("Σχεδόν Καθόλου");
		choice8403 = new JRadioButton("Μέτρια");
		choice8404 = new JRadioButton("Αρκετά");
		choice8405 = new JRadioButton("Πόλυ");
		choices84 = new JPanel(new FlowLayout());
		choices84.add(choice8401);
		choices84.add(choice8402);
		choices84.add(choice8403);
		choices84.add(choice8404);
		choices84.add(choice8405);
		ButtonGroup group84 = new ButtonGroup();
		group84.add(choice8401);
		group84.add(choice8402);
		group84.add(choice8403);
		group84.add(choice8404);
		group84.add(choice8405);
		circleListener listener84 = new circleListener();
		choice8401.addActionListener(listener84);
		choice8402.addActionListener(listener84);
		choice8403.addActionListener(listener84);
		choice8404.addActionListener(listener84);
		choice8405.addActionListener(listener84);
		
		//Σχολη 9
		question91 = new JLabel("33.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice9101 = new JRadioButton("Καθόλου");
		choice9102 = new JRadioButton("Σχεδόν Καθόλου");
		choice9103 = new JRadioButton("Μέτρια");
		choice9104 = new JRadioButton("Αρκετά");
		choice9105 = new JRadioButton("Πόλυ");
		choices91 = new JPanel(new FlowLayout());
		choices91.add(choice9101);
		choices91.add(choice9102);
		choices91.add(choice9103);
		choices91.add(choice9104);
		choices91.add(choice9105);
		ButtonGroup group91 = new ButtonGroup();
		group91.add(choice9101);
		group91.add(choice9102);
		group91.add(choice9103);
		group91.add(choice9104);
		group91.add(choice9105);
		circleListener listener91 = new circleListener();
		choice9101.addActionListener(listener91);
		choice9102.addActionListener(listener91);
		choice9103.addActionListener(listener91);
		choice9104.addActionListener(listener91);
		choice9105.addActionListener(listener91);
		//Ερωτηση 2
		question92 = new JLabel("34.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice9201 = new JRadioButton("Καθόλου");
		choice9202 = new JRadioButton("Σχεδόν Καθόλου");
		choice9203 = new JRadioButton("Μέτρια");
		choice9204 = new JRadioButton("Αρκετά");
		choice9205 = new JRadioButton("Πόλυ");
		choices92 = new JPanel(new FlowLayout());
		choices92.add(choice9201);
		choices92.add(choice9202);
		choices92.add(choice9203);
		choices92.add(choice9204);
		choices92.add(choice9205);
		ButtonGroup group92 = new ButtonGroup();
		group92.add(choice9201);
		group92.add(choice9202);
		group92.add(choice9203);
		group92.add(choice9204);
		group92.add(choice9205);
		circleListener listener92 = new circleListener();
		choice9201.addActionListener(listener92);
		choice9202.addActionListener(listener92);
		choice9203.addActionListener(listener92);
		choice9204.addActionListener(listener92);
		choice9205.addActionListener(listener92);
		//Ερωτηση 3
		question93 = new JLabel("35.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice9301 = new JRadioButton("Καθόλου");
		choice9302 = new JRadioButton("Σχεδόν Καθόλου");
		choice9303 = new JRadioButton("Μέτρια");
		choice9304 = new JRadioButton("Αρκετά");
		choice9305 = new JRadioButton("Πόλυ");
		choices93 = new JPanel(new FlowLayout());
		choices93.add(choice9301);
		choices93.add(choice9302);
		choices93.add(choice9303);
		choices93.add(choice9304);
		choices93.add(choice9305);
		ButtonGroup group93 = new ButtonGroup();
		group93.add(choice9301);
		group93.add(choice9302);
		group93.add(choice9303);
		group93.add(choice9304);
		group93.add(choice9305);
		circleListener listener93 = new circleListener();
		choice9301.addActionListener(listener93);
		choice9302.addActionListener(listener93);
		choice9303.addActionListener(listener93);
		choice9304.addActionListener(listener93);
		choice9305.addActionListener(listener93);
		
		
		//Ερωτηση 4
		question94 = new JLabel("36.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice9401 = new JRadioButton("Καθόλου");
		choice9402 = new JRadioButton("Σχεδόν Καθόλου");
		choice9403 = new JRadioButton("Μέτρια");
		choice9404 = new JRadioButton("Αρκετά");
		choice9405 = new JRadioButton("Πόλυ");
		choices94 = new JPanel(new FlowLayout());
		choices94.add(choice9401);
		choices94.add(choice9402);
		choices94.add(choice9403);
		choices94.add(choice9404);
		choices94.add(choice9405);
		ButtonGroup group94 = new ButtonGroup();
		group94.add(choice9401);
		group94.add(choice9402);
		group94.add(choice9403);
		group94.add(choice9404);
		group94.add(choice9405);
		circleListener listener94 = new circleListener();
		choice9401.addActionListener(listener94);
		choice9402.addActionListener(listener94);
		choice9403.addActionListener(listener94);
		choice9404.addActionListener(listener94);
		choice9405.addActionListener(listener94);
		
		//Σχολη 10
		question101 = new JLabel("37.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice10101 = new JRadioButton("Καθόλου");
		choice10102 = new JRadioButton("Σχεδόν Καθόλου");
		choice10103 = new JRadioButton("Μέτρια");
		choice10104 = new JRadioButton("Αρκετά");
		choice10105 = new JRadioButton("Πόλυ");
		choices101 = new JPanel(new FlowLayout());
		choices101.add(choice10101);
		choices101.add(choice10102);
		choices101.add(choice10103);
		choices101.add(choice10104);
		choices101.add(choice10105);
		ButtonGroup group101 = new ButtonGroup();
		group101.add(choice10101);
		group101.add(choice10102);
		group101.add(choice10103);
		group101.add(choice10104);
		group101.add(choice10105);
		circleListener listener101 = new circleListener();
		choice10101.addActionListener(listener101);
		choice10102.addActionListener(listener101);
		choice10103.addActionListener(listener101);
		choice10104.addActionListener(listener101);
		choice10105.addActionListener(listener101);
		//Ερωτηση 2
		question102 = new JLabel("38.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice10201 = new JRadioButton("Καθόλου");
		choice10202 = new JRadioButton("Σχεδόν Καθόλου");
		choice10203 = new JRadioButton("Μέτρια");
		choice10204 = new JRadioButton("Αρκετά");
		choice10205 = new JRadioButton("Πόλυ");
		choices102 = new JPanel(new FlowLayout());
		choices102.add(choice10201);
		choices102.add(choice10202);
		choices102.add(choice10203);
		choices102.add(choice10204);
		choices102.add(choice10205);
		ButtonGroup group102 = new ButtonGroup();
		group102.add(choice10201);
		group102.add(choice10202);
		group102.add(choice10203);
		group102.add(choice10204);
		group102.add(choice10205);
		circleListener listener102 = new circleListener();
		choice10201.addActionListener(listener102);
		choice10202.addActionListener(listener102);
		choice10203.addActionListener(listener102);
		choice10204.addActionListener(listener102);
		choice10205.addActionListener(listener102);
		//Ερωτηση 3
		question103 = new JLabel("39.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice10301 = new JRadioButton("Καθόλου");
		choice10302 = new JRadioButton("Σχεδόν Καθόλου");
		choice10303 = new JRadioButton("Μέτρια");
		choice10304 = new JRadioButton("Αρκετά");
		choice10305 = new JRadioButton("Πόλυ");
		choices103 = new JPanel(new FlowLayout());
		choices103.add(choice10301);
		choices103.add(choice10302);
		choices103.add(choice10303);
		choices103.add(choice10304);
		choices103.add(choice10305);
		ButtonGroup group103 = new ButtonGroup();
		group103.add(choice10301);
		group103.add(choice10302);
		group103.add(choice10303);
		group103.add(choice10304);
		group103.add(choice10305);
		circleListener listener103 = new circleListener();
		choice10301.addActionListener(listener103);
		choice10302.addActionListener(listener103);
		choice10303.addActionListener(listener103);
		choice10304.addActionListener(listener103);
		choice10305.addActionListener(listener103);
		
		
		//Ερωτηση 4
		question104 = new JLabel("40.Πόσο σου αρέσει το μάθημα ιστορία;");
		choice10401 = new JRadioButton("Καθόλου");
		choice10402 = new JRadioButton("Σχεδόν Καθόλου");
		choice10403 = new JRadioButton("Μέτρια");
		choice10404 = new JRadioButton("Αρκετά");
		choice10405 = new JRadioButton("Πόλυ");
		choices104 = new JPanel(new FlowLayout());
		choices104.add(choice10401);
		choices104.add(choice10402);
		choices104.add(choice10403);
		choices104.add(choice10404);
		choices104.add(choice10405);
		ButtonGroup group104 = new ButtonGroup();
		group104.add(choice10401);
		group104.add(choice10402);
		group104.add(choice10403);
		group104.add(choice10404);
		group104.add(choice10405);
		circleListener listener104 = new circleListener();
		choice10401.addActionListener(listener104);
		choice10402.addActionListener(listener104);
		choice10403.addActionListener(listener104);
		choice10404.addActionListener(listener104);
		choice10405.addActionListener(listener104);
		
		
		//Εισαγωγη των  componenets στο central panel
		//Σχολη 1
		central.add(question11);
		central.add(choices11);
		central.add(question12);
		central.add(choices12);
		central.add(question13);
		central.add(choices13);
		central.add(question14);
		central.add(choices14);
		
		//Σχολη 2
		central.add(question21);
		central.add(choices21);
		central.add(question22);
		central.add(choices22);
		central.add(question23);
		central.add(choices23);
		central.add(question24);
		central.add(choices24);
		
		//Σχολη 3
		
		central.add(question31);
		central.add(choices31);
		central.add(question32);
		central.add(choices32);
		central.add(question33);
		central.add(choices33);
		central.add(question34);
		central.add(choices34);
		
		//Σχολη 4
		central.add(question41);
		central.add(choices41);
		central.add(question42);
		central.add(choices42);
		central.add(question43);
		central.add(choices43);
		central.add(question44);
		central.add(choices44);
		
		//Σχολη 5
		central.add(question51);
		central.add(choices51);
		central.add(question52);
		central.add(choices52);
		central.add(question53);
		central.add(choices53);
		central.add(question54);
		central.add(choices54);
		
		//Σχολη 6
		central.add(question61);
		central.add(choices61);
		central.add(question62);
		central.add(choices62);
		central.add(question63);
		central.add(choices63);
		central.add(question64);
		central.add(choices64);
		
		//Σχολη 7
		central.add(question71);
		central.add(choices71);
		central.add(question72);
		central.add(choices72);
		central.add(question73);
		central.add(choices73);
		central.add(question74);
		central.add(choices74);
		
		//Σχολη 8
		central.add(question81);
		central.add(choices81);
		central.add(question82);
		central.add(choices82);
		central.add(question83);
		central.add(choices83);
		central.add(question84);
		central.add(choices84);
		
		//Σχολη 9
		central.add(question91);
		central.add(choices91);
		central.add(question92);
		central.add(choices92);
		central.add(question93);
		central.add(choices93);
		central.add(question94);
		central.add(choices94);
		
		//Σχολη 10 
		central.add(question101);
		central.add(choices101);
		central.add(question102);
		central.add(choices102);
		central.add(question103);
		central.add(choices103);
		central.add(question104);
		central.add(choices104);
				
		
		
		
		
		central.add(submit);
		
		//Εισαγωγη των components στο Frame]
		this.setLocation(400, 25);
		this.setTitle("Φόρμα Ανθρωπιστηκών Σπουδών");
		this.setContentPane(sheet);			
		this.setVisible(true);
		this.setSize(500,700);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.pack();
		
	}
	
	class circleListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	
	
	
	
}
