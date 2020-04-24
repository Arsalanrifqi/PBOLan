package swing3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

public abstract class Innterface extends JFrame implements ActionListener,ChangeListener,stopwatch{
	JMenuBar mb;
	JMenu  m;
	JButton b;
	JTextField cwaktu;
	JLabel angka;
	int waktu;
	String isi="Start";
	private Container frame; 
	ActionEvent arg0;
	
	public void awal(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		this.frame.setLayout(new FlowLayout());
		this.frame.setLayout(new GridLayout(7,2));
		this.mb = new JMenuBar();
		this.mb.add(m=new JMenu("exit"));
		this.m.addChangeListener((ChangeListener) this);;
		this.setJMenuBar(mb);
		this.frame.add(cwaktu = new JTextField());
		this.frame.add(b = new JButton("Simpan"));
		JLabel angka = new JLabel(isi);
		this.frame.add(angka);
		this.setVisible(true);
		this.setSize(500,300);
		this.setVisible(true);
		this.b.addActionListener((ActionListener) this);
	}
	
	public void update() {
		if(arg0.getSource() == b){
			waktu = Integer.parseInt(cwaktu.getText());
			while(waktu>0) {
				isi=Integer.toString(waktu);
				JLabel angka2 = new JLabel(isi);
				this.frame.remove(angka);
				this.frame.add(angka2);
				waktu--;
			}
		}
	}
}
