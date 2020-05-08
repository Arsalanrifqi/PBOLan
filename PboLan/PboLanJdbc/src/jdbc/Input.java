package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Input extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	final String[] jenis = {"Laki-laki","Perempuan"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input frame = new Input();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Input() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(new FlowLayout());
		contentPane.setLayout(new GridLayout(7,2));
		setContentPane(contentPane);
		
		JLabel lblNim = new JLabel("NIM");
		contentPane.add(lblNim);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNama = new JLabel("Nama");
		contentPane.add(lblNama);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
		contentPane.add(lblJenisKelamin);
		
		JComboBox comboBox = new JComboBox(jenis);
		contentPane.add(comboBox);
		
		JLabel lblTempatLahir = new JLabel("Tempat Lahir");
		contentPane.add(lblTempatLahir);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
		contentPane.add(lblTanggalLahir);
		
		textField_3 = new JTextField();
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAlamat = new JLabel("Alamat");
		contentPane.add(lblAlamat);
		
		JTextPane textPane = new JTextPane();
		contentPane.add(textPane);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nim=	textField.getText();
				String nama= textField_1.getText();
				String jk= comboBox.getSelectedItem().toString();
				String tmp_lahir= textField_2.getText();
				String tgl_lahir= textField_3.getText();
				String alamat= textPane.getText();
				DBBiodata biodata= new DBBiodata();
				biodata.insertBiodata(nim, nama, jk, tmp_lahir, tgl_lahir, alamat);
				System.out.print("Berhasil Memasukkan data");
			}
		});
		contentPane.add(btnSimpan);
	}

}
