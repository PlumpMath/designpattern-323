package org.xcl.dp.specification;

import java.util.ArrayList;
import java.util.List;

public class UserProviderImpl implements UserProvider{

	private static List<User> users = new ArrayList<User>();
	static{
		users.add(new User(1l, "user001", 12));
		users.add(new User(2l, "user002", 120));
		users.add(new User(3l, "user007", 23));
		users.add(new User(4l, "张三", 50));
		users.add(new User(5l, "李四", 99));
	}
	
	@Override
	public List<User> findUser(IUserSpecification ius) {
		List<User> ret = new ArrayList<User>();
		for(User u:users){
			if(ius.isSatisfiedBy(u)){
				ret.add(u);
			}
		}
		return ret;
	}

}
