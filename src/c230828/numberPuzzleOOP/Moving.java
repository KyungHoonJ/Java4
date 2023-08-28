package c230828.numberPuzzleOOP;

public class Moving {
	protected Player player;

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	protected boolean movePlayer(int[][] puzzle, int direction) {
		int playerX = player.getX();
		int playerY = player.getY();
		int movingPlayerX = playerX;
		int movingPlayerY = playerY;
		switch(direction) {
			case 2:
				movingPlayerY++;
				break;
			case 4:
				movingPlayerX--;
				break;
			case 6:
				movingPlayerX++;
				break;
			case 8:
				movingPlayerY--;
				break;
			default:
				break;
		}
		if(getIsOut(puzzle, movingPlayerY, movingPlayerX)) return false;
		
		Shuffle.changeArray(puzzle, playerX, playerY, movingPlayerX, movingPlayerY);
		player.setPosition(movingPlayerX, movingPlayerY);
		return true;
	}
	
	protected void movePlayer(int[][] puzzle, String direction) {};
	
	private boolean getIsOut(int[][] arr, int movingPlayerY, int movingPlayerX) {
		if(movingPlayerX < 0 || 
				movingPlayerX > arr[0].length - 1 ||
				movingPlayerY < 0 || 
				movingPlayerY > arr.length - 1
				) return true;
		
		return false;
	}
}






















