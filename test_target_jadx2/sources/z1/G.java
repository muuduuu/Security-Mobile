package Z1;

import a2.AbstractC1346c;

/* loaded from: classes.dex */
public class G implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final G f12288a = new G();

    private G() {
    }

    @Override // Z1.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2.d a(AbstractC1346c abstractC1346c, float f10) {
        boolean z10 = abstractC1346c.p() == AbstractC1346c.b.BEGIN_ARRAY;
        if (z10) {
            abstractC1346c.b();
        }
        float i10 = (float) abstractC1346c.i();
        float i11 = (float) abstractC1346c.i();
        while (abstractC1346c.f()) {
            abstractC1346c.t();
        }
        if (z10) {
            abstractC1346c.d();
        }
        return new c2.d((i10 / 100.0f) * f10, (i11 / 100.0f) * f10);
    }
}
