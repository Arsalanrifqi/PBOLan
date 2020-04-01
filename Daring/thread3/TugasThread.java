public class TugasThread extends Thread {
	int[] a={10,11,12,13};

    public TugasThread(String name)
    {
        super(name);
    }

    public void tampil(String nama)
    {
        synchronized(a){
            for(int i=0;i<6;i++)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
                System.out.println("Thread : "+nama+" Posisi : "+a[i]);
            }
        }
    }

    public void run()
    {
        tampil(getName());
    }

    public static void main(String args[])
    {
        Thread l1 = new Thread(new MethodSinkronisasi("l1"));
        Thread l3 = new Thread(new MethodSinkronisasi("l3"));
        Thread l2 = new Thread(new ThreadInterface("l2"));
        Thread l4 = new Thread(new ThreadInterface("l4"));
        l1.start();
        l3.start();
        l2.start();
        try {
            l3.join(3000);
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        l4.start();
    }


}
