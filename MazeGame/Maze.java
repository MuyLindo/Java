package Maze;

public class Maze{

	int size; // size of the maze

	public int[][] maze = new int [size][size];

	for(int i = 0; i < size; i++){
		for(int j = 0; j < size; j++){

			if(i == 0 || i == size - 1 || j == 0 || j == size - 1){
				maze[i][j] = 1; // create a frame
			}
			maze[i][j] = Math.round( Math.random ); // generate a random number 0 or 1
													// 0 is for led, 1 is for wall
		}
	}
}