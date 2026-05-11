package G3;

import android.graphics.Bitmap;
import android.util.SparseArray;
import c3.AbstractC1721a;
import f3.AbstractC3142a;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Y3.d f2842a;

    /* renamed from: b, reason: collision with root package name */
    private final E3.c f2843b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f2844c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f2845d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f2846e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray f2847f;

    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final D3.a f2848a;

        /* renamed from: b, reason: collision with root package name */
        private final E3.b f2849b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2850c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2851d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f2852e;

        public a(c cVar, D3.a animationBackend, E3.b bitmapFrameCache, int i10, int i11) {
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            this.f2852e = cVar;
            this.f2848a = animationBackend;
            this.f2849b = bitmapFrameCache;
            this.f2850c = i10;
            this.f2851d = i11;
        }

        private final boolean a(int i10, int i11) {
            AbstractC3142a D10;
            int i12 = 2;
            try {
                if (i11 == 1) {
                    D10 = this.f2849b.D(i10, this.f2848a.e(), this.f2848a.c());
                } else {
                    if (i11 != 2) {
                        return false;
                    }
                    D10 = this.f2852e.f2842a.b(this.f2848a.e(), this.f2848a.c(), this.f2852e.f2844c);
                    i12 = -1;
                }
                boolean b10 = b(i10, D10, i11);
                AbstractC3142a.n(D10);
                return (b10 || i12 == -1) ? b10 : a(i10, i12);
            } catch (RuntimeException e10) {
                AbstractC1721a.G(this.f2852e.f2846e, "Failed to create frame bitmap", e10);
                return false;
            } finally {
                AbstractC3142a.n(null);
            }
        }

        private final boolean b(int i10, AbstractC3142a abstractC3142a, int i11) {
            if (AbstractC3142a.x(abstractC3142a) && abstractC3142a != null) {
                E3.c cVar = this.f2852e.f2843b;
                Object p10 = abstractC3142a.p();
                Intrinsics.checkNotNullExpressionValue(p10, "bitmapReference.get()");
                if (cVar.a(i10, (Bitmap) p10)) {
                    AbstractC1721a.z(this.f2852e.f2846e, "Frame %d ready.", Integer.valueOf(i10));
                    synchronized (this.f2852e.f2847f) {
                        this.f2849b.H(i10, abstractC3142a, i11);
                        Unit unit = Unit.f36324a;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f2849b.C(this.f2850c)) {
                    AbstractC1721a.z(this.f2852e.f2846e, "Frame %d is cached already.", Integer.valueOf(this.f2850c));
                    SparseArray sparseArray = this.f2852e.f2847f;
                    c cVar = this.f2852e;
                    synchronized (sparseArray) {
                        cVar.f2847f.remove(this.f2851d);
                        Unit unit = Unit.f36324a;
                    }
                    return;
                }
                if (a(this.f2850c, 1)) {
                    AbstractC1721a.z(this.f2852e.f2846e, "Prepared frame %d.", Integer.valueOf(this.f2850c));
                } else {
                    AbstractC1721a.k(this.f2852e.f2846e, "Could not prepare frame %d.", Integer.valueOf(this.f2850c));
                }
                SparseArray sparseArray2 = this.f2852e.f2847f;
                c cVar2 = this.f2852e;
                synchronized (sparseArray2) {
                    cVar2.f2847f.remove(this.f2851d);
                    Unit unit2 = Unit.f36324a;
                }
            } catch (Throwable th) {
                SparseArray sparseArray3 = this.f2852e.f2847f;
                c cVar3 = this.f2852e;
                synchronized (sparseArray3) {
                    cVar3.f2847f.remove(this.f2851d);
                    Unit unit3 = Unit.f36324a;
                    throw th;
                }
            }
        }
    }

    public c(Y3.d platformBitmapFactory, E3.c bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f2842a = platformBitmapFactory;
        this.f2843b = bitmapFrameRenderer;
        this.f2844c = bitmapConfig;
        this.f2845d = executorService;
        this.f2846e = c.class;
        this.f2847f = new SparseArray();
    }

    private final int g(D3.a aVar, int i10) {
        return (aVar.hashCode() * 31) + i10;
    }

    @Override // G3.b
    public boolean a(E3.b bitmapFrameCache, D3.a animationBackend, int i10) {
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int g10 = g(animationBackend, i10);
        synchronized (this.f2847f) {
            if (this.f2847f.get(g10) != null) {
                AbstractC1721a.z(this.f2846e, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                return true;
            }
            if (bitmapFrameCache.C(i10)) {
                AbstractC1721a.z(this.f2846e, "Frame %d is cached already.", Integer.valueOf(i10));
                return true;
            }
            a aVar = new a(this, animationBackend, bitmapFrameCache, i10, g10);
            this.f2847f.put(g10, aVar);
            this.f2845d.execute(aVar);
            Unit unit = Unit.f36324a;
            return true;
        }
    }
}
