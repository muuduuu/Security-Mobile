package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C1944g0;

/* loaded from: classes2.dex */
public class NativeMethodsHelper {
    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static com.facebook.react.views.scroll.c findScrollView(com.facebook.react.views.swiperefresh.a aVar) {
        for (int i10 = 0; i10 < aVar.getChildCount(); i10++) {
            if (aVar.getChildAt(i10) instanceof com.facebook.react.views.scroll.c) {
                return (com.facebook.react.views.scroll.c) aVar.getChildAt(i10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollTo$0(View view, int i10, int i11) {
        ((com.facebook.react.views.scroll.b) view).smoothScrollTo(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollTo$1(View view, int i10, int i11) {
        ((com.facebook.react.views.scroll.c) view).smoothScrollTo(i10, i11);
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) B0.a(view);
        if (view2 == null || view == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        int[] iArr = new int[4];
        computeBoundingBox(view2, iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        computeBoundingBox(view, iArr);
        iArr[0] = iArr[0] - i10;
        iArr[1] = iArr[1] - i11;
        float[] fArr2 = new float[6];
        fArr2[0] = C1944g0.e(view.getLeft());
        fArr2[1] = C1944g0.e(view.getTop());
        for (int i12 = 2; i12 < 6; i12++) {
            fArr2[i12] = C1944g0.e(iArr[i12 - 2]);
        }
        return fArr2;
    }

    public static void scrollTo(final View view, double d10, double d11, boolean z10) {
        final int round = Math.round(C1944g0.f(d10));
        final int round2 = Math.round(C1944g0.f(d11));
        boolean z11 = view instanceof com.facebook.react.views.scroll.b;
        if (!z11) {
            if (view instanceof com.facebook.react.views.swiperefresh.a) {
                view = findScrollView((com.facebook.react.views.swiperefresh.a) view);
            }
            if (!(view instanceof com.facebook.react.views.scroll.c)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
                return;
            }
        }
        if (!z10) {
            view.scrollTo(round, round2);
        } else if (z11) {
            view.post(new Runnable() { // from class: com.swmansion.reanimated.b
                @Override // java.lang.Runnable
                public final void run() {
                    NativeMethodsHelper.lambda$scrollTo$0(view, round, round2);
                }
            });
        } else {
            view.post(new Runnable() { // from class: com.swmansion.reanimated.c
                @Override // java.lang.Runnable
                public final void run() {
                    NativeMethodsHelper.lambda$scrollTo$1(view, round, round2);
                }
            });
        }
    }
}
