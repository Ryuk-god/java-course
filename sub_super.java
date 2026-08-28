class supe {
  public int add(int i, int j) {
    int r = i + j;
    return r;
  }

}

public class sub_super {
  public static void main(String[] args) {
    int i = 4, j = 5;
    supe s = new supe();
    int re = s.add(i, j);
    System.out.println(re);
  }
}
