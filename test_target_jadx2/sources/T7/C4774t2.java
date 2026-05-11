package t7;

import t8.c;

/* renamed from: t7.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4774t2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4774t2 f43246a = new C4774t2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f43247b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f43248c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f43249d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f43250e;

    static {
        c.b a10 = t8.c.a("isChargingRequired");
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f43247b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("isWifiRequired");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f43248c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("isDeviceIdleRequired");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f43249d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("canDownloadInBackground");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f43250e = a13.b(c4772t04.b()).a();
    }

    private C4774t2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
