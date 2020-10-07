class RocketShip{
  public static int size = 3;
  public static void main(String[] args){
    arrow();
    line();
    blockOfArrowsUp();
    blockOfArrowsDown();
    line();
    arrow();
  }
  public static void line(){
    System.out.print("+");
    for (int i = 0; i < size*2; i++){
      System.out.print("=*");
    }
    System.out.println("+");
  }
  public static void arrow(){
    for (int i = 1; i < (2*size); i++){
      spaces(2*size - i);
      slashes(i);
      System.out.print("**");
      backslashes(i);
      System.out.println();
    }
  }
  public static void blockOfArrowsUp(){
    for (int i = size-1; i >= 0; i--){
      System.out.print("|");
      for (int k = 0; k < i; k++){
        System.out.print(".");
      }
      for (int k = 0; k < size - i; k++){
        System.out.print("/\\");
      }
      for (int k = 0; k < i; k++){
        System.out.print("..");
      }
      for (int k = 0; k < size - i; k++){
        System.out.print("/\\");
      }
      for (int k = 0; k < i; k++){
        System.out.print(".");
      }
      System.out.println("|");
    }
  }
  public static void blockOfArrowsDown(){
    for (int i = 0; i <= size-1; i++){
      System.out.print("|");
      for (int k = 0; k < i; k++){
        System.out.print(".");
      }
      for (int k = 0; k < size - i; k++){
        System.out.print("\\/");
      }
      for (int k = 0; k < i; k++){
        System.out.print("..");
      }
      for (int k = 0; k < size - i; k++){
        System.out.print("\\/");
      }
      for (int k = 0; k < i; k++){
        System.out.print(".");
      }
      System.out.println("|");
    }
  }
  public static void slashes(int num){
    for (int slashes = 0; slashes < num; slashes++){
        System.out.print("/");
      }
  }
  public static void backslashes(int num){
    for (int slashes = 0; slashes < num; slashes++){
        System.out.print("\\");
      }
  }
  public static void spaces(int num){
    for (int slashes = 0; slashes < num; slashes++){
        System.out.print(" ");
      }
  }
}
