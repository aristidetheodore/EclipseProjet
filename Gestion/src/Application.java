import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class Application {

	private static JPanel pan;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;
	private JPanel p6;
	private JPanel p7;
	static CardLayout cl=new CardLayout();
	private JLabel label_45;
	private JTextField txt;
	private JPasswordField pass;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_23;
	private JLabel lbl;
	private JLabel label_17;
	private JLabel label_26;
	private JLabel label_34;
	private JLabel label;
	private JLabel n;
	private JLabel tt;
	private int h;

	private JButton btnNewButton;
	private int j;
	private JTextField textField;
	private JTextField textField_21;
	private JTextField textField_24;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_25;
	
	String url = "jdbc:ucanaccess://C:\\ACCESS_db\\db.accdb";
	Connection con = null;
	Statement req = null;
	ResultSet res = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int x;
		new Application();
		try {
			for(x=0;x<=70;x++) {
					Thread.sleep(50);
					if(x==70) {
						Application.cl.show(pan, "1");

					}
			}}catch(InterruptedException e) {
					e.printStackTrace();
				
			}
	}

	/**
	 * Create the frame.
	 */
	public Application() {
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setBounds(50, 50, 1200, 673);
		frame.setFont(new Font("System", Font.PLAIN, 14));
		Font f = frame.getFont();
		FontMetrics fm = frame.getFontMetrics(f);
		String pad ="";
		//for (int i=0; i!=w; i++) pad +=" "; 
		pad = String.format("%"+150+"s", pad);
		frame.setTitle(pad+"Application");
		
		pan = new JPanel();
		pan.setBackground(Color.DARK_GRAY);
		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(pan);
		pan.setLayout(cl);
		
		p1 = new JPanel();
		p1.setBackground(SystemColor.inactiveCaptionText);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setBackground(SystemColor.inactiveCaptionText);
		p2.setBorder(new EmptyBorder(5, 5, 5, 5));
		p2.setLayout(null);
		
		p3 = new JPanel();
		p3.setBackground(SystemColor.inactiveCaptionText);
		p3.setBorder(new EmptyBorder(5, 5, 5, 5));
		p3.setLayout(null);
		
		p4 = new JPanel();
		p4.setBackground(SystemColor.inactiveCaptionText);
		p4.setBorder(new EmptyBorder(5, 5, 5, 5));
		p4.setLayout(null);
		
		p5 = new JPanel();
		p5.setBackground(SystemColor.inactiveCaptionText);
		p5.setBorder(new EmptyBorder(5, 5, 5, 5));
		p5.setLayout(null);
		
		p6 = new JPanel();
		p6.setBackground(SystemColor.inactiveCaptionText);
		p6.setBorder(new EmptyBorder(5, 5, 5, 5));
		p6.setLayout(null);
		
		p7 = new JPanel();
		p7.setBackground(new Color(0, 0, 0));
		p7.setBorder(new EmptyBorder(5, 5, 5, 5));
		p7.setLayout(null);
		
		pan.add(p1, "1");
		
		JLabel lblUtilisateur = new JLabel("Utilisateur :");
		lblUtilisateur.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\User_48px.png"));
		lblUtilisateur.setForeground(new Color(0, 255, 255));
		lblUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblUtilisateur.setBounds(136, 251, 244, 39);
		p1.add(lblUtilisateur);
		
		JLabel lblMotDePass = new JLabel("Mot de Pass :");
		lblMotDePass.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Privacy_48px.png"));
		lblMotDePass.setForeground(new Color(0, 255, 255));
		lblMotDePass.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblMotDePass.setBounds(136, 359, 244, 39);
		p1.add(lblMotDePass);
		
		txt = new JTextField();
		txt.setBounds(408, 251, 469, 39);
		p1.add(txt);
		txt.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(821, 359, 53, 39);
		p1.add(panel);
		panel.setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(checkBox.isSelected()) {
					pass.setEchoChar((char)0);
					checkBox.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\eye.png"));
				}else {
					pass.setEchoChar('*');
					checkBox.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools - copie.png"));
				}
			}
		});
		checkBox.setBounds(0, 0, 53, 39);
		checkBox.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools - copie.png"));
		panel.add(checkBox);
		
		pass = new JPasswordField();
		pass.setBounds(408, 359, 414, 39);
		p1.add(pass);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnOk.setBounds(1158, 0, 32, 23);
		p1.add(btnOk);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button.setBounds(1124, 0, 32, 23);
		p1.add(button);
		
		JLabel label_43 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		label_43.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		label_43.setForeground(new Color(135, 206, 250));
		label_43.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_43.setBounds(129, 22, 795, 81);
		p1.add(label_43);
		
		JLabel label_49 = new JLabel("MAHAJANGA");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setForeground(new Color(135, 206, 250));
		label_49.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_49.setBounds(357, 83, 351, 31);
		p1.add(label_49);
		
		JLabel label_50 = new JLabel("");
		label_50.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_50.setBounds(929, 31, 147, 96);
		p1.add(label_50);
		h =3;
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				try {
					con = DriverManager.getConnection(url);
					req = con.createStatement();
					res = req.executeQuery("SELECT * FROM Admin where Nom='"+txt.getText()+"' AND Password='"+pass.getText()+"'");
					if(res.next()) {
						label.setForeground(new Color(176, 196, 222));
						cl.show(pan, "2");
					}else {
						h-=1;
						JOptionPane.showMessageDialog(frame, "Nom ou Mot de pass incorrect !","Avertissement !", JOptionPane.WARNING_MESSAGE);
						txt.setText("");
						pass.setText("");
						n.setText(String.valueOf(h));
						tt.setText(": tentative(s)");
						if(n.getText().equals("0")) {
							btnNewButton.setEnabled(false);
						}
					}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\checkmark.png"));
		btnNewButton.setBounds(796, 461, 81, 46);
		p1.add(btnNewButton);
		
		n = new JLabel("");
		n.setForeground(Color.WHITE);
		n.setFont(new Font("Tahoma", Font.BOLD, 12));
		n.setBounds(884, 375, 33, 20);
		p1.add(n);
		
		tt = new JLabel("");
		tt.setForeground(Color.WHITE);
		tt.setFont(new Font("Tahoma", Font.BOLD, 12));
		tt.setBounds(914, 375, 81, 20);
		p1.add(tt);
		pan.add(p2, "2");
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(46, 116, 1087, 81);
		p2.add(panel_1);
		
		label = new JLabel("MATERIEL ROULANT");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), Color.CYAN, null, null));
		label.setBounds(0, 0, 229, 81);
		panel_1.add(label);
		
		JLabel lblSuiviEtEntretient_2 = new JLabel("SUIVI ET ENTRETIENT");
		lblSuiviEtEntretient_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lbl.setForeground(new Color(176, 196, 222));
				cl.show(pan, "3");
			}
		});
		lblSuiviEtEntretient_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuiviEtEntretient_2.setForeground(Color.CYAN);
		lblSuiviEtEntretient_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSuiviEtEntretient_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		lblSuiviEtEntretient_2.setBounds(227, 0, 244, 81);
		panel_1.add(lblSuiviEtEntretient_2);
		
		JLabel label_2 = new JLabel("ETAT DE ROULAGE");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_17.setForeground(new Color(176, 196, 222));
				cl.show(pan, "4");
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.CYAN);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_2.setBounds(470, 0, 256, 81);
		panel_1.add(label_2);
		
		JLabel lblAdministrateur = new JLabel("ADMINISTRATEUR");
		lblAdministrateur.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_26.setForeground(new Color(176, 196, 222));
				cl.show(pan, "5");
			}
		});
		lblAdministrateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministrateur.setForeground(Color.CYAN);
		lblAdministrateur.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdministrateur.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		lblAdministrateur.setBounds(725, 0, 229, 81);
		panel_1.add(lblAdministrateur);
		
		JLabel label_5 = new JLabel("AIDE");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_34.setForeground(new Color(176, 196, 222));
				cl.show(pan, "6");
			}
		});
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.CYAN);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_5.setBounds(952, 0, 135, 81);
		panel_1.add(label_5);
		
		JLabel lblGestionDuVehicules_1 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		lblGestionDuVehicules_1.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		lblGestionDuVehicules_1.setForeground(new Color(135, 206, 250));
		lblGestionDuVehicules_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGestionDuVehicules_1.setBounds(118, 0, 795, 81);
		p2.add(lblGestionDuVehicules_1);
		
		JLabel label_8 = new JLabel("MAHAJANGA");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(135, 206, 250));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_8.setBounds(346, 61, 351, 31);
		p2.add(label_8);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button_1.setBounds(1124, 0, 32, 23);
		p2.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		button_2.setBounds(1158, 0, 32, 23);
		p2.add(button_2);
		
		JLabel lblMahajanga_1 = new JLabel("Dir\u00E9ction");
		lblMahajanga_1.setForeground(new Color(176, 224, 230));
		lblMahajanga_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMahajanga_1.setBounds(61, 260, 126, 31);
		p2.add(lblMahajanga_1);
		
		JLabel lblTrisatec = new JLabel("TRISATEC");
		lblTrisatec.setForeground(new Color(176, 224, 230));
		lblTrisatec.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTrisatec.setBounds(61, 318, 147, 31);
		p2.add(lblTrisatec);
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setForeground(new Color(176, 224, 230));
		lblMarque.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMarque.setBounds(61, 434, 147, 31);
		p2.add(lblMarque);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setForeground(new Color(176, 224, 230));
		lblGenre.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGenre.setBounds(61, 376, 89, 31);
		p2.add(lblGenre);
		
		JLabel lblImmatric = new JLabel("IMMATRIC ");
		lblImmatric.setForeground(new Color(176, 224, 230));
		lblImmatric.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblImmatric.setBounds(61, 547, 152, 31);
		p2.add(lblImmatric);
		
		JLabel lblModle = new JLabel("Mod\u00E8le");
		lblModle.setForeground(new Color(176, 224, 230));
		lblModle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblModle.setBounds(61, 488, 105, 31);
		p2.add(lblModle);
		
		JLabel lblTraction = new JLabel("Traction");
		lblTraction.setForeground(new Color(176, 224, 230));
		lblTraction.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTraction.setBounds(519, 260, 105, 31);
		p2.add(lblTraction);
		
		JLabel lblType = new JLabel("TYPE");
		lblType.setForeground(new Color(176, 224, 230));
		lblType.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblType.setBounds(537, 315, 76, 31);
		p2.add(lblType);
		
		JLabel lblConsomspecifique = new JLabel("CONSOM_SPECIFIQUE");
		lblConsomspecifique.setForeground(new Color(176, 224, 230));
		lblConsomspecifique.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConsomspecifique.setBounds(520, 396, 300, 31);
		p2.add(lblConsomspecifique);
		
		JLabel lblCarburant = new JLabel("CARBURANT");
		lblCarburant.setForeground(new Color(176, 224, 230));
		lblCarburant.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarburant.setBounds(519, 341, 139, 31);
		p2.add(lblCarburant);
		
		JLabel lblSectionAnalitique = new JLabel("SECTION ANALITIQUE");
		lblSectionAnalitique.setForeground(new Color(176, 224, 230));
		lblSectionAnalitique.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSectionAnalitique.setBounds(519, 448, 300, 31);
		p2.add(lblSectionAnalitique);
		
		JLabel lblObsrvations = new JLabel("OBSERVATIONS");
		lblObsrvations.setForeground(new Color(176, 224, 230));
		lblObsrvations.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblObsrvations.setBounds(519, 498, 300, 31);
		p2.add(lblObsrvations);
		
		textField_1 = new JTextField();
		textField_1.setBounds(817, 509, 316, 31);
		p2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(817, 454, 316, 31);
		p2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(817, 396, 316, 31);
		p2.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GPL", "GNV", "essence", "diesel", "p\u00E9trole"}));
		comboBox.setBounds(817, 330, 316, 31);
		p2.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(216, 547, 261, 31);
		p2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(216, 488, 261, 31);
		p2.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(216, 376, 261, 31);
		p2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(216, 318, 261, 31);
		p2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(216, 260, 261, 31);
		p2.add(textField_9);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_4.setBounds(918, 9, 147, 96);
		p2.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Abarth", "Alfa Romeo", "Alpine", "Artega", "Aston Martin", "Audi", "Bentley", "BMW", "Bmw Alpina", "Cadillac", "Caterham", "Chevrolet", "Chrysler", "Citro\u00EBn", "Cupra", "Dacia", "Daihatsu", "Dodge", "Donkervoort", "DS", "Ferrari", "Fiat", "Ford", "Genesis", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Jaguar", "Jeep", "KIA", "KTM", "Lada", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lotus", "Lynk & Co", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "MG", "Mia Electric", "MINI", "Mitsubishi", "Nissan", "Opel", "Peugeot", "Polestar", "Porsche", "Renault", "Rolls-Royce", "Saab", "Seat", "Skoda", "Smart", "Ssangyong", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo"}));
		comboBox_1.setBounds(216, 434, 261, 31);
		p2.add(comboBox_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(817, 260, 316, 31);
		p2.add(textField_13);
		
		JButton button_13 = new JButton("");
		button_13.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Save_48px.png"));
		button_13.setBounds(679, 587, 89, 39);
		p2.add(button_13);
		pan.add(p3, "3");
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button_3.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button_3.setBounds(1124, 0, 32, 23);
		p3.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_4.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		button_4.setBounds(1158, 0, 32, 23);
		p3.add(button_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(47, 127, 1087, 81);
		p3.add(panel_2);
		
		JLabel label_6 = new JLabel("MATERIEL ROULANT");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label.setForeground(new Color(176, 196, 222));
				cl.show(pan, "2");
			}
		});
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.CYAN);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), Color.CYAN, null, null));
		label_6.setBounds(0, 0, 229, 81);
		panel_2.add(label_6);
		
		lbl = new JLabel("SUIVI ET ENTRETIENT");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(Color.CYAN);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		lbl.setBounds(227, 0, 242, 81);
		panel_2.add(lbl);
		
		JLabel label_9 = new JLabel("ETAT DE ROULAGE");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_17.setForeground(new Color(176, 196, 222));
				cl.show(pan, "4");
			}
		});
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.CYAN);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_9.setBounds(468, 0, 258, 81);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("ADMINISTRATEUR");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_26.setForeground(new Color(176, 196, 222));
				cl.show(pan, "5");
			}
		});
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.CYAN);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_10.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_10.setBounds(725, 0, 229, 81);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("AIDE");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_34.setForeground(new Color(176, 196, 222));
				cl.show(pan, "6");
			}
		});
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.CYAN);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_11.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_11.setBounds(952, 0, 135, 81);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		label_12.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		label_12.setForeground(new Color(135, 206, 250));
		label_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_12.setBounds(119, 11, 795, 81);
		p3.add(label_12);
		
		JLabel label_13 = new JLabel("MAHAJANGA");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(new Color(135, 206, 250));
		label_13.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_13.setBounds(347, 72, 351, 31);
		p3.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_14.setBounds(919, 20, 147, 96);
		p3.add(label_14);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(176, 224, 230));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDate.setBounds(72, 229, 89, 31);
		p3.add(lblDate);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(550, 229, 261, 31);
		p3.add(textField_14);
		
		JLabel lblKilomtriqueEffectus = new JLabel("Kilom\u00E9trique effectu\u00E9s");
		lblKilomtriqueEffectus.setForeground(new Color(176, 224, 230));
		lblKilomtriqueEffectus.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblKilomtriqueEffectus.setBounds(72, 289, 300, 31);
		p3.add(lblKilomtriqueEffectus);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(550, 289, 261, 31);
		p3.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(550, 348, 261, 31);
		p3.add(textField_16);
		
		JLabel lblTypeentretientreparationaccident = new JLabel("Type_Entretient/Reparation/Accident");
		lblTypeentretientreparationaccident.setForeground(new Color(176, 224, 230));
		lblTypeentretientreparationaccident.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTypeentretientreparationaccident.setBounds(72, 348, 468, 31);
		p3.add(lblTypeentretientreparationaccident);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(550, 409, 261, 31);
		p3.add(textField_17);
		
		JLabel lblDemandeur = new JLabel("Demandeur");
		lblDemandeur.setForeground(new Color(176, 224, 230));
		lblDemandeur.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDemandeur.setBounds(72, 409, 160, 31);
		p3.add(lblDemandeur);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(550, 470, 261, 31);
		p3.add(textField_18);
		
		JLabel lblInterventionDuConcessionnaire = new JLabel("Intervention du Concessionnaire");
		lblInterventionDuConcessionnaire.setForeground(new Color(176, 224, 230));
		lblInterventionDuConcessionnaire.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblInterventionDuConcessionnaire.setBounds(72, 470, 468, 31);
		p3.add(lblInterventionDuConcessionnaire);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(550, 530, 261, 31);
		p3.add(textField_19);
		
		JLabel lblRmarque = new JLabel("R\u00E9marque");
		lblRmarque.setForeground(new Color(176, 224, 230));
		lblRmarque.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRmarque.setBounds(72, 530, 166, 31);
		p3.add(lblRmarque);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(862, 289, 261, 31);
		p3.add(textField_20);
		
		JLabel lblChauffeurs = new JLabel("Chauffeur 1 :");
		lblChauffeurs.setForeground(new Color(176, 224, 230));
		lblChauffeurs.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChauffeurs.setBounds(862, 229, 204, 31);
		p3.add(lblChauffeurs);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(862, 408, 261, 31);
		p3.add(textField_22);
		
		JLabel lblChauffeur_1 = new JLabel("Chauffeur 2 :");
		lblChauffeur_1.setForeground(new Color(176, 224, 230));
		lblChauffeur_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChauffeur_1.setBounds(862, 348, 204, 31);
		p3.add(lblChauffeur_1);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(862, 530, 261, 31);
		p3.add(textField_23);
		
		JLabel lblChauffeur = new JLabel("Chauffeur 3 :");
		lblChauffeur.setForeground(new Color(176, 224, 230));
		lblChauffeur.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChauffeur.setBounds(862, 470, 204, 31);
		p3.add(lblChauffeur);
		
		JButton button_14 = new JButton("");
		button_14.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Save_48px.png"));
		button_14.setBounds(746, 589, 89, 45);
		p3.add(button_14);
		pan.add(p4, "4");
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button_5.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button_5.setBounds(1124, 0, 32, 23);
		p4.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_6.setBounds(1158, 0, 32, 23);
		p4.add(button_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(49, 127, 1087, 81);
		p4.add(panel_3);
		
		JLabel label_15 = new JLabel("MATERIEL ROULANT");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label.setForeground(new Color(176, 196, 222));
				cl.show(pan, "2");
			}
		});
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.CYAN);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_15.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), Color.CYAN, null, null));
		label_15.setBounds(0, 0, 229, 81);
		panel_3.add(label_15);
		
		JLabel lblSuiviEtEntretient = new JLabel("SUIVI ET ENTRETIENT");
		lblSuiviEtEntretient.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lbl.setForeground(new Color(176, 196, 222));
				cl.show(pan, "3");
			}
		});
		lblSuiviEtEntretient.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuiviEtEntretient.setForeground(Color.CYAN);
		lblSuiviEtEntretient.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSuiviEtEntretient.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		lblSuiviEtEntretient.setBounds(227, 0, 240, 81);
		panel_3.add(lblSuiviEtEntretient);
		
		label_17 = new JLabel("ETAT DE ROULAGE");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.CYAN);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_17.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_17.setBounds(467, 0, 259, 81);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("ADMINISTRATEUR");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_26.setForeground(new Color(176, 196, 222));
				cl.show(pan, "5");
			}
		});
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.CYAN);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_18.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_18.setBounds(725, 0, 229, 81);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("AIDE");
		label_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_34.setForeground(new Color(176, 196, 222));
				cl.show(pan, "6");
			}
		});
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.CYAN);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_19.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_19.setBounds(952, 0, 135, 81);
		panel_3.add(label_19);
		
		JLabel label_20 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		label_20.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		label_20.setForeground(new Color(135, 206, 250));
		label_20.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_20.setBounds(121, 11, 795, 81);
		p4.add(label_20);
		
		JLabel label_21 = new JLabel("MAHAJANGA");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setForeground(new Color(135, 206, 250));
		label_21.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_21.setBounds(349, 72, 351, 31);
		p4.add(label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_22.setBounds(921, 20, 147, 96);
		p4.add(label_22);
		
		JLabel label_3 = new JLabel("OBSERVATIONS");
		label_3.setForeground(new Color(176, 224, 230));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_3.setBounds(522, 503, 300, 31);
		p4.add(label_3);
		
		JLabel label_51 = new JLabel("SECTION ANALITIQUE");
		label_51.setForeground(new Color(176, 224, 230));
		label_51.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_51.setBounds(522, 399, 300, 31);
		p4.add(label_51);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Abarth", "Alfa Romeo", "Alpine", "Artega", "Aston Martin", "Audi", "Bentley", "BMW", "Bmw Alpina", "Cadillac", "Caterham", "Chevrolet", "Chrysler", "Citro\u00EBn", "Cupra", "Dacia", "Daihatsu", "Dodge", "Donkervoort", "DS", "Ferrari", "Fiat", "Ford", "Genesis", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Jaguar", "Jeep", "KIA", "KTM", "Lada", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lotus", "Lynk & Co", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "MG", "Mia Electric", "MINI", "Mitsubishi", "Nissan", "Opel", "Peugeot", "Polestar", "Porsche", "Renault", "Rolls-Royce", "Saab", "Seat", "Skoda", "Smart", "Ssangyong", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_2.setBounds(219, 401, 261, 31);
		p4.add(comboBox_2);
		
		JLabel label_52 = new JLabel("Marque");
		label_52.setForeground(new Color(176, 224, 230));
		label_52.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_52.setBounds(64, 401, 105, 31);
		p4.add(label_52);
		
		JLabel label_53 = new JLabel("IMMATRIC ");
		label_53.setForeground(new Color(176, 224, 230));
		label_53.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_53.setBounds(64, 300, 152, 31);
		p4.add(label_53);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(219, 300, 261, 31);
		p4.add(textField_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"GPL", "GNV", "essence", "diesel", "p\u00E9trole"}));
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_3.setBounds(820, 302, 316, 31);
		p4.add(comboBox_3);
		
		JLabel label_54 = new JLabel("CARBURANT");
		label_54.setForeground(new Color(176, 224, 230));
		label_54.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_54.setBounds(522, 302, 139, 31);
		p4.add(label_54);
		
		JLabel label_55 = new JLabel("Traction");
		label_55.setForeground(new Color(176, 224, 230));
		label_55.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_55.setBounds(64, 513, 105, 31);
		p4.add(label_55);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(219, 509, 261, 31);
		p4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(820, 399, 316, 31);
		p4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(820, 503, 316, 31);
		p4.add(textField_12);
		pan.add(p5, "5");
		
		label_45 = new JLabel("5");
		label_45.setBounds(23, 141, 46, 14);
		p5.add(label_45);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button_7.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button_7.setBounds(1124, 0, 32, 23);
		p5.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_8.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		button_8.setBounds(1158, 0, 32, 23);
		p5.add(button_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(49, 127, 1087, 81);
		p5.add(panel_4);
		
		JLabel label_23 = new JLabel("MATERIEL ROULANT");
		label_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label.setForeground(new Color(176, 196, 222));
				cl.show(pan, "2");
			}
		});
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(Color.CYAN);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_23.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), Color.CYAN, null, null));
		label_23.setBounds(0, 0, 229, 81);
		panel_4.add(label_23);
		
		JLabel lblSuiviEtEntretient_3 = new JLabel("SUIVI ET ENTRETIENT");
		lblSuiviEtEntretient_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lbl.setForeground(new Color(176, 196, 222));
				cl.show(pan, "3");
			}
		});
		lblSuiviEtEntretient_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuiviEtEntretient_3.setForeground(Color.CYAN);
		lblSuiviEtEntretient_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSuiviEtEntretient_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		lblSuiviEtEntretient_3.setBounds(227, 0, 242, 81);
		panel_4.add(lblSuiviEtEntretient_3);
		
		JLabel label_25 = new JLabel("ETAT DE ROULAGE");
		label_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_17.setForeground(new Color(176, 196, 222));
				cl.show(pan, "4");
			}
		});
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setForeground(Color.CYAN);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_25.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_25.setBounds(468, 0, 258, 81);
		panel_4.add(label_25);
		
		label_26 = new JLabel("ADMINISTRATEUR");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setForeground(Color.CYAN);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_26.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_26.setBounds(725, 0, 229, 81);
		panel_4.add(label_26);
		
		JLabel label_27 = new JLabel("AIDE");
		label_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_34.setForeground(new Color(176, 196, 222));
				cl.show(pan, "6");
			}
		});
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setForeground(Color.CYAN);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_27.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_27.setBounds(952, 0, 135, 81);
		panel_4.add(label_27);
		
		JLabel label_28 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		label_28.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		label_28.setForeground(new Color(135, 206, 250));
		label_28.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_28.setBounds(121, 11, 795, 81);
		p5.add(label_28);
		
		JLabel label_29 = new JLabel("MAHAJANGA");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setForeground(new Color(135, 206, 250));
		label_29.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_29.setBounds(349, 72, 351, 31);
		p5.add(label_29);
		
		JLabel label_46 = new JLabel("");
		label_46.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_46.setBounds(921, 20, 147, 96);
		p5.add(label_46);
		
		JLabel lblNomDuChef = new JLabel("Nom du chef");
		lblNomDuChef.setForeground(new Color(176, 224, 230));
		lblNomDuChef.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNomDuChef.setBounds(93, 269, 152, 31);
		p5.add(lblNomDuChef);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(376, 269, 261, 31);
		p5.add(textField);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(376, 343, 261, 31);
		p5.add(textField_21);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setForeground(new Color(176, 224, 230));
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPrenom.setBounds(93, 343, 152, 31);
		p5.add(lblPrenom);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(376, 414, 261, 31);
		p5.add(textField_24);
		
		JLabel lblCin = new JLabel("CIN");
		lblCin.setForeground(new Color(176, 224, 230));
		lblCin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCin.setBounds(93, 414, 152, 31);
		p5.add(lblCin);
		
		JLabel lblMotDePass_1 = new JLabel("mot de pass");
		lblMotDePass_1.setForeground(new Color(176, 224, 230));
		lblMotDePass_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMotDePass_1.setBounds(93, 490, 152, 31);
		p5.add(lblMotDePass_1);
		
		JLabel lblConfirmMotDe = new JLabel("Confirm mot de pass");
		lblConfirmMotDe.setForeground(new Color(176, 224, 230));
		lblConfirmMotDe.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConfirmMotDe.setBounds(93, 571, 268, 31);
		p5.add(lblConfirmMotDe);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(376, 490, 261, 31);
		p5.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(376, 571, 261, 31);
		p5.add(passwordField_1);
		
		JButton btnPhotos = new JButton("Photos");
		btnPhotos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPhotos.setBounds(690, 269, 122, 124);
		p5.add(btnPhotos);
		
		textField_25 = new JTextField();
		textField_25.setBounds(838, 361, 261, 31);
		p5.add(textField_25);
		textField_25.setColumns(10);
		
		JButton button_15 = new JButton("Ajouter");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_15.setBounds(900, 561, 111, 41);
		p5.add(button_15);
		pan.add(p6, "6");
		
		JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button_9.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button_9.setBounds(1124, 0, 32, 23);
		p6.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_10.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		button_10.setBounds(1158, 0, 32, 23);
		p6.add(button_10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.GRAY);
		panel_5.setBounds(50, 127, 1087, 81);
		p6.add(panel_5);
		
		JLabel label_30 = new JLabel("MATERIEL ROULANT");
		label_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label.setForeground(new Color(176, 196, 222));
				cl.show(pan, "2");
			}
		});
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setForeground(Color.CYAN);
		label_30.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_30.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), Color.CYAN, null, null));
		label_30.setBounds(0, 0, 229, 81);
		panel_5.add(label_30);
		
		JLabel lblSuiviEtEntretient_4 = new JLabel("SUIVI ET ENTRETIENT");
		lblSuiviEtEntretient_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lbl.setForeground(new Color(176, 196, 222));
				cl.show(pan, "3");
			}
		});
		lblSuiviEtEntretient_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuiviEtEntretient_4.setForeground(Color.CYAN);
		lblSuiviEtEntretient_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSuiviEtEntretient_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		lblSuiviEtEntretient_4.setBounds(227, 0, 238, 81);
		panel_5.add(lblSuiviEtEntretient_4);
		
		JLabel label_32 = new JLabel("ETAT DE ROULAGE");
		label_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_17.setForeground(new Color(176, 196, 222));
				cl.show(pan, "4");
			}
		});
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setForeground(Color.CYAN);
		label_32.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_32.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_32.setBounds(463, 0, 263, 81);
		panel_5.add(label_32);
		
		JLabel label_33 = new JLabel("ADMINISTRATEUR");
		label_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				label_26.setForeground(new Color(176, 196, 222));
				cl.show(pan, "5");
			}
		});
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setForeground(Color.CYAN);
		label_33.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_33.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_33.setBounds(725, 0, 229, 81);
		panel_5.add(label_33);
		
		label_34 = new JLabel("AIDE");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setForeground(Color.CYAN);
		label_34.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_34.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, null, null, null));
		label_34.setBounds(952, 0, 135, 81);
		panel_5.add(label_34);
		
		JLabel label_35 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		label_35.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		label_35.setForeground(new Color(135, 206, 250));
		label_35.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_35.setBounds(122, 11, 795, 81);
		p6.add(label_35);
		
		JLabel label_36 = new JLabel("MAHAJANGA");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setForeground(new Color(135, 206, 250));
		label_36.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_36.setBounds(350, 72, 351, 31);
		p6.add(label_36);
		
		JLabel label_47 = new JLabel("");
		label_47.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_47.setBounds(922, 20, 147, 96);
		p6.add(label_47);
		pan.add(p7, "7");
		
		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button_11.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Minimize Window_48px.png"));
		button_11.setBounds(1124, 0, 32, 23);
		p7.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_12.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Cancel_48px.png"));
		button_12.setBounds(1158, 0, 32, 23);
		p7.add(button_12);
		
		JLabel label_42 = new JLabel(" GESTION DU VEHICULES ENTRANT ET SORTANT DU JIRAMA");
		label_42.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\SUV_48px.png"));
		label_42.setForeground(new Color(135, 206, 250));
		label_42.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_42.setBounds(122, 11, 795, 81);
		p7.add(label_42);
		
		JLabel label_44 = new JLabel("MAHAJANGA");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setForeground(new Color(135, 206, 250));
		label_44.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_44.setBounds(350, 72, 351, 31);
		p7.add(label_44);
		
		JLabel label_48 = new JLabel("");
		label_48.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\output-onlinepngtools (2).png"));
		label_48.setBounds(922, 20, 147, 96);
		p7.add(label_48);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("C:\\Users\\ARISTIDE\\Documents\\eclipse\\Gestion\\image\\Youtube_loading_symbol_1_(wobbly).gif"));
		label_1.setBounds(366, 192, 417, 290);
		p7.add(label_1);
		
		cl.show(pan, "7");
		
		frame.setVisible(true);
	}
}
