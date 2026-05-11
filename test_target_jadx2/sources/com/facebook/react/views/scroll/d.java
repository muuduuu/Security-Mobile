package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1483a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1948i0;
import z0.C5228A;

/* loaded from: classes2.dex */
class d extends C1483a {

    /* renamed from: d, reason: collision with root package name */
    private final String f22703d = d.class.getSimpleName();

    d() {
    }

    private void n(View view, AccessibilityEvent accessibilityEvent) {
        boolean A10;
        View childAt;
        ReadableMap readableMap;
        ReadableMap readableMap2 = (ReadableMap) view.getTag(AbstractC1899n.f21883b);
        if (readableMap2 == null) {
            return;
        }
        accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
        if (!(view instanceof ViewGroup)) {
            return;
        }
        View childAt2 = ((ViewGroup) view).getChildAt(0);
        if (!(childAt2 instanceof ViewGroup)) {
            return;
        }
        Integer num = null;
        int i10 = 0;
        Integer num2 = null;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) childAt2;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            View childAt3 = viewGroup.getChildAt(i10);
            if (view instanceof c) {
                A10 = ((c) view).x(childAt3);
            } else if (!(view instanceof b)) {
                return;
            } else {
                A10 = ((b) view).A(childAt3);
            }
            ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(AbstractC1899n.f21884c);
            if (!(childAt3 instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt3;
            if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(AbstractC1899n.f21884c)) != null) {
                readableMap3 = readableMap;
            }
            if (A10 && readableMap3 != null) {
                if (num == null) {
                    num = Integer.valueOf(readableMap3.getInt("itemIndex"));
                }
                num2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
            }
            if (num != null && num2 != null) {
                accessibilityEvent.setFromIndex(num.intValue());
                accessibilityEvent.setToIndex(num2.intValue());
            }
            i10++;
        }
    }

    private void o(View view, C5228A c5228a) {
        C1948i0.e fromViewTag = C1948i0.e.fromViewTag(view);
        if (fromViewTag != null) {
            C1948i0.l0(c5228a, fromViewTag, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1899n.f21883b);
        if (readableMap != null) {
            c5228a.s0(C5228A.e.a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof c) {
            c5228a.M0(((c) view).getScrollEnabled());
        } else if (view instanceof b) {
            c5228a.M0(((b) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.C1483a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof c) || (view instanceof b)) {
            n(view, accessibilityEvent);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.f22703d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }

    @Override // androidx.core.view.C1483a
    public void g(View view, C5228A c5228a) {
        super.g(view, c5228a);
        if ((view instanceof c) || (view instanceof b)) {
            o(view, c5228a);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.f22703d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }
}
