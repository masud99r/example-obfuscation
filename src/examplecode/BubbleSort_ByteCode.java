// class version 49.0 (49)
// access flags 0x20
class edu/virginia/cs/deflow/DeFlow/Examples/BubbleSort {

  // compiled from: BubbleSort.java

  // access flags 0x0
  <init>()V
   L0
    LINENUMBER 4 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/BubbleSort; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x0
  bubbleSort([I)V
   L0
    LINENUMBER 8 L0
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L1
    LINENUMBER 9 L1
    ICONST_0
    ISTORE 3
   L2
    GOTO L3
   L4
    LINENUMBER 10 L4
    ICONST_0
    ISTORE 4
   L5
    GOTO L6
   L7
    LINENUMBER 11 L7
    ALOAD 1
    ILOAD 4
    IALOAD
    ALOAD 1
    ILOAD 4
    ICONST_1
    IADD
    IALOAD
    IF_ICMPLE L8
   L9
    LINENUMBER 14 L9
    ALOAD 1
    ILOAD 4
    IALOAD
    ISTORE 5
   L10
    LINENUMBER 15 L10
    ALOAD 1
    ILOAD 4
    ALOAD 1
    ILOAD 4
    ICONST_1
    IADD
    IALOAD
    IASTORE
   L11
    LINENUMBER 16 L11
    ALOAD 1
    ILOAD 4
    ICONST_1
    IADD
    ILOAD 5
    IASTORE
   L8
    LINENUMBER 10 L8
    IINC 4 1
   L6
    ILOAD 4
    ILOAD 2
    ILOAD 3
    ISUB
    ICONST_1
    ISUB
    IF_ICMPLT L7
   L12
    LINENUMBER 9 L12
    IINC 3 1
   L3
    ILOAD 3
    ILOAD 2
    ICONST_1
    ISUB
    IF_ICMPLT L4
   L13
    LINENUMBER 18 L13
    RETURN
   L14
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/BubbleSort; L0 L14 0
    LOCALVARIABLE arr [I L0 L14 1
    LOCALVARIABLE n I L1 L14 2
    LOCALVARIABLE i I L2 L13 3
    LOCALVARIABLE j I L5 L12 4
    LOCALVARIABLE temp I L10 L8 5
    MAXSTACK = 5
    MAXLOCALS = 6

  // access flags 0x0
  printArray([I)V
   L0
    LINENUMBER 23 L0
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L1
    LINENUMBER 24 L1
    ICONST_0
    ISTORE 3
   L2
    GOTO L3
   L4
    LINENUMBER 25 L4
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    ALOAD 1
    ILOAD 3
    IALOAD
    INVOKESTATIC java/lang/String.valueOf (I)Ljava/lang/String;
    INVOKESPECIAL java/lang/StringBuilder.<init> (Ljava/lang/String;)V
    LDC " "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.print (Ljava/lang/String;)V
   L5
    LINENUMBER 24 L5
    IINC 3 1
   L3
    ILOAD 3
    ILOAD 2
    IF_ICMPLT L4
   L6
    LINENUMBER 26 L6
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L7
    LINENUMBER 27 L7
    RETURN
   L8
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/BubbleSort; L0 L8 0
    LOCALVARIABLE arr [I L0 L8 1
    LOCALVARIABLE n I L1 L8 2
    LOCALVARIABLE i I L2 L6 3
    MAXSTACK = 5
    MAXLOCALS = 4

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 32 L0
    NEW edu/virginia/cs/deflow/DeFlow/Examples/BubbleSort
    DUP
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/BubbleSort.<init> ()V
    ASTORE 1
   L1
    LINENUMBER 33 L1
    BIPUSH 7
    NEWARRAY T_INT
    DUP
    ICONST_0
    BIPUSH 64
    IASTORE
    DUP
    ICONST_1
    BIPUSH 34
    IASTORE
    DUP
    ICONST_2
    BIPUSH 25
    IASTORE
    DUP
    ICONST_3
    BIPUSH 12
    IASTORE
    DUP
    ICONST_4
    BIPUSH 22
    IASTORE
    DUP
    ICONST_5
    BIPUSH 11
    IASTORE
    DUP
    BIPUSH 6
    BIPUSH 90
    IASTORE
    ASTORE 2
   L2
    LINENUMBER 34 L2
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL edu/virginia/cs/deflow/DeFlow/Examples/BubbleSort.bubbleSort ([I)V
   L3
    LINENUMBER 35 L3
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Sorted array"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L4
    LINENUMBER 36 L4
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL edu/virginia/cs/deflow/DeFlow/Examples/BubbleSort.printArray ([I)V
   L5
    LINENUMBER 37 L5
    RETURN
   L6
    LOCALVARIABLE args [Ljava/lang/String; L0 L6 0
    LOCALVARIABLE ob Ledu/virginia/cs/deflow/DeFlow/Examples/BubbleSort; L1 L6 1
    LOCALVARIABLE arr [I L2 L6 2
    MAXSTACK = 4
    MAXLOCALS = 3
}
