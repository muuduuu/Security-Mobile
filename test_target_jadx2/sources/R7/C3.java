package r7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* loaded from: classes2.dex */
final class C3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C3 f39308a = new C3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39309b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39310c;

    static {
        c.b a10 = t8.c.a("eventType");
        O0 o02 = new O0();
        o02.a(1);
        f39309b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a(Keys.ERROR_CODE);
        O0 o03 = new O0();
        o03.a(2);
        f39310c = a11.b(o03.b()).a();
    }

    private C3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
