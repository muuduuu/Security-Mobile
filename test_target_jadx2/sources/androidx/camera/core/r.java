package androidx.camera.core;

import A.Y;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: d, reason: collision with root package name */
    private final Object f14752d;

    /* renamed from: e, reason: collision with root package name */
    private final Y f14753e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f14754f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14755g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14756h;

    r(n nVar, Y y10) {
        this(nVar, null, y10);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public Y G() {
        return this.f14753e;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getHeight() {
        return this.f14756h;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getWidth() {
        return this.f14755g;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public void j1(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f14752d) {
            this.f14754f = rect;
        }
    }

    public r(n nVar, Size size, Y y10) {
        super(nVar);
        this.f14752d = new Object();
        if (size == null) {
            this.f14755g = super.getWidth();
            this.f14756h = super.getHeight();
        } else {
            this.f14755g = size.getWidth();
            this.f14756h = size.getHeight();
        }
        this.f14753e = y10;
    }
}
