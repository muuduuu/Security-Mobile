package j4;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Set f35826a;

    public s() {
        Set b10 = b3.n.b();
        Intrinsics.checkNotNullExpressionValue(b10, "newIdentityHashSet()");
        this.f35826a = b10;
    }

    @Override // e3.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        this.f35826a.add(createBitmap);
        return createBitmap;
    }

    @Override // e3.f, f3.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f35826a.remove(value);
        value.recycle();
    }
}
