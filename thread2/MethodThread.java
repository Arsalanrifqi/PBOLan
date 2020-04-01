public class MethodThread
{
public static void main(String args[]){
	//set priority
	Thread vespa = new Thread(new ThreadInterface("vespa"));
	Thread sepeda = new Thread(new ThreadInterface("sepeda"));
	vespa.setPriority(1);
	sepeda.setPriority(10);
	vespa.start();
	sepeda.start();
	//==========================================================
	//isAlive
	Thread mobil = new Thread(new ThreadInterface("mobil"));
	Thread bajai = new Thread(new ThreadInterface("bajai"));
	mobil.start();
	bajai.start();
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	System.out.println("Setelah 7 menit mobil:"+mobil.isAlive());//false brarti thread sudah mati
	//==========================================================
	//penggunaan join untuk mempriotitaskan object join selama permilisecon
	Thread bus = new Thread(new ThreadInterface("bus"));
	Thread truck = new Thread(new ThreadInterface("truck"));
	bus.start();
	try {
		bus.join(3000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	truck.start();
	//=====================================================================
}
}