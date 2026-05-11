package Ad;

import kotlin.jvm.internal.Intrinsics;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class p {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f414a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f414a = iArr;
        }
    }

    public static final s a(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        int i10 = a.f414a[u0Var.ordinal()];
        if (i10 == 1) {
            return s.INV;
        }
        if (i10 == 2) {
            return s.IN;
        }
        if (i10 == 3) {
            return s.OUT;
        }
        throw new lc.m();
    }
}
