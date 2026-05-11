package g4;

import android.graphics.Bitmap;
import f3.AbstractC3142a;
import q4.C3919a;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3187b extends AbstractC3186a implements f {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f33525i = false;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3142a f33526d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Bitmap f33527e;

    /* renamed from: f, reason: collision with root package name */
    private final n f33528f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33529g;

    /* renamed from: h, reason: collision with root package name */
    private final int f33530h;

    protected C3187b(Bitmap bitmap, f3.h hVar, n nVar, int i10, int i11) {
        this.f33527e = (Bitmap) b3.l.g(bitmap);
        this.f33526d = AbstractC3142a.C(this.f33527e, (f3.h) b3.l.g(hVar));
        this.f33528f = nVar;
        this.f33529g = i10;
        this.f33530h = i11;
    }

    private synchronized AbstractC3142a s() {
        AbstractC3142a abstractC3142a;
        abstractC3142a = this.f33526d;
        this.f33526d = null;
        this.f33527e = null;
        return abstractC3142a;
    }

    private static int t(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int u(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean x() {
        return f33525i;
    }

    @Override // g4.InterfaceC3190e
    public int M() {
        return C3919a.g(this.f33527e);
    }

    @Override // g4.AbstractC3186a, g4.InterfaceC3190e
    public n c1() {
        return this.f33528f;
    }

    @Override // g4.f
    public int c2() {
        return this.f33530h;
    }

    @Override // g4.InterfaceC3190e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC3142a s10 = s();
        if (s10 != null) {
            s10.close();
        }
    }

    @Override // g4.InterfaceC3190e, g4.k
    public int getHeight() {
        int i10;
        return (this.f33529g % 180 != 0 || (i10 = this.f33530h) == 5 || i10 == 7) ? u(this.f33527e) : t(this.f33527e);
    }

    @Override // g4.InterfaceC3190e, g4.k
    public int getWidth() {
        int i10;
        return (this.f33529g % 180 != 0 || (i10 = this.f33530h) == 5 || i10 == 7) ? t(this.f33527e) : u(this.f33527e);
    }

    @Override // g4.f
    public synchronized AbstractC3142a h0() {
        return AbstractC3142a.i(this.f33526d);
    }

    @Override // g4.InterfaceC3190e
    public synchronized boolean isClosed() {
        return this.f33526d == null;
    }

    @Override // g4.InterfaceC3189d
    public Bitmap p1() {
        return this.f33527e;
    }

    @Override // g4.f
    public int t0() {
        return this.f33529g;
    }

    protected C3187b(AbstractC3142a abstractC3142a, n nVar, int i10, int i11) {
        AbstractC3142a abstractC3142a2 = (AbstractC3142a) b3.l.g(abstractC3142a.d());
        this.f33526d = abstractC3142a2;
        this.f33527e = (Bitmap) abstractC3142a2.p();
        this.f33528f = nVar;
        this.f33529g = i10;
        this.f33530h = i11;
    }
}
