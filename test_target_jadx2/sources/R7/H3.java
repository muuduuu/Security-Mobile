package r7;

import t8.c;

/* loaded from: classes2.dex */
final class H3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final H3 f39427a = new H3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39428b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39429c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39430d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f39431e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f39432f;

    static {
        c.b a10 = t8.c.a("inferenceCommonLogEvent");
        O0 o02 = new O0();
        o02.a(1);
        f39428b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("options");
        O0 o03 = new O0();
        o03.a(2);
        f39429c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("detectedBarcodeFormats");
        O0 o04 = new O0();
        o04.a(3);
        f39430d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("detectedBarcodeValueTypes");
        O0 o05 = new O0();
        o05.a(4);
        f39431e = a13.b(o05.b()).a();
        c.b a14 = t8.c.a("imageInfo");
        O0 o06 = new O0();
        o06.a(5);
        f39432f = a14.b(o06.b()).a();
    }

    private H3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C4235u6 c4235u6 = (C4235u6) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f39428b, c4235u6.d());
        eVar.a(f39429c, c4235u6.e());
        eVar.a(f39430d, c4235u6.a());
        eVar.a(f39431e, c4235u6.b());
        eVar.a(f39432f, c4235u6.c());
    }
}
