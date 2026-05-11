package r7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: r7.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4232u3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4232u3 f40298a = new C4232u3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f40299b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f40300c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f40301d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f40302e;

    static {
        c.b a10 = t8.c.a("options");
        O0 o02 = new O0();
        o02.a(1);
        f40299b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("latencyMs");
        O0 o03 = new O0();
        o03.a(2);
        f40300c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("frameCount");
        O0 o04 = new O0();
        o04.a(3);
        f40301d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a(Keys.ERROR_CODE);
        O0 o05 = new O0();
        o05.a(4);
        f40302e = a13.b(o05.b()).a();
    }

    private C4232u3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
