import java.util.Arrays;

public class SubstringDivisibility
{
  public SubstringDivisibility (){
  }

  public void printAnswer() {
    long answer = 0;
    long counter = 1234567890L;

    while (counter <= 9876543210L) {
      if (check0to9Pandigital(Long.toString(counter))) {
        if (checkSubStringDiv(Long.toString(counter))) {
          answer += counter;
        }
      }
      if (nextValidThousand(Long.toString(counter))) {
        counter += 1000;
      }
      counter++;
    }
    System.out.printf("The sum of the qualified pandigital numbers is %d\n",
                      answer);
  }

  public void testCheckPan(Long n) {
    System.out.printf("%d is a Pandigital: %b\n", n,
      check0to9Pandigital(Long.toString(n)));
  }

  public void testCheckSubString(Long n) {
    System.out.printf("%d tested valid: %b\n", n,
      checkSubStringDiv(Long.toString(n)));
  }

  public void testCheckAnyPandigital(Long n) {
    System.out.printf("%d is pandigital: %b\n", n,
      checkAnyPandigital(Long.toString(n)));
  }

  public void testNextT(Long n) {
    System.out.printf("%d is getting 1k more: %b\n", n,
      nextValidThousand(Long.toString(n)));
  }

  private boolean nextValidThousand(String checkNum) {
    String subString = checkNum.substring(0, 7);
    if(checkAnyPandigital(subString)) {
      return false;
    }
    return true;
  }

  private boolean checkAnyPandigital(String checkNum) {
    char[] digitArray = checkNum.toCharArray();
      Arrays.sort(digitArray);
      char tempChar = 'a';
      for (char c : digitArray) {
        if (tempChar == c) {
          return false;
        }
        tempChar = c;
      }
    return true;
  }

  private boolean check0to9Pandigital(String checkNum) {
    for (int i = 0; i < 10; i++) {
      if (checkNum.contains(Integer.toString(i)) == false) {
        return false;
      }
    }
    return true;
  }

  private boolean checkSubStringDiv(String checkNum) {
    int[] divArray = {2, 3, 5, 7, 11, 13, 17};
    String subString = new String();

    for (int letterStart = 1; letterStart < 8; letterStart++) {
      subString = checkNum.substring(letterStart, letterStart + 3);
      if (Integer.parseInt(subString) % divArray[letterStart - 1] != 0) {
        return false;
      }
    }
    return true;
  }
}
