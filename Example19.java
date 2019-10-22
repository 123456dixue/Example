
public class Example19 {
	
		public static void main(String[] args) {
	         MeThread mythread1=new MeThread();
	         MeThread mythread2=new MeThread();
	         mythread1.setName("线程1");
	         mythread2.setName("线程2");
	         mythread1.start();
	         mythread2.start();


		}

	}
	class MeThread extends Thread{
		public void run(){
			while(true){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name);
			}
		}
	}

	

