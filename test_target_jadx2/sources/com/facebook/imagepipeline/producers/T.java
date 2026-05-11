package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import f3.AbstractC3142a;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class T implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20824a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f20825b;

    class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f20826f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0 f20827g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ m4.b f20828h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1847n interfaceC1847n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, m4.b bVar) {
            super(interfaceC1847n, g0Var, e0Var, str);
            this.f20826f = g0Var2;
            this.f20827g = e0Var2;
            this.f20828h = bVar;
        }

        @Override // com.facebook.imagepipeline.producers.m0, Z2.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f20826f.c(this.f20827g, "VideoThumbnailProducer", false);
            this.f20827g.f("local", "video");
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
            try {
                str = T.this.i(this.f20828h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? ThumbnailUtils.createVideoThumbnail(str, T.g(this.f20828h)) : null;
            if (createVideoThumbnail == null) {
                createVideoThumbnail = T.h(T.this.f20825b, this.f20828h.u());
            }
            if (createVideoThumbnail == null) {
                return null;
            }
            g4.f d22 = g4.f.d2(createVideoThumbnail, Y3.f.b(), g4.m.f33552d, 0);
            this.f20827g.n("image_format", "thumbnail");
            d22.g(this.f20827g.getExtras());
            return AbstractC3142a.y(d22);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, Z2.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(AbstractC3142a abstractC3142a) {
            super.f(abstractC3142a);
            this.f20826f.c(this.f20827g, "VideoThumbnailProducer", abstractC3142a != null);
            this.f20827g.f("local", "video");
        }
    }

    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20830a;

        b(m0 m0Var) {
            this.f20830a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20830a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f20824a = executor;
        this.f20825b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(m4.b bVar) {
        return (bVar.m() > 96 || bVar.l() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            b3.l.g(openFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(m4.b bVar) {
        return j3.f.e(this.f20825b, bVar.u());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g0 p10 = e0Var.p();
        m4.b c10 = e0Var.c();
        e0Var.f("local", "video");
        a aVar = new a(interfaceC1847n, p10, e0Var, "VideoThumbnailProducer", p10, e0Var, c10);
        e0Var.d(new b(aVar));
        this.f20824a.execute(aVar);
    }
}
