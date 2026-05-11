package k4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import j4.i;
import kotlin.jvm.internal.Intrinsics;
import q4.C3919a;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: h, reason: collision with root package name */
    private final f f36219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i bitmapPool, y0.d decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        this.f36219h = platformDecoderOptions;
    }

    @Override // k4.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        Bitmap.Config config;
        Intrinsics.checkNotNullParameter(options, "options");
        config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C3919a.f(i10, i11, config);
    }
}
