package c231016.user;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class usedSpringUserDAO {
	private JdbcTemplate jdbcTemplate;

	public usedSpringUserDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void add(UserInterface user) throws SQLException {
		jdbcTemplate.update("insert into users (name, user_id, password) values (?, ?, ?)", user.getName(),
				user.getUserId(), user.getPassword());

	}
}
