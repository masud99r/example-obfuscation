// class version 49.0 (49)
// access flags 0x21
public class edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus {

  // compiled from: BubbleSort_zx_obfus.java

  // access flags 0x9
  public static Z a

  // access flags 0x1A
  private final static Ljava/lang/String; b = "Sorted array"

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 4 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x0
  a([I)V
   L0
    LINENUMBER 15 L0
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L1
    LINENUMBER 16 L1
    GETSTATIC edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus.a : Z
    ISTORE 3
   L2
    LINENUMBER 17 L2
    ICONST_0
    ISTORE 4
   L3
    LINENUMBER 20 L3
    ILOAD 4
    ILOAD 2
    ICONST_1
    ISUB
    IF_ICMPLT L4
   L5
    LINENUMBER 21 L5
    GOTO L6
   L4
    LINENUMBER 23 L4
    ICONST_0
    ISTORE 5
   L7
    LINENUMBER 26 L7
    ILOAD 5
    ILOAD 2
    ILOAD 4
    ISUB
    ICONST_1
    ISUB
    IF_ICMPLT L8
   L9
    LINENUMBER 27 L9
    GOTO L10
   L8
    LINENUMBER 29 L8
    ALOAD 1
    ILOAD 5
    IALOAD
    ALOAD 1
    ILOAD 5
    ICONST_1
    IADD
    IALOAD
    IF_ICMPLE L11
   L12
    LINENUMBER 31 L12
    ALOAD 1
    ILOAD 5
    IALOAD
    ISTORE 6
   L13
    LINENUMBER 32 L13
    ALOAD 1
    ILOAD 5
    ALOAD 1
    ILOAD 5
    ICONST_1
    IADD
    IALOAD
    IASTORE
   L14
    LINENUMBER 33 L14
    ALOAD 1
    ILOAD 5
    ICONST_1
    IADD
    ILOAD 6
    IASTORE
   L11
    LINENUMBER 35 L11
    IINC 5 1
   L15
    LINENUMBER 36 L15
    ILOAD 3
    IFEQ L7
   L10
    LINENUMBER 37 L10
    IINC 4 1
   L16
    LINENUMBER 38 L16
    ILOAD 3
    IFEQ L3
   L6
    LINENUMBER 39 L6
    RETURN
   L17
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus; L0 L17 0
    LOCALVARIABLE paramArrayOfInt [I L0 L17 1
    LOCALVARIABLE i I L1 L17 2
    LOCALVARIABLE bool Z L2 L17 3
    LOCALVARIABLE j I L3 L17 4
    LOCALVARIABLE k I L7 L16 5
    LOCALVARIABLE m I L13 L11 6
    MAXSTACK = 5
    MAXLOCALS = 7

  // access flags 0x0
  b([I)V
   L0
    LINENUMBER 43 L0
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L1
    LINENUMBER 44 L1
    GETSTATIC edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus.a : Z
    ISTORE 3
   L2
    LINENUMBER 45 L2
    ICONST_0
    ISTORE 4
   L3
    LINENUMBER 48 L3
    ILOAD 4
    ILOAD 2
    IF_ICMPLT L4
   L5
    LINENUMBER 49 L5
    GOTO L6
   L4
    LINENUMBER 51 L4
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    ALOAD 1
    ILOAD 4
    IALOAD
    INVOKESTATIC java/lang/String.valueOf (I)Ljava/lang/String;
    INVOKESPECIAL java/lang/StringBuilder.<init> (Ljava/lang/String;)V
    LDC " "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.print (Ljava/lang/String;)V
   L7
    LINENUMBER 52 L7
    IINC 4 1
   L8
    LINENUMBER 53 L8
    ILOAD 3
    IFEQ L3
   L6
    LINENUMBER 54 L6
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L9
    LINENUMBER 62 L9
    RETURN
   L10
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus; L0 L10 0
    LOCALVARIABLE paramArrayOfInt [I L0 L10 1
    LOCALVARIABLE i I L1 L10 2
    LOCALVARIABLE bool Z L2 L10 3
    LOCALVARIABLE j I L3 L10 4
    MAXSTACK = 5
    MAXLOCALS = 5

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 66 L0
    NEW edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus
    DUP
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus.<init> ()V
    ASTORE 1
   L1
    LINENUMBER 67 L1
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
    LINENUMBER 68 L2
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus.a ([I)V
   L3
    LINENUMBER 69 L3
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Sorted array"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L4
    LINENUMBER 70 L4
    GETSTATIC edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus.a : Z
    ISTORE 3
   L5
    LINENUMBER 71 L5
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus.b ([I)V
   L6
    LINENUMBER 82 L6
    RETURN
   L7
    LOCALVARIABLE paramArrayOfString [Ljava/lang/String; L0 L7 0
    LOCALVARIABLE localBubbleSort Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/BubbleSort_zx_obfus; L1 L7 1
    LOCALVARIABLE arrayOfInt [I L2 L7 2
    LOCALVARIABLE bool Z L5 L7 3
    MAXSTACK = 4
    MAXLOCALS = 4
}
