package Y3;

import b4.C1649a;
import j4.C3491E;
import j4.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f12006a = new e();

    private e() {
    }

    public static final d a(C3491E poolFactory, k4.d platformDecoder, C1649a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        i b10 = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(b10, "poolFactory.bitmapPool");
        return new a(b10, closeableReferenceFactory);
    }
}
