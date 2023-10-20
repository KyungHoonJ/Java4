package c231020.test.board;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import c231019.user.UserBean;
import c231019.user.UserDAO;
import c231020.board.BoardBean;
import c231020.board.BoardDAO;
import c231020.board.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/c231020/dataSource.xml", "applicationContext.xml"})
public class BoardTest {
	@Autowired
	BoardDAO boardDAO;
	@Autowired
	BoardService boardService;
	@Autowired
	BoardTestDAO boardTestDAO;
	@Autowired
	UserDAO userDAO;
	
	private BoardBean board1;
	
	@Before
	public void initialize() {
		boardTestDAO.drop();
		boardTestDAO.create();
		BoardBean board = new BoardBean();
		board.setTitle("확인중1");
		board.setUserId(1);
		board.setContent("확인중인 내용1");
		boardDAO.add(board);
		board = new BoardBean();
		board.setTitle("확인중2");
		board.setUserId(1);
		board.setContent("확인중인 내용2");
		boardDAO.add(board);
		board1 = new BoardBean();
		board1.setTitle("확인중3");
		board1.setUserId(1);
		board1.setContent("확인중인 내용3");
		boardDAO.add(board1);
	}
	
	@Test
	public void add() {
		BoardBean board = new BoardBean();
		board.setTitle("확인중");
		board.setUserId(1);
		board.setContent("확인중인 내용");
		boardDAO.add(board);
	}
	
	@Test
	public void get() {
		BoardBean board = boardDAO.get(1);
		assertThat(board.getTitle(), is("확인중1"));
		assertThat(board.getUserId(), is(1));
		assertThat(board.getContent(), is("확인중인 내용1"));		
	}
	
	@Test
	public void getAll() {
		List<BoardBean> list = boardDAO.getAll();
		for(int i = 0; i < list.size();++i) {
			
			assertThat(list.get(i).getTitle(), is("확인중" + (i + 1)));
			assertThat(list.get(i).getUserId(), is(1));
			assertThat(list.get(i).getContent(), is("확인중인 내용"+ (i + 1)));
		};		
	}
	
	@Test
	public void addInService() {
		UserBean user = userDAO.get(2);
		BoardBean board = new BoardBean();
		board.setTitle("서비스 확인");
		board.setContent("서비스 확인중입니다.");
		boardService.add(board, user);
	}
	
	@Test
	public void getInService() {
		UserBean user = userDAO.get(1);
		BoardBean board = boardService.get(board1.getUserId());
		assertThat(board.getTitle(), is(board1.getTitle()));
		assertThat(board.getUserId(), is(board1.getUserId()));
		assertThat(board.getContent(), is(board1.getContent()));
		assertThat(board.getUser().getName(), is(user.getName()));
		assertThat(board.getUser().getPassword(), is(user.getPassword()));
		assertThat(board.getUser().getUserId(), is(user.getUserId()));
	}
}




