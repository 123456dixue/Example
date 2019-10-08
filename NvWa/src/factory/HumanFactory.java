package factory;

import create.*;

public class HumanFactory extends AbstractHumanFactory{
	public Human createHuman(Class<? extends Human> c){
		Human human=null;
		try {
		human = (Human)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
		System.out.println("�������ɴ���");
		}
		return human;
		}

}