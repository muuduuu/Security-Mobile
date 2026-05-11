package t7;

import t8.c;

/* renamed from: t7.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4732n1 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4732n1 f43084a = new C4732n1();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f43085b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f43086c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f43087d;

    static {
        c.b a10 = t8.c.a("logEventKey");
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f43085b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("eventCount");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f43086c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("inferenceDurationStats");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f43087d = a12.b(c4772t03.b()).a();
    }

    private C4732n1() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        R0 r02 = (R0) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f43085b, r02.a());
        eVar.a(f43086c, r02.c());
        eVar.a(f43087d, r02.b());
    }
}
