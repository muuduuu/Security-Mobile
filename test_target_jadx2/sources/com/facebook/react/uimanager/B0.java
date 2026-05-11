package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f22143a = new B0();

    private B0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final A0 a(View reactView) {
        Intrinsics.checkNotNullParameter(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof A0)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            AbstractC4012a.a(parent instanceof View);
            view = (View) parent;
        }
        return (A0) view;
    }

    public static final Point b(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        int[] iArr = new int[2];
        v10.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v10.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
