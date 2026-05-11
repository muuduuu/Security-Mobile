package r2;

import android.graphics.Bitmap;
import l2.InterfaceC3602d;

/* renamed from: r2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4008g implements k2.v, k2.r {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f39153a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3602d f39154b;

    public C4008g(Bitmap bitmap, InterfaceC3602d interfaceC3602d) {
        this.f39153a = (Bitmap) D2.k.e(bitmap, "Bitmap must not be null");
        this.f39154b = (InterfaceC3602d) D2.k.e(interfaceC3602d, "BitmapPool must not be null");
    }

    public static C4008g c(Bitmap bitmap, InterfaceC3602d interfaceC3602d) {
        if (bitmap == null) {
            return null;
        }
        return new C4008g(bitmap, interfaceC3602d);
    }

    @Override // k2.v
    public Class a() {
        return Bitmap.class;
    }

    @Override // k2.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f39153a;
    }

    @Override // k2.r
    public void initialize() {
        this.f39153a.prepareToDraw();
    }

    @Override // k2.v
    public int k() {
        return D2.l.i(this.f39153a);
    }

    @Override // k2.v
    public void recycle() {
        this.f39154b.c(this.f39153a);
    }
}
