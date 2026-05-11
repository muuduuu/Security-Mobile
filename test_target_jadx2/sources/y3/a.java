package Y3;

import android.graphics.Bitmap;
import b4.C1649a;
import f3.AbstractC3142a;
import j4.i;
import kotlin.jvm.internal.Intrinsics;
import q4.C3919a;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final i f11998a;

    /* renamed from: b, reason: collision with root package name */
    private final C1649a f11999b;

    public a(i bitmapPool, C1649a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f11998a = bitmapPool;
        this.f11999b = closeableReferenceFactory;
    }

    @Override // Y3.d
    public AbstractC3142a d(int i10, int i11, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f11998a.get(C3919a.f(i10, i11, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i10 * i11 * C3919a.e(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i10, i11, bitmapConfig);
        AbstractC3142a c10 = this.f11999b.c(bitmap, this.f11998a);
        Intrinsics.checkNotNullExpressionValue(c10, "closeableReferenceFactor…reate(bitmap, bitmapPool)");
        return c10;
    }
}
