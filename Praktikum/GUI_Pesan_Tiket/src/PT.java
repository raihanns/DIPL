import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.border.EtchedBorder;

public class PT {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PT window = new PT();
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
	public PT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel.setBounds(10, 24, 27, 31);
		frame.getContentPane().add(panel);
		
		JLabel A1 = new JLabel("A1");
		panel.add(A1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_1.setBounds(59, 24, 27, 31);
		frame.getContentPane().add(panel_1);
		
		JLabel A1_1 = new JLabel("A2");
		panel_1.add(A1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_2.setBounds(110, 24, 27, 31);
		frame.getContentPane().add(panel_2);
		
		JLabel A1_2 = new JLabel("A3");
		panel_2.add(A1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_3.setBounds(10, 72, 27, 31);
		frame.getContentPane().add(panel_3);
		
		JLabel A1_3 = new JLabel("B1");
		panel_3.add(A1_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_4.setBounds(59, 72, 27, 31);
		frame.getContentPane().add(panel_4);
		
		JLabel A1_4 = new JLabel("B2");
		panel_4.add(A1_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_5.setBounds(110, 72, 27, 31);
		frame.getContentPane().add(panel_5);
		
		JLabel A1_5 = new JLabel("B3");
		panel_5.add(A1_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_6.setBounds(10, 125, 27, 31);
		frame.getContentPane().add(panel_6);
		
		JLabel A1_6 = new JLabel("C1");
		panel_6.add(A1_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_7.setBounds(59, 125, 27, 31);
		frame.getContentPane().add(panel_7);
		
		JLabel A1_7 = new JLabel("C2");
		panel_7.add(A1_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.WHITE, null, null));
		panel_8.setBounds(110, 125, 27, 31);
		frame.getContentPane().add(panel_8);
		
		JLabel A1_8 = new JLabel("C3");
		panel_8.add(A1_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 226, 127, 24);
		frame.getContentPane().add(panel_9);
		
		JLabel lblNewLabel = new JLabel("Layar Bioskop");
		lblNewLabel.setForeground(UIManager.getColor("CheckBox.foreground"));
		panel_9.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pesan Tiket");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(295, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Konfirmasi Pemesanan");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(217, 5, 196, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Harga: Rp 50.000");
		lblNewLabel_2.setBounds(217, 114, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, UIManager.getColor("Button.focus"), null));
		panel_10.setBounds(0, 0, 196, 261);
		frame.getContentPane().add(panel_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Biaya adm: Rp 1.500 ");
		lblNewLabel_2_1.setBounds(217, 139, 127, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Bioskop: Transmart Buah Batu");
		lblNewLabel_2_2.setBounds(216, 90, 152, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tiket: 1 tiket");
		lblNewLabel_2_3.setBounds(216, 66, 89, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Kursi: A3");
		lblNewLabel_2_4.setBounds(216, 47, 89, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
	}
}
