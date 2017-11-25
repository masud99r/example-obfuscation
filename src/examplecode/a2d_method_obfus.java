public long k(s arg0)
  {
    Object localObject;
    String str;
    if ((str = localObject = arg0.F) == null) {
      str = FragmentTransaction.k("{aEaAx@/jjXfMj");
    }
    this.G.bindString(1, str);
    if ((localObject = arg0.f) == null) {
      localObject = str;
    }
    this.G.bindString(2, (String)localObject);
    long l;
    if (arg0.j == null) {
      return l = -1L;
    }
    this.G.bindString(3, arg0.j);
    this.G.bindLong(4, arg0.k());
    this.G.bindLong(5, arg0.K());
    this.G.bindLong(6, arg0.A());
    this.G.bindString(7, arg0.k());
    this.G.bindString(8, arg0.h());
    this.G.bindLong(9, arg0.L());
    this.G.bindString(10, arg0.E());
    this.G.bindString(11, arg0.I());
    this.G.bindString(12, arg0.A());
    this.G.bindLong(13, arg0.D());
    this.G.bindLong(14, arg0.b());
    this.G.bindLong(15, arg0.c());
    this.G.bindLong(16, arg0.h());
    this.G.bindLong(17, arg0.E());
    this.G.bindLong(18, arg0.I());
    this.G.bindLong(19, arg0.I());
    this.G.bindLong(20, arg0.L());
    this.G.bindLong(21, arg0.A());
    this.G.bindLong(22, arg0.b());
    this.G.bindLong(23, arg0.h());
    this.G.bindLong(24, arg0.j());
    this.G.bindLong(25, arg0.k());
    this.G.bindLong(26, arg0.l());
    this.G.bindLong(27, arg0.J());
    try
    {
      l = this.G.executeInsert();
      return l;
    }
    catch (Exception arg0)
    {
      arg0.printStackTrace();
    }
    return l = 0L;
  }

//java bytecode
public long k(a2dp.Vol.s);
    Code:
       0: aload_1       
       1: getfield      #123                // Field a2dp/Vol/s.F:Ljava/lang/String;
       4: dup           
       5: astore        5
       7: dup           
       8: astore        4
      10: ifnonnull     21
      13: ldc_w         #300                // String {aEaAx@/jjXfMj
      16: invokestatic  #248                // Method android/support/v4/app/FragmentTransaction.k:(Ljava/lang/String;)Ljava/lang/String;
      19: astore        4
      21: aload_0       
      22: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
      25: iconst_1      
      26: aload         4
      28: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
      31: aload_1       
      32: getfield      #130                // Field a2dp/Vol/s.f:Ljava/lang/String;
      35: dup           
      36: astore        5
      38: ifnonnull     45
      41: aload         4
      43: astore        5
      45: aload_0       
      46: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
      49: iconst_2      
      50: aload         5
      52: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
      55: aload_1       
      56: getfield      #48                 // Field a2dp/Vol/s.j:Ljava/lang/String;
      59: ifnonnull     68
      62: ldc2_w        #131                // long -1l
      65: dup2          
      66: lstore_2      
      67: lreturn       
      68: aload_0       
      69: dup           
      70: dup_x1        
      71: dup2          
      72: dup2          
      73: dup2          
      74: dup2          
      75: dup2          
      76: dup2          
      77: dup2          
      78: dup2          
      79: dup2          
      80: dup2          
      81: dup2          
      82: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
      85: iconst_3      
      86: aload_1       
      87: getfield      #48                 // Field a2dp/Vol/s.j:Ljava/lang/String;
      90: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
      93: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
      96: iconst_4      
      97: aload_1       
      98: invokevirtual #133                // Method a2dp/Vol/s.k:()I
     101: i2l           
     102: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     105: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     108: iconst_5      
     109: aload_1       
     110: invokevirtual #139                // Method a2dp/Vol/s.K:()J
     113: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     116: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     119: bipush        6
     121: aload_1       
     122: invokevirtual #140                // Method a2dp/Vol/s.A:()J
     125: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     128: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     131: bipush        7
     133: aload_1       
     134: invokevirtual #141                // Method a2dp/Vol/s.k:()Ljava/lang/String;
     137: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     140: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     143: bipush        8
     145: aload_1       
     146: invokevirtual #142                // Method a2dp/Vol/s.h:()Ljava/lang/String;
     149: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     152: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     155: bipush        9
     157: aload_1       
     158: invokevirtual #143                // Method a2dp/Vol/s.L:()J
     161: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     164: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     167: bipush        10
     169: aload_1       
     170: invokevirtual #144                // Method a2dp/Vol/s.E:()Ljava/lang/String;
     173: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     176: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     179: bipush        11
     181: aload_1       
     182: invokevirtual #145                // Method a2dp/Vol/s.I:()Ljava/lang/String;
     185: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     188: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     191: bipush        12
     193: aload_1       
     194: invokevirtual #146                // Method a2dp/Vol/s.A:()Ljava/lang/String;
     197: invokevirtual #129                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     200: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     203: bipush        13
     205: aload_1       
     206: invokevirtual #147                // Method a2dp/Vol/s.D:()J
     209: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     212: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     215: bipush        14
     217: aload_1       
     218: invokevirtual #148                // Method a2dp/Vol/s.b:()J
     221: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     224: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     227: bipush        15
     229: aload_1       
     230: invokevirtual #149                // Method a2dp/Vol/s.c:()J
     233: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     236: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     239: bipush        16
     241: aload_1       
     242: invokevirtual #150                // Method a2dp/Vol/s.h:()I
     245: i2l           
     246: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     249: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     252: bipush        17
     254: aload_1       
     255: invokevirtual #151                // Method a2dp/Vol/s.E:()J
     258: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     261: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     264: bipush        18
     266: aload_1       
     267: invokevirtual #152                // Method a2dp/Vol/s.I:()J
     270: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     273: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     276: bipush        19
     278: aload_1       
     279: invokevirtual #153                // Method a2dp/Vol/s.I:()I
     282: i2l           
     283: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     286: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     289: bipush        20
     291: aload_1       
     292: invokevirtual #154                // Method a2dp/Vol/s.L:()I
     295: i2l           
     296: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     299: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     302: bipush        21
     304: aload_1       
     305: invokevirtual #155                // Method a2dp/Vol/s.A:()I
     308: i2l           
     309: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     312: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     315: bipush        22
     317: aload_1       
     318: invokevirtual #156                // Method a2dp/Vol/s.b:()I
     321: i2l           
     322: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     325: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     328: bipush        23
     330: aload_1       
     331: invokevirtual #157                // Method a2dp/Vol/s.h:()J
     334: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     337: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     340: bipush        24
     342: aload_1       
     343: invokevirtual #158                // Method a2dp/Vol/s.j:()J
     346: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     349: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     352: bipush        25
     354: aload_1       
     355: invokevirtual #159                // Method a2dp/Vol/s.k:()J
     358: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     361: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     364: bipush        26
     366: aload_1       
     367: invokevirtual #160                // Method a2dp/Vol/s.l:()J
     370: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     373: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     376: bipush        27
     378: aload_1       
     379: invokevirtual #161                // Method a2dp/Vol/s.J:()J
     382: invokevirtual #137                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     385: aload_0       
     386: getfield      #36                 // Field G:Landroid/database/sqlite/SQLiteStatement;
     389: invokevirtual #164                // Method android/database/sqlite/SQLiteStatement.executeInsert:()J
     392: lstore_2      
     393: lload_2       
     394: lreturn       
     395: astore_1      
     396: lconst_0      
     397: dup2          
     398: lstore_2      
     399: aload_1       
     400: invokevirtual #167                // Method java/lang/Exception.printStackTrace:()V
     403: lreturn       
    Exception table:
       from    to  target type
         385   393   395   Class java/lang/Exception

