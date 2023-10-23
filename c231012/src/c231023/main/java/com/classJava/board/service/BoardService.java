package c231023.main.java.com.classJava.board.service;

import java.util.List;
import c231023.main.java.com.classJava.board.dao.BoardDAO;
import c231023.main.java.com.classJava.board.domain.Board;
import c231023.main.java.com.classJava.user.dao.UserDAO;
import c231023.main.java.com.classJava.user.domain.User;

public class BoardService {
	private UserDAO userDAO;
	private BoardDAO boardDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	public void add(Board board) {
		boardDAO.add(board);
	}

	public Board get(int id) {
		Board board = boardDAO.get(id);
		User user = userDAO.get(board.getUserId());
		board.setUser(user);

		return board;
	}

	public List<Board> getAll() {
		List<Board> list = boardDAO.getAll();
		for (int i = 0; i < list.size(); ++i) {
			int userId = list.get(i).getUserId();
			User user = userDAO.get(userId);
			list.get(i).setUser(user);
		}
		return list;
	}

//	public int getCount() {}

	public void update(Board board, User user) throws Exception {
		// 어떠한 유저(user)가 자신의 글(board)를 수정한다.
		if (board.getUserId() == user.getId()) {
			boardDAO.update(board);
		} else {
			throw new Exception("wrong user");
		}
	}
}
