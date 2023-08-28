package c230828.numberPuzzleOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		Player player = new Player();
		
		puzzle.setPlayer(player);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇짜리 퍼즐 맞출래? n * n");
		int count = scanner.nextInt();
		
		puzzle.setPuzzle(count, count);
		puzzle.print();
		
		while(true) {
			if(puzzle.getIsEnd()) break;
			System.out.println("p를 옮겨서 1 ~ " + (count * count - 1) + " 순서로 맞춰라.");
			System.out.println("2 : 상 / 8 : 하 / 4 : 좌 / 6 : 우 / 0 : 종료 / 5 : 리셋");
			int direction = scanner.nextInt();
			if(direction == 0) break;
			if(direction == 5) puzzle.shuffle();
			else puzzle.movePlayer(direction);
			puzzle.print();
		}
		System.out.println("끝!");
	}
	
	
	
	
	
	
	
	
	
}
