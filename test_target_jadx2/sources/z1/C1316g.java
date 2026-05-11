package Z1;

import a2.AbstractC1346c;
import android.graphics.Color;

/* renamed from: Z1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1316g implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C1316g f12306a = new C1316g();

    private C1316g() {
    }

    @Override // Z1.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(AbstractC1346c abstractC1346c, float f10) {
        boolean z10 = abstractC1346c.p() == AbstractC1346c.b.BEGIN_ARRAY;
        if (z10) {
            abstractC1346c.b();
        }
        double i10 = abstractC1346c.i();
        double i11 = abstractC1346c.i();
        double i12 = abstractC1346c.i();
        double i13 = abstractC1346c.p() == AbstractC1346c.b.NUMBER ? abstractC1346c.i() : 1.0d;
        if (z10) {
            abstractC1346c.d();
        }
        if (i10 <= 1.0d && i11 <= 1.0d && i12 <= 1.0d) {
            i10 *= 255.0d;
            i11 *= 255.0d;
            i12 *= 255.0d;
            if (i13 <= 1.0d) {
                i13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) i13, (int) i10, (int) i11, (int) i12));
    }
}
