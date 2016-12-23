package app11a.Dao;

import app11a.entity.User;

public interface userDao {
	User queryByUserCode(String userCode);
}
