package org.xcl.dp.specification;

public class UserByAgeThan implements IUserSpecification {
    
	private int age;
	
	public UserByAgeThan(int age) {
		super();
		this.age = age;
	}
	@Override
	public boolean isSatisfiedBy(User user) {
		return user.getAge()>age;
	}

}
