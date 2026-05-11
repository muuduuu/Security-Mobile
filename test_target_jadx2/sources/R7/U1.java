package r7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* loaded from: classes2.dex */
final class U1 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final U1 f39734a = new U1();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39735b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39736c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39737d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f39738e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f39739f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f39740g;

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f39741h;

    static {
        c.b a10 = t8.c.a(Keys.ERROR_CODE);
        O0 o02 = new O0();
        o02.a(1);
        f39735b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("hasResult");
        O0 o03 = new O0();
        o03.a(2);
        f39736c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("isColdCall");
        O0 o04 = new O0();
        o04.a(3);
        f39737d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("imageInfo");
        O0 o05 = new O0();
        o05.a(4);
        f39738e = a13.b(o05.b()).a();
        c.b a14 = t8.c.a("options");
        O0 o06 = new O0();
        o06.a(5);
        f39739f = a14.b(o06.b()).a();
        c.b a15 = t8.c.a("detectedBarcodeFormats");
        O0 o07 = new O0();
        o07.a(6);
        f39740g = a15.b(o07.b()).a();
        c.b a16 = t8.c.a("detectedBarcodeValueTypes");
        O0 o08 = new O0();
        o08.a(7);
        f39741h = a16.b(o08.b()).a();
    }

    private U1() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C4101h1 c4101h1 = (C4101h1) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f39735b, c4101h1.c());
        eVar.a(f39736c, null);
        eVar.a(f39737d, c4101h1.e());
        eVar.a(f39738e, null);
        eVar.a(f39739f, c4101h1.d());
        eVar.a(f39740g, c4101h1.a());
        eVar.a(f39741h, c4101h1.b());
    }
}
