package L9;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5717a = new int[2];

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            v10.removeOnAttachStateChangeListener(this);
            v10.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
        }
    }

    public static final void a(View view, Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!view.isAttachedToWindow()) {
            P9.a.d(P9.a.f7630a, "View.copyBoundsInWindow", "Can not copy bounds as view is not attached to window", null, 4, null);
            return;
        }
        rect.set(0, 0, view.getWidth(), view.getHeight());
        int[] iArr = f5717a;
        view.getLocationInWindow(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public static final int[] b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}
