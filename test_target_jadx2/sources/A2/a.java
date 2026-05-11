package A2;

import D2.l;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f310a;

    /* renamed from: b, reason: collision with root package name */
    private final int f311b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.request.d f312c;

    public a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // A2.d
    public final void h(com.bumptech.glide.request.d dVar) {
        this.f312c = dVar;
    }

    @Override // A2.d
    public final void j(c cVar) {
        cVar.c(this.f310a, this.f311b);
    }

    @Override // A2.d
    public final com.bumptech.glide.request.d l() {
        return this.f312c;
    }

    public a(int i10, int i11) {
        if (l.u(i10, i11)) {
            this.f310a = i10;
            this.f311b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // x2.l
    public void a() {
    }

    @Override // x2.l
    public void b() {
    }

    @Override // x2.l
    public void c() {
    }

    @Override // A2.d
    public final void d(c cVar) {
    }

    @Override // A2.d
    public void i(Drawable drawable) {
    }

    @Override // A2.d
    public void k(Drawable drawable) {
    }
}
