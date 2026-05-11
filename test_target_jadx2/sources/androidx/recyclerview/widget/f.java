package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal f17698e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    static Comparator f17699f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f17701b;

    /* renamed from: c, reason: collision with root package name */
    long f17702c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f17700a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f17703d = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f17711d;
            if ((recyclerView == null) != (cVar2.f17711d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f17708a;
            if (z10 != cVar2.f17708a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f17709b - cVar.f17709b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f17710c - cVar2.f17710c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        /* renamed from: a, reason: collision with root package name */
        int f17704a;

        /* renamed from: b, reason: collision with root package name */
        int f17705b;

        /* renamed from: c, reason: collision with root package name */
        int[] f17706c;

        /* renamed from: d, reason: collision with root package name */
        int f17707d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f17707d;
            int i13 = i12 * 2;
            int[] iArr = this.f17706c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f17706c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f17706c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f17706c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f17707d++;
        }

        void b() {
            int[] iArr = this.f17706c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f17707d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f17707d = 0;
            int[] iArr = this.f17706c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f17384n;
            if (recyclerView.f17382m == null || pVar == null || !pVar.u0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f17369e.p()) {
                    pVar.p(recyclerView.f17382m.e(), this);
                }
            } else if (!recyclerView.t0()) {
                pVar.o(this.f17704a, this.f17705b, recyclerView.f17337B0, this);
            }
            int i10 = this.f17707d;
            if (i10 > pVar.f17501m) {
                pVar.f17501m = i10;
                pVar.f17502n = z10;
                recyclerView.f17367c.P();
            }
        }

        boolean d(int i10) {
            if (this.f17706c != null) {
                int i11 = this.f17707d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f17706c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f17704a = i10;
            this.f17705b = i11;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17708a;

        /* renamed from: b, reason: collision with root package name */
        public int f17709b;

        /* renamed from: c, reason: collision with root package name */
        public int f17710c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f17711d;

        /* renamed from: e, reason: collision with root package name */
        public int f17712e;

        c() {
        }

        public void a() {
            this.f17708a = false;
            this.f17709b = 0;
            this.f17710c = 0;
            this.f17711d = null;
            this.f17712e = 0;
        }
    }

    f() {
    }

    private void b() {
        c cVar;
        int size = this.f17700a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f17700a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f17335A0.c(recyclerView, false);
                i10 += recyclerView.f17335A0.f17707d;
            }
        }
        this.f17703d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f17700a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f17335A0;
                int abs = Math.abs(bVar.f17704a) + Math.abs(bVar.f17705b);
                for (int i14 = 0; i14 < bVar.f17707d * 2; i14 += 2) {
                    if (i12 >= this.f17703d.size()) {
                        cVar = new c();
                        this.f17703d.add(cVar);
                    } else {
                        cVar = (c) this.f17703d.get(i12);
                    }
                    int[] iArr = bVar.f17706c;
                    int i15 = iArr[i14 + 1];
                    cVar.f17708a = i15 <= abs;
                    cVar.f17709b = abs;
                    cVar.f17710c = i15;
                    cVar.f17711d = recyclerView2;
                    cVar.f17712e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f17703d, f17699f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.F i10 = i(cVar.f17711d, cVar.f17712e, cVar.f17708a ? Long.MAX_VALUE : j10);
        if (i10 == null || i10.f17451b == null || !i10.u() || i10.v()) {
            return;
        }
        h((RecyclerView) i10.f17451b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f17703d.size(); i10++) {
            c cVar = (c) this.f17703d.get(i10);
            if (cVar.f17711d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.f17370f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.F l02 = RecyclerView.l0(recyclerView.f17370f.i(i11));
            if (l02.f17452c == i10 && !l02.v()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f17342E && recyclerView.f17370f.j() != 0) {
            recyclerView.e1();
        }
        b bVar = recyclerView.f17335A0;
        bVar.c(recyclerView, true);
        if (bVar.f17707d != 0) {
            try {
                androidx.core.os.o.a("RV Nested Prefetch");
                recyclerView.f17337B0.f(recyclerView.f17382m);
                for (int i10 = 0; i10 < bVar.f17707d * 2; i10 += 2) {
                    i(recyclerView, bVar.f17706c[i10], j10);
                }
            } finally {
                androidx.core.os.o.b();
            }
        }
    }

    private RecyclerView.F i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f17367c;
        try {
            recyclerView.O0();
            RecyclerView.F N10 = wVar.N(i10, false, j10);
            if (N10 != null) {
                if (!N10.u() || N10.v()) {
                    wVar.a(N10, false);
                } else {
                    wVar.G(N10.f17450a);
                }
            }
            recyclerView.Q0(false);
            return N10;
        } catch (Throwable th) {
            recyclerView.Q0(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.f17321U0 && this.f17700a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f17700a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f17321U0 && !this.f17700a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f17701b == 0) {
                this.f17701b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f17335A0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f17700a.remove(recyclerView);
        if (RecyclerView.f17321U0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.o.a("RV Prefetch");
            if (!this.f17700a.isEmpty()) {
                int size = this.f17700a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f17700a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f17702c);
                    this.f17701b = 0L;
                    androidx.core.os.o.b();
                }
            }
        } finally {
            this.f17701b = 0L;
            androidx.core.os.o.b();
        }
    }
}
