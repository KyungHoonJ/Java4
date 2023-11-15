package com.kyungiljava4.jdbctest.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kyungiljava4.jdbctest.board.domain.Board;

@Repository
public class BoardDAO {
	private JdbcTemplate jdbcTemplate;

	private RowMapper<Board> mapper = new RowMapper<Board>() {
		@Override
		public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return new Board(rs.getInt("id"), rs.getString("user"), rs.getString("title"), rs.getString("content"));
		}
	};

	public void add(Board board) {
		jdbcTemplate.update("insert into boards (\"title\", \"user\", \"content\") values (?, ?, ?)",
				board.getTitle(), board.getUser(), board.getContent());
	}

	public Board get(int id) {
		return jdbcTemplate.queryForObject("select * from boards where \"id\"=?", mapper, id);
	}

	public List<Board> getAll() {
		return jdbcTemplate.query("select * from boards order by \"id\"", mapper);

	}

}
