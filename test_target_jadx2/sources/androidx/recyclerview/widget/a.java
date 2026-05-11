package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class a implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private y0.d f17590a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f17591b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f17592c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0299a f17593d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f17594e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f17595f;

    /* renamed from: g, reason: collision with root package name */
    final i f17596g;

    /* renamed from: h, reason: collision with root package name */
    private int f17597h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0299a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.F e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f17598a;

        /* renamed from: b, reason: collision with root package name */
        int f17599b;

        /* renamed from: c, reason: collision with root package name */
        Object f17600c;

        /* renamed from: d, reason: collision with root package name */
        int f17601d;

        b(int i10, int i11, int i12, Object obj) {
            this.f17598a = i10;
            this.f17599b = i11;
            this.f17601d = i12;
            this.f17600c = obj;
        }

        String a() {
            int i10 = this.f17598a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f17598a;
            if (i10 != bVar.f17598a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f17601d - this.f17599b) == 1 && this.f17601d == bVar.f17599b && this.f17599b == bVar.f17601d) {
                return true;
            }
            if (this.f17601d != bVar.f17601d || this.f17599b != bVar.f17599b) {
                return false;
            }
            Object obj2 = this.f17600c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f17600c)) {
                    return false;
                }
            } else if (bVar.f17600c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f17598a * 31) + this.f17599b) * 31) + this.f17601d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f17599b + "c:" + this.f17601d + ",p:" + this.f17600c + "]";
        }
    }

    a(InterfaceC0299a interfaceC0299a) {
        this(interfaceC0299a, false);
    }

    private void c(b bVar) {
        u(bVar);
    }

    private void d(b bVar) {
        u(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f17599b;
        int i11 = bVar.f17601d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f17593d.e(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    u(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f17601d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f17599b;
        int i11 = bVar.f17601d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f17593d.e(i10) != null || h(i10)) {
                if (!z10) {
                    k(b(4, i13, i12, bVar.f17600c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    u(b(4, i13, i12, bVar.f17600c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f17601d) {
            Object obj = bVar.f17600c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (z10) {
            u(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f17592c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f17592c.get(i11);
            int i12 = bVar.f17598a;
            if (i12 == 8) {
                if (n(bVar.f17601d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f17599b;
                int i14 = bVar.f17601d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f17598a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int y10 = y(bVar.f17599b, i11);
        int i12 = bVar.f17599b;
        int i13 = bVar.f17598a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f17601d; i15++) {
            int y11 = y(bVar.f17599b + (i10 * i15), bVar.f17598a);
            int i16 = bVar.f17598a;
            if (i16 == 2 ? y11 != y10 : !(i16 == 4 && y11 == y10 + 1)) {
                b b10 = b(i16, y10, i14, bVar.f17600c);
                l(b10, i12);
                a(b10);
                if (bVar.f17598a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                y10 = y11;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f17600c;
        a(bVar);
        if (i14 > 0) {
            b b11 = b(bVar.f17598a, y10, i14, obj);
            l(b11, i12);
            a(b11);
        }
    }

    private void u(b bVar) {
        this.f17592c.add(bVar);
        int i10 = bVar.f17598a;
        if (i10 == 1) {
            this.f17593d.g(bVar.f17599b, bVar.f17601d);
            return;
        }
        if (i10 == 2) {
            this.f17593d.f(bVar.f17599b, bVar.f17601d);
            return;
        }
        if (i10 == 4) {
            this.f17593d.c(bVar.f17599b, bVar.f17601d, bVar.f17600c);
        } else {
            if (i10 == 8) {
                this.f17593d.a(bVar.f17599b, bVar.f17601d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int y(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f17592c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f17592c.get(size);
            int i14 = bVar.f17598a;
            if (i14 == 8) {
                int i15 = bVar.f17599b;
                int i16 = bVar.f17601d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f17599b = i15 + 1;
                            bVar.f17601d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f17599b = i15 - 1;
                            bVar.f17601d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f17601d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f17601d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f17599b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f17599b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f17599b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f17601d;
                    } else if (i14 == 2) {
                        i10 += bVar.f17601d;
                    }
                } else if (i11 == 1) {
                    bVar.f17599b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f17599b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f17592c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f17592c.get(size2);
            if (bVar2.f17598a == 8) {
                int i18 = bVar2.f17601d;
                if (i18 == bVar2.f17599b || i18 < 0) {
                    this.f17592c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f17601d <= 0) {
                this.f17592c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.i.a
    public void a(b bVar) {
        if (this.f17595f) {
            return;
        }
        bVar.f17600c = null;
        this.f17590a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.i.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f17590a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f17598a = i10;
        bVar.f17599b = i11;
        bVar.f17601d = i12;
        bVar.f17600c = obj;
        return bVar;
    }

    public int e(int i10) {
        int size = this.f17591b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f17591b.get(i11);
            int i12 = bVar.f17598a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f17599b;
                    if (i13 <= i10) {
                        int i14 = bVar.f17601d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f17599b;
                    if (i15 == i10) {
                        i10 = bVar.f17601d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f17601d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f17599b <= i10) {
                i10 += bVar.f17601d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f17592c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17593d.d((b) this.f17592c.get(i10));
        }
        w(this.f17592c);
        this.f17597h = 0;
    }

    void j() {
        i();
        int size = this.f17591b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f17591b.get(i10);
            int i11 = bVar.f17598a;
            if (i11 == 1) {
                this.f17593d.d(bVar);
                this.f17593d.g(bVar.f17599b, bVar.f17601d);
            } else if (i11 == 2) {
                this.f17593d.d(bVar);
                this.f17593d.h(bVar.f17599b, bVar.f17601d);
            } else if (i11 == 4) {
                this.f17593d.d(bVar);
                this.f17593d.c(bVar.f17599b, bVar.f17601d, bVar.f17600c);
            } else if (i11 == 8) {
                this.f17593d.d(bVar);
                this.f17593d.a(bVar.f17599b, bVar.f17601d);
            }
            Runnable runnable = this.f17594e;
            if (runnable != null) {
                runnable.run();
            }
        }
        w(this.f17591b);
        this.f17597h = 0;
    }

    void l(b bVar, int i10) {
        this.f17593d.b(bVar);
        int i11 = bVar.f17598a;
        if (i11 == 2) {
            this.f17593d.h(i10, bVar.f17601d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f17593d.c(i10, bVar.f17601d, bVar.f17600c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f17592c.size();
        while (i11 < size) {
            b bVar = (b) this.f17592c.get(i11);
            int i12 = bVar.f17598a;
            if (i12 == 8) {
                int i13 = bVar.f17599b;
                if (i13 == i10) {
                    i10 = bVar.f17601d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f17601d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f17599b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f17601d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f17601d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f17597h) != 0;
    }

    boolean p() {
        return this.f17591b.size() > 0;
    }

    boolean q() {
        return (this.f17592c.isEmpty() || this.f17591b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f17591b.add(b(4, i10, i11, obj));
        this.f17597h |= 4;
        return this.f17591b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f17591b.add(b(1, i10, i11, null));
        this.f17597h |= 1;
        return this.f17591b.size() == 1;
    }

    boolean t(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f17591b.add(b(2, i10, i11, null));
        this.f17597h |= 2;
        return this.f17591b.size() == 1;
    }

    void v() {
        this.f17596g.b(this.f17591b);
        int size = this.f17591b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f17591b.get(i10);
            int i11 = bVar.f17598a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f17594e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f17591b.clear();
    }

    void w(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((b) list.get(i10));
        }
        list.clear();
    }

    void x() {
        w(this.f17591b);
        w(this.f17592c);
        this.f17597h = 0;
    }

    a(InterfaceC0299a interfaceC0299a, boolean z10) {
        this.f17590a = new Pools$SimplePool(30);
        this.f17591b = new ArrayList();
        this.f17592c = new ArrayList();
        this.f17597h = 0;
        this.f17593d = interfaceC0299a;
        this.f17595f = z10;
        this.f17596g = new i(this);
    }
}
