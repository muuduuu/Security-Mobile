package s7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* loaded from: classes2.dex */
final class M2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final M2 f40970a = new M2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f40971b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f40972c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f40973d;

    static {
        c.b a10 = t8.c.a("numSamples");
        C4361f c4361f = new C4361f();
        c4361f.a(1);
        f40971b = a10.b(c4361f.b()).a();
        c.b a11 = t8.c.a(Keys.ERROR_CODE);
        C4361f c4361f2 = new C4361f();
        c4361f2.a(2);
        f40972c = a11.b(c4361f2.b()).a();
        c.b a12 = t8.c.a("metricResults");
        C4361f c4361f3 = new C4361f();
        c4361f3.a(3);
        f40973d = a12.b(c4361f3.b()).a();
    }

    private M2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