//class file corresponding to sevice$11.class
package a2dp.Vol;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.IBluetoothA2dp;
import android.bluetooth.IBluetoothA2dp.Stub;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Set;

final class L
  implements ServiceConnection
{
  public void onServiceDisconnected(ComponentName arg0)
  {
    service.F = false;
    service.k(service.k());
  }
  
  public void onServiceConnected(ComponentName arg0, IBinder arg1)
  {
    service.F = true;
    service.Ma = IBluetoothA2dp.Stub.k(arg1);
    arg1 = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
    arg0 = null;
    Iterator localIterator = arg1.iterator();
    while (!(arg1 = (BluetoothDevice)localIterator.next()).getAddress().equalsIgnoreCase(service.z)) {}
    arg0 = arg1;
    if (arg0 != null) {}
    try
    {
      service.Ma.connect(arg0);
      return;
    }
    catch (RemoteException arg0)
    {
      arg0.printStackTrace();
    }
  }
}

//bytecode
final class a2dp.Vol.L implements android.content.ServiceConnection {
  a2dp.Vol.L();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public void onServiceDisconnected(android.content.ComponentName);
    Code:
       0: iconst_0
       1: putstatic     #18                 // Field a2dp/Vol/service.F:Z
       4: invokestatic  #77                 // Method a2dp/Vol/service.k:()La2dp/Vol/MyApplication;
       7: invokestatic  #79                 // Method a2dp/Vol/service.k:(Landroid/content/Context;)V
      10: return

  public void onServiceConnected(android.content.ComponentName, android.os.IBinder);
    Code:
       0: iconst_1
       1: putstatic     #18                 // Field a2dp/Vol/service.F:Z
       4: aload_2
       5: invokestatic  #22                 // Method android/bluetooth/IBluetoothA2dp$Stub.k:(Landroid/os/IBinder;)Landroid/bluetooth/IBluetoothA2dp;
       8: putstatic     #24                 // Field a2dp/Vol/service.Ma:Landroid/bluetooth/IBluetoothA2dp;
      11: invokestatic  #30                 // Method android/bluetooth/BluetoothAdapter.getDefaultAdapter:()Landroid/bluetooth/BluetoothAdapter;
      14: invokevirtual #34                 // Method android/bluetooth/BluetoothAdapter.getBondedDevices:()Ljava/util/Set;
      17: astore_2
      18: aconst_null
      19: astore_1
      20: aload_2
      21: invokeinterface #40,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      26: astore_3
      27: aload_3
      28: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          65
      36: aload_3
      37: invokeinterface #50,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      42: checkcast     #52                 // class android/bluetooth/BluetoothDevice
      45: dup
      46: astore_2
      47: invokevirtual #56                 // Method android/bluetooth/BluetoothDevice.getAddress:()Ljava/lang/String;
      50: getstatic     #58                 // Field a2dp/Vol/service.z:Ljava/lang/String;
      53: invokevirtual #64                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      56: ifeq          27
      59: aload_2
      60: astore_1
      61: aload_3
      62: goto          28
      65: aload_1
      66: ifnull        79
      69: getstatic     #24                 // Field a2dp/Vol/service.Ma:Landroid/bluetooth/IBluetoothA2dp;
      72: aload_1
      73: invokeinterface #70,  2           // InterfaceMethod android/bluetooth/IBluetoothA2dp.connect:(Landroid/bluetooth/BluetoothDevice;)Z
      78: pop
      79: return
      80: astore_1
      81: aload_1
      82: invokevirtual #73                 // Method android/os/RemoteException.printStackTrace:()V
      85: return
    Exception table:
       from    to  target type
          69    79    80   Class android/os/RemoteException
}

