package T;

import A.AbstractC0700h0;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.camera.core.n;
import androidx.camera.core.o;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private final ImageWriter f9116b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1458r0 f9117c;

    /* renamed from: e, reason: collision with root package name */
    private final Surface f9119e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9120f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9121g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f9115a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f9118d = false;

    /* renamed from: h, reason: collision with root package name */
    long f9122h = -1;

    static final class a {
        static void a(Image image, long j10) {
            image.setTimestamp(j10);
        }
    }

    /* renamed from: T.b$b, reason: collision with other inner class name */
    static final class C0179b {
        static void a(ImageWriter imageWriter) {
            imageWriter.close();
        }

        static ImageWriter b(Surface surface, int i10, int i11) {
            ImageWriter newInstance;
            newInstance = ImageWriter.newInstance(surface, i10, i11);
            return newInstance;
        }

        static void c(ImageWriter imageWriter, Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public b(Surface surface, Size size, boolean z10) {
        this.f9121g = z10;
        boolean z11 = androidx.camera.extensions.internal.compat.quirk.a.b(CaptureOutputSurfaceOccupiedQuirk.class) != null || z10;
        this.f9120f = z11;
        if (Build.VERSION.SDK_INT < 29 || !z11) {
            this.f9119e = surface;
            this.f9117c = null;
            this.f9116b = null;
        } else {
            AbstractC0700h0.a("CaptureOutputSurface", "Enabling intermediate surface");
            InterfaceC1458r0 a10 = o.a(size.getWidth(), size.getHeight(), 35, 2);
            this.f9117c = a10;
            this.f9119e = a10.a();
            this.f9116b = C0179b.b(surface, 2, 35);
            a10.h(new InterfaceC1458r0.a() { // from class: T.a
                @Override // androidx.camera.core.impl.InterfaceC1458r0.a
                public final void a(InterfaceC1458r0 interfaceC1458r0) {
                    b.this.d(interfaceC1458r0);
                }
            }, F.c.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(InterfaceC1458r0 interfaceC1458r0) {
        Image E12;
        synchronized (this.f9115a) {
            try {
                if (this.f9118d) {
                    return;
                }
                n g10 = interfaceC1458r0.g();
                if (g10 != null && (E12 = g10.E1()) != null) {
                    if (this.f9121g) {
                        long j10 = this.f9122h;
                        if (j10 != -1) {
                            a.a(E12, j10);
                        }
                    }
                    C0179b.c(this.f9116b, E12);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f9115a) {
            try {
                this.f9118d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f9120f) {
                    this.f9117c.e();
                    this.f9117c.close();
                    C0179b.a(this.f9116b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface c() {
        return this.f9119e;
    }

    public void e(long j10) {
        if (this.f9121g) {
            this.f9122h = j10;
        }
    }
}
