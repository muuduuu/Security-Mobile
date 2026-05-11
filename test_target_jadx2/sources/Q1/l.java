package Q1;

import W1.j;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: d, reason: collision with root package name */
    private final String f7983d;

    /* renamed from: f, reason: collision with root package name */
    private final W1.j f7985f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f7980a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f7981b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f7982c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List f7984e = new ArrayList();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7986a;

        static {
            int[] iArr = new int[j.a.values().length];
            f7986a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7986a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7986a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7986a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7986a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(W1.j jVar) {
        this.f7983d = jVar.c();
        this.f7985f = jVar;
    }

    private void a() {
        for (int i10 = 0; i10 < this.f7984e.size(); i10++) {
            this.f7982c.addPath(((m) this.f7984e.get(i10)).J());
        }
    }

    private void d(Path.Op op) {
        this.f7981b.reset();
        this.f7980a.reset();
        for (int size = this.f7984e.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f7984e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List k10 = dVar.k();
                for (int size2 = k10.size() - 1; size2 >= 0; size2--) {
                    Path J10 = ((m) k10.get(size2)).J();
                    J10.transform(dVar.l());
                    this.f7981b.addPath(J10);
                }
            } else {
                this.f7981b.addPath(mVar.J());
            }
        }
        m mVar2 = (m) this.f7984e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List k11 = dVar2.k();
            for (int i10 = 0; i10 < k11.size(); i10++) {
                Path J11 = ((m) k11.get(i10)).J();
                J11.transform(dVar2.l());
                this.f7980a.addPath(J11);
            }
        } else {
            this.f7980a.set(mVar2.J());
        }
        this.f7982c.op(this.f7980a, this.f7981b, op);
    }

    @Override // Q1.m
    public Path J() {
        this.f7982c.reset();
        if (this.f7985f.d()) {
            return this.f7982c;
        }
        int i10 = a.f7986a[this.f7985f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            d(Path.Op.UNION);
        } else if (i10 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            d(Path.Op.XOR);
        }
        return this.f7982c;
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < this.f7984e.size(); i10++) {
            ((m) this.f7984e.get(i10)).b(list, list2);
        }
    }

    @Override // Q1.j
    public void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f7984e.add((m) cVar);
                listIterator.remove();
            }
        }
    }
}
