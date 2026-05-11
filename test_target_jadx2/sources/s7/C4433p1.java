package s7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: s7.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4433p1 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4433p1 f41392a = new C4433p1();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f41393b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f41394c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f41395d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f41396e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f41397f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f41398g;

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f41399h;

    static {
        c.b a10 = t8.c.a("durationMs");
        C4361f c4361f = new C4361f();
        c4361f.a(1);
        f41393b = a10.b(c4361f.b()).a();
        c.b a11 = t8.c.a("imageSource");
        C4361f c4361f2 = new C4361f();
        c4361f2.a(2);
        f41394c = a11.b(c4361f2.b()).a();
        c.b a12 = t8.c.a(Keys.IMAGE_FORMAT);
        C4361f c4361f3 = new C4361f();
        c4361f3.a(3);
        f41395d = a12.b(c4361f3.b()).a();
        c.b a13 = t8.c.a("imageByteSize");
        C4361f c4361f4 = new C4361f();
        c4361f4.a(4);
        f41396e = a13.b(c4361f4.b()).a();
        c.b a14 = t8.c.a("imageWidth");
        C4361f c4361f5 = new C4361f();
        c4361f5.a(5);
        f41397f = a14.b(c4361f5.b()).a();
        c.b a15 = t8.c.a("imageHeight");
        C4361f c4361f6 = new C4361f();
        c4361f6.a(6);
        f41398g = a15.b(c4361f6.b()).a();
        c.b a16 = t8.c.a("rotationDegrees");
        C4361f c4361f7 = new C4361f();
        c4361f7.a(7);
        f41399h = a16.b(c4361f7.b()).a();
    }

    private C4433p1() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A3 a32 = (A3) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f41393b, a32.g());
        eVar.a(f41394c, a32.b());
        eVar.a(f41395d, a32.a());
        eVar.a(f41396e, a32.c());
        eVar.a(f41397f, a32.e());
        eVar.a(f41398g, a32.d());
        eVar.a(f41399h, a32.f());
    }
}
