package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k2.t;
import k2.v;
import o2.o;
import o2.p;
import w2.C5033f;
import w2.InterfaceC5032e;
import z2.C5243a;
import z2.C5244b;
import z2.C5245c;
import z2.C5246d;
import z2.C5247e;
import z2.C5248f;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final p f20246a;

    /* renamed from: b, reason: collision with root package name */
    private final C5243a f20247b;

    /* renamed from: c, reason: collision with root package name */
    private final C5247e f20248c;

    /* renamed from: d, reason: collision with root package name */
    private final C5248f f20249d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f20250e;

    /* renamed from: f, reason: collision with root package name */
    private final C5033f f20251f;

    /* renamed from: g, reason: collision with root package name */
    private final C5244b f20252g;

    /* renamed from: h, reason: collision with root package name */
    private final C5246d f20253h = new C5246d();

    /* renamed from: i, reason: collision with root package name */
    private final C5245c f20254i = new C5245c();

    /* renamed from: j, reason: collision with root package name */
    private final y0.d f20255j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        y0.d e10 = E2.a.e();
        this.f20255j = e10;
        this.f20246a = new p(e10);
        this.f20247b = new C5243a();
        this.f20248c = new C5247e();
        this.f20249d = new C5248f();
        this.f20250e = new com.bumptech.glide.load.data.f();
        this.f20251f = new C5033f();
        this.f20252g = new C5244b();
        v(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f20248c.d(cls, cls2)) {
            for (Class cls5 : this.f20251f.b(cls4, cls3)) {
                arrayList.add(new k2.i(cls, cls4, cls5, this.f20248c.b(cls, cls4), this.f20251f.a(cls4, cls5), this.f20255j));
            }
        }
        return arrayList;
    }

    public i a(Class cls, i2.d dVar) {
        this.f20247b.a(cls, dVar);
        return this;
    }

    public i b(Class cls, i2.k kVar) {
        this.f20249d.a(cls, kVar);
        return this;
    }

    public i c(Class cls, Class cls2, i2.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public i d(Class cls, Class cls2, o oVar) {
        this.f20246a.a(cls, cls2, oVar);
        return this;
    }

    public i e(String str, Class cls, Class cls2, i2.j jVar) {
        this.f20248c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List b10 = this.f20252g.b();
        if (b10.isEmpty()) {
            throw new b();
        }
        return b10;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        t a10 = this.f20254i.a(cls, cls2, cls3);
        if (this.f20254i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List f10 = f(cls, cls2, cls3);
            a10 = f10.isEmpty() ? null : new t(cls, cls2, cls3, f10, this.f20255j);
            this.f20254i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public List i(Object obj) {
        return this.f20246a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a10 = this.f20253h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList();
            Iterator it = this.f20246a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f20248c.d((Class) it.next(), cls2)) {
                    if (!this.f20251f.b(cls4, cls3).isEmpty() && !a10.contains(cls4)) {
                        a10.add(cls4);
                    }
                }
            }
            this.f20253h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public i2.k k(v vVar) {
        i2.k b10 = this.f20249d.b(vVar.a());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.a());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f20250e.a(obj);
    }

    public i2.d m(Object obj) {
        i2.d b10 = this.f20247b.b(obj.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f20249d.b(vVar.a()) != null;
    }

    public i o(Class cls, Class cls2, i2.j jVar) {
        q("legacy_prepend_all", cls, cls2, jVar);
        return this;
    }

    public i p(Class cls, Class cls2, o oVar) {
        this.f20246a.f(cls, cls2, oVar);
        return this;
    }

    public i q(String str, Class cls, Class cls2, i2.j jVar) {
        this.f20248c.e(str, jVar, cls, cls2);
        return this;
    }

    public i r(ImageHeaderParser imageHeaderParser) {
        this.f20252g.a(imageHeaderParser);
        return this;
    }

    public i s(e.a aVar) {
        this.f20250e.b(aVar);
        return this;
    }

    public i t(Class cls, Class cls2, InterfaceC5032e interfaceC5032e) {
        this.f20251f.c(cls, cls2, interfaceC5032e);
        return this;
    }

    public i u(Class cls, Class cls2, o oVar) {
        this.f20246a.g(cls, cls2, oVar);
        return this;
    }

    public final i v(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f20248c.f(arrayList);
        return this;
    }
}
