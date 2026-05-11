package t7;

import t8.c;

/* renamed from: t7.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4642a2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4642a2 f42809a = new C4642a2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f42810b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f42811c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f42812d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f42813e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f42814f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f42815g;

    static {
        c.b a10 = t8.c.a("maxMs");
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f42810b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("minMs");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f42811c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("avgMs");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f42812d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("firstQuartileMs");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f42813e = a13.b(c4772t04.b()).a();
        c.b a14 = t8.c.a("medianMs");
        C4772t0 c4772t05 = new C4772t0();
        c4772t05.a(5);
        f42814f = a14.b(c4772t05.b()).a();
        c.b a15 = t8.c.a("thirdQuartileMs");
        C4772t0 c4772t06 = new C4772t0();
        c4772t06.a(6);
        f42815g = a15.b(c4772t06.b()).a();
    }

    private C4642a2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        N3 n32 = (N3) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f42810b, n32.c());
        eVar.a(f42811c, n32.e());
        eVar.a(f42812d, n32.a());
        eVar.a(f42813e, n32.b());
        eVar.a(f42814f, n32.d());
        eVar.a(f42815g, n32.f());
    }
}
