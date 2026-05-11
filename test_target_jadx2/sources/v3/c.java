package V3;

import Z3.n;
import android.net.Uri;
import b3.j;
import f3.AbstractC3142a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final V2.d f10805a;

    /* renamed from: b, reason: collision with root package name */
    private final n f10806b;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f10808d = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private final n.b f10807c = new a();

    class a implements n.b {
        a() {
        }

        @Override // Z3.n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(V2.d dVar, boolean z10) {
            c.this.f(dVar, z10);
        }
    }

    static class b implements V2.d {

        /* renamed from: a, reason: collision with root package name */
        private final V2.d f10810a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10811b;

        public b(V2.d dVar, int i10) {
            this.f10810a = dVar;
            this.f10811b = i10;
        }

        @Override // V2.d
        public boolean a(Uri uri) {
            return this.f10810a.a(uri);
        }

        @Override // V2.d
        public boolean b() {
            return false;
        }

        @Override // V2.d
        public String c() {
            return null;
        }

        @Override // V2.d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10811b == bVar.f10811b && this.f10810a.equals(bVar.f10810a);
        }

        @Override // V2.d
        public int hashCode() {
            return (this.f10810a.hashCode() * 1013) + this.f10811b;
        }

        public String toString() {
            return j.c(this).b("imageCacheKey", this.f10810a).a("frameIndex", this.f10811b).toString();
        }
    }

    public c(V2.d dVar, n nVar) {
        this.f10805a = dVar;
        this.f10806b = nVar;
    }

    private b e(int i10) {
        return new b(this.f10805a, i10);
    }

    private synchronized V2.d g() {
        V2.d dVar;
        Iterator it = this.f10808d.iterator();
        if (it.hasNext()) {
            dVar = (V2.d) it.next();
            it.remove();
        } else {
            dVar = null;
        }
        return dVar;
    }

    public AbstractC3142a a(int i10, AbstractC3142a abstractC3142a) {
        return this.f10806b.b(e(i10), abstractC3142a, this.f10807c);
    }

    public boolean b(int i10) {
        return this.f10806b.contains(e(i10));
    }

    public AbstractC3142a c(int i10) {
        return this.f10806b.get(e(i10));
    }

    public AbstractC3142a d() {
        AbstractC3142a d10;
        do {
            V2.d g10 = g();
            if (g10 == null) {
                return null;
            }
            d10 = this.f10806b.d(g10);
        } while (d10 == null);
        return d10;
    }

    public synchronized void f(V2.d dVar, boolean z10) {
        try {
            if (z10) {
                this.f10808d.add(dVar);
            } else {
                this.f10808d.remove(dVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
