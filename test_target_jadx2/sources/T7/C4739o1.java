package t7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: t7.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4739o1 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4739o1 f43103a = new C4739o1();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f43104b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f43105c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f43106d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f43107e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f43108f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f43109g;

    static {
        c.b a10 = t8.c.a(Keys.ERROR_CODE);
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f43104b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("isColdCall");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f43105c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("imageInfo");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f43106d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("detectorOptions");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f43107e = a13.b(c4772t04.b()).a();
        c.b a14 = t8.c.a("contourDetectedFaces");
        C4772t0 c4772t05 = new C4772t0();
        c4772t05.a(5);
        f43108f = a14.b(c4772t05.b()).a();
        c.b a15 = t8.c.a("nonContourDetectedFaces");
        C4772t0 c4772t06 = new C4772t0();
        c4772t06.a(6);
        f43109g = a15.b(c4772t06.b()).a();
    }

    private C4739o1() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        P0 p02 = (P0) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f43104b, p02.b());
        eVar.a(f43105c, p02.c());
        eVar.a(f43106d, null);
        eVar.a(f43107e, p02.a());
        eVar.a(f43108f, p02.d());
        eVar.a(f43109g, p02.e());
    }
}
