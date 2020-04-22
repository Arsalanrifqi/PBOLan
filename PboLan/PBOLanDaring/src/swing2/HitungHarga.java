package swing2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
	JButton b;
	final String[] jenis = {"PC","Laptop","Monitor"};
	JMenuBar mb;
	JMenu  m;
	
	public HitungHarga(){
		super("Pilih Barang");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout(2));
		cp.setLayout(new GridLayout(7,2));
		mb = new JMenuBar();
		mb.add(m=new JMenu("exit"));
		m.addChangeListener((ChangeListener) this);;
		this.setJMenuBar(mb);
		cp.add(rb1 = new JRadioButton("Member"));
		cp.add(rb2 = new JRadioButton("Non-Member"));
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		cp.add(cb =new JComboBox(jenis));
		cp.add(b = new JButton("Simpan"));
		this.setVisible(true);
		setSize(250,300);
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
			String radio=null;
			if(rb1.isSelected() == true){
				radio = rb1.getText();
			}else{
				radio = rb2.getText();
			}
			System.out.println("Radio Button Memilih: "+radio);
			String combo = cb.getSelectedItem().toString();
			System.out.println("ComboBox Memilih: "+combo);
		}
	}

}
