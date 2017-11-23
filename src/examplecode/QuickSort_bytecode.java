// class version 49.0 (49)
// access flags 0x21
public class edu/virginia/cs/deflow/DeFlow/Examples/QuickSort {

  // compiled from: QuickSort.java

  // access flags 0x2
  private [I numbers

  // access flags 0x2
  private I number

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 3 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/QuickSort; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public sort([I)V
   L0
    LINENUMBER 9 L0
    ALOAD 1
    IFNULL L1
    ALOAD 1
    ARRAYLENGTH
    IFNE L2
   L1
    LINENUMBER 10 L1
    RETURN
   L2
    LINENUMBER 12 L2
    ALOAD 0
    ALOAD 1
    PUTFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
   L3
    LINENUMBER 13 L3
    ALOAD 0
    ALOAD 1
    ARRAYLENGTH
    PUTFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.number : I
   L4
    LINENUMBER 14 L4
    ALOAD 0
    ICONST_0
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.number : I
    ICONST_1
    ISUB
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.quicksort (II)V
   L5
    LINENUMBER 15 L5
    RETURN
   L6
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/QuickSort; L0 L6 0
    LOCALVARIABLE values [I L0 L6 1
    MAXSTACK = 4
    MAXLOCALS = 2

  // access flags 0x2
  private quicksort(II)V
   L0
    LINENUMBER 18 L0
    ILOAD 1
    ISTORE 3
   L1
    ILOAD 2
    ISTORE 4
   L2
    LINENUMBER 20 L2
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 1
    ILOAD 2
    ILOAD 1
    ISUB
    ICONST_2
    IDIV
    IADD
    IALOAD
    ISTORE 5
   L3
    LINENUMBER 23 L3
    GOTO L4
   L5
    LINENUMBER 27 L5
    IINC 3 1
   L6
    LINENUMBER 26 L6
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 3
    IALOAD
    ILOAD 5
    IF_ICMPLT L5
   L7
    LINENUMBER 31 L7
    GOTO L8
   L9
    LINENUMBER 32 L9
    IINC 4 -1
   L8
    LINENUMBER 31 L8
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 4
    IALOAD
    ILOAD 5
    IF_ICMPGT L9
   L10
    LINENUMBER 40 L10
    ILOAD 3
    ILOAD 4
    IF_ICMPGT L4
   L11
    LINENUMBER 41 L11
    ALOAD 0
    ILOAD 3
    ILOAD 4
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.exchange (II)V
   L12
    LINENUMBER 42 L12
    IINC 3 1
   L13
    LINENUMBER 43 L13
    IINC 4 -1
   L4
    LINENUMBER 23 L4
    ILOAD 3
    ILOAD 4
    IF_ICMPLE L6
   L14
    LINENUMBER 47 L14
    ILOAD 1
    ILOAD 4
    IF_ICMPGE L15
   L16
    LINENUMBER 48 L16
    ALOAD 0
    ILOAD 1
    ILOAD 4
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.quicksort (II)V
   L15
    LINENUMBER 49 L15
    ILOAD 3
    ILOAD 2
    IF_ICMPGE L17
   L18
    LINENUMBER 50 L18
    ALOAD 0
    ILOAD 3
    ILOAD 2
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.quicksort (II)V
   L17
    LINENUMBER 51 L17
    RETURN
   L19
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/QuickSort; L0 L19 0
    LOCALVARIABLE low I L0 L19 1
    LOCALVARIABLE high I L0 L19 2
    LOCALVARIABLE i I L1 L19 3
    LOCALVARIABLE j I L2 L19 4
    LOCALVARIABLE pivot I L3 L19 5
    MAXSTACK = 4
    MAXLOCALS = 6

  // access flags 0x2
  private exchange(II)V
   L0
    LINENUMBER 54 L0
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 1
    IALOAD
    ISTORE 3
   L1
    LINENUMBER 55 L1
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 1
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 2
    IALOAD
    IASTORE
   L2
    LINENUMBER 56 L2
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/QuickSort.numbers : [I
    ILOAD 2
    ILOAD 3
    IASTORE
   L3
    LINENUMBER 57 L3
    RETURN
   L4
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/QuickSort; L0 L4 0
    LOCALVARIABLE i I L0 L4 1
    LOCALVARIABLE j I L0 L4 2
    LOCALVARIABLE temp I L1 L4 3
    MAXSTACK = 4
    MAXLOCALS = 4
}
