package t7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* loaded from: classes2.dex */
final class C2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C2 f42451a = new C2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f42452b;

    static {
        c.b a10 = t8.c.a(Keys.ERROR_CODE);
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f42452b = a10.b(c4772t0.b()).a();
    }

    private C2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((t8.e) obj2).a(f42452b, ((E4) obj).a());
    }
}
