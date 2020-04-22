package swing2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ButtonUI;

public class HitungHarga extends JFrame implements ActionListener,ChangeListener{
	ButtonGroup bg;
	JRadioButton rb1,rb2;
	JComboBox cb;
	JTextField cjumlah;
	JButton b;
	int jumlah,harga,hargaawal;
	double diskon,hargatot,hargadisk;
	String tjumlah,radio;
	final String[] jenis = {"PC","Laptop","Monitor"};
	JMenuBar mb;
	JMenu  m;
	boolean c=true;
	
	public HitungHarga(){
		super("Pilih Barang");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.setLayout(new GridLayout(7,2));
		mb = new JMenuBar();
		mb.add(m=new JMenu("exit"));
		m.addChangeListener((ChangeListener) this);;
		this.setJMenuBar(mb);
		cp.add( new JLabel("Pilih Barang : "));
		cp.add(cb =new JComboBox(jenis));
		cp.add( new JLabel("Jenis Pembelian : "));
		cp.add(new JLabel(""));
		cp.add(rb1 = new JRadioButton("Member"));
		cp.add(rb2 = new JRadioButton("Non-Member"));
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		cp.add( new JLabel("Jumlah Pembelian :"));
		cp.add(cjumlah = new JTextField());
		cp.add(new JLabel(""));
		cp.add(b = new JButton("Simpan"));
		this.setVisible(true);
		setSize(500,300);
		setVisible(true);
		b.addActionListener((ActionListener) this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HitungHarga();
	}


	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == m){
			System.exit(0);
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == b){
			JFrame cp = new JFrame();
			cp.setTitle("Data Pembelian");
			jumlah = Integer.parseInt(cjumlah.getText());
			String combo = cb.getSelectedItem().toString();
			if(rb1.isSelected() == true){
				radio = "True";
				diskon= 0.1;
				
			}else{
				radio = "False";
				diskon=0;
			}
				
			if (combo=="PC") {
				harga=2000000;
			}
			else if(combo=="Laptop") {
				harga=5000000;
			}
			else if(combo=="Monitor") {
				harga=900000;
			}
			cp.setLayout(new FlowLayout());
			cp.setLayout(new GridLayout(7,2));
			mb = new JMenuBar();
			mb.add(m=new JMenu("exit"));
			m.addChangeListener((ChangeListener) this);;
			this.setJMenuBar(mb);
			cp.add( new JLabel("Nama Barang : "));
			cp.add( new JLabel(combo));
			cp.add( new JLabel("Member : "));
			cp.add( new JLabel(radio));
			cp.add( new JLabel("Jumlah Barang : "));
			cp.add( new JLabel(cjumlah.getText()));
			cp.add( new JLabel("Harga Total Barang : "));
			hargaawal=jumlah*harga;
			hargadisk=(double) diskon*hargaawal;
			hargatot=(double) hargaawal-hargadisk;
			cp.add( new JLabel(Double.toString(hargatot)));
			cp.setSize(500,300);
			cp.setVisible(true);
		}
	}
	
}
