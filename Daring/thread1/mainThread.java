class mainThread
{
public void jalan(String name)
{
for(int i=0;i<5;i++)
{
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println("Thread: "+name+" posisi: "+i);
}
}
}
public class ThreadInterface extends mainThread implements Runnable{
String name;
public ThreadInterface(String name)
{
this.name=name;
}
@Override
public void run() {
// TODO Auto-generated method stub
jalan(name);
}
public static void main(String args[])
{
Thread vespa = new Thread(new ThreadInterface("vespa"));
Thread sepeda = new Thread(new ThreadInterface("sepeda"));
vespa.start();
sepeda.start();
}
}