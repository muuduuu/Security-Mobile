package C3;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: C3.a$a, reason: collision with other inner class name */
    public static class C0014a {

        /* renamed from: a, reason: collision with root package name */
        public int f872a;

        /* renamed from: b, reason: collision with root package name */
        public int f873b;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0014a c0014a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0014a.f873b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0014a.f872a) - i10) / f10) + i11), c0014a.f873b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0014a.f872a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0014a.f873b) - i11) * f10) + i10), c0014a.f872a), 1073741824);
        }
    }
}
