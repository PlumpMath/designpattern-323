package org.xcl.dp.specification;

import java.util.List;

public interface UserProvider {
	public List<User> findUser(IUserSpecification ius);
}
