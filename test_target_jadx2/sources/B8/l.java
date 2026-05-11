package b8;

import android.media.Image;

/* loaded from: classes2.dex */
final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Image f18878a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1656c f18879b;

    public l(Image image) {
        this.f18878a = image;
        C1661h c1661h = new C1661h();
        c1661h.b(3);
        int format = image.getFormat();
        c1661h.a(format == 42 ? 1 : format == 41 ? 2 : format != 35 ? format != 256 ? 0 : 9 : 7);
        this.f18879b = c1661h.c();
    }

    @Override // b8.j
    public final void a() {
        this.f18878a.close();
    }

    public final Image b() {
        return this.f18878a;
    }

    @Override // b8.j
    public final AbstractC1656c zzb() {
        return this.f18879b;
    }
}
