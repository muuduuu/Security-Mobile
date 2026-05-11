package k4;

import android.os.Build;
import e3.C3075b;
import j4.C3491E;
import j4.i;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f36220a = new e();

    private e() {
    }

    public static final d a(C3491E poolFactory, boolean z10, boolean z11, f platformDecoderOptions) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i b10 = poolFactory.b();
            Intrinsics.checkNotNullExpressionValue(b10, "poolFactory.bitmapPool");
            return new c(b10, b(poolFactory, z11), platformDecoderOptions);
        }
        i b11 = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(b11, "poolFactory.bitmapPool");
        return new C3541a(b11, b(poolFactory, z11), platformDecoderOptions);
    }

    public static final y0.d b(C3491E poolFactory, boolean z10) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        if (z10) {
            C3075b INSTANCE = C3075b.f32181a;
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int e10 = poolFactory.e();
        y0.e eVar = new y0.e(e10);
        for (int i10 = 0; i10 < e10; i10++) {
            eVar.a(ByteBuffer.allocate(C3075b.e()));
        }
        return eVar;
    }
}
