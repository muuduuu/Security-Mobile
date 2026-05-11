package n7;

import java.util.Arrays;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3712b extends AbstractC3713c {

    /* renamed from: a, reason: collision with root package name */
    Object[] f37571a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f37572b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f37573c;

    AbstractC3712b(int i10) {
    }

    public final AbstractC3712b a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f37571a.length;
        int i11 = this.f37572b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int highestOneBit = Integer.highestOneBit(i11);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.f37573c) {
            this.f37571a = Arrays.copyOf(this.f37571a, i10);
            this.f37573c = false;
        }
        Object[] objArr = this.f37571a;
        int i13 = this.f37572b;
        this.f37572b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
