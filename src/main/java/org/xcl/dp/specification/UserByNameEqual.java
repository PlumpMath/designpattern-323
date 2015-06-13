package org.xcl.dp.specification;

public class UserByNameEqual implements IUserSpecification {
	private String name;
	public UserByNameEqual(String name) {
		super();
		this.name = name;
	}
	@Override
	public boolean isSatisfiedBy(User user) {
		return user.getName().equals(name);
	}
}
