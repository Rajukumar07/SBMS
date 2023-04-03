package in.ashokit.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.model.User;

public class UserDao {

	private final JdbcTemplate jdbcTemplate;

	public UserDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<User> getAllUsers() {
		return jdbcTemplate.query("SELECT * FROM customers", (rs, rowNum) -> new User(rs.getLong("id"),
				rs.getString("name"), rs.getString("email"), rs.getString("phone")));
	}

	public void save(User user) {
		jdbcTemplate.update("INSERT INTO customers (name, email, phone) VALUES (?, ?, ?)", user.getName(),
				user.getEmail(), user.getPhone());
	}

	

	public User findById(Long id) {

		return null;
	}

}
