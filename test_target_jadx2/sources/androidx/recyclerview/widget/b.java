package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0300b f17602a;

    /* renamed from: b, reason: collision with root package name */
    final a f17603b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f17604c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f17605a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f17606b;

        a() {
        }

        private void c() {
            if (this.f17606b == null) {
                this.f17606b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f17605a &= ~(1 << i10);
                return;
            }
            a aVar = this.f17606b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f17606b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f17605a) : Long.bitCount(this.f17605a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f17605a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f17605a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f17605a & (1 << i10)) != 0;
            }
            c();
            return this.f17606b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f17606b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f17605a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f17605a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f17606b != null) {
                c();
                this.f17606b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f17606b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f17605a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f17605a = j12;
            long j13 = j10 - 1;
            this.f17605a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f17606b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f17606b.f(0);
            }
            return z10;
        }

        void g() {
            this.f17605a = 0L;
            a aVar = this.f17606b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f17605a |= 1 << i10;
            } else {
                c();
                this.f17606b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f17606b == null) {
                return Long.toBinaryString(this.f17605a);
            }
            return this.f17606b.toString() + "xx" + Long.toBinaryString(this.f17605a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0300b {
        View b(int i10);

        int c();

        void d(View view);

        void e();

        int f(View view);

        RecyclerView.F g(View view);

        void h(int i10);

        void i(View view);

        void j(View view, int i10);

        void k(int i10);

        void l(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0300b interfaceC0300b) {
        this.f17602a = interfaceC0300b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f17602a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f17603b.b(i11));
            if (b10 == 0) {
                while (this.f17603b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f17604c.add(view);
        this.f17602a.d(view);
    }

    private boolean t(View view) {
        if (!this.f17604c.remove(view)) {
            return false;
        }
        this.f17602a.i(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int c10 = i10 < 0 ? this.f17602a.c() : h(i10);
        this.f17603b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f17602a.j(view, c10);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int c10 = i10 < 0 ? this.f17602a.c() : h(i10);
        this.f17603b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f17602a.l(view, c10, layoutParams);
    }

    void d(int i10) {
        int h10 = h(i10);
        this.f17603b.f(h10);
        this.f17602a.h(h10);
    }

    View e(int i10) {
        int size = this.f17604c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f17604c.get(i11);
            RecyclerView.F g10 = this.f17602a.g(view);
            if (g10.o() == i10 && !g10.v() && !g10.x()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f17602a.b(h(i10));
    }

    int g() {
        return this.f17602a.c() - this.f17604c.size();
    }

    View i(int i10) {
        return this.f17602a.b(i10);
    }

    int j() {
        return this.f17602a.c();
    }

    void k(View view) {
        int f10 = this.f17602a.f(view);
        if (f10 >= 0) {
            this.f17603b.h(f10);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int f10 = this.f17602a.f(view);
        if (f10 == -1 || this.f17603b.d(f10)) {
            return -1;
        }
        return f10 - this.f17603b.b(f10);
    }

    boolean n(View view) {
        return this.f17604c.contains(view);
    }

    void o() {
        this.f17603b.g();
        for (int size = this.f17604c.size() - 1; size >= 0; size--) {
            this.f17602a.i((View) this.f17604c.get(size));
            this.f17604c.remove(size);
        }
        this.f17602a.e();
    }

    void p(View view) {
        int f10 = this.f17602a.f(view);
        if (f10 < 0) {
            return;
        }
        if (this.f17603b.f(f10)) {
            t(view);
        }
        this.f17602a.k(f10);
    }

    void q(int i10) {
        int h10 = h(i10);
        View b10 = this.f17602a.b(h10);
        if (b10 == null) {
            return;
        }
        if (this.f17603b.f(h10)) {
            t(b10);
        }
        this.f17602a.k(h10);
    }

    boolean r(View view) {
        int f10 = this.f17602a.f(view);
        if (f10 == -1) {
            t(view);
            return true;
        }
        if (!this.f17603b.d(f10)) {
            return false;
        }
        this.f17603b.f(f10);
        t(view);
        this.f17602a.k(f10);
        return true;
    }

    void s(View view) {
        int f10 = this.f17602a.f(view);
        if (f10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f17603b.d(f10)) {
            this.f17603b.a(f10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f17603b.toString() + ", hidden list:" + this.f17604c.size();
    }
}
