package com.kyungiljava4.jdbctest.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode(exclude = { "id" })
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Board {
	private int id;
	@NonNull
	private String user;
	@NonNull
	private String title;
	@NonNull
	private String content;
}
