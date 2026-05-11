package l3;

import b3.j;
import b3.l;
import b3.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h implements o {

    /* renamed from: a, reason: collision with root package name */
    private final List f37072a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37073b;

    private h(List list, boolean z10) {
        l.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f37072a = list;
        this.f37073b = z10;
    }

    public static h c(List list, boolean z10) {
        return new h(list, z10);
    }

    @Override // b3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC3606c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return j.a(this.f37072a, ((h) obj).f37072a);
        }
        return false;
    }

    public int hashCode() {
        return this.f37072a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f37072a).toString();
    }

    private class a extends AbstractC3604a {

        /* renamed from: h, reason: collision with root package name */
        private ArrayList f37074h;

        /* renamed from: i, reason: collision with root package name */
        private int f37075i;

        /* renamed from: j, reason: collision with root package name */
        private int f37076j;

        /* renamed from: k, reason: collision with root package name */
        private AtomicInteger f37077k;

        /* renamed from: l, reason: collision with root package name */
        private Throwable f37078l;

        /* renamed from: m, reason: collision with root package name */
        private Map f37079m;

        public a() {
            if (h.this.f37073b) {
                return;
            }
            A();
        }

        private void A() {
            if (this.f37077k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f37077k == null) {
                        this.f37077k = new AtomicInteger(0);
                        int size = h.this.f37072a.size();
                        this.f37076j = size;
                        this.f37075i = size;
                        this.f37074h = new ArrayList(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            InterfaceC3606c interfaceC3606c = (InterfaceC3606c) ((o) h.this.f37072a.get(i10)).get();
                            this.f37074h.add(interfaceC3606c);
                            interfaceC3606c.c(new C0549a(i10), Z2.a.a());
                            if (!interfaceC3606c.d()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        private synchronized InterfaceC3606c B(int i10) {
            InterfaceC3606c interfaceC3606c;
            ArrayList arrayList = this.f37074h;
            interfaceC3606c = null;
            if (arrayList != null && i10 < arrayList.size()) {
                interfaceC3606c = (InterfaceC3606c) this.f37074h.set(i10, null);
            }
            return interfaceC3606c;
        }

        private synchronized InterfaceC3606c C(int i10) {
            ArrayList arrayList;
            arrayList = this.f37074h;
            return (arrayList == null || i10 >= arrayList.size()) ? null : (InterfaceC3606c) this.f37074h.get(i10);
        }

        private synchronized InterfaceC3606c D() {
            return C(this.f37075i);
        }

        private void E() {
            Throwable th;
            if (this.f37077k.incrementAndGet() != this.f37076j || (th = this.f37078l) == null) {
                return;
            }
            q(th, this.f37079m);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[LOOP:0: B:16:0x0022->B:17:0x0024, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void F(int i10, InterfaceC3606c interfaceC3606c, boolean z10) {
            synchronized (this) {
                try {
                    int i11 = this.f37075i;
                    if (interfaceC3606c == C(i10) && i10 != this.f37075i) {
                        if (D() != null && (!z10 || i10 >= this.f37075i)) {
                            i10 = i11;
                            while (i11 > i10) {
                                z(B(i11));
                                i11--;
                            }
                        }
                        this.f37075i = i10;
                        while (i11 > i10) {
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i10, InterfaceC3606c interfaceC3606c) {
            z(I(i10, interfaceC3606c));
            if (i10 == 0) {
                this.f37078l = interfaceC3606c.e();
                this.f37079m = interfaceC3606c.getExtras();
            }
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i10, InterfaceC3606c interfaceC3606c) {
            F(i10, interfaceC3606c, interfaceC3606c.a());
            if (interfaceC3606c == D()) {
                u(null, i10 == 0 && interfaceC3606c.a(), interfaceC3606c.getExtras());
            }
            E();
        }

        private synchronized InterfaceC3606c I(int i10, InterfaceC3606c interfaceC3606c) {
            if (interfaceC3606c == D()) {
                return null;
            }
            if (interfaceC3606c != C(i10)) {
                return interfaceC3606c;
            }
            return B(i10);
        }

        private void z(InterfaceC3606c interfaceC3606c) {
            if (interfaceC3606c != null) {
                interfaceC3606c.close();
            }
        }

        @Override // l3.AbstractC3604a, l3.InterfaceC3606c
        public synchronized Object b() {
            InterfaceC3606c D10;
            try {
                if (h.this.f37073b) {
                    A();
                }
                D10 = D();
            } catch (Throwable th) {
                throw th;
            }
            return D10 != null ? D10.b() : null;
        }

        @Override // l3.AbstractC3604a, l3.InterfaceC3606c
        public boolean close() {
            if (h.this.f37073b) {
                A();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f37074h;
                    this.f37074h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        z((InterfaceC3606c) arrayList.get(i10));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // l3.AbstractC3604a, l3.InterfaceC3606c
        public synchronized boolean d() {
            boolean z10;
            try {
                if (h.this.f37073b) {
                    A();
                }
                InterfaceC3606c D10 = D();
                if (D10 != null) {
                    z10 = D10.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return z10;
        }

        /* renamed from: l3.h$a$a, reason: collision with other inner class name */
        private class C0549a implements e {

            /* renamed from: a, reason: collision with root package name */
            private int f37081a;

            public C0549a(int i10) {
                this.f37081a = i10;
            }

            @Override // l3.e
            public void b(InterfaceC3606c interfaceC3606c) {
                if (interfaceC3606c.d()) {
                    a.this.H(this.f37081a, interfaceC3606c);
                } else if (interfaceC3606c.a()) {
                    a.this.G(this.f37081a, interfaceC3606c);
                }
            }

            @Override // l3.e
            public void c(InterfaceC3606c interfaceC3606c) {
                a.this.G(this.f37081a, interfaceC3606c);
            }

            @Override // l3.e
            public void d(InterfaceC3606c interfaceC3606c) {
                if (this.f37081a == 0) {
                    a.this.s(interfaceC3606c.f());
                }
            }

            @Override // l3.e
            public void a(InterfaceC3606c interfaceC3606c) {
            }
        }
    }
}
