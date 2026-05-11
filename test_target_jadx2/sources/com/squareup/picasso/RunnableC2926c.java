package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.s;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;

/* renamed from: com.squareup.picasso.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2926c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final Object f29551t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static final ThreadLocal f29552u = new a();

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f29553v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    private static final z f29554w = new b();

    /* renamed from: a, reason: collision with root package name */
    final int f29555a = f29553v.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    final u f29556b;

    /* renamed from: c, reason: collision with root package name */
    final i f29557c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC2927d f29558d;

    /* renamed from: e, reason: collision with root package name */
    final B f29559e;

    /* renamed from: f, reason: collision with root package name */
    final String f29560f;

    /* renamed from: g, reason: collision with root package name */
    final x f29561g;

    /* renamed from: h, reason: collision with root package name */
    final int f29562h;

    /* renamed from: i, reason: collision with root package name */
    int f29563i;

    /* renamed from: j, reason: collision with root package name */
    final z f29564j;

    /* renamed from: k, reason: collision with root package name */
    AbstractC2924a f29565k;

    /* renamed from: l, reason: collision with root package name */
    List f29566l;

    /* renamed from: m, reason: collision with root package name */
    Bitmap f29567m;

    /* renamed from: n, reason: collision with root package name */
    Future f29568n;

    /* renamed from: o, reason: collision with root package name */
    u.e f29569o;

    /* renamed from: p, reason: collision with root package name */
    Exception f29570p;

    /* renamed from: q, reason: collision with root package name */
    int f29571q;

    /* renamed from: r, reason: collision with root package name */
    int f29572r;

    /* renamed from: s, reason: collision with root package name */
    u.f f29573s;

    /* renamed from: com.squareup.picasso.c$a */
    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    static class b extends z {
        b() {
        }

        @Override // com.squareup.picasso.z
        public boolean c(x xVar) {
            return true;
        }

        @Override // com.squareup.picasso.z
        public z.a f(x xVar, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + xVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    static class RunnableC0436c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RuntimeException f29574a;

        RunnableC0436c(F f10, RuntimeException runtimeException) {
            this.f29574a = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            new StringBuilder().append("Transformation ");
            throw null;
        }
    }

    RunnableC2926c(u uVar, i iVar, InterfaceC2927d interfaceC2927d, B b10, AbstractC2924a abstractC2924a, z zVar) {
        this.f29556b = uVar;
        this.f29557c = iVar;
        this.f29558d = interfaceC2927d;
        this.f29559e = b10;
        this.f29565k = abstractC2924a;
        this.f29560f = abstractC2924a.d();
        this.f29561g = abstractC2924a.i();
        this.f29573s = abstractC2924a.h();
        this.f29562h = abstractC2924a.e();
        this.f29563i = abstractC2924a.f();
        this.f29564j = zVar;
        this.f29572r = zVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        if (list.size() <= 0) {
            return bitmap;
        }
        android.support.v4.media.session.b.a(list.get(0));
        try {
            throw null;
        } catch (RuntimeException e10) {
            u.f29623o.post(new RunnableC0436c(null, e10));
            return null;
        }
    }

    private u.f d() {
        u.f fVar = u.f.LOW;
        List list = this.f29566l;
        boolean z10 = (list == null || list.isEmpty()) ? false : true;
        AbstractC2924a abstractC2924a = this.f29565k;
        if (abstractC2924a == null && !z10) {
            return fVar;
        }
        if (abstractC2924a != null) {
            fVar = abstractC2924a.h();
        }
        if (z10) {
            int size = this.f29566l.size();
            for (int i10 = 0; i10 < size; i10++) {
                u.f h10 = ((AbstractC2924a) this.f29566l.get(i10)).h();
                if (h10.ordinal() > fVar.ordinal()) {
                    fVar = h10;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(b0 b0Var, x xVar) {
        InterfaceC3879g c10 = M.c(b0Var);
        boolean r10 = G.r(c10);
        boolean z10 = xVar.f29680r;
        BitmapFactory.Options d10 = z.d(xVar);
        boolean g10 = z.g(d10);
        if (r10) {
            byte[] n02 = c10.n0();
            if (g10) {
                BitmapFactory.decodeByteArray(n02, 0, n02.length, d10);
                z.b(xVar.f29670h, xVar.f29671i, d10, xVar);
            }
            return BitmapFactory.decodeByteArray(n02, 0, n02.length, d10);
        }
        InputStream a22 = c10.a2();
        if (g10) {
            o oVar = new o(a22);
            oVar.a(false);
            long c11 = oVar.c(1024);
            BitmapFactory.decodeStream(oVar, null, d10);
            z.b(xVar.f29670h, xVar.f29671i, d10, xVar);
            oVar.b(c11);
            oVar.a(true);
            a22 = oVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(a22, null, d10);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static RunnableC2926c g(u uVar, i iVar, InterfaceC2927d interfaceC2927d, B b10, AbstractC2924a abstractC2924a) {
        x i10 = abstractC2924a.i();
        List h10 = uVar.h();
        int size = h10.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) h10.get(i11);
            if (zVar.c(i10)) {
                return new RunnableC2926c(uVar, iVar, interfaceC2927d, b10, abstractC2924a, zVar);
            }
        }
        return new RunnableC2926c(uVar, iVar, interfaceC2927d, b10, abstractC2924a, f29554w);
    }

    static int l(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || (i12 != 0 && i10 > i12) || (i13 != 0 && i11 > i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Bitmap y(x xVar, Bitmap bitmap, int i10) {
        int i11;
        int i12;
        boolean z10;
        Matrix matrix;
        int i13;
        int i14;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        int i16;
        float f18;
        float f19;
        float f20;
        int i17;
        int i18;
        float f21;
        boolean z11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z12 = xVar.f29675m;
        Matrix matrix2 = new Matrix();
        if (xVar.e() || i10 != 0) {
            int i25 = xVar.f29670h;
            int i26 = xVar.f29671i;
            float f22 = xVar.f29676n;
            if (f22 != 0.0f) {
                double d10 = f22;
                double cos = Math.cos(Math.toRadians(d10));
                double sin = Math.sin(Math.toRadians(d10));
                if (xVar.f29679q) {
                    matrix2.setRotate(f22, xVar.f29677o, xVar.f29678p);
                    float f23 = xVar.f29677o;
                    double d11 = 1.0d - cos;
                    float f24 = xVar.f29678p;
                    i12 = height;
                    z10 = z12;
                    double d12 = (f23 * d11) + (f24 * sin);
                    double d13 = (f24 * d11) - (f23 * sin);
                    int i27 = xVar.f29670h;
                    double d14 = (i27 * cos) + d12;
                    double d15 = (i27 * sin) + d13;
                    int i28 = xVar.f29671i;
                    i11 = width;
                    double d16 = (d12 + (i27 * cos)) - (i28 * sin);
                    double d17 = (i27 * sin) + d13 + (i28 * cos);
                    double d18 = d12 - (i28 * sin);
                    double d19 = (i28 * cos) + d13;
                    double max = Math.max(d18, Math.max(d16, Math.max(d12, d14)));
                    double min = Math.min(d18, Math.min(d16, Math.min(d12, d14)));
                    double max2 = Math.max(d19, Math.max(d17, Math.max(d13, d15)));
                    double min2 = Math.min(d19, Math.min(d17, Math.min(d13, d15)));
                    i25 = (int) Math.floor(max - min);
                    i26 = (int) Math.floor(max2 - min2);
                    matrix = matrix2;
                } else {
                    i11 = width;
                    i12 = height;
                    z10 = z12;
                    matrix = matrix2;
                    matrix.setRotate(f22);
                    int i29 = xVar.f29670h;
                    double d20 = i29 * cos;
                    double d21 = i29 * sin;
                    int i30 = xVar.f29671i;
                    double d22 = (i29 * cos) - (i30 * sin);
                    double d23 = (i29 * sin) + (i30 * cos);
                    double d24 = -(i30 * sin);
                    double d25 = i30 * cos;
                    double max3 = Math.max(d24, Math.max(d22, Math.max(0.0d, d20)));
                    double min3 = Math.min(d24, Math.min(d22, Math.min(0.0d, d20)));
                    double max4 = Math.max(d25, Math.max(d23, Math.max(0.0d, d21)));
                    double min4 = Math.min(d25, Math.min(d23, Math.min(0.0d, d21)));
                    int floor = (int) Math.floor(max3 - min3);
                    i26 = (int) Math.floor(max4 - min4);
                    i25 = floor;
                }
            } else {
                i11 = width;
                i12 = height;
                z10 = z12;
                matrix = matrix2;
            }
            if (i10 != 0) {
                int l10 = l(i10);
                int m10 = m(i10);
                if (l10 != 0) {
                    matrix.preRotate(l10);
                    if (l10 == 90 || l10 == 270) {
                        int i31 = i26;
                        i26 = i25;
                        i25 = i31;
                    }
                }
                if (m10 != 1) {
                    matrix.postScale(m10, 1.0f);
                }
            }
            if (xVar.f29672j) {
                if (i25 != 0) {
                    i15 = i11;
                    f18 = i25 / i15;
                    i16 = i12;
                } else {
                    i15 = i11;
                    i16 = i12;
                    f18 = i26 / i16;
                }
                if (i26 != 0) {
                    f19 = i26;
                    f20 = i16;
                } else {
                    f19 = i25;
                    f20 = i15;
                }
                float f25 = f19 / f20;
                if (f18 > f25) {
                    int ceil = (int) Math.ceil(i16 * (f25 / f18));
                    int i32 = xVar.f29673k;
                    f21 = i26 / ceil;
                    i18 = ceil;
                    z11 = z10;
                    i20 = 0;
                    i19 = (i32 & 48) == 48 ? 0 : (i32 & 80) == 80 ? i16 - ceil : (i16 - ceil) / 2;
                    i17 = i15;
                } else if (f18 < f25) {
                    int ceil2 = (int) Math.ceil(i15 * (f18 / f25));
                    int i33 = xVar.f29673k;
                    i20 = (i33 & 3) == 3 ? 0 : (i33 & 5) == 5 ? i15 - ceil2 : (i15 - ceil2) / 2;
                    i17 = ceil2;
                    i18 = i16;
                    f18 = i25 / ceil2;
                    z11 = z10;
                    f21 = f25;
                    i19 = 0;
                } else {
                    i17 = i15;
                    i18 = i16;
                    f18 = f25;
                    f21 = f18;
                    z11 = z10;
                    i19 = 0;
                    i20 = 0;
                }
                if (v(z11, i15, i16, i25, i26)) {
                    matrix.preScale(f18, f21);
                }
                i21 = i19;
                i22 = i18;
                i23 = i20;
                i24 = i17;
                createBitmap = Bitmap.createBitmap(bitmap, i23, i21, i24, i22, matrix, true);
                if (createBitmap != bitmap) {
                    return bitmap;
                }
                bitmap.recycle();
                return createBitmap;
            }
            i13 = i12;
            boolean z13 = z10;
            i14 = i11;
            if (xVar.f29674l) {
                if (i25 != 0) {
                    f14 = i25;
                    f15 = i14;
                } else {
                    f14 = i26;
                    f15 = i13;
                }
                float f26 = f14 / f15;
                if (i26 != 0) {
                    f16 = i26;
                    f17 = i13;
                } else {
                    f16 = i25;
                    f17 = i14;
                }
                float f27 = f16 / f17;
                if (f26 >= f27) {
                    f26 = f27;
                }
                if (v(z13, i14, i13, i25, i26)) {
                    matrix.preScale(f26, f26);
                }
            } else if ((i25 != 0 || i26 != 0) && (i25 != i14 || i26 != i13)) {
                if (i25 != 0) {
                    f10 = i25;
                    f11 = i14;
                } else {
                    f10 = i26;
                    f11 = i13;
                }
                float f28 = f10 / f11;
                if (i26 != 0) {
                    f12 = i26;
                    f13 = i13;
                } else {
                    f12 = i25;
                    f13 = i14;
                }
                float f29 = f12 / f13;
                if (v(z13, i14, i13, i25, i26)) {
                    matrix.preScale(f28, f29);
                }
            }
        } else {
            i14 = width;
            i13 = height;
            matrix = matrix2;
        }
        i24 = i14;
        i22 = i13;
        i23 = 0;
        i21 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i23, i21, i24, i22, matrix, true);
        if (createBitmap != bitmap) {
        }
    }

    static void z(x xVar) {
        String a10 = xVar.a();
        StringBuilder sb2 = (StringBuilder) f29552u.get();
        sb2.ensureCapacity(a10.length() + 8);
        sb2.replace(8, sb2.length(), a10);
        Thread.currentThread().setName(sb2.toString());
    }

    void b(AbstractC2924a abstractC2924a) {
        boolean z10 = this.f29556b.f29637m;
        x xVar = abstractC2924a.f29535b;
        if (this.f29565k == null) {
            this.f29565k = abstractC2924a;
            if (z10) {
                List list = this.f29566l;
                if (list == null || list.isEmpty()) {
                    G.t("Hunter", "joined", xVar.d(), "to empty hunter");
                    return;
                } else {
                    G.t("Hunter", "joined", xVar.d(), G.k(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.f29566l == null) {
            this.f29566l = new ArrayList(3);
        }
        this.f29566l.add(abstractC2924a);
        if (z10) {
            G.t("Hunter", "joined", xVar.d(), G.k(this, "to "));
        }
        u.f h10 = abstractC2924a.h();
        if (h10.ordinal() > this.f29573s.ordinal()) {
            this.f29573s = h10;
        }
    }

    boolean c() {
        Future future;
        if (this.f29565k != null) {
            return false;
        }
        List list = this.f29566l;
        return (list == null || list.isEmpty()) && (future = this.f29568n) != null && future.cancel(false);
    }

    void f(AbstractC2924a abstractC2924a) {
        boolean remove;
        if (this.f29565k == abstractC2924a) {
            this.f29565k = null;
            remove = true;
        } else {
            List list = this.f29566l;
            remove = list != null ? list.remove(abstractC2924a) : false;
        }
        if (remove && abstractC2924a.h() == this.f29573s) {
            this.f29573s = d();
        }
        if (this.f29556b.f29637m) {
            G.t("Hunter", "removed", abstractC2924a.f29535b.d(), G.k(this, "from "));
        }
    }

    AbstractC2924a h() {
        return this.f29565k;
    }

    List i() {
        return this.f29566l;
    }

    x j() {
        return this.f29561g;
    }

    Exception k() {
        return this.f29570p;
    }

    String n() {
        return this.f29560f;
    }

    u.e o() {
        return this.f29569o;
    }

    int p() {
        return this.f29562h;
    }

    u q() {
        return this.f29556b;
    }

    u.f r() {
        return this.f29573s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f29561g);
                        if (this.f29556b.f29637m) {
                            G.s("Hunter", "executing", G.j(this));
                        }
                        Bitmap t10 = t();
                        this.f29567m = t10;
                        if (t10 == null) {
                            this.f29557c.e(this);
                        } else {
                            this.f29557c.d(this);
                        }
                    } catch (IOException e10) {
                        this.f29570p = e10;
                        this.f29557c.g(this);
                    }
                } catch (s.b e11) {
                    if (!r.isOfflineOnly(e11.f29619b) || e11.f29618a != 504) {
                        this.f29570p = e11;
                    }
                    this.f29557c.e(this);
                }
            } catch (Exception e12) {
                this.f29570p = e12;
                this.f29557c.e(this);
            } catch (OutOfMemoryError e13) {
                StringWriter stringWriter = new StringWriter();
                this.f29559e.a().a(new PrintWriter(stringWriter));
                this.f29570p = new RuntimeException(stringWriter.toString(), e13);
                this.f29557c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    Bitmap s() {
        return this.f29567m;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Bitmap t() {
        Bitmap bitmap;
        if (q.shouldReadFromMemoryCache(this.f29562h)) {
            bitmap = this.f29558d.a(this.f29560f);
            if (bitmap != null) {
                this.f29559e.d();
                this.f29569o = u.e.MEMORY;
                if (this.f29556b.f29637m) {
                    G.t("Hunter", "decoded", this.f29561g.d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i10 = this.f29572r == 0 ? r.OFFLINE.index : this.f29563i;
        this.f29563i = i10;
        z.a f10 = this.f29564j.f(this.f29561g, i10);
        if (f10 != null) {
            this.f29569o = f10.c();
            this.f29571q = f10.b();
            bitmap = f10.a();
            if (bitmap == null) {
                b0 d10 = f10.d();
                try {
                    bitmap = e(d10, this.f29561g);
                } finally {
                    try {
                        d10.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f29556b.f29637m) {
                G.s("Hunter", "decoded", this.f29561g.d());
            }
            this.f29559e.b(bitmap);
            if (this.f29561g.f() || this.f29571q != 0) {
                synchronized (f29551t) {
                    try {
                        if (!this.f29561g.e()) {
                            if (this.f29571q != 0) {
                            }
                            if (this.f29561g.b()) {
                                bitmap = a(this.f29561g.f29669g, bitmap);
                                if (this.f29556b.f29637m) {
                                    G.t("Hunter", "transformed", this.f29561g.d(), "from custom transformations");
                                }
                            }
                        }
                        bitmap = y(this.f29561g, bitmap, this.f29571q);
                        if (this.f29556b.f29637m) {
                            G.s("Hunter", "transformed", this.f29561g.d());
                        }
                        if (this.f29561g.b()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    this.f29559e.c(bitmap);
                }
            }
        }
        return bitmap;
    }

    boolean u() {
        Future future = this.f29568n;
        return future != null && future.isCancelled();
    }

    boolean w(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f29572r;
        if (i10 <= 0) {
            return false;
        }
        this.f29572r = i10 - 1;
        return this.f29564j.h(z10, networkInfo);
    }

    boolean x() {
        return this.f29564j.i();
    }
}
