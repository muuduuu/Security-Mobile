package Z1;

import U1.b;
import a2.AbstractC1346c;
import android.graphics.PointF;
import com.appsflyer.attribution.RequestError;

/* renamed from: Z1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1318i implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C1318i f12308a = new C1318i();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12309b = AbstractC1346c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C1318i() {
    }

    @Override // Z1.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U1.b a(AbstractC1346c abstractC1346c, float f10) {
        b.a aVar = b.a.CENTER;
        abstractC1346c.c();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12309b)) {
                case 0:
                    str = abstractC1346c.n();
                    break;
                case 1:
                    str2 = abstractC1346c.n();
                    break;
                case 2:
                    f11 = (float) abstractC1346c.i();
                    break;
                case 3:
                    int j10 = abstractC1346c.j();
                    aVar2 = b.a.CENTER;
                    if (j10 <= aVar2.ordinal() && j10 >= 0) {
                        aVar2 = b.a.values()[j10];
                        break;
                    }
                    break;
                case 4:
                    i10 = abstractC1346c.j();
                    break;
                case 5:
                    f12 = (float) abstractC1346c.i();
                    break;
                case 6:
                    f13 = (float) abstractC1346c.i();
                    break;
                case 7:
                    i11 = s.d(abstractC1346c);
                    break;
                case 8:
                    i12 = s.d(abstractC1346c);
                    break;
                case 9:
                    f14 = (float) abstractC1346c.i();
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    z10 = abstractC1346c.g();
                    break;
                case 11:
                    abstractC1346c.b();
                    PointF pointF3 = new PointF(((float) abstractC1346c.i()) * f10, ((float) abstractC1346c.i()) * f10);
                    abstractC1346c.d();
                    pointF = pointF3;
                    break;
                case 12:
                    abstractC1346c.b();
                    PointF pointF4 = new PointF(((float) abstractC1346c.i()) * f10, ((float) abstractC1346c.i()) * f10);
                    abstractC1346c.d();
                    pointF2 = pointF4;
                    break;
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    break;
            }
        }
        abstractC1346c.e();
        return new U1.b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}
