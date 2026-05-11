package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.u;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: u, reason: collision with root package name */
    private static final long f29662u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f29663a;

    /* renamed from: b, reason: collision with root package name */
    long f29664b;

    /* renamed from: c, reason: collision with root package name */
    int f29665c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f29666d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29667e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29668f;

    /* renamed from: g, reason: collision with root package name */
    public final List f29669g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29670h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29671i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29672j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29673k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f29674l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f29675m;

    /* renamed from: n, reason: collision with root package name */
    public final float f29676n;

    /* renamed from: o, reason: collision with root package name */
    public final float f29677o;

    /* renamed from: p, reason: collision with root package name */
    public final float f29678p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29679q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f29680r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f29681s;

    /* renamed from: t, reason: collision with root package name */
    public final u.f f29682t;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f29683a;

        /* renamed from: b, reason: collision with root package name */
        private int f29684b;

        /* renamed from: c, reason: collision with root package name */
        private String f29685c;

        /* renamed from: d, reason: collision with root package name */
        private int f29686d;

        /* renamed from: e, reason: collision with root package name */
        private int f29687e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f29688f;

        /* renamed from: g, reason: collision with root package name */
        private int f29689g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f29690h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f29691i;

        /* renamed from: j, reason: collision with root package name */
        private float f29692j;

        /* renamed from: k, reason: collision with root package name */
        private float f29693k;

        /* renamed from: l, reason: collision with root package name */
        private float f29694l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f29695m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f29696n;

        /* renamed from: o, reason: collision with root package name */
        private List f29697o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f29698p;

        /* renamed from: q, reason: collision with root package name */
        private u.f f29699q;

        b(Uri uri, int i10, Bitmap.Config config) {
            this.f29683a = uri;
            this.f29684b = i10;
            this.f29698p = config;
        }

        public x a() {
            boolean z10 = this.f29690h;
            if (z10 && this.f29688f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f29688f && this.f29686d == 0 && this.f29687e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z10 && this.f29686d == 0 && this.f29687e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f29699q == null) {
                this.f29699q = u.f.NORMAL;
            }
            return new x(this.f29683a, this.f29684b, this.f29685c, this.f29697o, this.f29686d, this.f29687e, this.f29688f, this.f29690h, this.f29689g, this.f29691i, this.f29692j, this.f29693k, this.f29694l, this.f29695m, this.f29696n, this.f29698p, this.f29699q);
        }

        boolean b() {
            return (this.f29683a == null && this.f29684b == 0) ? false : true;
        }

        boolean c() {
            return this.f29699q != null;
        }

        boolean d() {
            return (this.f29686d == 0 && this.f29687e == 0) ? false : true;
        }

        public b e(u.f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("Priority invalid.");
            }
            if (this.f29699q != null) {
                throw new IllegalStateException("Priority already set.");
            }
            this.f29699q = fVar;
            return this;
        }

        public b f(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i11 == 0 && i10 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f29686d = i10;
            this.f29687e = i11;
            return this;
        }
    }

    String a() {
        Uri uri = this.f29666d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f29667e);
    }

    boolean b() {
        return this.f29669g != null;
    }

    public boolean c() {
        return (this.f29670h == 0 && this.f29671i == 0) ? false : true;
    }

    String d() {
        long nanoTime = System.nanoTime() - this.f29664b;
        if (nanoTime > f29662u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    boolean e() {
        return c() || this.f29676n != 0.0f;
    }

    boolean f() {
        return e() || b();
    }

    String g() {
        return "[R" + this.f29663a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f29667e;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f29666d);
        }
        List list = this.f29669g;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f29669g.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                sb2.append(' ');
                throw null;
            }
        }
        if (this.f29668f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f29668f);
            sb2.append(')');
        }
        if (this.f29670h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f29670h);
            sb2.append(',');
            sb2.append(this.f29671i);
            sb2.append(')');
        }
        if (this.f29672j) {
            sb2.append(" centerCrop");
        }
        if (this.f29674l) {
            sb2.append(" centerInside");
        }
        if (this.f29676n != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f29676n);
            if (this.f29679q) {
                sb2.append(" @ ");
                sb2.append(this.f29677o);
                sb2.append(',');
                sb2.append(this.f29678p);
            }
            sb2.append(')');
        }
        if (this.f29680r) {
            sb2.append(" purgeable");
        }
        if (this.f29681s != null) {
            sb2.append(' ');
            sb2.append(this.f29681s);
        }
        sb2.append('}');
        return sb2.toString();
    }

    private x(Uri uri, int i10, String str, List list, int i11, int i12, boolean z10, boolean z11, int i13, boolean z12, float f10, float f11, float f12, boolean z13, boolean z14, Bitmap.Config config, u.f fVar) {
        this.f29666d = uri;
        this.f29667e = i10;
        this.f29668f = str;
        if (list == null) {
            this.f29669g = null;
        } else {
            this.f29669g = Collections.unmodifiableList(list);
        }
        this.f29670h = i11;
        this.f29671i = i12;
        this.f29672j = z10;
        this.f29674l = z11;
        this.f29673k = i13;
        this.f29675m = z12;
        this.f29676n = f10;
        this.f29677o = f11;
        this.f29678p = f12;
        this.f29679q = z13;
        this.f29680r = z14;
        this.f29681s = config;
        this.f29682t = fVar;
    }
}
