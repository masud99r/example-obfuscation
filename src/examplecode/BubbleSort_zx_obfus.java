package examplecode;
import java.io.PrintStream;

public class BubbleSort_zx_obfus {

  public static boolean a;
  //original line was without init
  /*
  private static final String b;
  */
  private static final String b="Sorted array";//modified to remove compilation error
  
  void a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    boolean bool = a;
    int j = 0;
    do
    {
      if (j >= i - 1) {
        break;
      }
      int k = 0;
      do
      {
        if (k >= i - j - 1) {
          break;
        }
        if (paramArrayOfInt[k] > paramArrayOfInt[(k + 1)])
        {
          int m = paramArrayOfInt[k];
          paramArrayOfInt[k] = paramArrayOfInt[(k + 1)];
          paramArrayOfInt[(k + 1)] = m;
        }
        k++;
      } while (!bool);
      j++;
    } while (!bool);
  }
  
  void b(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    boolean bool = a;
    int j = 0;
    do
    {
      if (j >= i) {
        break;
      }
      System.out.print(paramArrayOfInt[j] + " ");
      j++;
    } while (!bool);
    System.out.println();
    /*injected noise code: added at the end, if error occur no output changes:
    pattern: inject invalid/uncessary code at the end*/
    /*
    if (a.a != 0) {
      a = !bool;
    }*/
    
  }
  
  public static void main(String[] paramArrayOfString)
  {
    BubbleSort_zx_obfus localBubbleSort = new BubbleSort_zx_obfus();
    int[] arrayOfInt = { 64, 34, 25, 12, 22, 11, 90 };
    localBubbleSort.a(arrayOfInt);
    System.out.println(b);
    boolean bool = a;
    localBubbleSort.b(arrayOfInt);
    /*injected noise code: added at the end, if error occur no output changes:
    pattern: inject invalid/uncessary code at the end*/
    /*
    if (bool)
    {
      int i = a.a;
      i++;
      a.a = i;
    }*/
    
  }
}
