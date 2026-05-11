package mc;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC3568c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* renamed from: mc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3668d implements Map, Serializable, yc.e {

    /* renamed from: n, reason: collision with root package name */
    public static final a f37449n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final C3668d f37450o;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f37451a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f37452b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f37453c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f37454d;

    /* renamed from: e, reason: collision with root package name */
    private int f37455e;

    /* renamed from: f, reason: collision with root package name */
    private int f37456f;

    /* renamed from: g, reason: collision with root package name */
    private int f37457g;

    /* renamed from: h, reason: collision with root package name */
    private int f37458h;

    /* renamed from: i, reason: collision with root package name */
    private int f37459i;

    /* renamed from: j, reason: collision with root package name */
    private C3670f f37460j;

    /* renamed from: k, reason: collision with root package name */
    private C3671g f37461k;

    /* renamed from: l, reason: collision with root package name */
    private C3669e f37462l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37463m;

    /* renamed from: mc.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(kotlin.ranges.d.d(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final C3668d e() {
            return C3668d.f37450o;
        }

        private a() {
        }
    }

    /* renamed from: mc.d$b */
    public static final class b extends C0564d implements Iterator, InterfaceC5191a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3668d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() >= d().f37456f) {
                throw new NoSuchElementException();
            }
            int b10 = b();
            g(b10 + 1);
            h(b10);
            c cVar = new c(d(), c());
            f();
            return cVar;
        }

        public final void j(StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (b() >= d().f37456f) {
                throw new NoSuchElementException();
            }
            int b10 = b();
            g(b10 + 1);
            h(b10);
            Object obj = d().f37451a[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = d().f37452b;
            Intrinsics.d(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            f();
        }

        public final int l() {
            if (b() >= d().f37456f) {
                throw new NoSuchElementException();
            }
            int b10 = b();
            g(b10 + 1);
            h(b10);
            Object obj = d().f37451a[c()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = d().f37452b;
            Intrinsics.d(objArr);
            Object obj2 = objArr[c()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return hashCode2;
        }
    }

    /* renamed from: mc.d$c */
    public static final class c implements Map.Entry, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final C3668d f37464a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37465b;

        public c(C3668d map, int i10) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f37464a = map;
            this.f37465b = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.b(entry.getKey(), getKey()) && Intrinsics.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f37464a.f37451a[this.f37465b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f37464a.f37452b;
            Intrinsics.d(objArr);
            return objArr[this.f37465b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f37464a.m();
            Object[] j10 = this.f37464a.j();
            int i10 = this.f37465b;
            Object obj2 = j10[i10];
            j10[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: mc.d$d, reason: collision with other inner class name */
    public static class C0564d {

        /* renamed from: a, reason: collision with root package name */
        private final C3668d f37466a;

        /* renamed from: b, reason: collision with root package name */
        private int f37467b;

        /* renamed from: c, reason: collision with root package name */
        private int f37468c;

        /* renamed from: d, reason: collision with root package name */
        private int f37469d;

        public C0564d(C3668d map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f37466a = map;
            this.f37468c = -1;
            this.f37469d = map.f37458h;
            f();
        }

        public final void a() {
            if (this.f37466a.f37458h != this.f37469d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f37467b;
        }

        public final int c() {
            return this.f37468c;
        }

        public final C3668d d() {
            return this.f37466a;
        }

        public final void f() {
            while (this.f37467b < this.f37466a.f37456f) {
                int[] iArr = this.f37466a.f37453c;
                int i10 = this.f37467b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f37467b = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f37467b = i10;
        }

        public final void h(int i10) {
            this.f37468c = i10;
        }

        public final boolean hasNext() {
            return this.f37467b < this.f37466a.f37456f;
        }

        public final void remove() {
            a();
            if (this.f37468c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f37466a.m();
            this.f37466a.M(this.f37468c);
            this.f37468c = -1;
            this.f37469d = this.f37466a.f37458h;
        }
    }

    /* renamed from: mc.d$e */
    public static final class e extends C0564d implements Iterator, InterfaceC5191a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3668d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f37456f) {
                throw new NoSuchElementException();
            }
            int b10 = b();
            g(b10 + 1);
            h(b10);
            Object obj = d().f37451a[c()];
            f();
            return obj;
        }
    }

    /* renamed from: mc.d$f */
    public static final class f extends C0564d implements Iterator, InterfaceC5191a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C3668d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f37456f) {
                throw new NoSuchElementException();
            }
            int b10 = b();
            g(b10 + 1);
            h(b10);
            Object[] objArr = d().f37452b;
            Intrinsics.d(objArr);
            Object obj = objArr[c()];
            f();
            return obj;
        }
    }

    static {
        C3668d c3668d = new C3668d(0);
        c3668d.f37463m = true;
        f37450o = c3668d;
    }

    private C3668d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f37451a = objArr;
        this.f37452b = objArr2;
        this.f37453c = iArr;
        this.f37454d = iArr2;
        this.f37455e = i10;
        this.f37456f = i11;
        this.f37457g = f37449n.d(z());
    }

    private final int E(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f37457g;
    }

    private final boolean G(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        t(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (H((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean H(Map.Entry entry) {
        int i10 = i(entry.getKey());
        Object[] j10 = j();
        if (i10 >= 0) {
            j10[i10] = entry.getValue();
            return true;
        }
        int i11 = (-i10) - 1;
        if (Intrinsics.b(entry.getValue(), j10[i11])) {
            return false;
        }
        j10[i11] = entry.getValue();
        return true;
    }

    private final boolean I(int i10) {
        int E10 = E(this.f37451a[i10]);
        int i11 = this.f37455e;
        while (true) {
            int[] iArr = this.f37454d;
            if (iArr[E10] == 0) {
                iArr[E10] = i10 + 1;
                this.f37453c[i10] = E10;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            E10 = E10 == 0 ? z() - 1 : E10 - 1;
        }
    }

    private final void J() {
        this.f37458h++;
    }

    private final void K(int i10) {
        J();
        int i11 = 0;
        if (this.f37456f > size()) {
            n(false);
        }
        this.f37454d = new int[i10];
        this.f37457g = f37449n.d(i10);
        while (i11 < this.f37456f) {
            int i12 = i11 + 1;
            if (!I(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i10) {
        AbstractC3667c.f(this.f37451a, i10);
        Object[] objArr = this.f37452b;
        if (objArr != null) {
            AbstractC3667c.f(objArr, i10);
        }
        N(this.f37453c[i10]);
        this.f37453c[i10] = -1;
        this.f37459i = size() - 1;
        J();
    }

    private final void N(int i10) {
        int h10 = kotlin.ranges.d.h(this.f37455e * 2, z() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? z() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f37455e) {
                this.f37454d[i12] = 0;
                return;
            }
            int[] iArr = this.f37454d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((E(this.f37451a[i14]) - i10) & (z() - 1)) >= i11) {
                    this.f37454d[i12] = i13;
                    this.f37453c[i14] = i12;
                }
                h10--;
            }
            i12 = i10;
            i11 = 0;
            h10--;
        } while (h10 >= 0);
        this.f37454d[i12] = -1;
    }

    private final boolean Q(int i10) {
        int x10 = x();
        int i11 = this.f37456f;
        int i12 = x10 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= x() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] j() {
        Object[] objArr = this.f37452b;
        if (objArr != null) {
            return objArr;
        }
        Object[] d10 = AbstractC3667c.d(x());
        this.f37452b = d10;
        return d10;
    }

    private final void n(boolean z10) {
        int i10;
        Object[] objArr = this.f37452b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f37456f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f37453c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f37451a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f37454d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC3667c.g(this.f37451a, i12, i10);
        if (objArr != null) {
            AbstractC3667c.g(objArr, i12, this.f37456f);
        }
        this.f37456f = i12;
    }

    private final boolean r(Map map) {
        return size() == map.size() && o(map.entrySet());
    }

    private final void s(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > x()) {
            int e10 = AbstractC3568c.f36342a.e(x(), i10);
            this.f37451a = AbstractC3667c.e(this.f37451a, e10);
            Object[] objArr = this.f37452b;
            this.f37452b = objArr != null ? AbstractC3667c.e(objArr, e10) : null;
            int[] copyOf = Arrays.copyOf(this.f37453c, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f37453c = copyOf;
            int c10 = f37449n.c(e10);
            if (c10 > z()) {
                K(c10);
            }
        }
    }

    private final void t(int i10) {
        if (Q(i10)) {
            n(true);
        } else {
            s(this.f37456f + i10);
        }
    }

    private final int v(Object obj) {
        int E10 = E(obj);
        int i10 = this.f37455e;
        while (true) {
            int i11 = this.f37454d[E10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.b(this.f37451a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            E10 = E10 == 0 ? z() - 1 : E10 - 1;
        }
    }

    private final int w(Object obj) {
        int i10 = this.f37456f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f37453c[i10] >= 0) {
                Object[] objArr = this.f37452b;
                Intrinsics.d(objArr);
                if (Intrinsics.b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final int z() {
        return this.f37454d.length;
    }

    public Set A() {
        C3670f c3670f = this.f37460j;
        if (c3670f != null) {
            return c3670f;
        }
        C3670f c3670f2 = new C3670f(this);
        this.f37460j = c3670f2;
        return c3670f2;
    }

    public int B() {
        return this.f37459i;
    }

    public Collection D() {
        C3671g c3671g = this.f37461k;
        if (c3671g != null) {
            return c3671g;
        }
        C3671g c3671g2 = new C3671g(this);
        this.f37461k = c3671g2;
        return c3671g2;
    }

    public final e F() {
        return new e(this);
    }

    public final boolean L(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        m();
        int v10 = v(entry.getKey());
        if (v10 < 0) {
            return false;
        }
        Object[] objArr = this.f37452b;
        Intrinsics.d(objArr);
        if (!Intrinsics.b(objArr[v10], entry.getValue())) {
            return false;
        }
        M(v10);
        return true;
    }

    public final boolean O(Object obj) {
        m();
        int v10 = v(obj);
        if (v10 < 0) {
            return false;
        }
        M(v10);
        return true;
    }

    public final boolean P(Object obj) {
        m();
        int w10 = w(obj);
        if (w10 < 0) {
            return false;
        }
        M(w10);
        return true;
    }

    public final f R() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        int i10 = this.f37456f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f37453c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f37454d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC3667c.g(this.f37451a, 0, this.f37456f);
        Object[] objArr = this.f37452b;
        if (objArr != null) {
            AbstractC3667c.g(objArr, 0, this.f37456f);
        }
        this.f37459i = 0;
        this.f37456f = 0;
        J();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return w(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return y();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && r((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int v10 = v(obj);
        if (v10 < 0) {
            return null;
        }
        Object[] objArr = this.f37452b;
        Intrinsics.d(objArr);
        return objArr[v10];
    }

    @Override // java.util.Map
    public int hashCode() {
        b u10 = u();
        int i10 = 0;
        while (u10.hasNext()) {
            i10 += u10.l();
        }
        return i10;
    }

    public final int i(Object obj) {
        m();
        while (true) {
            int E10 = E(obj);
            int h10 = kotlin.ranges.d.h(this.f37455e * 2, z() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f37454d[E10];
                if (i11 <= 0) {
                    if (this.f37456f < x()) {
                        int i12 = this.f37456f;
                        int i13 = i12 + 1;
                        this.f37456f = i13;
                        this.f37451a[i12] = obj;
                        this.f37453c[i12] = E10;
                        this.f37454d[E10] = i13;
                        this.f37459i = size() + 1;
                        J();
                        if (i10 > this.f37455e) {
                            this.f37455e = i10;
                        }
                        return i12;
                    }
                    t(1);
                } else {
                    if (Intrinsics.b(this.f37451a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > h10) {
                        K(z() * 2);
                        break;
                    }
                    E10 = E10 == 0 ? z() - 1 : E10 - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return A();
    }

    public final Map l() {
        m();
        this.f37463m = true;
        if (size() > 0) {
            return this;
        }
        C3668d c3668d = f37450o;
        Intrinsics.e(c3668d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c3668d;
    }

    public final void m() {
        if (this.f37463m) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean o(Collection m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m();
        int i10 = i(obj);
        Object[] j10 = j();
        if (i10 >= 0) {
            j10[i10] = obj2;
            return null;
        }
        int i11 = (-i10) - 1;
        Object obj3 = j10[i11];
        j10[i11] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        m();
        G(from.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int v10 = v(entry.getKey());
        if (v10 < 0) {
            return false;
        }
        Object[] objArr = this.f37452b;
        Intrinsics.d(objArr);
        return Intrinsics.b(objArr[v10], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m();
        int v10 = v(obj);
        if (v10 < 0) {
            return null;
        }
        Object[] objArr = this.f37452b;
        Intrinsics.d(objArr);
        Object obj2 = objArr[v10];
        M(v10);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return B();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b u10 = u();
        int i10 = 0;
        while (u10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            u10.j(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final b u() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return D();
    }

    public final int x() {
        return this.f37451a.length;
    }

    public Set y() {
        C3669e c3669e = this.f37462l;
        if (c3669e != null) {
            return c3669e;
        }
        C3669e c3669e2 = new C3669e(this);
        this.f37462l = c3669e2;
        return c3669e2;
    }

    public C3668d() {
        this(8);
    }

    public C3668d(int i10) {
        this(AbstractC3667c.d(i10), null, new int[i10], new int[f37449n.c(i10)], 2, 0);
    }
}
