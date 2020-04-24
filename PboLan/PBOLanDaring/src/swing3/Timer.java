package swing3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Timer extends JFrame implements ActionListener,ChangeListener{
	JMenuBar mb;
	JMenu  m;
	JButton b;
	JTextField cwaktu;
	JLabel angka;
	int waktu;
	String isi="Start";
	private Container frame; 
	
	
	
	public Timer(){
		super("Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(7,2));
		mb = new JMenuBar();
		mb.add(m=new JMenu("exit"));
		m.addChangeListener((ChangeListener) this);;
		this.setJMenuBar(mb);
		frame.add(cwaktu = new JTextField());
		frame.add(b = new JButton("Simpan"));
		JLabel angka = new JLabel(isi);
		frame.add(angka);
		this.setVisible(true);
		setSize(500,300);
		setVisible(true);
		b.addActionListener((ActionListener) this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Timer();
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
			JFrame frame = new JFrame();
			frame.setTitle("timer");
			waktu = Integer.parseInt(cwaktu.getText());
			while(waktu>0) {
				isi=Integer.toString(waktu);
				JLabel angka2 = new JLabel(isi);
				frame.remove(angka);
				frame.add(angka2);
				waktu--;
			}
		}
	}

}
