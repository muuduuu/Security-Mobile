package t6;

import android.util.SparseArray;

/* renamed from: t6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4637p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<EnumC4637p> valueMap;
    private final int value;

    static {
        EnumC4637p enumC4637p = DEFAULT;
        EnumC4637p enumC4637p2 = UNMETERED_ONLY;
        EnumC4637p enumC4637p3 = UNMETERED_OR_DAILY;
        EnumC4637p enumC4637p4 = FAST_IF_RADIO_AWAKE;
        EnumC4637p enumC4637p5 = NEVER;
        EnumC4637p enumC4637p6 = UNRECOGNIZED;
        SparseArray<EnumC4637p> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, enumC4637p);
        sparseArray.put(1, enumC4637p2);
        sparseArray.put(2, enumC4637p3);
        sparseArray.put(3, enumC4637p4);
        sparseArray.put(4, enumC4637p5);
        sparseArray.put(-1, enumC4637p6);
    }

    EnumC4637p(int i10) {
        this.value = i10;
    }

    public static EnumC4637p forNumber(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
