public class TestInstrumented
{
    public static void main(String[] args) {
        System.err.println("CALL printOne");
        printOne();
        System.err.println("RETURN printOne");

        System.err.println("CALL printOne");
        printOne();
        System.err.println("RETURN printOne");

        System.err.println("CALL printTwo");
        printTwo();
        System.err.println("RETURN printTwo");
    }
    
    public static void printOne() {
        System.err.println("CALL println");
        System.out.println("Hello World");
        System.err.println("RETURN println");
    }
    
    public static void printTwo() {
        System.err.println("CALL printOne");
        printOne();
        System.err.println("RETURN printOne");

        System.err.println("CALL printOne");
        printOne();
        System.err.println("RETURN printOne");
    }
}

//ASMifier output: ASM code
import java.util.*;
import org.objectweb.asm.*;
public class TestInstrumentedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_7, ACC_PUBLIC + ACC_SUPER, "TestInstrumented", null, "java/lang/Object", null);

{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
mv.visitInsn(RETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("CALL printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitMethodInsn(INVOKESTATIC, "TestInstrumented", "printOne", "()V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("RETURN printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("CALL printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitMethodInsn(INVOKESTATIC, "TestInstrumented", "printOne", "()V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("RETURN printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("CALL printTwo");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitMethodInsn(INVOKESTATIC, "TestInstrumented", "printTwo", "()V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("RETURN printTwo");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "printOne", "()V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("CALL println");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
mv.visitLdcInsn("Hello World");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("RETURN println");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitInsn(RETURN);
mv.visitMaxs(2, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "printTwo", "()V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("CALL printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitMethodInsn(INVOKESTATIC, "TestInstrumented", "printOne", "()V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("RETURN printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("CALL printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitMethodInsn(INVOKESTATIC, "TestInstrumented", "printOne", "()V", false);
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
mv.visitLdcInsn("RETURN printOne");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
mv.visitInsn(RETURN);
mv.visitMaxs(2, 0);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}

//Butecode using ASM:

//Bytecode using commnad: javap -c TestInstrumented.class
Compiled from "TestInstrumented.java"
public class TestInstrumented {
  public TestInstrumented();
    Code:
       0: aload_0       
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return        

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
       3: ldc           #3                  // String CALL printOne
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: invokestatic  #5                  // Method printOne:()V
      11: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      14: ldc           #6                  // String RETURN printOne
      16: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      19: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      22: ldc           #3                  // String CALL printOne
      24: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      27: invokestatic  #5                  // Method printOne:()V
      30: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      33: ldc           #6                  // String RETURN printOne
      35: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      38: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      41: ldc           #7                  // String CALL printTwo
      43: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      46: invokestatic  #8                  // Method printTwo:()V
      49: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      52: ldc           #9                  // String RETURN printTwo
      54: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      57: return        

  public static void printOne();
    Code:
       0: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
       3: ldc           #10                 // String CALL println
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #12                 // String Hello World
      13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      19: ldc           #13                 // String RETURN println
      21: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      24: return        

  public static void printTwo();
    Code:
       0: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
       3: ldc           #3                  // String CALL printOne
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: invokestatic  #5                  // Method printOne:()V
      11: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      14: ldc           #6                  // String RETURN printOne
      16: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      19: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      22: ldc           #3                  // String CALL printOne
      24: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      27: invokestatic  #5                  // Method printOne:()V
      30: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
      33: ldc           #6                  // String RETURN printOne
      35: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      38: return        
}
