package org.xcl.dp.specification;

import java.util.List;

public class Client {

	public static void main(String[] args) {
      
		UserProvider ud = new UserProviderImpl();
		
		List<User> uname = ud.findUser(new UserByNameEqual("user001"));
		List<User> uage = ud.findUser(new UserByAgeThan(80));
		List<User> ulike = ud.findUser(new UserByNameLike("u", "7"));
		System.out.println(uname);
		System.out.println(uage);
		System.out.println(ulike);
	}

}
