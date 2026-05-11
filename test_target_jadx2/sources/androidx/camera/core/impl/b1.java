package androidx.camera.core.impl;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class b1 {

    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        a(int i10) {
            this.mId = i10;
        }

        int getId() {
            return this.mId;
        }
    }

    public enum b {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    b1() {
    }

    public static b1 a(b bVar, a aVar) {
        return new C1446l(bVar, aVar, 0L);
    }

    public static b1 b(b bVar, a aVar, long j10) {
        return new C1446l(bVar, aVar, j10);
    }

    public static b e(int i10) {
        return i10 == 35 ? b.YUV : i10 == 256 ? b.JPEG : i10 == 4101 ? b.JPEG_R : i10 == 32 ? b.RAW : b.PRIV;
    }

    public static b1 h(int i10, int i11, Size size, c1 c1Var) {
        b e10 = e(i11);
        a aVar = a.NOT_SUPPORT;
        int c10 = L.d.c(size);
        if (i10 == 1) {
            if (c10 <= L.d.c(c1Var.i(i11))) {
                aVar = a.s720p;
            } else if (c10 <= L.d.c(c1Var.g(i11))) {
                aVar = a.s1440p;
            }
        } else if (c10 <= L.d.c(c1Var.b())) {
            aVar = a.VGA;
        } else if (c10 <= L.d.c(c1Var.e())) {
            aVar = a.PREVIEW;
        } else if (c10 <= L.d.c(c1Var.f())) {
            aVar = a.RECORD;
        } else if (c10 <= L.d.c(c1Var.c(i11))) {
            aVar = a.MAXIMUM;
        } else {
            Size k10 = c1Var.k(i11);
            if (k10 != null && c10 <= L.d.c(k10)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(e10, aVar);
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public final boolean g(b1 b1Var) {
        return b1Var.c().getId() <= c().getId() && b1Var.d() == d();
    }
}
