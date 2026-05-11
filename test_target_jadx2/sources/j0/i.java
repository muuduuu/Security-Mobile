package j0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k0.AbstractC3526a;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private int[] f35702a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f35703b;

    /* renamed from: c, reason: collision with root package name */
    private int f35704c;

    public i() {
        this(0, 1, null);
    }

    private final int c(Object obj, int i10) {
        int i11 = this.f35704c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = AbstractC3526a.a(this.f35702a, i11, i10);
        if (a10 < 0) {
            return a10;
        }
        if (Intrinsics.b(obj, this.f35703b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f35702a[i12] == i10) {
            if (Intrinsics.b(obj, this.f35703b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.f35702a[i13] == i10; i13--) {
            if (Intrinsics.b(obj, this.f35703b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int e() {
        int i10 = this.f35704c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = AbstractC3526a.a(this.f35702a, i10, 0);
        if (a10 < 0) {
            return a10;
        }
        if (this.f35703b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f35702a[i11] == 0) {
            if (this.f35703b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f35702a[i12] == 0; i12--) {
            if (this.f35703b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f35704c * 2;
        Object[] objArr = this.f35703b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.b(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f35704c;
        int[] iArr = this.f35702a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35702a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35703b, i10 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f35703b = copyOf2;
        }
        if (this.f35704c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f35704c > 0) {
            this.f35702a = AbstractC3526a.f35960a;
            this.f35703b = AbstractC3526a.f35962c;
            this.f35704c = 0;
        }
        if (this.f35704c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                if (size() != ((i) obj).size()) {
                    return false;
                }
                i iVar = (i) obj;
                int i10 = this.f35704c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object f10 = f(i11);
                    Object j10 = j(i11);
                    Object obj2 = iVar.get(f10);
                    if (j10 == null) {
                        if (obj2 != null || !iVar.containsKey(f10)) {
                            return false;
                        }
                    } else if (!Intrinsics.b(j10, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f35704c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f11 = f(i13);
                Object j11 = j(i13);
                Object obj3 = ((Map) obj).get(f11);
                if (j11 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f11)) {
                        return false;
                    }
                } else if (!Intrinsics.b(j11, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f35704c) {
            z10 = true;
        }
        if (!z10) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f35703b[i10 << 1];
    }

    public void g(i map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i10 = map.f35704c;
        b(this.f35704c + i10);
        if (this.f35704c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.f(i11), map.j(i11));
            }
        } else if (i10 > 0) {
            AbstractC3574i.f(map.f35702a, this.f35702a, 0, 0, i10);
            AbstractC3574i.h(map.f35703b, this.f35703b, 0, 0, i10 << 1);
            this.f35704c = i10;
        }
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f35703b[(d10 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        return d10 >= 0 ? this.f35703b[(d10 << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        if (!(i10 >= 0 && i10 < this.f35704c)) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f35703b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f35704c;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f35702a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    AbstractC3574i.f(iArr, iArr, i10, i14, i12);
                    Object[] objArr2 = this.f35703b;
                    AbstractC3574i.h(objArr2, objArr2, i11, i14 << 1, i12 << 1);
                }
                Object[] objArr3 = this.f35703b;
                int i15 = i13 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i16);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f35702a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f35703b, i16 << 1);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.f35703b = copyOf2;
                if (i12 != this.f35704c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    AbstractC3574i.f(iArr, this.f35702a, 0, 0, i10);
                    AbstractC3574i.h(objArr, this.f35703b, 0, 0, i11);
                }
                if (i10 < i13) {
                    int i17 = i10 + 1;
                    AbstractC3574i.f(iArr, this.f35702a, i10, i17, i12);
                    AbstractC3574i.h(objArr, this.f35703b, i11, i17 << 1, i12 << 1);
                }
            }
            if (i12 != this.f35704c) {
                throw new ConcurrentModificationException();
            }
            this.f35704c = i13;
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f35702a;
        Object[] objArr = this.f35703b;
        int i10 = this.f35704c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public Object i(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f35704c) {
            z10 = true;
        }
        if (!z10) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f35703b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f35704c <= 0;
    }

    public Object j(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f35704c) {
            z10 = true;
        }
        if (!z10) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f35703b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f35704c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c10 = obj != null ? c(obj, hashCode) : e();
        if (c10 >= 0) {
            int i11 = (c10 << 1) + 1;
            Object[] objArr = this.f35703b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~c10;
        int[] iArr = this.f35702a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35702a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35703b, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f35703b = copyOf2;
            if (i10 != this.f35704c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f35702a;
            int i14 = i12 + 1;
            AbstractC3574i.f(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f35703b;
            AbstractC3574i.h(objArr2, objArr2, i14 << 1, i12 << 1, this.f35704c << 1);
        }
        int i15 = this.f35704c;
        if (i10 == i15) {
            int[] iArr3 = this.f35702a;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.f35703b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f35704c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return i(d10, obj2);
        }
        return null;
    }

    public int size() {
        return this.f35704c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35704c * 28);
        sb2.append('{');
        int i10 = this.f35704c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object f10 = f(i11);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object j10 = j(i11);
            if (j10 != sb2) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public i(int i10) {
        this.f35702a = i10 == 0 ? AbstractC3526a.f35960a : new int[i10];
        this.f35703b = i10 == 0 ? AbstractC3526a.f35962c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !Intrinsics.b(obj2, j(d10))) {
            return false;
        }
        h(d10);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !Intrinsics.b(obj2, j(d10))) {
            return false;
        }
        i(d10, obj3);
        return true;
    }

    public /* synthetic */ i(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public i(i iVar) {
        this(0, 1, null);
        if (iVar != null) {
            g(iVar);
        }
    }
}
