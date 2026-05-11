package h1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements l1.j, l1.i {

    /* renamed from: i, reason: collision with root package name */
    public static final a f33932i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap f33933j = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    private final int f33934a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f33935b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f33936c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f33937d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f33938e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f33939f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f33940g;

    /* renamed from: h, reason: collision with root package name */
    private int f33941h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(String query, int i10) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap treeMap = v.f33933j;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry == null) {
                    Unit unit = Unit.f36324a;
                    v vVar = new v(i10, null);
                    vVar.e(query, i10);
                    return vVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                v sqliteQuery = (v) ceilingEntry.getValue();
                sqliteQuery.e(query, i10);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = v.f33933j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ v(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final v c(String str, int i10) {
        return f33932i.a(str, i10);
    }

    @Override // l1.i
    public void G0(int i10, long j10) {
        this.f33940g[i10] = 2;
        this.f33936c[i10] = j10;
    }

    @Override // l1.i
    public void P0(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f33940g[i10] = 5;
        this.f33939f[i10] = value;
    }

    @Override // l1.j
    public void a(l1.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int d10 = d();
        if (1 > d10) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f33940g[i10];
            if (i11 == 1) {
                statement.s1(i10);
            } else if (i11 == 2) {
                statement.G0(i10, this.f33936c[i10]);
            } else if (i11 == 3) {
                statement.m0(i10, this.f33937d[i10]);
            } else if (i11 == 4) {
                String str = this.f33938e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.b0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f33939f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.P0(i10, bArr);
            }
            if (i10 == d10) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // l1.j
    public String b() {
        String str = this.f33935b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // l1.i
    public void b0(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f33940g[i10] = 4;
        this.f33938e[i10] = value;
    }

    public int d() {
        return this.f33941h;
    }

    public final void e(String query, int i10) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f33935b = query;
        this.f33941h = i10;
    }

    public final void f() {
        TreeMap treeMap = f33933j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f33934a), this);
            f33932i.b();
            Unit unit = Unit.f36324a;
        }
    }

    @Override // l1.i
    public void m0(int i10, double d10) {
        this.f33940g[i10] = 3;
        this.f33937d[i10] = d10;
    }

    @Override // l1.i
    public void s1(int i10) {
        this.f33940g[i10] = 1;
    }

    private v(int i10) {
        this.f33934a = i10;
        int i11 = i10 + 1;
        this.f33940g = new int[i11];
        this.f33936c = new long[i11];
        this.f33937d = new double[i11];
        this.f33938e = new String[i11];
        this.f33939f = new byte[i11][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
