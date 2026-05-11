package p4;

import android.graphics.Bitmap;
import f3.AbstractC3142a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f38324a = new b();

    private b() {
    }

    public static final boolean a(InterfaceC3793a interfaceC3793a, AbstractC3142a abstractC3142a) {
        if (interfaceC3793a == null || abstractC3142a == null) {
            return false;
        }
        Object p10 = abstractC3142a.p();
        Intrinsics.checkNotNullExpressionValue(p10, "bitmapReference.get()");
        Bitmap bitmap = (Bitmap) p10;
        if (interfaceC3793a.a()) {
            bitmap.setHasAlpha(true);
        }
        interfaceC3793a.b(bitmap);
        return true;
    }
}
