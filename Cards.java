public class Cards {
  private int Value;
  private String Suit;
  
  public Cards (int v, String s){
    Value = v;
    Suit = s;
  }
  public void setValue (int v){
    this.Value = v;
  }
  public int getValue(){
    return Value;
  }
   public void setSuit (String s){
    this.Suit = s;
  }
  public String getSuit (){
    return Suit;
  }
  public String toString(){
    return Value + Suit;
  }
}