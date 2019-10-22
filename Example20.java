
	class MaThread implements Runnable{
		public void run(){
			for(int i=0;i<50;i++){
				System.out.println("new");
			}
		}
	}
	public class Example20 {

		public static void main(String[] args) {
			MaThread methread=new MaThread();
			Thread thread=new Thread(methread);
			thread.start();
			for(int i =0;i<100;i++){
				System.out.println("main");
			}

		}

	}


