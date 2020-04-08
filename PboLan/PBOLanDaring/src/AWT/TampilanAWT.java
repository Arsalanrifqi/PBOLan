package AWT;


import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class TampilanAWT extends Frame implements WindowListener{
	String nim;
	String nama;
	String jk;
	String alamat;
	String tmp_lahir;
	String tgl_lahir;
	TextField cnim,cnama,ctmp_lahir,ctgl_lahir;
	Choice cjk1;
	TextArea calamat;
	Button b;
public TampilanAWT(){
	super("Data Diri");
	Panel p = new Panel();
	add(p);
	p.setLayout(new GridLayout(7, 2));
	p.add( new Label("nim"));
	p.add(cnim = new TextField());
	p.add( new Label("nama"));
	p.add(cnama = new TextField());
	p.add( new Label("Jenis Kelamin"));
	cjk1 = new Choice();
	cjk1.add("Laki-laki");
	cjk1.add("Perempuan");
	p.add(cjk1);
	p.add( new Label("Tempat Lahir"));
	p.add(ctmp_lahir = new TextField());
	p.add( new Label("Tanggal Lahir"));
	p.add(ctgl_lahir = new TextField());
	p.add( new Label("Alamat"));
	p.add(calamat = new TextArea());
	p.add( new Label(""));
	p.add(b=new Button("save"));
	//p.add(arg0);
	//p.add(cjk2 = new Checkbox("Perempuan"));
	setSize(250,300);
	setVisible(true);
	addWindowListener(this);
}
public boolean action(Event e, Object what){
	if(what.equals("save")){
		nim = cnim.getText();
		nama = cnama.getText();
		jk = cjk1.getSelectedItem().toString();
		alamat = calamat.getText();
		tmp_lahir = ctmp_lahir.getText();
		tgl_lahir = ctgl_lahir.getText();
		new TampilanAWT(nim, nama, jk, alamat, tmp_lahir, tgl_lahir);
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

public TampilanAWT(String nim,String nama,String jk,String alamat,String tmp_lahir,
		String tgl_lahir){
	super("Identitas Diri");
	Panel p = new Panel();
	add(p);
	p.setLayout(new GridLayout(7, 2));
	p.add( new Label("nim"));
	p.add(new Label(nim));
	p.add( new Label("nama"));
	p.add(new Label(nama));
	p.add( new Label("Jenis Kelamin"));
	p.add(new Label(jk));
	p.add( new Label("Tempat Lahir"));
	p.add(new Label(tmp_lahir));
	p.add( new Label("Tanggal Lahir"));
	p.add(new Label(tgl_lahir));
	p.add( new Label("Alamat"));
	p.add(new Label(alamat));
	setSize(250,300);
	setVisible(true);
	addWindowListener(this);
}
public static void main(String args[]){
	new TampilanAWT();
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
System.exit(1);
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