public long insert(btDevice parambtDevice)
  {
    Object localObject2 = parambtDevice.desc1;
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "Unknown Device";
    }
    this.insertStmt.bindString(1, (String)localObject1);
    String str = parambtDevice.desc2;
    localObject2 = str;
    if (str == null) {
      localObject2 = localObject1;
    }
    this.insertStmt.bindString(2, (String)localObject2);
    long l;
    if (parambtDevice.mac == null) {
      l = -1L;
    }
    for (;;)
    {
      return l;
      this.insertStmt.bindString(3, parambtDevice.mac);
      this.insertStmt.bindLong(4, parambtDevice.getDefVol());
      this.insertStmt.bindLong(5, parambtDevice.islSetV());
      this.insertStmt.bindLong(6, parambtDevice.islGetLoc());
      this.insertStmt.bindString(7, parambtDevice.getPname());
      this.insertStmt.bindString(8, parambtDevice.getBdevice());
      this.insertStmt.bindLong(9, parambtDevice.islWifi());
      this.insertStmt.bindString(10, parambtDevice.getAppaction());
      this.insertStmt.bindString(11, parambtDevice.getAppdata());
      this.insertStmt.bindString(12, parambtDevice.getApptype());
      this.insertStmt.bindLong(13, parambtDevice.lApprestart());
      this.insertStmt.bindLong(14, parambtDevice.islEnableTTS());
      this.insertStmt.bindLong(15, parambtDevice.islSetpv());
      this.insertStmt.bindLong(16, parambtDevice.getPhonev());
      this.insertStmt.bindLong(17, parambtDevice.lAppkill());
      this.insertStmt.bindLong(18, parambtDevice.lenablegps());
      this.insertStmt.bindLong(19, parambtDevice.getIcon());
      this.insertStmt.bindLong(20, parambtDevice.getSmsdelay());
      this.insertStmt.bindLong(21, parambtDevice.getSmsstream());
      this.insertStmt.bindLong(22, parambtDevice.getVoldelay());
      this.insertStmt.bindLong(23, parambtDevice.lVolramp());
      this.insertStmt.bindLong(24, parambtDevice.lautovol());
      this.insertStmt.bindLong(25, parambtDevice.lsilent());
      this.insertStmt.bindLong(26, parambtDevice.lsleep());
      this.insertStmt.bindLong(27, parambtDevice.lcarmode());
      try
      {
        l = this.insertStmt.executeInsert();
      }
      catch (Exception parambtDevice)
      {
        l = 0L;
        parambtDevice.printStackTrace();
      }
    }
  }


//Bytecode

