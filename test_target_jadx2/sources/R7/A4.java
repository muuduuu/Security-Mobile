package r7;

import t8.c;

/* loaded from: classes2.dex */
final class A4 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final A4 f39269a = new A4();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39270b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39271c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39272d;

    static {
        c.b a10 = t8.c.a("detectorMode");
        O0 o02 = new O0();
        o02.a(1);
        f39270b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("streamModeSmoothingRatio");
        O0 o03 = new O0();
        o03.a(2);
        f39271c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("rawSizeMaskEnabled");
        O0 o04 = new O0();
        o04.a(3);
        f39272d = a12.b(o04.b()).a();
    }

    private A4() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
