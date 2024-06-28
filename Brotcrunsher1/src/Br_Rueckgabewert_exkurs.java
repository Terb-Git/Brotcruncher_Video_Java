
public class Br_Rueckgabewert_exkurs {
	  public static void main(String[] args) {
          checkValue(27);
          checkValue(7);
          checkValue(37);
      }

      public static void checkValue(int x) {
          if (x != 37) {
              return;
              // Ab hier sind keine weitern Anweisungen zulässig
          } else {
              System.out.println(x + " ist die richtige Zahl!");
          }
      }
}
