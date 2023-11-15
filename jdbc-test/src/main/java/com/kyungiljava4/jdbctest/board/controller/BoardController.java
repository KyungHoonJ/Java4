package com.kyungiljava4.jdbctest.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kyungiljava4.jdbctest.board.domain.Board;
import com.kyungiljava4.jdbctest.board.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;

	@GetMapping("/board")
	public String listPage() {
		return "boards/index";
	}

	@GetMapping("/board/add")
	public String addPage() {
		return "boards/add";
	}

	@ResponseBody
	@PostMapping("/board")
	public String list() {
		List<Board> list = boardService.getAll();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < list.size(); ++i) {
			sb.append("{\"id\":" + list.get(i).getId() + ",");
			sb.append("\"user\":\"" + list.get(i).getUser() + "\",");
			sb.append("\"title\":\"" + list.get(i).getTitle() + "\",");
			sb.append("\"content\":\"" + list.get(i).getContent() + "\"}");
			if(i < list.size() - 1) sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	@PostMapping("/board/add")
	public String add(@RequestParam Map<String, String> data) {
		boardService.add(new Board(data.get("user"), data.get("title"), data.get("content")));

		return "redirect:/board";
	}
}
