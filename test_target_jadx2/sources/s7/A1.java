package s7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* loaded from: classes2.dex */
final class A1 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final A1 f40791a = new A1();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f40792b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f40793c;

    static {
        c.b a10 = t8.c.a("eventType");
        C4361f c4361f = new C4361f();
        c4361f.a(1);
        f40792b = a10.b(c4361f.b()).a();
        c.b a11 = t8.c.a(Keys.ERROR_CODE);
        C4361f c4361f2 = new C4361f();
        c4361f2.a(2);
        f40793c = a11.b(c4361f2.b()).a();
    }

    private A1() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
