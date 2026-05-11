package s7;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class K3 extends AbstractC4408l4 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f40938a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f40939b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f40940c;

    K3(int i10) {
    }

    private final void b(int i10) {
        Object[] objArr = this.f40938a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f40940c) {
                this.f40938a = (Object[]) objArr.clone();
                this.f40940c = false;
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
        this.f40938a = Arrays.copyOf(objArr, i11);
        this.f40940c = false;
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f40939b + 1);
        Object[] objArr = this.f40938a;
        int i10 = this.f40939b;
        this.f40939b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
