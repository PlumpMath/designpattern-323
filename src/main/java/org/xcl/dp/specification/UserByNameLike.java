package org.xcl.dp.specification;

public class UserByNameLike implements IUserSpecification {

	private String startName;
	private String endName;
	public UserByNameLike(String startName, String endName) {
		this.startName = startName;
		this.endName = endName;
	}
	@Override
	public boolean isSatisfiedBy(User user) {
		String name = user.getName();
		return name.startsWith(startName) || name.endsWith(endName);
	}

}
