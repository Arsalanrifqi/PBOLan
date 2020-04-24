package swing3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Timer extends JFrame implements ActionListener,ChangeListener{
	JMenuBar mb;
	JMenu  m;
	JButton b;
	
	public Timer(){
		JFrame cp = new JFrame();
		cp.setTitle("struk belanja");
		cp.setSize(500, 400);
		
		mb = new JMenuBar();
		mb.add(m=new JMenu("exit"));
		m.addChangeListener((ChangeListener) this);;
		this.setJMenuBar(mb);
		
		cp.add(b = new JButton("Simpan"));
		this.setVisible(true);
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
			
		}
	}

}
