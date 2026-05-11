package p0;

import p0.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f38247m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f38239e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f38239e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p0.f
    public void d(int i10) {
        if (this.f38244j) {
            return;
        }
        this.f38244j = true;
        this.f38241g = i10;
        for (d dVar : this.f38245k) {
            dVar.a(dVar);
        }
    }
}
