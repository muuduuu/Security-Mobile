package t7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: t7.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4677f2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4677f2 f42917a = new C4677f2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f42918b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f42919c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f42920d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f42921e;

    static {
        c.b a10 = t8.c.a(Keys.IMAGE_FORMAT);
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f42918b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("originalImageSize");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f42919c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("compressedImageSize");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f42920d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("isOdmlImage");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f42921e = a13.b(c4772t04.b()).a();
    }

    private C4677f2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        Z3 z32 = (Z3) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f42918b, z32.a());
        eVar.a(f42919c, z32.b());
        eVar.a(f42920d, null);
        eVar.a(f42921e, null);
    }
}
