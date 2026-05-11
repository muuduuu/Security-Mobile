package t7;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class I extends J {

    /* renamed from: a, reason: collision with root package name */
    Object[] f42544a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f42545b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f42546c;

    I(int i10) {
    }

    private final void b(int i10) {
        Object[] objArr = this.f42544a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f42546c) {
                this.f42544a = (Object[]) objArr.clone();
                this.f42546c = false;
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
        this.f42544a = Arrays.copyOf(objArr, i11);
        this.f42546c = false;
    }

    public final I a(Object obj) {
        obj.getClass();
        b(this.f42545b + 1);
        Object[] objArr = this.f42544a;
        int i10 = this.f42545b;
        this.f42545b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
