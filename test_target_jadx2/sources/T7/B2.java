package t7;

import t8.c;

/* loaded from: classes2.dex */
final class B2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final B2 f42427a = new B2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f42428b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f42429c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f42430d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f42431e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f42432f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f42433g;

    static {
        c.b a10 = t8.c.a("inferenceCommonLogEvent");
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f42428b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("options");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f42429c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("imageInfo");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f42430d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("detectorOptions");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f42431e = a13.b(c4772t04.b()).a();
        c.b a14 = t8.c.a("contourDetectedFaces");
        C4772t0 c4772t05 = new C4772t0();
        c4772t05.a(5);
        f42432f = a14.b(c4772t05.b()).a();
        c.b a15 = t8.c.a("nonContourDetectedFaces");
        C4772t0 c4772t06 = new C4772t0();
        c4772t06.a(6);
        f42433g = a15.b(c4772t06.b()).a();
    }

    private B2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        B4 b42 = (B4) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f42428b, b42.c());
        eVar.a(f42429c, null);
        eVar.a(f42430d, b42.b());
        eVar.a(f42431e, b42.a());
        eVar.a(f42432f, b42.d());
        eVar.a(f42433g, b42.e());
    }
}
