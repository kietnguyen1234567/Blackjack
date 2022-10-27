import java.util.ArrayList;
public class Decks {
  ArrayList<Cards>deck = new ArrayList<Cards>();
  ArrayList<Cards>rdeck = new ArrayList<Cards>();
  
  public void makeDeck(){
    for (int i = 1; i<14; i++){
      Cards c = new Cards (i, "H");
      deck.add (c);
    }
    for (int i = 1; i<14; i++){
      Cards c = new Cards (i, "C");
      deck.add (c);
    }
    for (int i = 1; i<14; i++){
      Cards c = new Cards (i, "S");
      deck.add (c);
    }
    for (int i = 1; i<14; i++){
      Cards c = new Cards (i, "D");
      deck.add (c);
    }
  }
  
  public Decks(){
  makeDeck();
  }
  
  public void printDeck(){
    for (int i = 0; i < deck.size(); i++){
      System.out.println(deck.get(i));
    }
  }
  
  public void Shuffle(){
    ArrayList<Cards>shuffleD = new ArrayList<Cards>();
    shuffleD.clear();
    //for (int i = 0; i < deck.size(); i++) {
    while (deck.size()!= 0){
      int j = (int) (Math.random()*deck.size());
      //System.out.println( j ) ;
      Cards c = deck.get(j);
      //System.out.println( c );
      shuffleD.add(c);
      deck.remove(j);
    }
    deck = shuffleD;
  }
  
  public void drawCard(){
    ArrayList<Cards>playerHand = new ArrayList<Cards>();
    playerHand.add(deck.get(0));
  }

}



//if I get a 7, then {arguments}
// else if I get a 5, then {arguments}
//else, then {arguments}
 