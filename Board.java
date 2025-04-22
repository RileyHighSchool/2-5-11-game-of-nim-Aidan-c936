import java.util.Scanner;

public class Board {
    
private static int pilesize;


public static void populate(){
    pilesize = (int)(Math.random()*40 + 10);
}

public static void takePieces(){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many pieces do you want to take?");
    int pieces = sc.nextInt();

    while (pieces > pilesize/2 || pieces < 1){
    System.out.println("Try again, you must take at least one , and no more than half");
     pieces = sc.nextInt();

    }
   pilesize -= pieces;
}

public static int getPileSize(){
    return pilesize;
}
    
}




