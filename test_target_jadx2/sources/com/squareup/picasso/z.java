package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.u;
import pe.b0;

/* loaded from: classes2.dex */
public abstract class z {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final u.e f29713a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f29714b;

        /* renamed from: c, reason: collision with root package name */
        private final b0 f29715c;

        /* renamed from: d, reason: collision with root package name */
        private final int f29716d;

        public a(Bitmap bitmap, u.e eVar) {
            this((Bitmap) G.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.f29714b;
        }

        int b() {
            return this.f29716d;
        }

        public u.e c() {
            return this.f29713a;
        }

        public b0 d() {
            return this.f29715c;
        }

        public a(b0 b0Var, u.e eVar) {
            this(null, (b0) G.d(b0Var, "source == null"), eVar, 0);
        }

        a(Bitmap bitmap, b0 b0Var, u.e eVar, int i10) {
            if ((bitmap != null) != (b0Var != null)) {
                this.f29714b = bitmap;
                this.f29715c = b0Var;
                this.f29713a = (u.e) G.d(eVar, "loadedFrom == null");
                this.f29716d = i10;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, x xVar) {
        int max;
        double floor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                floor = Math.floor(i12 / i10);
            } else if (i10 == 0) {
                floor = Math.floor(i13 / i11);
            } else {
                int floor2 = (int) Math.floor(i13 / i11);
                int floor3 = (int) Math.floor(i12 / i10);
                max = xVar.f29674l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    static void b(int i10, int i11, BitmapFactory.Options options, x xVar) {
        a(i10, i11, options.outWidth, options.outHeight, options, xVar);
    }

    static BitmapFactory.Options d(x xVar) {
        boolean c10 = xVar.c();
        boolean z10 = xVar.f29681s != null;
        if (!c10 && !z10 && !xVar.f29680r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c10;
        boolean z11 = xVar.f29680r;
        options.inInputShareable = z11;
        options.inPurgeable = z11;
        if (z10) {
            options.inPreferredConfig = xVar.f29681s;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(x xVar);

    int e() {
        return 0;
    }

    public abstract a f(x xVar, int i10);

    boolean h(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    boolean i() {
        return false;
    }
}
