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

