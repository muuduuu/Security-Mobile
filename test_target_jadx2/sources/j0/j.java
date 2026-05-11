package j0;

import java.util.Arrays;
import k0.AbstractC3526a;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f35705a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f35706b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f35707c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f35708d;

    public j() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f35708d;
        if (i11 != 0 && i10 <= this.f35706b[i11 - 1]) {
            n(i10, obj);
            return;
        }
        if (this.f35705a && i11 >= this.f35706b.length) {
            k.d(this);
        }
        int i12 = this.f35708d;
        if (i12 >= this.f35706b.length) {
            int e10 = AbstractC3526a.e(i12 + 1);
            int[] copyOf = Arrays.copyOf(this.f35706b, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35706b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35707c, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f35707c = copyOf2;
        }
        this.f35706b[i12] = i10;
        this.f35707c[i12] = obj;
        this.f35708d = i12 + 1;
    }

    public void b() {
        int i10 = this.f35708d;
        Object[] objArr = this.f35707c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f35708d = 0;
        this.f35705a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j clone() {
        Object clone = super.clone();
        Intrinsics.e(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) clone;
        jVar.f35706b = (int[]) this.f35706b.clone();
        jVar.f35707c = (Object[]) this.f35707c.clone();
        return jVar;
    }

    public boolean h(int i10) {
        return k(i10) >= 0;
    }

    public Object i(int i10) {
        return k.c(this, i10);
    }

    public int k(int i10) {
        if (this.f35705a) {
            k.d(this);
        }
        return AbstractC3526a.a(this.f35706b, this.f35708d, i10);
    }

    public int l(Object obj) {
        if (this.f35705a) {
            k.d(this);
        }
        int i10 = this.f35708d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f35707c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int m(int i10) {
        if (this.f35705a) {
            k.d(this);
        }
        return this.f35706b[i10];
    }

    public void n(int i10, Object obj) {
        Object obj2;
        int a10 = AbstractC3526a.a(this.f35706b, this.f35708d, i10);
        if (a10 >= 0) {
            this.f35707c[a10] = obj;
            return;
        }
        int i11 = ~a10;
        if (i11 < this.f35708d) {
            Object obj3 = this.f35707c[i11];
            obj2 = k.f35709a;
            if (obj3 == obj2) {
                this.f35706b[i11] = i10;
                this.f35707c[i11] = obj;
                return;
            }
        }
        if (this.f35705a && this.f35708d >= this.f35706b.length) {
            k.d(this);
            i11 = ~AbstractC3526a.a(this.f35706b, this.f35708d, i10);
        }
        int i12 = this.f35708d;
        if (i12 >= this.f35706b.length) {
            int e10 = AbstractC3526a.e(i12 + 1);
            int[] copyOf = Arrays.copyOf(this.f35706b, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35706b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35707c, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f35707c = copyOf2;
        }
        int i13 = this.f35708d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f35706b;
            int i14 = i11 + 1;
            AbstractC3574i.f(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f35707c;
            AbstractC3574i.h(objArr, objArr, i14, i11, this.f35708d);
        }
        this.f35706b[i11] = i10;
        this.f35707c[i11] = obj;
        this.f35708d++;
    }

    public int o() {
        if (this.f35705a) {
            k.d(this);
        }
        return this.f35708d;
    }

    public Object p(int i10) {
        if (this.f35705a) {
            k.d(this);
        }
        return this.f35707c[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35708d * 28);
        sb2.append('{');
        int i10 = this.f35708d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append('=');
            Object p10 = p(i11);
            if (p10 != this) {
                sb2.append(p10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }

    public j(int i10) {
        if (i10 == 0) {
            this.f35706b = AbstractC3526a.f35960a;
            this.f35707c = AbstractC3526a.f35962c;
        } else {
            int e10 = AbstractC3526a.e(i10);
            this.f35706b = new int[e10];
            this.f35707c = new Object[e10];
        }
    }

    public /* synthetic */ j(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
