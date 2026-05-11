package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import com.bumptech.glide.module.AppGlideModule;
import j0.C3476a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l2.C3603e;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;
import m2.C3644f;
import m2.C3645g;
import m2.C3647i;
import m2.InterfaceC3639a;
import m2.InterfaceC3646h;
import n2.ExecutorServiceC3704a;
import x2.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private k2.k f20217c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3602d f20218d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3600b f20219e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3646h f20220f;

    /* renamed from: g, reason: collision with root package name */
    private ExecutorServiceC3704a f20221g;

    /* renamed from: h, reason: collision with root package name */
    private ExecutorServiceC3704a f20222h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3639a.InterfaceC0556a f20223i;

    /* renamed from: j, reason: collision with root package name */
    private C3647i f20224j;

    /* renamed from: k, reason: collision with root package name */
    private x2.c f20225k;

    /* renamed from: n, reason: collision with root package name */
    private o.b f20228n;

    /* renamed from: o, reason: collision with root package name */
    private ExecutorServiceC3704a f20229o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20230p;

    /* renamed from: q, reason: collision with root package name */
    private List f20231q;

    /* renamed from: a, reason: collision with root package name */
    private final Map f20215a = new C3476a();

    /* renamed from: b, reason: collision with root package name */
    private final f.a f20216b = new f.a();

    /* renamed from: l, reason: collision with root package name */
    private int f20226l = 4;

    /* renamed from: m, reason: collision with root package name */
    private c.a f20227m = new a();

    class a implements c.a {
        a() {
        }

        @Override // com.bumptech.glide.c.a
        public com.bumptech.glide.request.h c() {
            return new com.bumptech.glide.request.h();
        }
    }

    static final class b {
    }

    public static final class c {
    }

    com.bumptech.glide.c a(Context context, List list, AppGlideModule appGlideModule) {
        if (this.f20221g == null) {
            this.f20221g = ExecutorServiceC3704a.i();
        }
        if (this.f20222h == null) {
            this.f20222h = ExecutorServiceC3704a.g();
        }
        if (this.f20229o == null) {
            this.f20229o = ExecutorServiceC3704a.d();
        }
        if (this.f20224j == null) {
            this.f20224j = new C3647i.a(context).a();
        }
        if (this.f20225k == null) {
            this.f20225k = new x2.e();
        }
        if (this.f20218d == null) {
            int b10 = this.f20224j.b();
            if (b10 > 0) {
                this.f20218d = new l2.k(b10);
            } else {
                this.f20218d = new C3603e();
            }
        }
        if (this.f20219e == null) {
            this.f20219e = new l2.i(this.f20224j.a());
        }
        if (this.f20220f == null) {
            this.f20220f = new C3645g(this.f20224j.d());
        }
        if (this.f20223i == null) {
            this.f20223i = new C3644f(context);
        }
        if (this.f20217c == null) {
            this.f20217c = new k2.k(this.f20220f, this.f20223i, this.f20222h, this.f20221g, ExecutorServiceC3704a.j(), this.f20229o, this.f20230p);
        }
        List list2 = this.f20231q;
        if (list2 == null) {
            this.f20231q = Collections.emptyList();
        } else {
            this.f20231q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f20217c, this.f20220f, this.f20218d, this.f20219e, new o(this.f20228n), this.f20225k, this.f20226l, this.f20227m, this.f20215a, this.f20231q, list, appGlideModule, this.f20216b.b());
    }

    public d b(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f20226l = i10;
        return this;
    }

    void c(o.b bVar) {
        this.f20228n = bVar;
    }
}
