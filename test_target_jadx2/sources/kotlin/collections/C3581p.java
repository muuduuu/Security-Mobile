package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nc.AbstractC3728a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3581p extends C3580o {
    public static final Collection g(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new C3572g(objArr, false);
    }

    public static final int h(List list, Comparable comparable, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int a10 = AbstractC3728a.a((Comparable) list.get(i13), comparable);
            if (a10 < 0) {
                i10 = i13 + 1;
            } else {
                if (a10 <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return h(list, comparable, i10, i11);
    }

    public static List j() {
        return y.f36361a;
    }

    public static IntRange k(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static int l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List m(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? AbstractC3574i.d(elements) : CollectionsKt.j();
    }

    public static List n(Object obj) {
        return obj != null ? CollectionsKt.e(obj) : CollectionsKt.j();
    }

    public static List o(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return AbstractC3574i.x(elements);
    }

    public static List p(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C3572g(elements, true));
    }

    public static final List q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt.e(list.get(0)) : CollectionsKt.j();
    }

    private static final void r(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
