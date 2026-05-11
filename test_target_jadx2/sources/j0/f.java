package j0;

import java.util.Arrays;
import k0.AbstractC3526a;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f35688a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f35689b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f35690c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f35691d;

    public f() {
        this(0, 1, null);
    }

    public void a() {
        int i10 = this.f35691d;
        Object[] objArr = this.f35690c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f35691d = 0;
        this.f35688a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f clone() {
        Object clone = super.clone();
        Intrinsics.e(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        f fVar = (f) clone;
        fVar.f35689b = (long[]) this.f35689b.clone();
        fVar.f35690c = (Object[]) this.f35690c.clone();
        return fVar;
    }

    public boolean d(long j10) {
        return i(j10) >= 0;
    }

    public Object h(long j10) {
        Object obj;
        int b10 = AbstractC3526a.b(this.f35689b, this.f35691d, j10);
        if (b10 >= 0) {
            Object obj2 = this.f35690c[b10];
            obj = g.f35692a;
            if (obj2 != obj) {
                return this.f35690c[b10];
            }
        }
        return null;
    }

    public int i(long j10) {
        Object obj;
        if (this.f35688a) {
            int i10 = this.f35691d;
            long[] jArr = this.f35689b;
            Object[] objArr = this.f35690c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj2 = objArr[i12];
                obj = g.f35692a;
                if (obj2 != obj) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj2;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f35688a = false;
            this.f35691d = i11;
        }
        return AbstractC3526a.b(this.f35689b, this.f35691d, j10);
    }

    public long k(int i10) {
        Object obj;
        if (!(i10 >= 0 && i10 < this.f35691d)) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f35688a) {
            int i11 = this.f35691d;
            long[] jArr = this.f35689b;
            Object[] objArr = this.f35690c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                obj = g.f35692a;
                if (obj2 != obj) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f35688a = false;
            this.f35691d = i12;
        }
        return this.f35689b[i10];
    }

    public void l(long j10, Object obj) {
        Object obj2;
        Object obj3;
        int b10 = AbstractC3526a.b(this.f35689b, this.f35691d, j10);
        if (b10 >= 0) {
            this.f35690c[b10] = obj;
            return;
        }
        int i10 = ~b10;
        if (i10 < this.f35691d) {
            Object obj4 = this.f35690c[i10];
            obj3 = g.f35692a;
            if (obj4 == obj3) {
                this.f35689b[i10] = j10;
                this.f35690c[i10] = obj;
                return;
            }
        }
        if (this.f35688a) {
            int i11 = this.f35691d;
            long[] jArr = this.f35689b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f35690c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj5 = objArr[i13];
                    obj2 = g.f35692a;
                    if (obj5 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj5;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f35688a = false;
                this.f35691d = i12;
                i10 = ~AbstractC3526a.b(this.f35689b, i12, j10);
            }
        }
        int i14 = this.f35691d;
        if (i14 >= this.f35689b.length) {
            int f10 = AbstractC3526a.f(i14 + 1);
            long[] copyOf = Arrays.copyOf(this.f35689b, f10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35689b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35690c, f10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f35690c = copyOf2;
        }
        int i15 = this.f35691d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f35689b;
            int i16 = i10 + 1;
            AbstractC3574i.g(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f35690c;
            AbstractC3574i.h(objArr2, objArr2, i16, i10, this.f35691d);
        }
        this.f35689b[i10] = j10;
        this.f35690c[i10] = obj;
        this.f35691d++;
    }

    public void m(long j10) {
        Object obj;
        Object obj2;
        int b10 = AbstractC3526a.b(this.f35689b, this.f35691d, j10);
        if (b10 >= 0) {
            Object obj3 = this.f35690c[b10];
            obj = g.f35692a;
            if (obj3 != obj) {
                Object[] objArr = this.f35690c;
                obj2 = g.f35692a;
                objArr[b10] = obj2;
                this.f35688a = true;
            }
        }
    }

    public void n(int i10) {
        Object obj;
        Object obj2;
        Object obj3 = this.f35690c[i10];
        obj = g.f35692a;
        if (obj3 != obj) {
            Object[] objArr = this.f35690c;
            obj2 = g.f35692a;
            objArr[i10] = obj2;
            this.f35688a = true;
        }
    }

    public int o() {
        Object obj;
        if (this.f35688a) {
            int i10 = this.f35691d;
            long[] jArr = this.f35689b;
            Object[] objArr = this.f35690c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj2 = objArr[i12];
                obj = g.f35692a;
                if (obj2 != obj) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj2;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f35688a = false;
            this.f35691d = i11;
        }
        return this.f35691d;
    }

    public Object p(int i10) {
        Object obj;
        if (!(i10 >= 0 && i10 < this.f35691d)) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f35688a) {
            int i11 = this.f35691d;
            long[] jArr = this.f35689b;
            Object[] objArr = this.f35690c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                obj = g.f35692a;
                if (obj2 != obj) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f35688a = false;
            this.f35691d = i12;
        }
        return this.f35690c[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35691d * 28);
        sb2.append('{');
        int i10 = this.f35691d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(k(i11));
            sb2.append('=');
            Object p10 = p(i11);
            if (p10 != sb2) {
                sb2.append(p10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public f(int i10) {
        if (i10 == 0) {
            this.f35689b = AbstractC3526a.f35961b;
            this.f35690c = AbstractC3526a.f35962c;
        } else {
            int f10 = AbstractC3526a.f(i10);
            this.f35689b = new long[f10];
            this.f35690c = new Object[f10];
        }
    }

    public /* synthetic */ f(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
