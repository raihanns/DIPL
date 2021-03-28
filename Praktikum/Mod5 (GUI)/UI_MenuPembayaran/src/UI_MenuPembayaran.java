import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI_MenuPembayaran {

	private JFrame frame;
	private JTextField txtNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_MenuPembayaran window = new UI_MenuPembayaran();
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
	public UI_MenuPembayaran() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 752, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Menu Pembayaran");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton btnNewButton = new JButton("Bayar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(24)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(275, Short.MAX_VALUE)
							.addComponent(lblNewLabel)))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(84))
				.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("The Avengers");
		lblNewLabel_1.setBounds(222, 10, 184, 37);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 37, 156, 285);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Poster Film");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(35, 10, 94, 29);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2 = new JLabel("Transmart Buah Batu  XXI, Studio 2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(176, 75, 241, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Senin, 06 April 2020, 1815");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(176, 122, 227, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5 Tiket");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(176, 145, 98, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("B4, B5, B6, B7, B8");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(250, 142, 156, 19);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rp.165.000");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(357, 270, 133, 31);
		panel.add(lblNewLabel_6);
		
		txtNo = new JTextField();
		txtNo.setBackground(Color.LIGHT_GRAY);
		txtNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNo.setText("Nomor Order : 120393752353279659");
		txtNo.setBounds(176, 316, 268, 19);
		panel.add(txtNo);
		txtNo.setColumns(10);
		frame.getContentPane().setLayout(groupLayout);
	}
}
