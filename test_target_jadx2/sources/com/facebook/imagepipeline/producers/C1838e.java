package com.facebook.imagepipeline.producers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1838e implements e0 {

    /* renamed from: n, reason: collision with root package name */
    public static final Set f20896n = b3.h.h("id", "uri_source");

    /* renamed from: o, reason: collision with root package name */
    private static final Object f20897o = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final m4.b f20898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20899b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20900c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f20901d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f20902e;

    /* renamed from: f, reason: collision with root package name */
    private final b.c f20903f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f20904g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20905h;

    /* renamed from: i, reason: collision with root package name */
    private a4.e f20906i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20907j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20908k;

    /* renamed from: l, reason: collision with root package name */
    private final List f20909l;

    /* renamed from: m, reason: collision with root package name */
    private final b4.m f20910m;

    public C1838e(m4.b bVar, String str, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, a4.e eVar, b4.m mVar) {
        this(bVar, str, null, null, g0Var, obj, cVar, z10, z11, eVar, mVar);
    }

    public static void h(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public static void k(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    public static void m(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public static void s(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public Object a() {
        return this.f20902e;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized a4.e b() {
        return this.f20906i;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public m4.b c() {
        return this.f20898a;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void d(f0 f0Var) {
        boolean z10;
        synchronized (this) {
            this.f20909l.add(f0Var);
            z10 = this.f20908k;
        }
        if (z10) {
            f0Var.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public b4.m e() {
        return this.f20910m;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void f(String str, String str2) {
        this.f20904g.put("origin", str);
        this.f20904g.put("origin_sub", str2);
    }

    @Override // N3.a
    public void g(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            n((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // N3.a
    public Map getExtras() {
        return this.f20904g;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String getId() {
        return this.f20899b;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean i() {
        return this.f20905h;
    }

    @Override // N3.a
    public Object j(String str) {
        return this.f20904g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String l() {
        return this.f20900c;
    }

    @Override // N3.a
    public void n(String str, Object obj) {
        if (f20896n.contains(str)) {
            return;
        }
        this.f20904g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void o(String str) {
        f(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public g0 p() {
        return this.f20901d;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean q() {
        return this.f20907j;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public b.c r() {
        return this.f20903f;
    }

    public void t() {
        h(u());
    }

    public synchronized List u() {
        if (this.f20908k) {
            return null;
        }
        this.f20908k = true;
        return new ArrayList(this.f20909l);
    }

    public synchronized List v(boolean z10) {
        if (z10 == this.f20907j) {
            return null;
        }
        this.f20907j = z10;
        return new ArrayList(this.f20909l);
    }

    public synchronized List w(boolean z10) {
        if (z10 == this.f20905h) {
            return null;
        }
        this.f20905h = z10;
        return new ArrayList(this.f20909l);
    }

    public synchronized List x(a4.e eVar) {
        if (eVar == this.f20906i) {
            return null;
        }
        this.f20906i = eVar;
        return new ArrayList(this.f20909l);
    }

    public C1838e(m4.b bVar, String str, String str2, Map map, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, a4.e eVar, b4.m mVar) {
        this.f20898a = bVar;
        this.f20899b = str;
        HashMap hashMap = new HashMap();
        this.f20904g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", bVar == null ? "null-request" : bVar.u());
        g(map);
        this.f20900c = str2;
        this.f20901d = g0Var;
        this.f20902e = obj == null ? f20897o : obj;
        this.f20903f = cVar;
        this.f20905h = z10;
        this.f20906i = eVar;
        this.f20907j = z11;
        this.f20908k = false;
        this.f20909l = new ArrayList();
        this.f20910m = mVar;
    }
}
