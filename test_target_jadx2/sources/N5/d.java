package N5;

import v5.C;

/* loaded from: classes2.dex */
public class d extends a {

    /* renamed from: c, reason: collision with root package name */
    protected final String f6542c;

    public d(M5.e eVar, D5.d dVar, String str) {
        super(eVar, dVar);
        this.f6542c = str;
    }

    @Override // N5.m, M5.g
    public String b() {
        return this.f6542c;
    }

    @Override // N5.a, M5.g
    public C.a c() {
        return C.a.PROPERTY;
    }

    @Override // N5.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public d a(D5.d dVar) {
        return this.f6563b == dVar ? this : new d(this.f6562a, dVar, this.f6542c);
    }
}
