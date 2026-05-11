package p0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l0.C3592d;
import o0.AbstractC3737b;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f38264g;

    /* renamed from: b, reason: collision with root package name */
    int f38266b;

    /* renamed from: d, reason: collision with root package name */
    int f38268d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f38265a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    boolean f38267c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f38269e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f38270f = -1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference f38271a;

        /* renamed from: b, reason: collision with root package name */
        int f38272b;

        /* renamed from: c, reason: collision with root package name */
        int f38273c;

        /* renamed from: d, reason: collision with root package name */
        int f38274d;

        /* renamed from: e, reason: collision with root package name */
        int f38275e;

        /* renamed from: f, reason: collision with root package name */
        int f38276f;

        /* renamed from: g, reason: collision with root package name */
        int f38277g;

        public a(o0.e eVar, C3592d c3592d, int i10) {
            this.f38271a = new WeakReference(eVar);
            this.f38272b = c3592d.y(eVar.f37696O);
            this.f38273c = c3592d.y(eVar.f37697P);
            this.f38274d = c3592d.y(eVar.f37698Q);
            this.f38275e = c3592d.y(eVar.f37699R);
            this.f38276f = c3592d.y(eVar.f37700S);
            this.f38277g = i10;
        }
    }

    public o(int i10) {
        int i11 = f38264g;
        f38264g = i11 + 1;
        this.f38266b = i11;
        this.f38268d = i10;
    }

    private String e() {
        int i10 = this.f38268d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(C3592d c3592d, ArrayList arrayList, int i10) {
        int y10;
        int y11;
        o0.f fVar = (o0.f) ((o0.e) arrayList.get(0)).I();
        c3592d.E();
        fVar.g(c3592d, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((o0.e) arrayList.get(i11)).g(c3592d, false);
        }
        if (i10 == 0 && fVar.f37772V0 > 0) {
            AbstractC3737b.b(fVar, c3592d, arrayList, 0);
        }
        if (i10 == 1 && fVar.f37773W0 > 0) {
            AbstractC3737b.b(fVar, c3592d, arrayList, 1);
        }
        try {
            c3592d.A();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f38269e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f38269e.add(new a((o0.e) arrayList.get(i12), c3592d, i10));
        }
        if (i10 == 0) {
            y10 = c3592d.y(fVar.f37696O);
            y11 = c3592d.y(fVar.f37698Q);
            c3592d.E();
        } else {
            y10 = c3592d.y(fVar.f37697P);
            y11 = c3592d.y(fVar.f37699R);
            c3592d.E();
        }
        return y11 - y10;
    }

    public boolean a(o0.e eVar) {
        if (this.f38265a.contains(eVar)) {
            return false;
        }
        this.f38265a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f38265a.size();
        if (this.f38270f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f38270f == oVar.f38266b) {
                    g(this.f38268d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f38266b;
    }

    public int d() {
        return this.f38268d;
    }

    public int f(C3592d c3592d, int i10) {
        if (this.f38265a.size() == 0) {
            return 0;
        }
        return j(c3592d, this.f38265a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator it = this.f38265a.iterator();
        while (it.hasNext()) {
            o0.e eVar = (o0.e) it.next();
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.f37688H0 = oVar.c();
            } else {
                eVar.f37690I0 = oVar.c();
            }
        }
        this.f38270f = oVar.f38266b;
    }

    public void h(boolean z10) {
        this.f38267c = z10;
    }

    public void i(int i10) {
        this.f38268d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f38266b + "] <";
        Iterator it = this.f38265a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((o0.e) it.next()).r();
        }
        return str + " >";
    }
}
