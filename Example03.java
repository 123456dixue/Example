
public class Example03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MpThread myThread=new MpThread();
		Thread thread=new Thread(myThread);
		thread.start();
		while(true){
			System.out.println("main()����������");
	
		}

	}

}

class MpThread implements Runnable{
	public void run (){
		while(true){
			System.out.println("MpThread���run()����������");
		}
	}
}