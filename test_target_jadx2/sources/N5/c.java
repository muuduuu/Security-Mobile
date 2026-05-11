package N5;

import v5.C;

/* loaded from: classes2.dex */
public class c extends m {

    /* renamed from: c, reason: collision with root package name */
    protected final String f6541c;

    public c(M5.e eVar, D5.d dVar, String str) {
        super(eVar, dVar);
        this.f6541c = str;
    }

    @Override // N5.m, M5.g
    public String b() {
        return this.f6541c;
    }

    @Override // M5.g
    public C.a c() {
        return C.a.EXTERNAL_PROPERTY;
    }

    @Override // M5.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public c a(D5.d dVar) {
        return this.f6563b == dVar ? this : new c(this.f6562a, dVar, this.f6541c);
    }
}
