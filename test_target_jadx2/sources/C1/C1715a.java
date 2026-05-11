package c1;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.core.graphics.d;
import c1.C1716b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1715a {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f19285g = new C0343a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f19286a;

    /* renamed from: b, reason: collision with root package name */
    final int[] f19287b;

    /* renamed from: c, reason: collision with root package name */
    final List f19288c;

    /* renamed from: e, reason: collision with root package name */
    final C1716b.c[] f19290e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f19291f = new float[3];

    /* renamed from: d, reason: collision with root package name */
    final TimingLogger f19289d = null;

    /* renamed from: c1.a$a, reason: collision with other inner class name */
    static class C0343a implements Comparator {
        C0343a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* renamed from: c1.a$b */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        private int f19292a;

        /* renamed from: b, reason: collision with root package name */
        private int f19293b;

        /* renamed from: c, reason: collision with root package name */
        private int f19294c;

        /* renamed from: d, reason: collision with root package name */
        private int f19295d;

        /* renamed from: e, reason: collision with root package name */
        private int f19296e;

        /* renamed from: f, reason: collision with root package name */
        private int f19297f;

        /* renamed from: g, reason: collision with root package name */
        private int f19298g;

        /* renamed from: h, reason: collision with root package name */
        private int f19299h;

        /* renamed from: i, reason: collision with root package name */
        private int f19300i;

        b(int i10, int i11) {
            this.f19292a = i10;
            this.f19293b = i11;
            c();
        }

        final boolean a() {
            return e() > 1;
        }

        final int b() {
            int f10 = f();
            C1715a c1715a = C1715a.this;
            int[] iArr = c1715a.f19286a;
            int[] iArr2 = c1715a.f19287b;
            C1715a.e(iArr, f10, this.f19292a, this.f19293b);
            Arrays.sort(iArr, this.f19292a, this.f19293b + 1);
            C1715a.e(iArr, f10, this.f19292a, this.f19293b);
            int i10 = this.f19294c / 2;
            int i11 = this.f19292a;
            int i12 = 0;
            while (true) {
                int i13 = this.f19293b;
                if (i11 > i13) {
                    return this.f19292a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        final void c() {
            C1715a c1715a = C1715a.this;
            int[] iArr = c1715a.f19286a;
            int[] iArr2 = c1715a.f19287b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f19292a; i17 <= this.f19293b; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int k10 = C1715a.k(i18);
                int j10 = C1715a.j(i18);
                int i19 = C1715a.i(i18);
                if (k10 > i11) {
                    i11 = k10;
                }
                if (k10 < i10) {
                    i10 = k10;
                }
                if (j10 > i12) {
                    i12 = j10;
                }
                if (j10 < i15) {
                    i15 = j10;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i16) {
                    i16 = i19;
                }
            }
            this.f19295d = i10;
            this.f19296e = i11;
            this.f19297f = i15;
            this.f19298g = i12;
            this.f19299h = i16;
            this.f19300i = i13;
            this.f19294c = i14;
        }

        final C1716b.d d() {
            C1715a c1715a = C1715a.this;
            int[] iArr = c1715a.f19286a;
            int[] iArr2 = c1715a.f19287b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = this.f19292a; i14 <= this.f19293b; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i15];
                i11 += i16;
                i10 += C1715a.k(i15) * i16;
                i12 += C1715a.j(i15) * i16;
                i13 += i16 * C1715a.i(i15);
            }
            float f10 = i11;
            return new C1716b.d(C1715a.b(Math.round(i10 / f10), Math.round(i12 / f10), Math.round(i13 / f10)), i11);
        }

        final int e() {
            return (this.f19293b + 1) - this.f19292a;
        }

        final int f() {
            int i10 = this.f19296e - this.f19295d;
            int i11 = this.f19298g - this.f19297f;
            int i12 = this.f19300i - this.f19299h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        final int g() {
            return ((this.f19296e - this.f19295d) + 1) * ((this.f19298g - this.f19297f) + 1) * ((this.f19300i - this.f19299h) + 1);
        }

        final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int b10 = b();
            b bVar = C1715a.this.new b(b10 + 1, this.f19293b);
            this.f19293b = b10;
            c();
            return bVar;
        }
    }

    C1715a(int[] iArr, int i10, C1716b.c[] cVarArr) {
        this.f19290e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f19287b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int g10 = g(iArr[i11]);
            iArr[i11] = g10;
            iArr2[g10] = iArr2[g10] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f19286a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 > i10) {
            this.f19288c = h(i10);
            return;
        }
        this.f19288c = new ArrayList();
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = iArr3[i16];
            this.f19288c.add(new C1716b.d(a(i17), iArr2[i17]));
        }
    }

    private static int a(int i10) {
        return b(k(i10), j(i10), i(i10));
    }

    static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    private List c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1716b.d d10 = ((b) it.next()).d();
            if (!n(d10)) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = i(i13) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = k(i14) | (i(i14) << 10) | (j(i14) << 5);
            i11++;
        }
    }

    private static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    private static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    private List h(int i10) {
        PriorityQueue priorityQueue = new PriorityQueue(i10, f19285g);
        priorityQueue.offer(new b(0, this.f19286a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    static int i(int i10) {
        return i10 & 31;
    }

    static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    private boolean l(int i10) {
        int a10 = a(i10);
        d.h(a10, this.f19291f);
        return m(a10, this.f19291f);
    }

    private boolean m(int i10, float[] fArr) {
        C1716b.c[] cVarArr = this.f19290e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f19290e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(C1716b.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    private void o(PriorityQueue priorityQueue, int i10) {
        b bVar;
        while (priorityQueue.size() < i10 && (bVar = (b) priorityQueue.poll()) != null && bVar.a()) {
            priorityQueue.offer(bVar.h());
            priorityQueue.offer(bVar);
        }
    }

    List d() {
        return this.f19288c;
    }
}
