package p0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f38238d;

    /* renamed from: f, reason: collision with root package name */
    int f38240f;

    /* renamed from: g, reason: collision with root package name */
    public int f38241g;

    /* renamed from: a, reason: collision with root package name */
    public d f38235a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38236b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38237c = false;

    /* renamed from: e, reason: collision with root package name */
    a f38239e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f38242h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f38243i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38244j = false;

    /* renamed from: k, reason: collision with root package name */
    List f38245k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f38246l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f38238d = pVar;
    }

    @Override // p0.d
    public void a(d dVar) {
        Iterator it = this.f38246l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f38244j) {
                return;
            }
        }
        this.f38237c = true;
        d dVar2 = this.f38235a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f38236b) {
            this.f38238d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f38246l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f38244j) {
            g gVar = this.f38243i;
            if (gVar != null) {
                if (!gVar.f38244j) {
                    return;
                } else {
                    this.f38240f = this.f38242h * gVar.f38241g;
                }
            }
            d(fVar.f38241g + this.f38240f);
        }
        d dVar3 = this.f38235a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f38245k.add(dVar);
        if (this.f38244j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f38246l.clear();
        this.f38245k.clear();
        this.f38244j = false;
        this.f38241g = 0;
        this.f38237c = false;
        this.f38236b = false;
    }

    public void d(int i10) {
        if (this.f38244j) {
            return;
        }
        this.f38244j = true;
        this.f38241g = i10;
        for (d dVar : this.f38245k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38238d.f38280b.r());
        sb2.append(":");
        sb2.append(this.f38239e);
        sb2.append("(");
        sb2.append(this.f38244j ? Integer.valueOf(this.f38241g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f38246l.size());
        sb2.append(":d=");
        sb2.append(this.f38245k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
