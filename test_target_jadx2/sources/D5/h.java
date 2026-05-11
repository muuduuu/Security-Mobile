package D5;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class h extends e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final G5.e f1251a;

    /* renamed from: b, reason: collision with root package name */
    protected final G5.f f1252b;

    /* renamed from: c, reason: collision with root package name */
    protected final g f1253c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f1254d;

    /* renamed from: e, reason: collision with root package name */
    protected final C5.h f1255e;

    /* renamed from: f, reason: collision with root package name */
    protected final Class f1256f;

    /* renamed from: g, reason: collision with root package name */
    protected transient F5.i f1257g;

    protected h(G5.f fVar, G5.e eVar) {
        if (fVar == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this.f1252b = fVar;
        this.f1251a = eVar == null ? new G5.e() : eVar;
        this.f1254d = 0;
        this.f1255e = null;
        this.f1253c = null;
        this.f1256f = null;
        this.f1257g = null;
    }

    @Override // D5.e
    public final S5.o g() {
        return this.f1253c.z();
    }

    @Override // D5.e
    public Object i(j jVar, String str) {
        throw I5.a.s(null, str, jVar);
    }

    @Override // D5.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g f() {
        return this.f1253c;
    }
}
