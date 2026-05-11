package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.react.uimanager.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1954l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Rect f22460a = new Rect();

    public static void a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof InterfaceC1952k0) {
            InterfaceC1952k0 interfaceC1952k0 = (InterfaceC1952k0) parent;
            if (interfaceC1952k0.getRemoveClippedSubviews()) {
                Rect rect2 = f22460a;
                interfaceC1952k0.getClippingRect(rect2);
                if (!rect2.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-view.getLeft(), -view.getTop());
                rect2.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                rect2.offset(view.getScrollX(), view.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
