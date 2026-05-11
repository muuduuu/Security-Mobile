package k4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import j4.i;
import kotlin.jvm.internal.Intrinsics;
import q4.C3919a;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3541a extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3541a(i bitmapPool, y0.d decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
    }

    @Override // k4.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return C3919a.f(i10, i11, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
