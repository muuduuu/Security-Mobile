package O1;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: O1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1038i {

    /* renamed from: c, reason: collision with root package name */
    private Map f6949c;

    /* renamed from: d, reason: collision with root package name */
    private Map f6950d;

    /* renamed from: e, reason: collision with root package name */
    private float f6951e;

    /* renamed from: f, reason: collision with root package name */
    private Map f6952f;

    /* renamed from: g, reason: collision with root package name */
    private List f6953g;

    /* renamed from: h, reason: collision with root package name */
    private j0.j f6954h;

    /* renamed from: i, reason: collision with root package name */
    private j0.f f6955i;

    /* renamed from: j, reason: collision with root package name */
    private List f6956j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f6957k;

    /* renamed from: l, reason: collision with root package name */
    private float f6958l;

    /* renamed from: m, reason: collision with root package name */
    private float f6959m;

    /* renamed from: n, reason: collision with root package name */
    private float f6960n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6961o;

    /* renamed from: q, reason: collision with root package name */
    private int f6963q;

    /* renamed from: r, reason: collision with root package name */
    private int f6964r;

    /* renamed from: a, reason: collision with root package name */
    private final E f6947a = new E();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f6948b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    private int f6962p = 0;

    public void a(String str) {
        b2.f.c(str);
        this.f6948b.add(str);
    }

    public Rect b() {
        return this.f6957k;
    }

    public j0.j c() {
        return this.f6954h;
    }

    public float d() {
        return (long) ((e() / this.f6960n) * 1000.0f);
    }

    public float e() {
        return this.f6959m - this.f6958l;
    }

    public float f() {
        return this.f6959m;
    }

    public Map g() {
        return this.f6952f;
    }

    public float h(float f10) {
        return b2.k.i(this.f6958l, this.f6959m, f10);
    }

    public float i() {
        return this.f6960n;
    }

    public Map j() {
        float e10 = b2.l.e();
        if (e10 != this.f6951e) {
            for (Map.Entry entry : this.f6950d.entrySet()) {
                this.f6950d.put((String) entry.getKey(), ((x) entry.getValue()).a(this.f6951e / e10));
            }
        }
        this.f6951e = e10;
        return this.f6950d;
    }

    public List k() {
        return this.f6956j;
    }

    public U1.h l(String str) {
        int size = this.f6953g.size();
        for (int i10 = 0; i10 < size; i10++) {
            U1.h hVar = (U1.h) this.f6953g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f6962p;
    }

    public E n() {
        return this.f6947a;
    }

    public List o(String str) {
        return (List) this.f6949c.get(str);
    }

    public float p() {
        return this.f6958l;
    }

    public boolean q() {
        return this.f6961o;
    }

    public void r(int i10) {
        this.f6962p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List list, j0.f fVar, Map map, Map map2, float f13, j0.j jVar, Map map3, List list2, int i10, int i11) {
        this.f6957k = rect;
        this.f6958l = f10;
        this.f6959m = f11;
        this.f6960n = f12;
        this.f6956j = list;
        this.f6955i = fVar;
        this.f6949c = map;
        this.f6950d = map2;
        this.f6951e = f13;
        this.f6954h = jVar;
        this.f6952f = map3;
        this.f6953g = list2;
        this.f6963q = i10;
        this.f6964r = i11;
    }

    public X1.e t(long j10) {
        return (X1.e) this.f6955i.h(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f6956j.iterator();
        while (it.hasNext()) {
            sb2.append(((X1.e) it.next()).z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f6961o = z10;
    }

    public void v(boolean z10) {
        this.f6947a.b(z10);
    }
}
