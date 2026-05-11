package g9;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import f9.AbstractC3155b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t7.D0;
import t7.F1;
import t7.N5;
import t7.c6;
import t7.g6;
import t7.m6;
import t7.v6;
import t7.w6;

/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3201a {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f33590a;

    /* renamed from: b, reason: collision with root package name */
    private int f33591b;

    /* renamed from: c, reason: collision with root package name */
    private final float f33592c;

    /* renamed from: d, reason: collision with root package name */
    private final float f33593d;

    /* renamed from: e, reason: collision with root package name */
    private final float f33594e;

    /* renamed from: f, reason: collision with root package name */
    private final float f33595f;

    /* renamed from: g, reason: collision with root package name */
    private final float f33596g;

    /* renamed from: h, reason: collision with root package name */
    private final float f33597h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray f33598i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    private final SparseArray f33599j = new SparseArray();

    public C3201a(F1 f12, Matrix matrix) {
        float f10 = f12.f42496c;
        float f11 = f12.f42498e / 2.0f;
        float f13 = f12.f42497d;
        float f14 = f12.f42499f / 2.0f;
        Rect rect = new Rect((int) (f10 - f11), (int) (f13 - f14), (int) (f10 + f11), (int) (f13 + f14));
        this.f33590a = rect;
        if (matrix != null) {
            AbstractC3155b.f(rect, matrix);
        }
        this.f33591b = f12.f42495b;
        for (N5 n52 : f12.f42503j) {
            if (k(n52.f42634d)) {
                PointF pointF = new PointF(n52.f42632b, n52.f42633c);
                if (matrix != null) {
                    AbstractC3155b.d(pointF, matrix);
                }
                SparseArray sparseArray = this.f33598i;
                int i10 = n52.f42634d;
                sparseArray.put(i10, new C3206f(i10, pointF));
            }
        }
        for (D0 d02 : f12.f42507n) {
            int i11 = d02.f42458b;
            if (j(i11)) {
                PointF[] pointFArr = d02.f42457a;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r5 / 10);
                ArrayList arrayList = new ArrayList(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    AbstractC3155b.e(arrayList, matrix);
                }
                this.f33599j.put(i11, new C3202b(i11, arrayList));
            }
        }
        this.f33595f = f12.f42502i;
        this.f33596g = f12.f42500g;
        this.f33597h = f12.f42501h;
        this.f33594e = f12.f42506m;
        this.f33593d = f12.f42504k;
        this.f33592c = f12.f42505l;
    }

    private static boolean j(int i10) {
        return i10 <= 15 && i10 > 0;
    }

    private static boolean k(int i10) {
        return i10 == 0 || i10 == 1 || i10 == 7 || i10 == 3 || i10 == 9 || i10 == 4 || i10 == 10 || i10 == 5 || i10 == 11 || i10 == 6;
    }

    public Rect a() {
        return this.f33590a;
    }

    public C3202b b(int i10) {
        return (C3202b) this.f33599j.get(i10);
    }

    public float c() {
        return this.f33595f;
    }

    public float d() {
        return this.f33596g;
    }

    public float e() {
        return this.f33597h;
    }

    public C3206f f(int i10) {
        return (C3206f) this.f33598i.get(i10);
    }

    public final SparseArray g() {
        return this.f33599j;
    }

    public final void h(SparseArray sparseArray) {
        this.f33599j.clear();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            this.f33599j.put(sparseArray.keyAt(i10), (C3202b) sparseArray.valueAt(i10));
        }
    }

    public final void i(int i10) {
        this.f33591b = -1;
    }

    public String toString() {
        v6 a10 = w6.a(HVRetakeActivity.FACE_CALLING_ACTIVITY_VALUE);
        a10.c("boundingBox", this.f33590a);
        a10.b("trackingId", this.f33591b);
        a10.a("rightEyeOpenProbability", this.f33592c);
        a10.a("leftEyeOpenProbability", this.f33593d);
        a10.a("smileProbability", this.f33594e);
        a10.a("eulerX", this.f33595f);
        a10.a("eulerY", this.f33596g);
        a10.a("eulerZ", this.f33597h);
        v6 a11 = w6.a("Landmarks");
        for (int i10 = 0; i10 <= 11; i10++) {
            if (k(i10)) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("landmark_");
                sb2.append(i10);
                a11.c(sb2.toString(), f(i10));
            }
        }
        a10.c("landmarks", a11.toString());
        v6 a12 = w6.a("Contours");
        for (int i11 = 1; i11 <= 15; i11++) {
            StringBuilder sb3 = new StringBuilder(19);
            sb3.append("Contour_");
            sb3.append(i11);
            a12.c(sb3.toString(), b(i11));
        }
        a10.c("contours", a12.toString());
        return a10.toString();
    }

    public C3201a(g6 g6Var, Matrix matrix) {
        Rect g12 = g6Var.g1();
        this.f33590a = g12;
        if (matrix != null) {
            AbstractC3155b.f(g12, matrix);
        }
        this.f33591b = g6Var.a1();
        for (m6 m6Var : g6Var.m1()) {
            if (k(m6Var.j())) {
                PointF u10 = m6Var.u();
                if (matrix != null) {
                    AbstractC3155b.d(u10, matrix);
                }
                this.f33598i.put(m6Var.j(), new C3206f(m6Var.j(), u10));
            }
        }
        for (c6 c6Var : g6Var.i1()) {
            int j10 = c6Var.j();
            if (j(j10)) {
                List u11 = c6Var.u();
                u11.getClass();
                ArrayList arrayList = new ArrayList(u11);
                if (matrix != null) {
                    AbstractC3155b.e(arrayList, matrix);
                }
                this.f33599j.put(j10, new C3202b(j10, arrayList));
            }
        }
        this.f33595f = g6Var.Z0();
        this.f33596g = g6Var.u();
        this.f33597h = -g6Var.I();
        this.f33594e = g6Var.y0();
        this.f33593d = g6Var.j();
        this.f33592c = g6Var.F();
    }
}
