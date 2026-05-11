package F5;

import P5.r;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    protected static final r[] f2559d = new r[0];

    /* renamed from: e, reason: collision with root package name */
    protected static final P5.g[] f2560e = new P5.g[0];

    /* renamed from: a, reason: collision with root package name */
    protected final r[] f2561a;

    /* renamed from: b, reason: collision with root package name */
    protected final r[] f2562b;

    /* renamed from: c, reason: collision with root package name */
    protected final P5.g[] f2563c;

    public o() {
        this(null, null, null);
    }

    public boolean a() {
        return this.f2562b.length > 0;
    }

    public boolean b() {
        return this.f2563c.length > 0;
    }

    public Iterable c() {
        return new T5.c(this.f2562b);
    }

    public Iterable d() {
        return new T5.c(this.f2563c);
    }

    public Iterable e() {
        return new T5.c(this.f2561a);
    }

    protected o(r[] rVarArr, r[] rVarArr2, P5.g[] gVarArr) {
        this.f2561a = rVarArr == null ? f2559d : rVarArr;
        this.f2562b = rVarArr2 == null ? f2559d : rVarArr2;
        this.f2563c = gVarArr == null ? f2560e : gVarArr;
    }
}
