package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3577l extends C3576k {

    /* renamed from: kotlin.collections.l$a */
    public static final class a extends AbstractC3568c implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f36356b;

        a(int[] iArr) {
            this.f36356b = iArr;
        }

        public boolean C(int i10) {
            return AbstractC3574i.u(this.f36356b, i10);
        }

        @Override // kotlin.collections.AbstractC3566a
        public int c() {
            return this.f36356b.length;
        }

        @Override // kotlin.collections.AbstractC3566a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return C(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f36356b[i10]);
        }

        public int h(int i10) {
            return C3578m.H(this.f36356b, i10);
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return h(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC3566a, java.util.Collection
        public boolean isEmpty() {
            return this.f36356b.length == 0;
        }

        public int j(int i10) {
            return C3578m.U(this.f36356b, i10);
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return j(((Number) obj).intValue());
            }
            return -1;
        }
    }

    public static List c(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new a(iArr);
    }

    public static List d(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List a10 = AbstractC3579n.a(objArr);
        Intrinsics.checkNotNullExpressionValue(a10, "asList(...)");
        return a10;
    }

    public static byte[] e(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] f(int[] iArr, int[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] g(long[] jArr, long[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] h(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] i(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return AbstractC3574i.e(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] j(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return AbstractC3574i.f(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] k(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return AbstractC3574i.h(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] l(byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C3575j.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] m(Object[] objArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        C3575j.b(i11, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void n(byte[] bArr, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static void o(Object[] objArr, Object obj, int i10, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void p(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        AbstractC3574i.o(objArr, obj, i10, i11);
    }

    public static final void q(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static void r(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
