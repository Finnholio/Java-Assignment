class Staircase{
  public static int stairs = 6;
  public static void main(String[] args) {
    for (int i = (stairs)*5; i >= 5; i -= 5){
      spaces(i);
      System.out.print("  o  ******");
      spaces(stairs*5-i);
      System.out.println("*");
      spaces(i);
      System.out.print(" /|\\ *");
      spaces(stairs*5-i);
      System.out.println("     *");
      spaces(i);
      System.out.print(" /|\\ *");
      spaces(stairs*5-i);
      System.out.println("     *");
    }
    spaces(5);
    for (int i = 0; i < (stairs)*5+7; i++){
      System.out.print("*");
    }
  }
  public static void spaces(int spacesNum){
    for (int i = 0; i < spacesNum; i++){
      System.out.print(" ");
    }
  }
}