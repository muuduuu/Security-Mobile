package F3;

import android.graphics.Bitmap;
import f3.AbstractC3142a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements E3.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2493c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f2494a = -1;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3142a f2495b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final synchronized void a() {
        AbstractC3142a.n(this.f2495b);
        this.f2495b = null;
        this.f2494a = -1;
    }

    @Override // E3.b
    public synchronized boolean C(int i10) {
        boolean z10;
        if (i10 == this.f2494a) {
            z10 = AbstractC3142a.x(this.f2495b);
        }
        return z10;
    }

    @Override // E3.b
    public synchronized AbstractC3142a D(int i10, int i11, int i12) {
        try {
        } finally {
            a();
        }
        return AbstractC3142a.i(this.f2495b);
    }

    @Override // E3.b
    public synchronized AbstractC3142a E(int i10) {
        return this.f2494a == i10 ? AbstractC3142a.i(this.f2495b) : null;
    }

    @Override // E3.b
    public synchronized AbstractC3142a F(int i10) {
        return AbstractC3142a.i(this.f2495b);
    }

    @Override // E3.b
    public synchronized void G(int i10, AbstractC3142a bitmapReference, int i11) {
        try {
            Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
            if (this.f2495b != null) {
                Object p10 = bitmapReference.p();
                AbstractC3142a abstractC3142a = this.f2495b;
                if (Intrinsics.b(p10, abstractC3142a != null ? (Bitmap) abstractC3142a.p() : null)) {
                    return;
                }
            }
            AbstractC3142a.n(this.f2495b);
            this.f2495b = AbstractC3142a.i(bitmapReference);
            this.f2494a = i10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // E3.b
    public void H(int i10, AbstractC3142a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // E3.b
    public synchronized void clear() {
        a();
    }
}
