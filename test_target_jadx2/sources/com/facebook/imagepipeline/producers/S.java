package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import d3.C2976a;
import f3.AbstractC3142a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class S implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20815a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f20816b;

    class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f20817f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0 f20818g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ m4.b f20819h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f20820i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1847n interfaceC1847n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, m4.b bVar, CancellationSignal cancellationSignal) {
            super(interfaceC1847n, g0Var, e0Var, str);
            this.f20817f = g0Var2;
            this.f20818g = e0Var2;
            this.f20819h = bVar;
            this.f20820i = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.m0, Z2.h
        protected void d() {
            super.d();
            this.f20820i.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.m0, Z2.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f20817f.c(this.f20818g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f20818g.f("local", "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z2.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(AbstractC3142a abstractC3142a) {
            AbstractC3142a.n(abstractC3142a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(AbstractC3142a abstractC3142a) {
            return b3.g.of("createdThumbnail", String.valueOf(abstractC3142a != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z2.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC3142a c() {
            String str;
            Size size = new Size(this.f20819h.m(), this.f20819h.l());
            try {
                str = S.this.e(this.f20819h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? C2976a.c(C2976a.b(str)) ? ThumbnailUtils.createVideoThumbnail(new File(str), size, this.f20820i) : ThumbnailUtils.createImageThumbnail(new File(str), size, this.f20820i) : null;
            if (createVideoThumbnail == null) {
                createVideoThumbnail = S.this.f20816b.loadThumbnail(this.f20819h.u(), size, this.f20820i);
            }
            if (createVideoThumbnail == null) {
                return null;
            }
            g4.f d22 = g4.f.d2(createVideoThumbnail, Y3.f.b(), g4.m.f33552d, 0);
            this.f20818g.n("image_format", "thumbnail");
            d22.g(this.f20818g.getExtras());
            return AbstractC3142a.y(d22);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, Z2.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(AbstractC3142a abstractC3142a) {
            super.f(abstractC3142a);
            this.f20817f.c(this.f20818g, "LocalThumbnailBitmapSdk29Producer", abstractC3142a != null);
            this.f20818g.f("local", "thumbnail_bitmap");
        }
    }

    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20822a;

        b(m0 m0Var) {
            this.f20822a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20822a.a();
        }
    }

    public S(Executor executor, ContentResolver contentResolver) {
        this.f20815a = executor;
        this.f20816b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(m4.b bVar) {
        return j3.f.e(this.f20816b, bVar.u());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g0 p10 = e0Var.p();
        m4.b c10 = e0Var.c();
        e0Var.f("local", "thumbnail_bitmap");
        a aVar = new a(interfaceC1847n, p10, e0Var, "LocalThumbnailBitmapSdk29Producer", p10, e0Var, c10, new CancellationSignal());
        e0Var.d(new b(aVar));
        this.f20815a.execute(aVar);
    }
}
