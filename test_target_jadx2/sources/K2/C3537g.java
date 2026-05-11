package k2;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.h;
import l2.InterfaceC3600b;
import m2.InterfaceC3639a;
import o2.n;
import q2.C3917n;

/* renamed from: k2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3537g {

    /* renamed from: a, reason: collision with root package name */
    private final List f36006a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f36007b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f36008c;

    /* renamed from: d, reason: collision with root package name */
    private Object f36009d;

    /* renamed from: e, reason: collision with root package name */
    private int f36010e;

    /* renamed from: f, reason: collision with root package name */
    private int f36011f;

    /* renamed from: g, reason: collision with root package name */
    private Class f36012g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f36013h;

    /* renamed from: i, reason: collision with root package name */
    private i2.h f36014i;

    /* renamed from: j, reason: collision with root package name */
    private Map f36015j;

    /* renamed from: k, reason: collision with root package name */
    private Class f36016k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f36017l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36018m;

    /* renamed from: n, reason: collision with root package name */
    private i2.f f36019n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.h f36020o;

    /* renamed from: p, reason: collision with root package name */
    private j f36021p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f36022q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f36023r;

    C3537g() {
    }

    void a() {
        this.f36008c = null;
        this.f36009d = null;
        this.f36019n = null;
        this.f36012g = null;
        this.f36016k = null;
        this.f36014i = null;
        this.f36020o = null;
        this.f36015j = null;
        this.f36021p = null;
        this.f36006a.clear();
        this.f36017l = false;
        this.f36007b.clear();
        this.f36018m = false;
    }

    InterfaceC3600b b() {
        return this.f36008c.a();
    }

    List c() {
        if (!this.f36018m) {
            this.f36018m = true;
            this.f36007b.clear();
            List g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) g10.get(i10);
                if (!this.f36007b.contains(aVar.f37866a)) {
                    this.f36007b.add(aVar.f37866a);
                }
                for (int i11 = 0; i11 < aVar.f37867b.size(); i11++) {
                    if (!this.f36007b.contains(aVar.f37867b.get(i11))) {
                        this.f36007b.add(aVar.f37867b.get(i11));
                    }
                }
            }
        }
        return this.f36007b;
    }

    InterfaceC3639a d() {
        return this.f36013h.a();
    }

    j e() {
        return this.f36021p;
    }

    int f() {
        return this.f36011f;
    }

    List g() {
        if (!this.f36017l) {
            this.f36017l = true;
            this.f36006a.clear();
            List i10 = this.f36008c.h().i(this.f36009d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a b10 = ((o2.n) i10.get(i11)).b(this.f36009d, this.f36010e, this.f36011f, this.f36014i);
                if (b10 != null) {
                    this.f36006a.add(b10);
                }
            }
        }
        return this.f36006a;
    }

    t h(Class cls) {
        return this.f36008c.h().h(cls, this.f36012g, this.f36016k);
    }

    Class i() {
        return this.f36009d.getClass();
    }

    List j(File file) {
        return this.f36008c.h().i(file);
    }

    i2.h k() {
        return this.f36014i;
    }

    com.bumptech.glide.h l() {
        return this.f36020o;
    }

    List m() {
        return this.f36008c.h().j(this.f36009d.getClass(), this.f36012g, this.f36016k);
    }

    i2.k n(v vVar) {
        return this.f36008c.h().k(vVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f36008c.h().l(obj);
    }

    i2.f p() {
        return this.f36019n;
    }

    i2.d q(Object obj) {
        return this.f36008c.h().m(obj);
    }

    Class r() {
        return this.f36016k;
    }

    i2.l s(Class cls) {
        i2.l lVar = (i2.l) this.f36015j.get(cls);
        if (lVar == null) {
            Iterator it = this.f36015j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (i2.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f36015j.isEmpty() || !this.f36022q) {
            return C3917n.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f36010e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.e eVar, Object obj, i2.f fVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.h hVar, i2.h hVar2, Map map, boolean z10, boolean z11, h.e eVar2) {
        this.f36008c = eVar;
        this.f36009d = obj;
        this.f36019n = fVar;
        this.f36010e = i10;
        this.f36011f = i11;
        this.f36021p = jVar;
        this.f36012g = cls;
        this.f36013h = eVar2;
        this.f36016k = cls2;
        this.f36020o = hVar;
        this.f36014i = hVar2;
        this.f36015j = map;
        this.f36022q = z10;
        this.f36023r = z11;
    }

    boolean w(v vVar) {
        return this.f36008c.h().n(vVar);
    }

    boolean x() {
        return this.f36023r;
    }

    boolean y(i2.f fVar) {
        List g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) g10.get(i10)).f37866a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
