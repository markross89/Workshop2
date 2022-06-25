package pl.coderslab.entity;

import javax.xml.transform.Result;
import java.io.PushbackInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


public class Main {
	
	public static void main (String[] args) throws SQLException {
		
		User user4 = new User();
		user4.setUserName("mireeeek");
		user4.setPassword("ssfffsss");
		user4.setEmail("ghfffghg.com");
		
		UserDao userDao = new UserDao();
		UserDao userDao3 = new UserDao();
		
		
		userDao3.delete(19);
		userDao3.create(user4);
		
		
	//	userDao.create(user3);
//
		User user = userDao.read(17);
//		System.out.println(userDao2.getUserName());
		
	//	System.out.println(Arrays.deepToString(userDao2.findAll()));          // czemu metoda find all nie jest statyczna
	
//		User user2  = userDao.read(17);
//		user2.setEmail("nowy.com");
//		user2.setUserName("rajmund");
//		user2.setPassword("hhhhhhh");
//		userDao.update(user2);
		
		//daoUser.create(user);
		
		
//		ResultSet result = createUser.getGeneratedKeys();
//		int newId = result.getInt(1);                             // czemu to nie działa bez pętli albo ifa
//		System.out.println(newId);



//		PreparedStatement createUser = connection.prepareStatement(CREATE_USER_QUERY)
//		createUser.setString(1, user.getUserName());
//		createUser.setString(2, user.getEmail());
//		createUser.setString(3, user.getPassword());
//		createUser.executeQuery();                                 //czemu get update a nie query
//		ResultSet resultSet = createUser.getGeneratedKeys();
//		if (resultSet.next()) {
//			user.setId(resultSet.getInt(1));
//		}


//		String userName = "select username from user where id = ?";
//		String email = "select email from user where id = ?";
//		String password = "select password from user where id = ?";
//		PreparedStatement userNameStatement = connection.prepareStatement(userName);
//		userNameStatement.setInt(1, userId);
//		userNameStatement.executeQuery();
//		ResultSet userNameResult = userNameStatement.executeQuery();
//		String nameOop = "";
//		if (userNameResult.next()) {
//			nameOop = userNameResult.getString("username");
//		}
//		PreparedStatement emailStatement = connection.prepareStatement(email);
//		emailStatement.setInt(1, userId);
//		emailStatement.executeQuery();
//		ResultSet emailResult = emailStatement.executeQuery();
//		String emailOop = "";
//		if (emailResult.next()) {
//			emailOop = emailResult.getString("email");
//		}
//		PreparedStatement passwordStatement = connection.prepareStatement(password);
//		passwordStatement.setInt(1, userId);
//		passwordStatement.executeQuery();
//		ResultSet passwordResult = passwordStatement.executeQuery();
//		String passwordOop = "";
//		if (passwordResult.next()) {
//			passwordOop = passwordResult.getString("password");
//		}



//		User user = new User(nameOop, emailOop, passwordOop);
//		user.setId(userId);															//konstruktor w klasie user?
//		return user;
	
	
	}
}

                              //// Czy jest tu jakiekolwiek dziedziczenie  ?  ///