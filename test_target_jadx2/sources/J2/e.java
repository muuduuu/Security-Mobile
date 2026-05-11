package J2;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f4472c = new e(null, null);

    /* renamed from: d, reason: collision with root package name */
    public static final e f4473d = new e(a.none, null);

    /* renamed from: e, reason: collision with root package name */
    public static final e f4474e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f4475f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f4476g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f4477h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f4478i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f4479j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f4480k;

    /* renamed from: a, reason: collision with root package name */
    private a f4481a;

    /* renamed from: b, reason: collision with root package name */
    private b f4482b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f4474e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f4475f = new e(aVar2, bVar);
        f4476g = new e(a.xMaxYMax, bVar);
        f4477h = new e(a.xMidYMin, bVar);
        f4478i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f4479j = new e(aVar, bVar2);
        f4480k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f4481a = aVar;
        this.f4482b = bVar;
    }

    public a a() {
        return this.f4481a;
    }

    public b b() {
        return this.f4482b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4481a == eVar.f4481a && this.f4482b == eVar.f4482b;
    }

    public String toString() {
        return this.f4481a + " " + this.f4482b;
    }
}
