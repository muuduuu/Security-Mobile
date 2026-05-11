package q7;

/* renamed from: q7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3935i {
    static int a(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return i12;
    }
}
