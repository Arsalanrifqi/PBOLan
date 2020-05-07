package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tampilan extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DBBiodata biodata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tampilan frame = new tampilan();
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
	public tampilan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.NORTH);
		
		biodata = new DBBiodata();
		Vector columnNames = new Vector();
		columnNames.addElement("nim");
		columnNames.addElement("nama");
		columnNames.addElement("jenis kelamin");
		columnNames.addElement("tempat lahir");
		columnNames.addElement("tanggal lahir");
		columnNames.addElement("alamat");
		table=new JTable();
		DefaultTableModel dtm=new DefaultTableModel(biodata.data(),columnNames);
		table.setModel(dtm);
		scrollPane.setViewportView(table);
	}

}
