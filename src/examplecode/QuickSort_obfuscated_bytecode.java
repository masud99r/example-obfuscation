// class version 49.0 (49)
// access flags 0x21
public class edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b {

  // compiled from: b.java

  // access flags 0x2
  private [I a

  // access flags 0x2
  private I b

  // access flags 0x9
  public static I c

  // access flags 0x1A
  private final static Ljava/lang/String; d = "Quick SOr edited"

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 11 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/b; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a([I)V
   L0
    LINENUMBER 20 L0
    ALOAD 1
    IFNULL L1
    ALOAD 1
    ARRAYLENGTH
    IFNE L2
   L1
    LINENUMBER 21 L1
    RETURN
   L2
    LINENUMBER 23 L2
    ALOAD 0
    ALOAD 1
    PUTFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
   L3
    LINENUMBER 24 L3
    ALOAD 0
    ALOAD 1
    ARRAYLENGTH
    PUTFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.b : I
   L4
    LINENUMBER 25 L4
    ALOAD 0
    ICONST_0
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.b : I
    ICONST_1
    ISUB
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a (II)V
   L5
    LINENUMBER 26 L5
    RETURN
   L6
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/b; L0 L6 0
    LOCALVARIABLE values [I L0 L6 1
    MAXSTACK = 4
    MAXLOCALS = 2

  // access flags 0x2
  private a(II)V
   L0
    LINENUMBER 29 L0
    ILOAD 1
    ISTORE 3
   L1
    ILOAD 2
    ISTORE 4
   L2
    LINENUMBER 31 L2
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
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
    GETSTATIC edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.c : I
    ISTORE 6
   L4
    LINENUMBER 33 L4
    ICONST_0
    ISTORE 7
   L5
    LINENUMBER 34 L5
    ILOAD 3
    ILOAD 5
    IF_ICMPLE L6
   L7
    LINENUMBER 35 L7
    GOTO L8
   L6
    LINENUMBER 37 L6
    ILOAD 6
    IFEQ L9
    GOTO L10
   L9
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
    ILOAD 3
    IALOAD
    ILOAD 7
    IF_ICMPLT L11
    GOTO L10
   L11
    LINENUMBER 38 L11
    IINC 3 1
    ILOAD 6
    IFEQ L12
    GOTO L13
   L12
    ILOAD 6
    IFEQ L6
   L10
    LINENUMBER 42 L10
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
    ILOAD 5
    IALOAD
    ILOAD 7
    IF_ICMPGT L14
    GOTO L13
   L14
    LINENUMBER 43 L14
    IINC 5 -1
    ILOAD 6
    IFEQ L15
    GOTO L16
   L15
    ILOAD 6
    IFEQ L10
   L16
    LINENUMBER 51 L16
    ILOAD 3
    ILOAD 5
   L17
    LINENUMBER 33 L17
    IF_ICMPGT L4
   L8
    LINENUMBER 52 L8
    ALOAD 0
    ILOAD 3
    ILOAD 5
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.b (II)V
   L18
    LINENUMBER 53 L18
    IINC 3 1
   L19
    LINENUMBER 54 L19
    IINC 5 -1
    ILOAD 6
    IFEQ L4
   L13
    LINENUMBER 58 L13
    ILOAD 1
    ILOAD 5
    IF_ICMPGE L20
   L21
    LINENUMBER 59 L21
    ALOAD 0
    ILOAD 1
    ILOAD 5
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a (II)V
   L20
    LINENUMBER 60 L20
    ILOAD 3
    ILOAD 2
    IF_ICMPGE L22
   L23
    LINENUMBER 61 L23
    ALOAD 0
    ILOAD 3
    ILOAD 2
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a (II)V
   L22
    LINENUMBER 62 L22
    RETURN
   L24
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/b; L0 L24 0
    LOCALVARIABLE low I L0 L24 1
    LOCALVARIABLE high I L0 L24 2
    LOCALVARIABLE i I L1 L24 3
    LOCALVARIABLE j I L2 L24 4
    LOCALVARIABLE j1 I L3 L24 5
    LOCALVARIABLE a I L4 L24 6
    LOCALVARIABLE pivot I L5 L16 7
    MAXSTACK = 4
    MAXLOCALS = 8

  // access flags 0x2
  private b(II)V
   L0
    LINENUMBER 65 L0
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
    ILOAD 1
    IALOAD
    ISTORE 3
   L1
    LINENUMBER 66 L1
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
    ILOAD 1
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
    ILOAD 2
    IALOAD
    IASTORE
   L2
    LINENUMBER 67 L2
    ALOAD 0
    GETFIELD edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a : [I
    ILOAD 2
    ILOAD 3
    IASTORE
   L3
    LINENUMBER 68 L3
    RETURN
   L4
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/b; L0 L4 0
    LOCALVARIABLE i I L0 L4 1
    LOCALVARIABLE j I L0 L4 2
    LOCALVARIABLE temp I L1 L4 3
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x0
  b([I)V
   L0
    LINENUMBER 71 L0
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L1
    LINENUMBER 72 L1
    ICONST_0
    ISTORE 3
   L2
    GOTO L3
   L4
    LINENUMBER 73 L4
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
    LINENUMBER 72 L5
    IINC 3 1
   L3
    ILOAD 3
    ILOAD 2
    IF_ICMPLT L4
   L6
    LINENUMBER 74 L6
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L7
    LINENUMBER 75 L7
    RETURN
   L8
    LOCALVARIABLE this Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/b; L0 L8 0
    LOCALVARIABLE arr [I L0 L8 1
    LOCALVARIABLE n I L1 L8 2
    LOCALVARIABLE i I L2 L6 3
    MAXSTACK = 5
    MAXLOCALS = 4

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 79 L0
    NEW edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b
    DUP
    INVOKESPECIAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.<init> ()V
    ASTORE 1
   L1
    LINENUMBER 80 L1
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
    LINENUMBER 81 L2
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.a ([I)V
   L3
    LINENUMBER 82 L3
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Quick SOr edited"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L4
    LINENUMBER 83 L4
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL edu/virginia/cs/deflow/DeFlow/Examples/Obfus/b.b ([I)V
   L5
    LINENUMBER 84 L5
    RETURN
   L6
    LOCALVARIABLE args [Ljava/lang/String; L0 L6 0
    LOCALVARIABLE ob Ledu/virginia/cs/deflow/DeFlow/Examples/Obfus/b; L1 L6 1
    LOCALVARIABLE arr [I L2 L6 2
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0xA
  private static a(Ljava/lang/String;)[C
   L0
    LINENUMBER 88 L0
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.toCharArray ()[C
    ASTORE 1
   L1
    LINENUMBER 89 L1
    ALOAD 1
    ARRAYLENGTH
    ICONST_2
    IF_ICMPGE L2
   L3
    LINENUMBER 91 L3
    ICONST_0
    ISTORE 2
   L4
    LINENUMBER 92 L4
    ALOAD 1
    ASTORE 3
   L5
    LINENUMBER 93 L5
    ALOAD 3
    ILOAD 2
    ALOAD 3
    ILOAD 2
    CALOAD
    BIPUSH 25
    IXOR
    I2C
    CASTORE
   L2
    LINENUMBER 95 L2
    ALOAD 1
    ARETURN
   L6
    LOCALVARIABLE paramString Ljava/lang/String; L0 L6 0
    LOCALVARIABLE tmp4_1 [C L1 L6 1
    LOCALVARIABLE tmp12_11 I L4 L2 2
    LOCALVARIABLE tmp12_4 [C L5 L2 3
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0xA
  private static a([C)Ljava/lang/String;
   L0
    LINENUMBER 100 L0
    ICONST_0
    ISTORE 1
   L1
    LINENUMBER 101 L1
    GOTO L2
   L3
    LINENUMBER 103 L3
    ILOAD 1
    BIPUSH 7
    IREM
    TABLESWITCH
      0: L4
      1: L5
      2: L6
      3: L7
      4: L8
      5: L2
      default: L2
   L4
    LINENUMBER 106 L4
    GOTO L2
   L5
    LINENUMBER 108 L5
    GOTO L2
   L6
    LINENUMBER 110 L6
    GOTO L2
   L7
    LINENUMBER 112 L7
    GOTO L2
   L8
    LINENUMBER 114 L8
    GOTO L2
   L2
    LINENUMBER 101 L2
    BIPUSH 94
    ILOAD 1
    IF_ICMPGT L3
   L9
    LINENUMBER 120 L9
    NEW java/lang/String
    DUP
    INVOKESPECIAL java/lang/String.<init> ()V
    INVOKEVIRTUAL java/lang/String.intern ()Ljava/lang/String;
    ARETURN
   L10
    LOCALVARIABLE paramArrayOfChar [C L0 L10 0
    LOCALVARIABLE i I L1 L10 1
    MAXSTACK = 2
    MAXLOCALS = 2
}
