import java.io.*;
import java.util.List;
import java.util.ArrayList;
//whats the move
// first though would be to make a arraylisy and store chars in them
// 0 1 2
// 3 4 5
// 6 7 8
// What are some winnig algos: naah to complicated too many options
// why am i thinking greedy or some iterative approacat
// narrow it down: your x and your move is on 0> how do you check if you've won? 0 + 1 + 1   0 + 3 + 3  0 + 4 + 4 
// narrow it down: your x and your move is on 4 > how do you check if you've won? 4 -4 + 4   4 -3 + 3   4 -2 + 2
// narrow it down: your x and your move is on 7 > how do you check if you've won? 7 +1 -1   7 -3 - 6
// we 3 have cases: corner case(1,3,4), side middle case(1,3), middle middle case(1,3,4)
//this is too much but i wnat you to brute force it first
//0,2,6,8
//start with teh plyer class

class Board {
    private ArrayList<Character> board;

    Board() {
        this.board = new ArrayList<>(9);
    }

    public void makeMove(int position, char playerSymbol) {
        this.board.set(position, playerSymbol);
    }
}

class Player {
    private char playerSymbol;

    Player(char playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

}
