package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final List f20a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21b;

    /* renamed from: c, reason: collision with root package name */
    private final List f22c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23d;

    D(a aVar) {
        this.f20a = Collections.unmodifiableList(aVar.f24a);
        this.f21b = Collections.unmodifiableList(aVar.f25b);
        this.f22c = Collections.unmodifiableList(aVar.f26c);
        this.f23d = aVar.f27d;
    }

    public long a() {
        return this.f23d;
    }

    public List b() {
        return this.f21b;
    }

    public List c() {
        return this.f20a;
    }

    public List d() {
        return this.f22c;
    }

    public boolean e() {
        return this.f23d > 0;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final List f24a;

        /* renamed from: b, reason: collision with root package name */
        final List f25b;

        /* renamed from: c, reason: collision with root package name */
        final List f26c;

        /* renamed from: d, reason: collision with root package name */
        long f27d;

        public a(C0706k0 c0706k0, int i10) {
            this.f24a = new ArrayList();
            this.f25b = new ArrayList();
            this.f26c = new ArrayList();
            this.f27d = 5000L;
            a(c0706k0, i10);
        }

        public a a(C0706k0 c0706k0, int i10) {
            boolean z10 = false;
            y0.f.b(c0706k0 != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            y0.f.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f24a.add(c0706k0);
            }
            if ((i10 & 2) != 0) {
                this.f25b.add(c0706k0);
            }
            if ((i10 & 4) != 0) {
                this.f26c.add(c0706k0);
            }
            return this;
        }

        public D b() {
            return new D(this);
        }

        public a c(int i10) {
            if ((i10 & 1) != 0) {
                this.f24a.clear();
            }
            if ((i10 & 2) != 0) {
                this.f25b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f26c.clear();
            }
            return this;
        }

        public a(D d10) {
            ArrayList arrayList = new ArrayList();
            this.f24a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f25b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f26c = arrayList3;
            this.f27d = 5000L;
            arrayList.addAll(d10.c());
            arrayList2.addAll(d10.b());
            arrayList3.addAll(d10.d());
            this.f27d = d10.a();
        }
    }
}
