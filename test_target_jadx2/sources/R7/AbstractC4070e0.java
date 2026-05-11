package r7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: r7.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4070e0 extends AbstractC4080f0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f39965a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f39966b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f39967c;

    AbstractC4070e0(int i10) {
    }

    private final void d(int i10) {
        Object[] objArr = this.f39965a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f39967c) {
                this.f39965a = (Object[]) objArr.clone();
                this.f39967c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f39965a = Arrays.copyOf(objArr, i11);
        this.f39967c = false;
    }

    public final AbstractC4070e0 b(Object obj) {
        obj.getClass();
        d(this.f39966b + 1);
        Object[] objArr = this.f39965a;
        int i10 = this.f39966b;
        this.f39966b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC4080f0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f39966b + iterable.size());
            if (iterable instanceof AbstractC4090g0) {
                this.f39966b = ((AbstractC4090g0) iterable).c(this.f39965a, this.f39966b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
