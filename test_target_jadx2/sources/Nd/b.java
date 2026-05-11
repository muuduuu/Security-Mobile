package Nd;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private d[] f6744a;

    /* renamed from: b, reason: collision with root package name */
    private int f6745b;

    /* renamed from: c, reason: collision with root package name */
    private int f6746c;

    protected final d d() {
        d dVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f6744a;
                if (dVarArr == null) {
                    dVarArr = h(2);
                    this.f6744a = dVarArr;
                } else if (this.f6745b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f6744a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i10 = this.f6746c;
                do {
                    dVar = dVarArr[i10];
                    if (dVar == null) {
                        dVar = g();
                        dVarArr[i10] = dVar;
                    }
                    i10++;
                    if (i10 >= dVarArr.length) {
                        i10 = 0;
                    }
                    Intrinsics.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f6746c = i10;
                this.f6745b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    protected abstract d g();

    protected abstract d[] h(int i10);

    protected final void i(d dVar) {
        int i10;
        kotlin.coroutines.d[] b10;
        synchronized (this) {
            try {
                int i11 = this.f6745b - 1;
                this.f6745b = i11;
                if (i11 == 0) {
                    this.f6746c = 0;
                }
                Intrinsics.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.d dVar2 : b10) {
            if (dVar2 != null) {
                o.a aVar = lc.o.f37128b;
                dVar2.resumeWith(lc.o.b(Unit.f36324a));
            }
        }
    }

    protected final d[] j() {
        return this.f6744a;
    }
}
