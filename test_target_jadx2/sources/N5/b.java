package N5;

import v5.C;

/* loaded from: classes2.dex */
public class b extends d {
    public b(M5.e eVar, D5.d dVar, String str) {
        super(eVar, dVar, str);
    }

    @Override // N5.d, N5.a, M5.g
    public C.a c() {
        return C.a.EXISTING_PROPERTY;
    }

    @Override // N5.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b a(D5.d dVar) {
        return this.f6563b == dVar ? this : new b(this.f6562a, dVar, this.f6542c);
    }
}
