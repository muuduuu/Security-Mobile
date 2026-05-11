package r7;

import t8.c;

/* loaded from: classes2.dex */
final class T1 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final T1 f39705a = new T1();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39706b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39707c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39708d;

    static {
        c.b a10 = t8.c.a("logEventKey");
        O0 o02 = new O0();
        o02.a(1);
        f39706b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("eventCount");
        O0 o03 = new O0();
        o03.a(2);
        f39707c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("inferenceDurationStats");
        O0 o04 = new O0();
        o04.a(3);
        f39708d = a12.b(o04.b()).a();
    }

    private T1() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C4121j1 c4121j1 = (C4121j1) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f39706b, c4121j1.a());
        eVar.a(f39707c, c4121j1.c());
        eVar.a(f39708d, c4121j1.b());
    }
}
