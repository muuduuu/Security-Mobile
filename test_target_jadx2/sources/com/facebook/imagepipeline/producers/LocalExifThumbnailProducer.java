package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import c3.AbstractC1721a;
import f3.AbstractC3142a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import q4.C3919a;

/* loaded from: classes.dex */
public class LocalExifThumbnailProducer implements u0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20804a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.i f20805b;

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f20806c;

    private class Api24Utils {
        ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }

        private Api24Utils() {
        }
    }

    class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m4.b f20808f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1847n interfaceC1847n, g0 g0Var, e0 e0Var, String str, m4.b bVar) {
            super(interfaceC1847n, g0Var, e0Var, str);
            this.f20808f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z2.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(g4.i iVar) {
            g4.i.c(iVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(g4.i iVar) {
            return b3.g.of("createdThumbnail", Boolean.toString(iVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z2.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public g4.i c() {
            ExifInterface g10 = LocalExifThumbnailProducer.this.g(this.f20808f.u());
            if (g10 == null || !g10.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f20805b.b((byte[]) b3.l.g(g10.getThumbnail())), g10);
        }
    }

    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20810a;

        b(m0 m0Var) {
            this.f20810a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20810a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, e3.i iVar, ContentResolver contentResolver) {
        this.f20804a = executor;
        this.f20805b = iVar;
        this.f20806c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g4.i e(e3.h hVar, ExifInterface exifInterface) {
        Pair b10 = C3919a.b(new e3.j(hVar));
        int h10 = h(exifInterface);
        int intValue = b10 != null ? ((Integer) b10.first).intValue() : -1;
        int intValue2 = b10 != null ? ((Integer) b10.second).intValue() : -1;
        AbstractC3142a y10 = AbstractC3142a.y(hVar);
        try {
            g4.i iVar = new g4.i(y10);
            AbstractC3142a.n(y10);
            iVar.Q(S3.b.f8722b);
            iVar.i0(h10);
            iVar.z0(intValue);
            iVar.N(intValue2);
            return iVar;
        } catch (Throwable th) {
            AbstractC3142a.n(y10);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return q4.e.a(Integer.parseInt((String) b3.l.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g0 p10 = e0Var.p();
        m4.b c10 = e0Var.c();
        e0Var.f("local", "exif");
        a aVar = new a(interfaceC1847n, p10, e0Var, "LocalExifThumbnailProducer", c10);
        e0Var.d(new b(aVar));
        this.f20804a.execute(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean b(a4.f fVar) {
        return v0.b(512, 512, fVar);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String e10 = j3.f.e(this.f20806c, uri);
        if (e10 == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            AbstractC1721a.i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(e10)) {
            return new ExifInterface(e10);
        }
        AssetFileDescriptor a10 = j3.f.a(this.f20806c, uri);
        if (a10 != null) {
            ExifInterface a11 = new Api24Utils().a(a10.getFileDescriptor());
            a10.close();
            return a11;
        }
        return null;
    }
}
