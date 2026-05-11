package t;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import x.C5089d;

/* renamed from: t.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4545g1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Size f42073e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    private static final Size f42074f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    private static final Size f42075g = new Size(HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f42076h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile C4545g1 f42077i;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f42078a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Size f42079b = null;

    /* renamed from: c, reason: collision with root package name */
    private final x.l f42080c = new x.l();

    /* renamed from: d, reason: collision with root package name */
    private final C5089d f42081d = new C5089d();

    private C4545g1(Context context) {
        this.f42078a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size b10 = b();
        int width = b10.getWidth() * b10.getHeight();
        Size size = f42073e;
        if (width > size.getWidth() * size.getHeight()) {
            b10 = size;
        }
        return this.f42080c.a(b10);
    }

    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (L.d.d(size, f42074f) && (size = this.f42081d.a()) == null) {
            size = f42075g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static C4545g1 c(Context context) {
        if (f42077i == null) {
            synchronized (f42076h) {
                try {
                    if (f42077i == null) {
                        f42077i = new C4545g1(context);
                    }
                } finally {
                }
            }
        }
        return f42077i;
    }

    private Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f42078a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e10 = e(displays, z10);
        if (e10 == null && z10) {
            e10 = e(displays, false);
        }
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    Size f() {
        if (this.f42079b != null) {
            return this.f42079b;
        }
        this.f42079b = a();
        return this.f42079b;
    }

    void g() {
        this.f42079b = a();
    }
}
