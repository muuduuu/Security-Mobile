package K5;

import v5.O;

/* loaded from: classes2.dex */
public class B {

    /* renamed from: f, reason: collision with root package name */
    private static final B f5288f = new B(D5.w.f1296e, Object.class, null, false, null);

    /* renamed from: a, reason: collision with root package name */
    protected final D5.w f5289a;

    /* renamed from: b, reason: collision with root package name */
    protected final Class f5290b;

    /* renamed from: c, reason: collision with root package name */
    protected final Class f5291c;

    /* renamed from: d, reason: collision with root package name */
    protected final Class f5292d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f5293e;

    public B(D5.w wVar, Class cls, Class cls2, Class cls3) {
        this(wVar, cls, cls2, false, cls3);
    }

    public static B a() {
        return f5288f;
    }

    public boolean b() {
        return this.f5293e;
    }

    public Class c() {
        return this.f5290b;
    }

    public D5.w d() {
        return this.f5289a;
    }

    public Class e() {
        return this.f5292d;
    }

    public B f(boolean z10) {
        return this.f5293e == z10 ? this : new B(this.f5289a, this.f5292d, this.f5290b, z10, this.f5291c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f5289a + ", scope=" + T5.f.Q(this.f5292d) + ", generatorType=" + T5.f.Q(this.f5290b) + ", alwaysAsId=" + this.f5293e;
    }

    protected B(D5.w wVar, Class cls, Class cls2, boolean z10, Class cls3) {
        this.f5289a = wVar;
        this.f5292d = cls;
        this.f5290b = cls2;
        this.f5293e = z10;
        this.f5291c = cls3 == null ? O.class : cls3;
    }
}
