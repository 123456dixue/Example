
public class Example03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MpThread myThread=new MpThread();
		Thread thread=new Thread(myThread);
		thread.start();
		while(true){
			System.out.println("main()方法在运行");
	
		}

	}

}

class MpThread implements Runnable{
	public void run (){
		while(true){
			System.out.println("MpThread类的run()方法在运行");
		}
	}
}