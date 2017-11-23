package edu.virginia.cs.deflow.DeFlow.Examples.Obfus;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */ {
/*    */   private int[] a;
/*    */   private int b;
/*    */   public static int c;
/*    */   private static final String d = "Quick SOr edited";
/*    */   
/*    */   public void a(int[] values)
/*    */   {
/* 19 */     if ((values == null) || (values.length == 0)) {
/* 20 */       return;
/*    */     }
/* 22 */     this.a = values;
/* 23 */     this.b = values.length;
/* 24 */     a(0, this.b - 1);
/*    */   }
/*    */   
/*    */   private void a(int low, int high) {
/* 28 */     int i = low;  int j = high;
/*    */     
/* 30 */     int j1 = this.a[(low + (high - low) / 2)];int a = c;
/*    */     label81:
/*    */     do { do { int pivot = 0;
/* 33 */         if (i > j1)
/*    */           break;
/*    */         do {
/* 36 */           if (a != 0) break ; if (this.a[i] >= pivot) break;
/* 37 */           i++; if (a != 0) break label81; } while (a == 0);
/*    */         
/*    */         do
/*    */         {
/* 41 */           if (this.a[j1] <= pivot) break label81;
/* 42 */           j1--; if (a != 0) break; } while (a == 0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       }
/* 50 */       while (i > j1);
/* 51 */       b(i, j1);
/* 52 */       i++;
/* 53 */       j1--; } while (a == 0);
/*    */     
/*    */ 
/*    */ 
/* 57 */     if (low < j1) label109:
/* 58 */       a(low, j1);
/* 59 */     if (i < high)
/* 60 */       a(i, high);
/*    */   }
/*    */   
/*    */   private void b(int i, int j) {
/* 64 */     int temp = this.a[i];
/* 65 */     this.a[i] = this.a[j];
/* 66 */     this.a[j] = temp;
/*    */   }
/*    */   
/*    */   void b(int[] arr) {
/* 70 */     int n = arr.length;
/* 71 */     for (int i = 0; i < n; i++)
/* 72 */       System.out.print(arr[i] + " ");
/* 73 */     System.out.println();
/*    */   }
/*    */   
/*    */   public static void main(String[] args)
/*    */   {
/* 78 */     b ob = new b();
/* 79 */     int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
/* 80 */     ob.a(arr);
/* 81 */     System.out.println(d);
/* 82 */     ob.b(arr);
/*    */   }
/*    */   
/*    */   private static char[] a(String paramString)
/*    */   {
/*    */     char[] tmp4_1 = paramString.toCharArray();
/*    */     if (tmp4_1.length < 2)
/*    */     {
/*    */       int tmp12_11 = 0;
/*    */       char[] tmp12_4 = tmp4_1;
/*    */       tmp12_4[tmp12_11] = ((char)(tmp12_4[tmp12_11] ^ 0x19));
/*    */     }
/*    */     return tmp4_1;//adding random code
/*    */   }
/*    */   
/*    */   private static String a(char[] paramArrayOfChar)
/*    */   {
/*    */     int i = 0;
/*    */     while (94 > i)
/*    */     {
/*    */       switch (i % 7)
/*    */       {
/*    */       case 0: 
/*    */         break;
/*    */       case 1: 
/*    */         break;
/*    */       case 2: 
/*    */         break;
/*    */       case 3: 
/*    */         break;
/*    */       case 4: 
/*    */         break;
/*    */       case 5: 
/*    */         break;
/*    */       }
/*    */       //70[50] = ((char)(0xA ^ 0x19)); //add random code at the end
/*    */     }
/*    */     return new String().intern();
/*    */   }
/*    */ }


/* Location:              C:\Users\Masud\Desktop\work_dev\ExampleCode-quick-only-obfus.jar!\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
