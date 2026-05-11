package Jd;

import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class P {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ P[] $VALUES;
    public static final P DEFAULT = new P("DEFAULT", 0);
    public static final P LAZY = new P("LAZY", 1);
    public static final P ATOMIC = new P("ATOMIC", 2);
    public static final P UNDISPATCHED = new P("UNDISPATCHED", 3);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5005a;

        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[P.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5005a = iArr;
        }
    }

    private static final /* synthetic */ P[] $values() {
        return new P[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        P[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private P(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }

    public final <R, T> void invoke(Function2<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, R r10, kotlin.coroutines.d<? super T> dVar) {
        int i10 = a.f5005a[ordinal()];
        if (i10 == 1) {
            Pd.a.c(function2, r10, dVar);
            return;
        }
        if (i10 == 2) {
            kotlin.coroutines.f.a(function2, r10, dVar);
        } else if (i10 == 3) {
            Pd.b.a(function2, r10, dVar);
        } else if (i10 != 4) {
            throw new lc.m();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
