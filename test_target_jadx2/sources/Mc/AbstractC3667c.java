package mc;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3667c {
    public static final Object[] d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i10);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void f(Object[] objArr, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i10] = null;
    }

    public static final void g(Object[] objArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i10 < i11) {
            f(objArr, i10);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!Intrinsics.b(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Object[] objArr, int i10, int i11) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i10 + i13];
            i12 = (i12 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
