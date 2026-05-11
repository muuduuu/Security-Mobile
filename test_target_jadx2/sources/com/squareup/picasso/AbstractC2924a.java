package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.u;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2924a {

    /* renamed from: a, reason: collision with root package name */
    final u f29534a;

    /* renamed from: b, reason: collision with root package name */
    final x f29535b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f29536c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f29537d;

    /* renamed from: e, reason: collision with root package name */
    final int f29538e;

    /* renamed from: f, reason: collision with root package name */
    final int f29539f;

    /* renamed from: g, reason: collision with root package name */
    final int f29540g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f29541h;

    /* renamed from: i, reason: collision with root package name */
    final String f29542i;

    /* renamed from: j, reason: collision with root package name */
    final Object f29543j;

    /* renamed from: k, reason: collision with root package name */
    boolean f29544k;

    /* renamed from: l, reason: collision with root package name */
    boolean f29545l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    static class C0435a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC2924a f29546a;

        C0435a(AbstractC2924a abstractC2924a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f29546a = abstractC2924a;
        }
    }

    AbstractC2924a(u uVar, Object obj, x xVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj2, boolean z10) {
        this.f29534a = uVar;
        this.f29535b = xVar;
        this.f29536c = obj == null ? null : new C0435a(this, obj, uVar.f29634j);
        this.f29538e = i10;
        this.f29539f = i11;
        this.f29537d = z10;
        this.f29540g = i12;
        this.f29541h = drawable;
        this.f29542i = str;
        this.f29543j = obj2 == null ? this : obj2;
    }

    void a() {
        this.f29545l = true;
    }

    abstract void b(Bitmap bitmap, u.e eVar);

    abstract void c(Exception exc);

    String d() {
        return this.f29542i;
    }

    int e() {
        return this.f29538e;
    }

    int f() {
        return this.f29539f;
    }

    u g() {
        return this.f29534a;
    }

    u.f h() {
        return this.f29535b.f29682t;
    }

    x i() {
        return this.f29535b;
    }

    Object j() {
        return this.f29543j;
    }

    Object k() {
        WeakReference weakReference = this.f29536c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean l() {
        return this.f29545l;
    }

    boolean m() {
        return this.f29544k;
    }
}
