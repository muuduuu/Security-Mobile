package androidx.camera.view;

import A.AbstractC0700h0;
import A.I0;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.n;
import androidx.camera.view.w;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
final class w extends n {

    /* renamed from: e, reason: collision with root package name */
    SurfaceView f14889e;

    /* renamed from: f, reason: collision with root package name */
    final b f14890f;

    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class b implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        private Size f14891a;

        /* renamed from: b, reason: collision with root package name */
        private I0 f14892b;

        /* renamed from: c, reason: collision with root package name */
        private I0 f14893c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f14894d;

        /* renamed from: e, reason: collision with root package name */
        private Size f14895e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f14896f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f14897g = false;

        b() {
        }

        private boolean b() {
            return (this.f14896f || this.f14892b == null || !Objects.equals(this.f14891a, this.f14895e)) ? false : true;
        }

        private void c() {
            if (this.f14892b != null) {
                AbstractC0700h0.a("SurfaceViewImpl", "Request canceled: " + this.f14892b);
                this.f14892b.G();
            }
        }

        private void d() {
            if (this.f14892b != null) {
                AbstractC0700h0.a("SurfaceViewImpl", "Surface closed " + this.f14892b);
                this.f14892b.m().d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(n.a aVar, I0.g gVar) {
            AbstractC0700h0.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean g() {
            Surface surface = w.this.f14889e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            AbstractC0700h0.a("SurfaceViewImpl", "Surface set on Preview.");
            final n.a aVar = this.f14894d;
            I0 i02 = this.f14892b;
            Objects.requireNonNull(i02);
            i02.D(surface, androidx.core.content.a.h(w.this.f14889e.getContext()), new InterfaceC5159a() { // from class: androidx.camera.view.x
                @Override // y0.InterfaceC5159a
                public final void accept(Object obj) {
                    w.b.e(n.a.this, (I0.g) obj);
                }
            });
            this.f14896f = true;
            w.this.f();
            return true;
        }

        void f(I0 i02, n.a aVar) {
            c();
            if (this.f14897g) {
                this.f14897g = false;
                i02.r();
                return;
            }
            this.f14892b = i02;
            this.f14894d = aVar;
            Size p10 = i02.p();
            this.f14891a = p10;
            this.f14896f = false;
            if (g()) {
                return;
            }
            AbstractC0700h0.a("SurfaceViewImpl", "Wait for new Surface creation.");
            w.this.f14889e.getHolder().setFixedSize(p10.getWidth(), p10.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            AbstractC0700h0.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f14895e = new Size(i11, i12);
            g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            I0 i02;
            AbstractC0700h0.a("SurfaceViewImpl", "Surface created.");
            if (!this.f14897g || (i02 = this.f14893c) == null) {
                return;
            }
            i02.r();
            this.f14893c = null;
            this.f14897g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC0700h0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f14896f) {
                d();
            } else {
                c();
            }
            this.f14897g = true;
            I0 i02 = this.f14892b;
            if (i02 != null) {
                this.f14893c = i02;
            }
            this.f14896f = false;
            this.f14892b = null;
            this.f14894d = null;
            this.f14895e = null;
            this.f14891a = null;
        }
    }

    w(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f14890f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Semaphore semaphore, int i10) {
        if (i10 == 0) {
            AbstractC0700h0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            AbstractC0700h0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
        }
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(I0 i02, n.a aVar) {
        this.f14890f.f(i02, aVar);
    }

    private static boolean o(SurfaceView surfaceView, Size size, I0 i02) {
        return surfaceView != null && Objects.equals(size, i02.p());
    }

    @Override // androidx.camera.view.n
    View b() {
        return this.f14889e;
    }

    @Override // androidx.camera.view.n
    Bitmap c() {
        SurfaceView surfaceView = this.f14889e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f14889e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.f14889e.getWidth(), this.f14889e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f14889e, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.v
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                w.m(semaphore, i10);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    AbstractC0700h0.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e10) {
                AbstractC0700h0.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            }
            return createBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.n
    void d() {
    }

    @Override // androidx.camera.view.n
    void e() {
    }

    @Override // androidx.camera.view.n
    void g(final I0 i02, final n.a aVar) {
        if (!o(this.f14889e, this.f14864a, i02)) {
            this.f14864a = i02.p();
            l();
        }
        if (aVar != null) {
            i02.j(androidx.core.content.a.h(this.f14889e.getContext()), new Runnable() { // from class: androidx.camera.view.t
                @Override // java.lang.Runnable
                public final void run() {
                    n.a.this.a();
                }
            });
        }
        this.f14889e.post(new Runnable() { // from class: androidx.camera.view.u
            @Override // java.lang.Runnable
            public final void run() {
                w.this.n(i02, aVar);
            }
        });
    }

    @Override // androidx.camera.view.n
    h8.d i() {
        return G.n.p(null);
    }

    void l() {
        y0.f.g(this.f14865b);
        y0.f.g(this.f14864a);
        SurfaceView surfaceView = new SurfaceView(this.f14865b.getContext());
        this.f14889e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f14864a.getWidth(), this.f14864a.getHeight()));
        this.f14865b.removeAllViews();
        this.f14865b.addView(this.f14889e);
        this.f14889e.getHolder().addCallback(this.f14890f);
    }
}
