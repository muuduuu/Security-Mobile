package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f16068a;

    static class a {
        static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    private M(PointerIcon pointerIcon) {
        this.f16068a = pointerIcon;
    }

    public static M b(Context context, int i10) {
        return new M(a.b(context, i10));
    }

    public Object a() {
        return this.f16068a;
    }
}
