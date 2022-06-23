package pl.coderslab.entity;

import java.sql.*;


public class UserDao {
	
	
	private final String CREATE_USER_QUERY =
			"INSERT INTO user(username, email, password) VALUES (?, ?, ?)";
	
	public User create (User user){
		
		try (Connection connection = DbUtil.getConnection()) {
			
			PreparedStatement createUser = connection.prepareStatement("INSERT INTO user(username, email, password) VALUES (?, ?, ?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			createUser.setString(1, user.getUserName());
			createUser.setString(2, user.getEmail());
			createUser.setString(3, user.getPassword());
			createUser.executeUpdate();
			ResultSet resultSet = createUser.getGeneratedKeys();
			if (resultSet.next()) {
				user.setId(resultSet.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
