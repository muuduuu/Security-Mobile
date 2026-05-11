package androidx.camera.view;

import A.AbstractC0700h0;
import A.I0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.n;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
final class D extends n {

    /* renamed from: e, reason: collision with root package name */
    TextureView f14797e;

    /* renamed from: f, reason: collision with root package name */
    SurfaceTexture f14798f;

    /* renamed from: g, reason: collision with root package name */
    h8.d f14799g;

    /* renamed from: h, reason: collision with root package name */
    I0 f14800h;

    /* renamed from: i, reason: collision with root package name */
    boolean f14801i;

    /* renamed from: j, reason: collision with root package name */
    SurfaceTexture f14802j;

    /* renamed from: k, reason: collision with root package name */
    AtomicReference f14803k;

    /* renamed from: l, reason: collision with root package name */
    n.a f14804l;

    /* renamed from: m, reason: collision with root package name */
    Executor f14805m;

    class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.D$a$a, reason: collision with other inner class name */
        class C0250a implements G.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f14807a;

            C0250a(SurfaceTexture surfaceTexture) {
                this.f14807a = surfaceTexture;
            }

            @Override // G.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(I0.g gVar) {
                y0.f.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                AbstractC0700h0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f14807a.release();
                D d10 = D.this;
                if (d10.f14802j != null) {
                    d10.f14802j = null;
                }
            }

            @Override // G.c
            public void onFailure(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            AbstractC0700h0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            D d10 = D.this;
            d10.f14798f = surfaceTexture;
            if (d10.f14799g == null) {
                d10.u();
                return;
            }
            y0.f.g(d10.f14800h);
            AbstractC0700h0.a("TextureViewImpl", "Surface invalidated " + D.this.f14800h);
            D.this.f14800h.m().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            D d10 = D.this;
            d10.f14798f = null;
            h8.d dVar = d10.f14799g;
            if (dVar == null) {
                AbstractC0700h0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            G.n.j(dVar, new C0250a(surfaceTexture), androidx.core.content.a.h(D.this.f14797e.getContext()));
            D.this.f14802j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            AbstractC0700h0.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a aVar = (c.a) D.this.f14803k.getAndSet(null);
            if (aVar != null) {
                aVar.c(null);
            }
            D.this.getClass();
            Executor executor = D.this.f14805m;
        }
    }

    D(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f14801i = false;
        this.f14803k = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(I0 i02) {
        I0 i03 = this.f14800h;
        if (i03 != null && i03 == i02) {
            this.f14800h = null;
            this.f14799g = null;
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(Surface surface, final c.a aVar) {
        AbstractC0700h0.a("TextureViewImpl", "Surface set on Preview.");
        I0 i02 = this.f14800h;
        Executor b10 = F.c.b();
        Objects.requireNonNull(aVar);
        i02.D(surface, b10, new InterfaceC5159a() { // from class: androidx.camera.view.C
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                c.a.this.c((I0.g) obj);
            }
        });
        return "provideSurface[request=" + this.f14800h + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Surface surface, h8.d dVar, I0 i02) {
        AbstractC0700h0.a("TextureViewImpl", "Safe to release surface.");
        s();
        surface.release();
        if (this.f14799g == dVar) {
            this.f14799g = null;
        }
        if (this.f14800h == i02) {
            this.f14800h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(c.a aVar) {
        this.f14803k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void s() {
        n.a aVar = this.f14804l;
        if (aVar != null) {
            aVar.a();
            this.f14804l = null;
        }
    }

    private void t() {
        if (!this.f14801i || this.f14802j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f14797e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f14802j;
        if (surfaceTexture != surfaceTexture2) {
            this.f14797e.setSurfaceTexture(surfaceTexture2);
            this.f14802j = null;
            this.f14801i = false;
        }
    }

    @Override // androidx.camera.view.n
    View b() {
        return this.f14797e;
    }

    @Override // androidx.camera.view.n
    Bitmap c() {
        TextureView textureView = this.f14797e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f14797e.getBitmap();
    }

    @Override // androidx.camera.view.n
    void d() {
        t();
    }

    @Override // androidx.camera.view.n
    void e() {
        this.f14801i = true;
    }

    @Override // androidx.camera.view.n
    void g(final I0 i02, n.a aVar) {
        this.f14864a = i02.p();
        this.f14804l = aVar;
        n();
        I0 i03 = this.f14800h;
        if (i03 != null) {
            i03.G();
        }
        this.f14800h = i02;
        i02.j(androidx.core.content.a.h(this.f14797e.getContext()), new Runnable() { // from class: androidx.camera.view.y
            @Override // java.lang.Runnable
            public final void run() {
                D.this.o(i02);
            }
        });
        u();
    }

    @Override // androidx.camera.view.n
    h8.d i() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.view.z
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object r10;
                r10 = D.this.r(aVar);
                return r10;
            }
        });
    }

    public void n() {
        y0.f.g(this.f14865b);
        y0.f.g(this.f14864a);
        TextureView textureView = new TextureView(this.f14865b.getContext());
        this.f14797e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f14864a.getWidth(), this.f14864a.getHeight()));
        this.f14797e.setSurfaceTextureListener(new a());
        this.f14865b.removeAllViews();
        this.f14865b.addView(this.f14797e);
    }

    void u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f14864a;
        if (size == null || (surfaceTexture = this.f14798f) == null || this.f14800h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f14864a.getHeight());
        final Surface surface = new Surface(this.f14798f);
        final I0 i02 = this.f14800h;
        final h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.view.A
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object p10;
                p10 = D.this.p(surface, aVar);
                return p10;
            }
        });
        this.f14799g = a10;
        a10.e(new Runnable() { // from class: androidx.camera.view.B
            @Override // java.lang.Runnable
            public final void run() {
                D.this.q(surface, a10, i02);
            }
        }, androidx.core.content.a.h(this.f14797e.getContext()));
        f();
    }
}
