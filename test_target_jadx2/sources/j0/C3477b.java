package j0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k0.AbstractC3526a;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5192b;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3477b implements Collection, Set, InterfaceC5192b, yc.f {

    /* renamed from: a, reason: collision with root package name */
    private int[] f35681a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f35682b;

    /* renamed from: c, reason: collision with root package name */
    private int f35683c;

    /* renamed from: j0.b$a */
    private final class a extends e {
        public a() {
            super(C3477b.this.m());
        }

        @Override // j0.e
        protected Object a(int i10) {
            return C3477b.this.w(i10);
        }

        @Override // j0.e
        protected void b(int i10) {
            C3477b.this.r(i10);
        }
    }

    public C3477b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int c10;
        int m10 = m();
        if (obj == null) {
            c10 = d.d(this);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            c10 = d.c(this, obj, hashCode);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        if (m10 >= h().length) {
            int i12 = 8;
            if (m10 >= 8) {
                i12 = (m10 >> 1) + m10;
            } else if (m10 < 4) {
                i12 = 4;
            }
            int[] h10 = h();
            Object[] e10 = e();
            d.a(this, i12);
            if (m10 != m()) {
                throw new ConcurrentModificationException();
            }
            if (!(h().length == 0)) {
                AbstractC3574i.j(h10, h(), 0, 0, h10.length, 6, null);
                AbstractC3574i.k(e10, e(), 0, 0, e10.length, 6, null);
            }
        }
        if (i11 < m10) {
            int i13 = i11 + 1;
            AbstractC3574i.f(h(), h(), i13, i11, m10);
            AbstractC3574i.h(e(), e(), i13, i11, m10);
        }
        if (m10 != m() || i11 >= h().length) {
            throw new ConcurrentModificationException();
        }
        h()[i11] = i10;
        e()[i11] = obj;
        v(m() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c(m() + elements.size());
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    public final void c(int i10) {
        int m10 = m();
        if (h().length < i10) {
            int[] h10 = h();
            Object[] e10 = e();
            d.a(this, i10);
            if (m() > 0) {
                AbstractC3574i.j(h10, h(), 0, 0, m(), 6, null);
                AbstractC3574i.k(e10, e(), 0, 0, m(), 6, null);
            }
        }
        if (m() != m10) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m() != 0) {
            u(AbstractC3526a.f35960a);
            t(AbstractC3526a.f35962c);
            v(0);
        }
        if (m() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] e() {
        return this.f35682b;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int m10 = m();
                for (int i10 = 0; i10 < m10; i10++) {
                    if (((Set) obj).contains(w(i10))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int[] h() {
        return this.f35681a;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] h10 = h();
        int m10 = m();
        int i10 = 0;
        for (int i11 = 0; i11 < m10; i11++) {
            i10 += h10[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public int j() {
        return this.f35683c;
    }

    public final int m() {
        return this.f35683c;
    }

    public final Object r(int i10) {
        int m10 = m();
        Object obj = e()[i10];
        if (m10 <= 1) {
            clear();
        } else {
            int i11 = m10 - 1;
            if (h().length <= 8 || m() >= h().length / 3) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    AbstractC3574i.f(h(), h(), i10, i12, m10);
                    AbstractC3574i.h(e(), e(), i10, i12, m10);
                }
                e()[i11] = null;
            } else {
                int m11 = m() > 8 ? m() + (m() >> 1) : 8;
                int[] h10 = h();
                Object[] e10 = e();
                d.a(this, m11);
                if (i10 > 0) {
                    AbstractC3574i.j(h10, h(), 0, 0, i10, 6, null);
                    AbstractC3574i.k(e10, e(), 0, 0, i10, 6, null);
                }
                if (i10 < i11) {
                    int i13 = i10 + 1;
                    AbstractC3574i.f(h10, h(), i10, i13, m10);
                    AbstractC3574i.h(e10, e(), i10, i13, m10);
                }
            }
            if (m10 != m()) {
                throw new ConcurrentModificationException();
            }
            v(i11);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        r(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int m10 = m() - 1; -1 < m10; m10--) {
            if (!CollectionsKt.V(elements, e()[m10])) {
                r(m10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return j();
    }

    public final void t(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f35682b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC3574i.m(this.f35682b, 0, this.f35683c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(m() * 14);
        sb2.append('{');
        int m10 = m();
        for (int i10 = 0; i10 < m10; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object w10 = w(i10);
            if (w10 != this) {
                sb2.append(w10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final void u(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f35681a = iArr;
    }

    public final void v(int i10) {
        this.f35683c = i10;
    }

    public final Object w(int i10) {
        return e()[i10];
    }

    public C3477b(int i10) {
        this.f35681a = AbstractC3526a.f35960a;
        this.f35682b = AbstractC3526a.f35962c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] result = c.a(array, this.f35683c);
        AbstractC3574i.h(this.f35682b, result, 0, 0, this.f35683c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public /* synthetic */ C3477b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
