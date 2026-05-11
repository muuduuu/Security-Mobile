package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import xc.AbstractC5149b;
import yc.InterfaceC5191a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3578m extends C3577l {

    /* renamed from: kotlin.collections.m$a */
    public static final class a implements Iterable, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f36357a;

        public a(Object[] objArr) {
            this.f36357a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC5149b.a(this.f36357a);
        }
    }

    /* renamed from: kotlin.collections.m$b */
    public static final class b implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f36358a;

        public b(Object[] objArr) {
            this.f36358a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC5149b.a(this.f36358a);
        }
    }

    /* renamed from: kotlin.collections.m$c */
    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f36359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object[] objArr) {
            super(0);
            this.f36359a = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Object> invoke() {
            return AbstractC5149b.a(this.f36359a);
        }
    }

    public static Object A(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static List A0(int[] iArr, Object[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = iArr[i10];
            arrayList.add(lc.t.a(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    public static IntRange B(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IntRange(0, C(bArr));
    }

    public static List B0(Object[] objArr, Iterable other) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.u(other, 10), length));
        int i10 = 0;
        for (Object obj : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(lc.t.a(objArr[i10], obj));
            i10++;
        }
        return arrayList;
    }

    public static final int C(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    public static List C0(Object[] objArr, Object[] other) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(lc.t.a(objArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static int D(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Double E(double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0 || i10 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static Integer F(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Object G(Object[] objArr, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static final int H(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static int I(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (Intrinsics.b(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable J(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable K(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable L(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable M(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        CharSequence charSequence5 = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence6 = BuildConfig.FLAVOR;
        CharSequence charSequence7 = i12 != 0 ? BuildConfig.FLAVOR : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return L(objArr, appendable, charSequence5, charSequence7, charSequence6, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : function1);
    }

    public static final String N(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb2 = ((StringBuilder) J(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String O(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb2 = ((StringBuilder) K(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String P(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb2 = ((StringBuilder) L(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String Q(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? BuildConfig.FLAVOR : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return N(bArr, charSequence, charSequence6, charSequence5, i13, charSequence7, function1);
    }

    public static /* synthetic */ String R(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? BuildConfig.FLAVOR : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return O(iArr, charSequence, charSequence6, charSequence5, i13, charSequence7, function1);
    }

    public static /* synthetic */ String S(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? BuildConfig.FLAVOR : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return P(objArr, charSequence, charSequence6, charSequence5, i13, charSequence7, function1);
    }

    public static Object T(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[AbstractC3574i.D(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int U(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static List V(Object[] objArr, Function1 transform) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(transform.invoke(obj));
        }
        return arrayList;
    }

    public static Comparable W(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int D10 = AbstractC3574i.D(comparableArr);
        int i10 = 1;
        if (1 <= D10) {
            while (true) {
                Comparable comparable2 = comparableArr[i10];
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
                if (i10 == D10) {
                    break;
                }
                i10++;
            }
        }
        return comparable;
    }

    public static List X(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return CollectionsKt.j();
        }
        List v02 = AbstractC3574i.v0(objArr);
        w.R(v02);
        return v02;
    }

    public static char Y(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object Z(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object a0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static byte[] b0(byte[] bArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : AbstractC3574i.l(bArr, indices.t().intValue(), indices.r().intValue() + 1);
    }

    public static final Object[] c0(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        AbstractC3574i.r(copyOf, comparator);
        return copyOf;
    }

    public static List d0(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return AbstractC3574i.d(c0(objArr, comparator));
    }

    public static final List e0(Object[] objArr, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.j();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return AbstractC3574i.m0(objArr);
        }
        if (i10 == 1) {
            return CollectionsKt.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static final Collection f0(Object[] objArr, Collection destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List g0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? p0(bArr) : CollectionsKt.e(Byte.valueOf(bArr[0])) : CollectionsKt.j();
    }

    public static List h0(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? q0(cArr) : CollectionsKt.e(Character.valueOf(cArr[0])) : CollectionsKt.j();
    }

    public static List i0(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? r0(dArr) : CollectionsKt.e(Double.valueOf(dArr[0])) : CollectionsKt.j();
    }

    public static List j0(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? s0(fArr) : CollectionsKt.e(Float.valueOf(fArr[0])) : CollectionsKt.j();
    }

    public static List k0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? t0(iArr) : CollectionsKt.e(Integer.valueOf(iArr[0])) : CollectionsKt.j();
    }

    public static List l0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? u0(jArr) : CollectionsKt.e(Long.valueOf(jArr[0])) : CollectionsKt.j();
    }

    public static List m0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? AbstractC3574i.v0(objArr) : CollectionsKt.e(objArr[0]) : CollectionsKt.j();
    }

    public static List n0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? w0(sArr) : CollectionsKt.e(Short.valueOf(sArr[0])) : CollectionsKt.j();
    }

    public static List o0(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? x0(zArr) : CollectionsKt.e(Boolean.valueOf(zArr[0])) : CollectionsKt.j();
    }

    public static final List p0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List q0(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static final List r0(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static Iterable s(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? CollectionsKt.j() : new a(objArr);
    }

    public static final List s0(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static Sequence t(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? kotlin.sequences.j.e() : new b(objArr);
    }

    public static final List t0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static boolean u(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return H(iArr, i10) >= 0;
    }

    public static final List u0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean v(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return AbstractC3574i.I(objArr, obj) >= 0;
    }

    public static List v0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(C3581p.g(objArr));
    }

    public static List w(Object[] objArr, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i10 >= 0) {
            return e0(objArr, kotlin.ranges.d.d(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final List w0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static List x(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return (List) y(objArr, new ArrayList());
    }

    public static final List x0(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final Collection y(Object[] objArr, Collection destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Set y0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) f0(objArr, new LinkedHashSet(G.d(objArr.length))) : O.c(objArr[0]) : O.d();
    }

    public static Object z(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Iterable z0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new B(new c(objArr));
    }
}
