package r7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* loaded from: classes2.dex */
final class I3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final I3 f39442a = new I3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39443b;

    static {
        c.b a10 = t8.c.a(Keys.ERROR_CODE);
        O0 o02 = new O0();
        o02.a(1);
        f39443b = a10.b(o02.b()).a();
    }

    private I3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((t8.e) obj2).a(f39443b, ((C4275y6) obj).a());
    }
}
