package J4;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4761a;

    /* renamed from: b, reason: collision with root package name */
    private final WritableMap f4762b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4763c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4764d;

    /* renamed from: e, reason: collision with root package name */
    private final e f4765e;

    public a(String str, WritableMap writableMap, long j10, boolean z10) {
        this(str, writableMap, j10, z10, f.f4781b);
    }

    WritableMap a() {
        return this.f4762b;
    }

    e b() {
        return this.f4765e;
    }

    String c() {
        return this.f4761a;
    }

    long d() {
        return this.f4763c;
    }

    boolean e() {
        return this.f4764d;
    }

    public a(String str, WritableMap writableMap, long j10, boolean z10, e eVar) {
        this.f4761a = str;
        this.f4762b = writableMap;
        this.f4763c = j10;
        this.f4764d = z10;
        this.f4765e = eVar;
    }

    public a(a aVar) {
        this.f4761a = aVar.f4761a;
        this.f4762b = aVar.f4762b.copy();
        this.f4763c = aVar.f4763c;
        this.f4764d = aVar.f4764d;
        e eVar = aVar.f4765e;
        if (eVar != null) {
            this.f4765e = eVar.copy();
        } else {
            this.f4765e = null;
        }
    }
}
