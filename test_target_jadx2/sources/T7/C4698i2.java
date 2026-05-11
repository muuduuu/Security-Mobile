package t7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: t7.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4698i2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4698i2 f42998a = new C4698i2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f42999b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f43000c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f43001d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f43002e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f43003f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f43004g;

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f43005h;

    /* renamed from: i, reason: collision with root package name */
    private static final t8.c f43006i;

    /* renamed from: j, reason: collision with root package name */
    private static final t8.c f43007j;

    /* renamed from: k, reason: collision with root package name */
    private static final t8.c f43008k;

    static {
        c.b a10 = t8.c.a("durationMs");
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f42999b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a(Keys.ERROR_CODE);
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f43000c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("isColdCall");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f43001d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("autoManageModelOnBackground");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f43002e = a13.b(c4772t04.b()).a();
        c.b a14 = t8.c.a("autoManageModelOnLowMemory");
        C4772t0 c4772t05 = new C4772t0();
        c4772t05.a(5);
        f43003f = a14.b(c4772t05.b()).a();
        c.b a15 = t8.c.a("isNnApiEnabled");
        C4772t0 c4772t06 = new C4772t0();
        c4772t06.a(6);
        f43004g = a15.b(c4772t06.b()).a();
        c.b a16 = t8.c.a("eventsCount");
        C4772t0 c4772t07 = new C4772t0();
        c4772t07.a(7);
        f43005h = a16.b(c4772t07.b()).a();
        c.b a17 = t8.c.a("otherErrors");
        C4772t0 c4772t08 = new C4772t0();
        c4772t08.a(8);
        f43006i = a17.b(c4772t08.b()).a();
        c.b a18 = t8.c.a("remoteConfigValueForAcceleration");
        C4772t0 c4772t09 = new C4772t0();
        c4772t09.a(9);
        f43007j = a18.b(c4772t09.b()).a();
        c.b a19 = t8.c.a("isAccelerated");
        C4772t0 c4772t010 = new C4772t0();
        c4772t010.a(10);
        f43008k = a19.b(c4772t010.b()).a();
    }

    private C4698i2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C4665d4 c4665d4 = (C4665d4) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f42999b, c4665d4.e());
        eVar.a(f43000c, c4665d4.a());
        eVar.a(f43001d, c4665d4.d());
        eVar.a(f43002e, c4665d4.b());
        eVar.a(f43003f, c4665d4.c());
        eVar.a(f43004g, null);
        eVar.a(f43005h, null);
        eVar.a(f43006i, null);
        eVar.a(f43007j, null);
        eVar.a(f43008k, null);
    }
}
