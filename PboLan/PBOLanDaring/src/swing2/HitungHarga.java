package swing2;

import java.awt.Container;
import java.awt.FlowLayout;
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
	final String[] jenis = {"Laki-laki","Perempuan"};
	JMenuBar mb;
	JMenu  m;
	
	public HitungHarga(){
		super("Radio Combo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		mb = new JMenuBar();
		mb.add(m=new JMenu("exit"));
		m.addChangeListener((ChangeListener) this);;
		this.setJMenuBar(mb);
		cp.add(rb1 = new JRadioButton("Laki-laki"));
		cp.add(rb2 = new JRadioButton("Perempuan"));
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		cp.add(cb =new JComboBox(jenis));
		cp.add(b = new JButton("Simpan"));
		this.setVisible(true);
		b.addActionListener((ActionListener) this);
	}
	
	public boolean action(Event e, Object what){
		if(what.equals("save")){
			nim = cnim.getText();
			nama = cnama.getText();
			jk = cjk1.getSelectedItem().toString();
			alamat = calamat.getText();
			tmp_lahir = ctmp_lahir.getText();
			tgl_lahir = ctgl_lahir.getText();
			new HasilAWT(nim, nama, jk, alamat, tmp_lahir, tgl_lahir);
			System.out.println(nim);
			System.out.println(nama);
			System.out.println(jk);
			System.out.println(alamat);
			System.out.println(tmp_lahir);
			System.out.println(tgl_lahir);
			return true;
		}
	return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
