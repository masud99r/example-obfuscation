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
