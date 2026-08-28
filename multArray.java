public class multArray {
  public static void main(String[] args) {
    int nums[][] = new int[3][];
    // for the random value
    // int random = (int)Math.random()*100;

    for (int n[] : nums) {
      for (int j = 0; j < n.length; j++) {
        n[j] = (int) Math.random() * 100;
      }
      System.out.println();
    }
    for (int n[] : nums) {
      for (int m : n) {
        System.out.println(m + " ");
      }
      System.err.println();
    }
  }

  // System.out.println("random values of math for 2 digits || for one digit multi
  // by 10 :" + (int)Math.random()*100);
}