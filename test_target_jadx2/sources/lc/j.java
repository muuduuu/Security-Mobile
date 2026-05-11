package lc;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37127a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37127a = iArr;
        }
    }

    public static Lazy a(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new r(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static Lazy b(l mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i10 = a.f37127a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new r(initializer, defaultConstructorMarker, i11, defaultConstructorMarker);
        }
        if (i10 == 2) {
            return new q(initializer);
        }
        if (i10 == 3) {
            return new C3620B(initializer);
        }
        throw new m();
    }
}
