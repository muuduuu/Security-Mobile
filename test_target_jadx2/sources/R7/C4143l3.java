package r7;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import t8.c;

/* renamed from: r7.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4143l3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4143l3 f40118a = new C4143l3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f40119b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f40120c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f40121d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f40122e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f40123f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f40124g;

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f40125h;

    /* renamed from: i, reason: collision with root package name */
    private static final t8.c f40126i;

    /* renamed from: j, reason: collision with root package name */
    private static final t8.c f40127j;

    /* renamed from: k, reason: collision with root package name */
    private static final t8.c f40128k;

    static {
        c.b a10 = t8.c.a("durationMs");
        O0 o02 = new O0();
        o02.a(1);
        f40119b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a(Keys.ERROR_CODE);
        O0 o03 = new O0();
        o03.a(2);
        f40120c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("isColdCall");
        O0 o04 = new O0();
        o04.a(3);
        f40121d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("autoManageModelOnBackground");
        O0 o05 = new O0();
        o05.a(4);
        f40122e = a13.b(o05.b()).a();
        c.b a14 = t8.c.a("autoManageModelOnLowMemory");
        O0 o06 = new O0();
        o06.a(5);
        f40123f = a14.b(o06.b()).a();
        c.b a15 = t8.c.a("isNnApiEnabled");
        O0 o07 = new O0();
        o07.a(6);
        f40124g = a15.b(o07.b()).a();
        c.b a16 = t8.c.a("eventsCount");
        O0 o08 = new O0();
        o08.a(7);
        f40125h = a16.b(o08.b()).a();
        c.b a17 = t8.c.a("otherErrors");
        O0 o09 = new O0();
        o09.a(8);
        f40126i = a17.b(o09.b()).a();
        c.b a18 = t8.c.a("remoteConfigValueForAcceleration");
        O0 o010 = new O0();
        o010.a(9);
        f40127j = a18.b(o010.b()).a();
        c.b a19 = t8.c.a("isAccelerated");
        O0 o011 = new O0();
        o011.a(10);
        f40128k = a19.b(o011.b()).a();
    }

    private C4143l3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        S5 s52 = (S5) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f40119b, s52.e());
        eVar.a(f40120c, s52.a());
        eVar.a(f40121d, s52.d());
        eVar.a(f40122e, s52.b());
        eVar.a(f40123f, s52.c());
        eVar.a(f40124g, null);
        eVar.a(f40125h, null);
        eVar.a(f40126i, null);
        eVar.a(f40127j, null);
        eVar.a(f40128k, null);
    }
}
