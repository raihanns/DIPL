import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;

public class UI1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI1 window = new UI1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 548, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Generate = new JButton(" Generate Kode");
		Generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Generate.setBounds(369, 139, 117, 36);
		frame.getContentPane().add(Generate);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField.setText("66779");
		textField.setBounds(357, 186, 142, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Invoice");
		lblNewLabel.setFont(new Font("ChronicaPro-Bold", Font.BOLD, 29));
		lblNewLabel.setBounds(211, 11, 110, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 56, 311, 183);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 112, 161);
		panel.add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Poster Film");
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("The Avengers");
		lblNewLabel_1.setFont(new Font("ChronicaPro-BoldIt", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(132, 22, 123, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Transmart Buah Batu XXI, Studio 2");
		lblNewLabel_2.setFont(new Font("ChronicaPro-Regular", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(132, 54, 169, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Senin 15 Maret 2021, 18:15");
		lblNewLabel_2_1.setFont(new Font("ChronicaPro-Regular", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(132, 79, 169, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("5 Tiket");
		lblNewLabel_2_1_1.setFont(new Font("ChronicaPro-Regular", Font.PLAIN, 10));
		lblNewLabel_2_1_1.setBounds(132, 104, 50, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("B4, B5, B6, B7, B8");
		lblNewLabel_2_1_1_1.setFont(new Font("ChronicaPro-Regular", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1.setBounds(192, 104, 109, 14);
		panel.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("ToggleButton.light"));
		panel_2.setBounds(132, 151, 169, 21);
		panel.add(panel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nomor Order : 866414xxurq14");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Rp 165.000");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(231, 129, 70, 14);
		panel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setBounds(408, 205, 46, 14);
		frame.getContentPane().add(label);
	}
}
