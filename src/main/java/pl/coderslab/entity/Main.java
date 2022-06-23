package pl.coderslab.entity;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {
	
	public static void main (String[] args) throws SQLException {
		
		User user = new User("julian", "asfadf.com", "oooooo");
		UserDao daoUser = new UserDao();
		
		daoUser.create(user);
		//UserDao.create(user);
		
//		ResultSet result = createUser.getGeneratedKeys();
//		intnewId = result.getInt(1);                             // czemu to nie działa bez pętli
//		System.out.println(newId);
		
//		ResultSet resultSet = createUser.getGeneratedKeys();
//		if (resultSet.next()) {
//			user.setId(resultSet.getInt(1  ));   ///  czemu jak wpisze id to wywala brak takiej kolumny
//		}
		
	}
}