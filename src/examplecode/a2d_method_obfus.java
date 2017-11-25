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
