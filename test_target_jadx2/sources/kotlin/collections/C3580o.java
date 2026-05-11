package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mc.C3666b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3580o {
    public static List a(List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((C3666b) builder).E();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (z10 && Intrinsics.b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new C3666b(0, 1, null);
    }

    public static List d(int i10) {
        return new C3666b(i10);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] f(int i10, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