public long insert(a2dp.Vol.btDevice);
    Code:
       0: aload_1       
       1: getfield      #211                // Field a2dp/Vol/btDevice.desc1:Ljava/lang/String;
       4: astore        5
       6: aload         5
       8: astore        4
      10: aload         5
      12: ifnonnull     19
      15: ldc           #213                // String Unknown Device
      17: astore        4
      19: aload_0       
      20: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
      23: iconst_1      
      24: aload         4
      26: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
      29: aload_1       
      30: getfield      #222                // Field a2dp/Vol/btDevice.desc2:Ljava/lang/String;
      33: astore        6
      35: aload         6
      37: astore        5
      39: aload         6
      41: ifnonnull     48
      44: aload         4
      46: astore        5
      48: aload_0       
      49: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
      52: iconst_2      
      53: aload         5
      55: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
      58: aload_1       
      59: getfield      #68                 // Field a2dp/Vol/btDevice.mac:Ljava/lang/String;
      62: ifnonnull     71
      65: ldc2_w        #223                // long -1l
      68: lstore_2      
      69: lload_2       
      70: lreturn       
      71: aload_0       
      72: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
      75: iconst_3      
      76: aload_1       
      77: getfield      #68                 // Field a2dp/Vol/btDevice.mac:Ljava/lang/String;
      80: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
      83: aload_0       
      84: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
      87: iconst_4      
      88: aload_1       
      89: invokevirtual #227                // Method a2dp/Vol/btDevice.getDefVol:()I
      92: i2l           
      93: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
      96: aload_0       
      97: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     100: iconst_5      
     101: aload_1       
     102: invokevirtual #235                // Method a2dp/Vol/btDevice.islSetV:()J
     105: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     108: aload_0       
     109: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     112: bipush        6
     114: aload_1       
     115: invokevirtual #238                // Method a2dp/Vol/btDevice.islGetLoc:()J
     118: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     121: aload_0       
     122: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     125: bipush        7
     127: aload_1       
     128: invokevirtual #241                // Method a2dp/Vol/btDevice.getPname:()Ljava/lang/String;
     131: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     134: aload_0       
     135: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     138: bipush        8
     140: aload_1       
     141: invokevirtual #244                // Method a2dp/Vol/btDevice.getBdevice:()Ljava/lang/String;
     144: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     147: aload_0       
     148: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     151: bipush        9
     153: aload_1       
     154: invokevirtual #247                // Method a2dp/Vol/btDevice.islWifi:()J
     157: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     160: aload_0       
     161: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     164: bipush        10
     166: aload_1       
     167: invokevirtual #250                // Method a2dp/Vol/btDevice.getAppaction:()Ljava/lang/String;
     170: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     173: aload_0       
     174: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     177: bipush        11
     179: aload_1       
     180: invokevirtual #253                // Method a2dp/Vol/btDevice.getAppdata:()Ljava/lang/String;
     183: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     186: aload_0       
     187: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     190: bipush        12
     192: aload_1       
     193: invokevirtual #256                // Method a2dp/Vol/btDevice.getApptype:()Ljava/lang/String;
     196: invokevirtual #219                // Method android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
     199: aload_0       
     200: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     203: bipush        13
     205: aload_1       
     206: invokevirtual #259                // Method a2dp/Vol/btDevice.lApprestart:()J
     209: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     212: aload_0       
     213: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     216: bipush        14
     218: aload_1       
     219: invokevirtual #262                // Method a2dp/Vol/btDevice.islEnableTTS:()J
     222: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     225: aload_0       
     226: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     229: bipush        15
     231: aload_1       
     232: invokevirtual #265                // Method a2dp/Vol/btDevice.islSetpv:()J
     235: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     238: aload_0       
     239: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     242: bipush        16
     244: aload_1       
     245: invokevirtual #268                // Method a2dp/Vol/btDevice.getPhonev:()I
     248: i2l           
     249: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     252: aload_0       
     253: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     256: bipush        17
     258: aload_1       
     259: invokevirtual #271                // Method a2dp/Vol/btDevice.lAppkill:()J
     262: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     265: aload_0       
     266: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     269: bipush        18
     271: aload_1       
     272: invokevirtual #274                // Method a2dp/Vol/btDevice.lenablegps:()J
     275: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     278: aload_0       
     279: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     282: bipush        19
     284: aload_1       
     285: invokevirtual #277                // Method a2dp/Vol/btDevice.getIcon:()I
     288: i2l           
     289: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     292: aload_0       
     293: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     296: bipush        20
     298: aload_1       
     299: invokevirtual #280                // Method a2dp/Vol/btDevice.getSmsdelay:()I
     302: i2l           
     303: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     306: aload_0       
     307: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     310: bipush        21
     312: aload_1       
     313: invokevirtual #283                // Method a2dp/Vol/btDevice.getSmsstream:()I
     316: i2l           
     317: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     320: aload_0       
     321: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     324: bipush        22
     326: aload_1       
     327: invokevirtual #286                // Method a2dp/Vol/btDevice.getVoldelay:()I
     330: i2l           
     331: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     334: aload_0       
     335: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     338: bipush        23
     340: aload_1       
     341: invokevirtual #289                // Method a2dp/Vol/btDevice.lVolramp:()J
     344: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     347: aload_0       
     348: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     351: bipush        24
     353: aload_1       
     354: invokevirtual #292                // Method a2dp/Vol/btDevice.lautovol:()J
     357: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     360: aload_0       
     361: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     364: bipush        25
     366: aload_1       
     367: invokevirtual #295                // Method a2dp/Vol/btDevice.lsilent:()J
     370: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     373: aload_0       
     374: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     377: bipush        26
     379: aload_1       
     380: invokevirtual #298                // Method a2dp/Vol/btDevice.lsleep:()J
     383: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     386: aload_0       
     387: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     390: bipush        27
     392: aload_1       
     393: invokevirtual #301                // Method a2dp/Vol/btDevice.lcarmode:()J
     396: invokevirtual #231                // Method android/database/sqlite/SQLiteStatement.bindLong:(IJ)V
     399: aload_0       
     400: getfield      #49                 // Field insertStmt:Landroid/database/sqlite/SQLiteStatement;
     403: invokevirtual #304                // Method android/database/sqlite/SQLiteStatement.executeInsert:()J
     406: lstore_2      
     407: goto          69
     410: astore_1      
     411: lconst_0      
     412: lstore_2      
     413: aload_1       
     414: invokevirtual #307                // Method java/lang/Exception.printStackTrace:()V
     417: goto          69
    Exception table:
       from    to  target type
         399   407   410   Class java/lang/Exception
