package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.u;
import com.squareup.picasso.x;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f29700m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final u f29701a;

    /* renamed from: b, reason: collision with root package name */
    private final x.b f29702b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29703c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29704d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29705e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f29706f;

    /* renamed from: g, reason: collision with root package name */
    private int f29707g;

    /* renamed from: h, reason: collision with root package name */
    private int f29708h;

    /* renamed from: i, reason: collision with root package name */
    private int f29709i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f29710j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f29711k;

    /* renamed from: l, reason: collision with root package name */
    private Object f29712l;

    y(u uVar, Uri uri, int i10) {
        if (uVar.f29638n) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f29701a = uVar;
        this.f29702b = new x.b(uri, i10, uVar.f29635k);
    }

    private x b(long j10) {
        int andIncrement = f29700m.getAndIncrement();
        x a10 = this.f29702b.a();
        a10.f29663a = andIncrement;
        a10.f29664b = j10;
        boolean z10 = this.f29701a.f29637m;
        if (z10) {
            G.t("Main", "created", a10.g(), a10.toString());
        }
        x n10 = this.f29701a.n(a10);
        if (n10 != a10) {
            n10.f29663a = andIncrement;
            n10.f29664b = j10;
            if (z10) {
                G.t("Main", "changed", n10.d(), "into " + n10);
            }
        }
        return n10;
    }

    private Drawable e() {
        int i10 = this.f29706f;
        return i10 != 0 ? this.f29701a.f29628d.getDrawable(i10) : this.f29710j;
    }

    y a() {
        this.f29712l = null;
        return this;
    }

    public y c(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (this.f29707g != 0) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f29711k = drawable;
        return this;
    }

    public void d(InterfaceC2928e interfaceC2928e) {
        long nanoTime = System.nanoTime();
        if (this.f29704d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.f29702b.b()) {
            if (!this.f29702b.c()) {
                this.f29702b.e(u.f.LOW);
            }
            x b10 = b(nanoTime);
            String g10 = G.g(b10, new StringBuilder());
            if (!q.shouldReadFromMemoryCache(this.f29708h) || this.f29701a.k(g10) == null) {
                this.f29701a.m(new k(this.f29701a, b10, this.f29708h, this.f29709i, this.f29712l, g10, interfaceC2928e));
                return;
            }
            if (this.f29701a.f29637m) {
                G.t("Main", "completed", b10.g(), "from " + u.e.MEMORY);
            }
            if (interfaceC2928e != null) {
                interfaceC2928e.onSuccess();
            }
        }
    }

    public void f(ImageView imageView) {
        g(imageView, null);
    }

    public void g(ImageView imageView, InterfaceC2928e interfaceC2928e) {
        Bitmap k10;
        long nanoTime = System.nanoTime();
        G.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f29702b.b()) {
            this.f29701a.b(imageView);
            if (this.f29705e) {
                v.d(imageView, e());
                return;
            }
            return;
        }
        if (this.f29704d) {
            if (this.f29702b.d()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f29705e) {
                    v.d(imageView, e());
                }
                this.f29701a.e(imageView, new h(this, imageView, interfaceC2928e));
                return;
            }
            this.f29702b.f(width, height);
        }
        x b10 = b(nanoTime);
        String f10 = G.f(b10);
        if (!q.shouldReadFromMemoryCache(this.f29708h) || (k10 = this.f29701a.k(f10)) == null) {
            if (this.f29705e) {
                v.d(imageView, e());
            }
            this.f29701a.g(new m(this.f29701a, imageView, b10, this.f29708h, this.f29709i, this.f29707g, this.f29711k, f10, this.f29712l, interfaceC2928e, this.f29703c));
            return;
        }
        this.f29701a.b(imageView);
        u uVar = this.f29701a;
        Context context = uVar.f29628d;
        u.e eVar = u.e.MEMORY;
        v.c(imageView, context, k10, eVar, this.f29703c, uVar.f29636l);
        if (this.f29701a.f29637m) {
            G.t("Main", "completed", b10.g(), "from " + eVar);
        }
        if (interfaceC2928e != null) {
            interfaceC2928e.onSuccess();
        }
    }

    public void h(D d10) {
        Bitmap k10;
        long nanoTime = System.nanoTime();
        G.c();
        if (d10 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f29704d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.f29702b.b()) {
            this.f29701a.c(d10);
            d10.onPrepareLoad(this.f29705e ? e() : null);
            return;
        }
        x b10 = b(nanoTime);
        String f10 = G.f(b10);
        if (!q.shouldReadFromMemoryCache(this.f29708h) || (k10 = this.f29701a.k(f10)) == null) {
            d10.onPrepareLoad(this.f29705e ? e() : null);
            this.f29701a.g(new E(this.f29701a, d10, b10, this.f29708h, this.f29709i, this.f29711k, f10, this.f29712l, this.f29707g));
        } else {
            this.f29701a.c(d10);
            d10.onBitmapLoaded(k10, u.e.MEMORY);
        }
    }

    public y i(Drawable drawable) {
        if (!this.f29705e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (this.f29706f != 0) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f29710j = drawable;
        return this;
    }

    public y j(int i10, int i11) {
        this.f29702b.f(i10, i11);
        return this;
    }

    y k() {
        this.f29704d = false;
        return this;
    }
}
