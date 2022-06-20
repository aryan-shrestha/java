class NestedIfElse {
  public static void main (String[] args){
    int per=60;
    String g = "female";
    if (g=="male") {
      if(per >= 80) {
        System.out.println("You're selected");
      } else {
        System.out.println("sorry! you're not selected");
      }
    } else {
      System.out.println("Not Eligible");
    }
  }
}