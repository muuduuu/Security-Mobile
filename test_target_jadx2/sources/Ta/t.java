package Ta;

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import expo.modules.image.enums.ContentFit;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;

/* loaded from: classes2.dex */
public final class t implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f9642a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9643b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9644c;

    /* renamed from: d, reason: collision with root package name */
    private int f9645d;

    /* renamed from: e, reason: collision with root package name */
    private int f9646e;

    /* renamed from: f, reason: collision with root package name */
    private int f9647f;

    /* renamed from: g, reason: collision with root package name */
    private int f9648g;

    /* renamed from: h, reason: collision with root package name */
    private int f9649h;

    /* renamed from: i, reason: collision with root package name */
    private ContentFit f9650i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.request.d f9651j;

    /* renamed from: k, reason: collision with root package name */
    private y f9652k;

    public t(WeakReference imageViewHolder) {
        Intrinsics.checkNotNullParameter(imageViewHolder, "imageViewHolder");
        this.f9642a = imageViewHolder;
        this.f9645d = -1;
        this.f9646e = -1;
        this.f9647f = -1;
        this.f9648g = -1;
        this.f9649h = -1;
        this.f9652k = new y(imageViewHolder);
    }

    private final void f() {
        synchronized (this) {
            if (this.f9649h >= 0) {
                B b10 = B.f9505a;
                String c10 = b10.c();
                String a10 = b10.a();
                AbstractC3901a.d("[" + c10 + "] " + a10, this.f9649h);
                this.f9649h = -1;
            }
            Unit unit = Unit.f36324a;
        }
    }

    public final void A(boolean z10) {
        this.f9644c = z10;
    }

    @Override // A2.d
    public void d(A2.c cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f9652k.l(cb2);
    }

    public final void e(com.bumptech.glide.l requestManager) {
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        this.f9652k.d();
        requestManager.p(this);
    }

    public final boolean g() {
        return this.f9643b;
    }

    @Override // A2.d
    public void h(com.bumptech.glide.request.d dVar) {
        this.f9651j = dVar;
    }

    @Override // A2.d
    public void i(Drawable drawable) {
        f();
    }

    @Override // A2.d
    public void j(A2.c cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        if (this.f9642a.get() == null) {
            cb2.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            this.f9652k.e(cb2);
        }
    }

    @Override // A2.d
    public com.bumptech.glide.request.d l() {
        return this.f9651j;
    }

    public final ContentFit o() {
        return this.f9650i;
    }

    public final int p() {
        return this.f9647f;
    }

    public final int q() {
        return this.f9648g;
    }

    public final int r() {
        return this.f9645d;
    }

    public final int s() {
        return this.f9646e;
    }

    public final boolean t() {
        return this.f9644c;
    }

    @Override // A2.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void n(Drawable resource, B2.b bVar) {
        com.bumptech.glide.request.d b10;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Object obj = this.f9642a.get();
        if (obj == null) {
            f();
            Log.w("ExpoImage", "The `ExpoImageViewWrapper` was deallocated, but the target wasn't canceled in time.");
            return;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "ifNull(...)");
        k kVar = (k) obj;
        com.bumptech.glide.request.d dVar = this.f9651j;
        boolean z10 = false;
        if (dVar instanceof ThumbnailRequestCoordinator) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = dVar instanceof ThumbnailRequestCoordinator ? (ThumbnailRequestCoordinator) dVar : null;
            if (thumbnailRequestCoordinator != null && (b10 = A.b(thumbnailRequestCoordinator)) != null && !b10.isComplete()) {
                z10 = true;
            }
        }
        if (!z10) {
            f();
        }
        kVar.L(this, resource, z10);
    }

    public final void v(int i10) {
        f();
        synchronized (this) {
            this.f9649h = i10;
            Unit unit = Unit.f36324a;
        }
    }

    public final void w(boolean z10) {
        this.f9643b = z10;
    }

    public final void x(ContentFit contentFit) {
        this.f9650i = contentFit;
    }

    public final void y(int i10) {
        this.f9645d = i10;
    }

    public final void z(int i10) {
        this.f9646e = i10;
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
    public void k(Drawable drawable) {
    }

    @Override // A2.d
    public void m(Drawable drawable) {
    }
}
