package l3;

import b3.j;
import b3.l;
import b3.o;
import java.util.List;

/* loaded from: classes.dex */
public class g implements o {

    /* renamed from: a, reason: collision with root package name */
    private final List f37066a;

    private class a extends AbstractC3604a {

        /* renamed from: h, reason: collision with root package name */
        private int f37067h = 0;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC3606c f37068i = null;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC3606c f37069j = null;

        /* renamed from: l3.g$a$a, reason: collision with other inner class name */
        private class C0548a implements e {
            @Override // l3.e
            public void b(InterfaceC3606c interfaceC3606c) {
                if (interfaceC3606c.d()) {
                    a.this.F(interfaceC3606c);
                } else if (interfaceC3606c.a()) {
                    a.this.E(interfaceC3606c);
                }
            }

            @Override // l3.e
            public void c(InterfaceC3606c interfaceC3606c) {
                a.this.E(interfaceC3606c);
            }

            @Override // l3.e
            public void d(InterfaceC3606c interfaceC3606c) {
                a.this.s(Math.max(a.this.f(), interfaceC3606c.f()));
            }

            private C0548a() {
            }

            @Override // l3.e
            public void a(InterfaceC3606c interfaceC3606c) {
            }
        }

        public a() {
            if (H()) {
                return;
            }
            p(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(InterfaceC3606c interfaceC3606c) {
            if (interfaceC3606c != null) {
                interfaceC3606c.close();
            }
        }

        private synchronized InterfaceC3606c B() {
            return this.f37069j;
        }

        private synchronized o C() {
            if (k() || this.f37067h >= g.this.f37066a.size()) {
                return null;
            }
            List list = g.this.f37066a;
            int i10 = this.f37067h;
            this.f37067h = i10 + 1;
            return (o) list.get(i10);
        }

        private void D(InterfaceC3606c interfaceC3606c, boolean z10) {
            InterfaceC3606c interfaceC3606c2;
            synchronized (this) {
                if (interfaceC3606c == this.f37068i && interfaceC3606c != (interfaceC3606c2 = this.f37069j)) {
                    if (interfaceC3606c2 != null && !z10) {
                        interfaceC3606c2 = null;
                        A(interfaceC3606c2);
                    }
                    this.f37069j = interfaceC3606c;
                    A(interfaceC3606c2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(InterfaceC3606c interfaceC3606c) {
            if (z(interfaceC3606c)) {
                if (interfaceC3606c != B()) {
                    A(interfaceC3606c);
                }
                if (H()) {
                    return;
                }
                q(interfaceC3606c.e(), interfaceC3606c.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(InterfaceC3606c interfaceC3606c) {
            D(interfaceC3606c, interfaceC3606c.a());
            if (interfaceC3606c == B()) {
                u(null, interfaceC3606c.a(), interfaceC3606c.getExtras());
            }
        }

        private synchronized boolean G(InterfaceC3606c interfaceC3606c) {
            if (k()) {
                return false;
            }
            this.f37068i = interfaceC3606c;
            return true;
        }

        private boolean H() {
            o C10 = C();
            InterfaceC3606c interfaceC3606c = C10 != null ? (InterfaceC3606c) C10.get() : null;
            if (!G(interfaceC3606c) || interfaceC3606c == null) {
                A(interfaceC3606c);
                return false;
            }
            interfaceC3606c.c(new C0548a(), Z2.a.a());
            return true;
        }

        private synchronized boolean z(InterfaceC3606c interfaceC3606c) {
            if (!k() && interfaceC3606c == this.f37068i) {
                this.f37068i = null;
                return true;
            }
            return false;
        }

        @Override // l3.AbstractC3604a, l3.InterfaceC3606c
        public synchronized Object b() {
            InterfaceC3606c B10;
            B10 = B();
            return B10 != null ? B10.b() : null;
        }

        @Override // l3.AbstractC3604a, l3.InterfaceC3606c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    InterfaceC3606c interfaceC3606c = this.f37068i;
                    this.f37068i = null;
                    InterfaceC3606c interfaceC3606c2 = this.f37069j;
                    this.f37069j = null;
                    A(interfaceC3606c2);
                    A(interfaceC3606c);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // l3.AbstractC3604a, l3.InterfaceC3606c
        public synchronized boolean d() {
            boolean z10;
            InterfaceC3606c B10 = B();
            if (B10 != null) {
                z10 = B10.d();
            }
            return z10;
        }
    }

    private g(List list) {
        l.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f37066a = list;
    }

    public static g b(List list) {
        return new g(list);
    }

    @Override // b3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3606c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return j.a(this.f37066a, ((g) obj).f37066a);
        }
        return false;
    }

    public int hashCode() {
        return this.f37066a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f37066a).toString();
    }
}
