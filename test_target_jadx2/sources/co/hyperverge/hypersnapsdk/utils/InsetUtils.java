package co.hyperverge.hypersnapsdk.utils;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.I;
import androidx.core.view.K0;
import androidx.core.view.i1;

/* loaded from: classes.dex */
public class InsetUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ K0 lambda$applySystemInsets$0(int i10, View view, K0 k02) {
        Rect rect = (Rect) view.getTag(i10);
        androidx.core.graphics.e f10 = k02.f(K0.m.g());
        view.setPadding(rect.left + f10.f15924a, rect.top + f10.f15925b, rect.right + f10.f15926c, rect.bottom + f10.f15927d);
        return k02;
    }

    public void applySystemInsets(Window window, View view, final int i10) {
        if (Build.VERSION.SDK_INT < 35 || view.getContext().getApplicationInfo().targetSdkVersion < 35) {
            return;
        }
        HVLogUtils.d("InsetUtils", "applySystemInsets called");
        i1 L10 = AbstractC1484a0.L(window.getDecorView());
        if (L10 != null) {
            L10.f(true);
        }
        if (view.getTag(i10) == null) {
            HVLogUtils.d("InsetUtils", "TAG is null setting originalPadding");
            view.setTag(i10, new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()));
        }
        AbstractC1484a0.F0(view, new I() { // from class: co.hyperverge.hypersnapsdk.utils.p
            @Override // androidx.core.view.I
            public final K0 p(View view2, K0 k02) {
                K0 lambda$applySystemInsets$0;
                lambda$applySystemInsets$0 = InsetUtils.lambda$applySystemInsets$0(i10, view2, k02);
                return lambda$applySystemInsets$0;
            }
        });
    }
}
