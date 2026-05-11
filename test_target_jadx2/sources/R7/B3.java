package r7;

import t8.c;

/* loaded from: classes2.dex */
final class B3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final B3 f39285a = new B3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39286b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39287c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39288d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f39289e;

    static {
        c.b a10 = t8.c.a("isChargingRequired");
        O0 o02 = new O0();
        o02.a(1);
        f39286b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("isWifiRequired");
        O0 o03 = new O0();
        o03.a(2);
        f39287c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("isDeviceIdleRequired");
        O0 o04 = new O0();
        o04.a(3);
        f39288d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("canDownloadInBackground");
        O0 o05 = new O0();
        o05.a(4);
        f39289e = a13.b(o05.b()).a();
    }

    private B3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
