package f9;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.SystemClock;
import b8.AbstractC1654a;
import b8.AbstractC1655b;
import b8.AbstractC1656c;
import b8.AbstractC1657d;
import b8.C1659f;
import e9.C3102a;
import java.nio.ByteBuffer;
import java.util.List;
import s7.G5;
import s7.I5;
import s7.K5;

/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3155b {
    public static C3102a a(C1659f c1659f) {
        C3102a a10;
        AbstractC1656c abstractC1656c = (AbstractC1656c) c1659f.a().get(0);
        int b10 = abstractC1656c.b();
        if (b10 != 1) {
            a10 = null;
            if (b10 == 2) {
                ByteBuffer a11 = AbstractC1655b.a(c1659f);
                int a12 = abstractC1656c.a();
                Integer num = a12 != 4 ? a12 != 5 ? null : 842094169 : 17;
                if (num != null) {
                    g(num.intValue(), 3, SystemClock.elapsedRealtime(), c1659f.getHeight(), c1659f.getWidth(), a11.limit(), c1659f.c());
                    a10 = C3102a.c(a11, c1659f.getWidth(), c1659f.getHeight(), c1659f.c(), num.intValue());
                }
            } else if (b10 == 3) {
                Image a13 = AbstractC1657d.a(c1659f);
                g(a13.getFormat(), 5, SystemClock.elapsedRealtime(), c1659f.getHeight(), c1659f.getWidth(), a13.getFormat() == 256 ? a13.getPlanes()[0].getBuffer().limit() : (a13.getPlanes()[0].getBuffer().limit() * 3) / 2, c1659f.c());
                a10 = C3102a.d(a13, c1659f.c());
            }
        } else {
            Bitmap a14 = AbstractC1654a.a(c1659f);
            g(-1, 1, SystemClock.elapsedRealtime(), c1659f.getHeight(), c1659f.getWidth(), a14.getAllocationByteCount(), c1659f.c());
            a10 = C3102a.a(a14, c1659f.c());
        }
        if (a10 != null) {
            K5.a();
        }
        return a10;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i10);
    }

    public static void c(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i10 = 0; i10 < pointArr.length; i10++) {
            Point point = pointArr[i10];
            int i11 = i10 + i10;
            fArr[i11] = point.x;
            fArr[i11 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            int i13 = i12 + i12;
            pointArr[i12].set((int) fArr[i13], (int) fArr[i13 + 1]);
        }
    }

    public static void d(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void e(List list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 + i10;
            fArr[i11] = ((PointF) list.get(i10)).x;
            fArr[i11 + 1] = ((PointF) list.get(i10)).y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < list.size(); i12++) {
            int i13 = i12 + i12;
            ((PointF) list.get(i12)).set(fArr[i13], fArr[i13 + 1]);
        }
    }

    public static void f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void g(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        I5.b(G5.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }
}
