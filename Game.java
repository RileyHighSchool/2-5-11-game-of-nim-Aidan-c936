public class Game {
     
private Player player1;
private Player player2;
private Player currentPlayer;


public Game(){
   player1 = new Player();
   player2 = new Player();
}

public void setFirstPlayer(){
 if (Math.random() > 0.5){
    currentPlayer = player1;
 } else {
    currentPlayer = player2;
 }
}
public void play(){
   setFirstPlayer();

 while (Board.getPileSize() > 1){
   System.out.println("It is " + currentPlayer.getName() + " 's turn");
   System.out.println("There are " + Board.getPileSize() + " pieces.");

   Board.takePieces();
   switchPlayer();
 }
 endgame();
}


public void switchPlayer(){
if (currentPlayer == player1){
  currentPlayer = player2;
} else {
  currentPlayer = player1;
 }
}



public void endgame(){
if (player1.getScore() > player2.getScore()){
    System.out.println("Congratulations " + player1.getName());
  } else if (player2.getScore() > player1.getScore()){
    System.out.println("Congratulations " + player2.getName());
  } else {
    System.out.println("Ya'll Tied");
  }
}


}
