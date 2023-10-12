package c231012.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import c231012.connection.ConnectionMaker;
import c231012.connection.OracleCM;
import c231012.user.UserBean;

public class SingletonDAO {
	private static ConnectionMaker maker = new OracleCM();
	
	private static SingletonDAO INSTANCE;

	public SingletonDAO(ConnectionMaker maker) {
		this.maker = maker;
	}
	
//	public static SingletonDAO getInstance() {
//		return INSTANCE;
//	}

	public static void setMaker(ConnectionMaker maker) {
		SingletonDAO.maker = maker;
	}
	
	public static SingletonDAO getInstance() {
		if(maker != null && INSTANCE == null)INSTANCE = new SingletonDAO(maker);
		return INSTANCE;
	}
	
	public void add(UserBean user) throws Exception {
		Connection conn = maker.makeConnection();
		String query = "insert into users (name, user_id, password) values (?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(query);

		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getUserId());
		pstmt.setString(3, user.getPassword());
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	}

	public UserBean get(String userId) throws Exception {
		Connection conn = maker.makeConnection();
		
		String query = "select * from users where user_id=?";
		PreparedStatement pstmt = conn.prepareStatement(query);

		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		UserBean user = null;
		
		if(rs.next()) {
			user = new UserBean();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setUserId(rs.getString("user_id"));
			user.setPassword(rs.getString("password"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		return user;
	}
}
