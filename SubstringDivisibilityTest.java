public class SubstringDivisibilityTest
{
  public static void main(String[] args) {
    SubstringDivisibility ssd = new SubstringDivisibility();
    ssd.testCheckPan(1406357289L);
    ssd.testCheckPan(1406357789L);
    ssd.testCheckSubString(1406357289L);
    ssd.testCheckSubString(1460357289L);
    ssd.testCheckSubString(8960357214L);
    ssd.testCheckAnyPandigital(452344L);
    ssd.testCheckAnyPandigital(45326L);
    ssd.testNextT(9876544210L);
    ssd.testNextT(9876454210L);
    ssd.testNextT(9876542222L);
    ssd.printAnswer();
  }
}
