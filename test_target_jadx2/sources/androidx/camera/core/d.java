package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC1458r0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class d implements InterfaceC1458r0 {

    /* renamed from: a, reason: collision with root package name */
    private final ImageReader f14353a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14354b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f14355c = true;

    d(ImageReader imageReader) {
        this.f14353a = imageReader;
    }

    private boolean j(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(InterfaceC1458r0.a aVar) {
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Executor executor, final InterfaceC1458r0.a aVar, ImageReader imageReader) {
        synchronized (this.f14354b) {
            try {
                if (!this.f14355c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.this.k(aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public Surface a() {
        Surface surface;
        synchronized (this.f14354b) {
            surface = this.f14353a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public n c() {
        Image image;
        synchronized (this.f14354b) {
            try {
                image = this.f14353a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!j(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void close() {
        synchronized (this.f14354b) {
            this.f14353a.close();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int d() {
        int imageFormat;
        synchronized (this.f14354b) {
            imageFormat = this.f14353a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void e() {
        synchronized (this.f14354b) {
            this.f14355c = true;
            this.f14353a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int f() {
        int maxImages;
        synchronized (this.f14354b) {
            maxImages = this.f14353a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public n g() {
        Image image;
        synchronized (this.f14354b) {
            try {
                image = this.f14353a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!j(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getHeight() {
        int height;
        synchronized (this.f14354b) {
            height = this.f14353a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getWidth() {
        int width;
        synchronized (this.f14354b) {
            width = this.f14353a.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void h(final InterfaceC1458r0.a aVar, final Executor executor) {
        synchronized (this.f14354b) {
            this.f14355c = false;
            this.f14353a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.this.l(executor, aVar, imageReader);
                }
            }, E.m.a());
        }
    }
}
