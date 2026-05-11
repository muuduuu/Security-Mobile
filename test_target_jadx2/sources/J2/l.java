package J2;

import J2.b;
import J2.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g.N element, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof g.C0863s) {
            return;
        }
        if (element instanceof g.L) {
            z10 = z10 || d((g.L) element);
            g.L l10 = (g.L) element;
            f(l10.f4561e, i10);
            f(l10.f4562f, i10);
            c(l10, i10, z10);
        }
        if (element instanceof g.J) {
            for (g.N n10 : ((g.J) element).a()) {
                Intrinsics.d(n10);
                a(n10, i10, z10);
            }
        }
    }

    public static final void b(g svg, int i10) {
        Intrinsics.checkNotNullParameter(svg, "svg");
        g.F m10 = svg.m();
        List d10 = svg.d();
        if (d10 != null) {
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                f(((b.p) it.next()).f4457b, i10);
            }
        }
        f(m10.f4561e, i10);
        f(m10.f4562f, i10);
        Intrinsics.d(m10);
        boolean d11 = d(m10);
        for (g.N n10 : m10.f4547i) {
            Intrinsics.d(n10);
            a(n10, i10, d11);
        }
    }

    public static final void c(g.L element, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (z10) {
            return;
        }
        g.E e10 = element.f4562f;
        if (e10 == null) {
            e10 = new g.E();
            element.f4562f = e10;
        }
        g.C0851f c0851f = new g.C0851f(i10);
        if (element instanceof g.C0866v ? true : element instanceof g.C0849d ? true : element instanceof g.C0853i ? true : element instanceof g.B ? true : element instanceof g.C ? true : element instanceof g.C0861q ? true : element instanceof g.A ? true : element instanceof g.C0870z) {
            e10.f4517b = c0851f;
            e10.f4516a = 1L;
        } else if (element instanceof g.Z) {
            e10.f4529n = c0851f;
            e10.f4516a = 4096L;
        }
    }

    public static final boolean d(g.L element) {
        g.O o10;
        Intrinsics.checkNotNullParameter(element, "element");
        g.E e10 = element.f4562f;
        if (e10 == null && element.f4561e == null) {
            return false;
        }
        if (e10 != null && (e10.f4529n != null || e10.f4517b != null || (o10 = e10.f4520e) != null || o10 != null || e10.f4505C != null || e10.f4510H != null)) {
            return true;
        }
        g.E e11 = element.f4561e;
        if (e11 == null) {
            return false;
        }
        return (e11.f4529n == null && e11.f4517b == null && e11.f4520e == null && e11.f4512J == null && e11.f4505C == null && e11.f4510H == null) ? false : true;
    }

    public static final void e(g.O o10, int i10) {
        if (!(o10 instanceof g.C0851f) || o10 == g.C0851f.f4610c) {
            return;
        }
        ((g.C0851f) o10).f4611a = i10;
    }

    public static final void f(g.E e10, int i10) {
        if (e10 == null) {
            return;
        }
        e(e10.f4529n, i10);
        e(e10.f4517b, i10);
        e(e10.f4520e, i10);
        e(e10.f4505C, i10);
        e(e10.f4510H, i10);
        e(e10.f4512J, i10);
    }
}
