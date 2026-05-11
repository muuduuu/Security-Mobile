package r7;

import t8.c;

/* loaded from: classes2.dex */
final class O4 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final O4 f39578a = new O4();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39579b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39580c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39581d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f39582e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f39583f;

    static {
        c.b a10 = t8.c.a("xMin");
        O0 o02 = new O0();
        o02.a(1);
        f39579b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("yMin");
        O0 o03 = new O0();
        o03.a(2);
        f39580c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("xMax");
        O0 o04 = new O0();
        o04.a(3);
        f39581d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("yMax");
        O0 o05 = new O0();
        o05.a(4);
        f39582e = a13.b(o05.b()).a();
        c.b a14 = t8.c.a("confidenceScore");
        O0 o06 = new O0();
        o06.a(5);
        f39583f = a14.b(o06.b()).a();
    }

    private O4() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        AbstractC4286z7 abstractC4286z7 = (AbstractC4286z7) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f39579b, abstractC4286z7.c());
        eVar.a(f39580c, abstractC4286z7.e());
        eVar.a(f39581d, abstractC4286z7.b());
        eVar.a(f39582e, abstractC4286z7.d());
        eVar.a(f39583f, abstractC4286z7.a());
    }
}
