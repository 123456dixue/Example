package dao;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import entity.*;
public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String, IEntity> scs = new HashMap<String, IEntity>();
	
	private SC sc;
	
	public static SCDao getInstance() {
		if(instance == null) {
			synchronized(SCDao.class) {
				if(instance == null) {
					instance = new SCDao();
					return instance;
				}
			}
		}
		return instance;
	}
	
	@Override
	public void insert(IEntity ientity) {
		// TODO Auto-generated method stub
          scs.put(((SC)ientity).getStudentNo(),(SC)ientity);
          System.out.println("��ϲ������ѡ�γ̱��Ϊ"+((SC)ientity).getCourseNo()+"���ſγ̣��������ѡ�����˵���ѡ����Ҫ���еĲ�����");
	}
	
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
   
	}
	
	public void update1(IEntity ientity) {
		// TODO Auto-generated method stub
		scs.put(((SC)ientity).getStudentNo(),(SC)ientity);
        System.out.println("��ϲ������ѡ�γ̱��Ϊ"+((SC)ientity).getCourseNo()+"���ſγ̣��������ѡ�����˵���ѡ����Ҫ���еĲ�����");
	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return scs;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return scs.get(Id);
	}

}
