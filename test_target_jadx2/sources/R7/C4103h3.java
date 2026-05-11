package r7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: r7.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4103h3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4103h3 f40049a = new C4103h3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f40050b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f40051c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f40052d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f40053e;

    static {
        c.b a10 = t8.c.a(Keys.IMAGE_FORMAT);
        O0 o02 = new O0();
        o02.a(1);
        f40050b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("originalImageSize");
        O0 o03 = new O0();
        o03.a(2);
        f40051c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("compressedImageSize");
        O0 o04 = new O0();
        o04.a(3);
        f40052d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("isOdmlImage");
        O0 o05 = new O0();
        o05.a(4);
        f40053e = a13.b(o05.b()).a();
    }

    private C4103h3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        M5 m52 = (M5) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f40050b, m52.a());
        eVar.a(f40051c, m52.b());
        eVar.a(f40052d, null);
        eVar.a(f40053e, null);
    }
}
