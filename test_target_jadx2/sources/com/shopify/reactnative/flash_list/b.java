package com.shopify.reactnative.flash_list;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.j;
import java.util.Comparator;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import nc.AbstractC3728a;

/* loaded from: classes2.dex */
public final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    private final com.shopify.reactnative.flash_list.a f29455a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29456b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29457c;

    /* renamed from: d, reason: collision with root package name */
    private double f29458d;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3728a.a(Integer.valueOf(((d) obj).getIndex()), Integer.valueOf(((d) obj2).getIndex()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29455a = new com.shopify.reactnative.flash_list.a();
        this.f29458d = 1.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getFooter() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof d) && ((d) childAt).getIndex() == -1) {
                return childAt;
            }
        }
        return null;
    }

    private final int getFooterDiff() {
        int bottom;
        int top;
        if (getChildCount() == 0) {
            this.f29455a.i(0);
        } else if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            com.shopify.reactnative.flash_list.a aVar = this.f29455a;
            aVar.i(aVar.e() ? childAt.getRight() : childAt.getBottom());
        }
        if (this.f29455a.e()) {
            bottom = getRight();
            top = getLeft();
        } else {
            bottom = getBottom();
            top = getTop();
        }
        return this.f29455a.f() - (bottom - top);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getParentScrollView() {
        for (ViewParent viewParent = getParent(); viewParent != 0; viewParent = viewParent.getParent()) {
            if ((viewParent instanceof ScrollView) || (viewParent instanceof HorizontalScrollView)) {
                return (View) viewParent;
            }
        }
        return null;
    }

    private final void r() {
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = L0.c((ReactContext) context, getId());
        if (c10 != null) {
            Context context2 = getContext();
            Intrinsics.e(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            c10.c(new c(L0.e((ReactContext) context2), getId(), this.f29455a.d() / this.f29458d, this.f29455a.c() / this.f29458d));
        }
    }

    private final void s() {
        View parentScrollView = getParentScrollView();
        if (this.f29457c || parentScrollView == null) {
            return;
        }
        if (this.f29455a.e()) {
            if (getRight() > parentScrollView.getWidth()) {
                return;
            }
        } else if (getBottom() > parentScrollView.getHeight()) {
            return;
        }
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        View footer = getFooter();
        int footerDiff = getFooterDiff();
        if (footerDiff == 0 || footer == null || view == null) {
            return;
        }
        if (this.f29455a.e()) {
            footer.offsetLeftAndRight(footerDiff);
            setRight(getRight() + footerDiff);
            view.setRight(view.getRight() + footerDiff);
        } else {
            footer.offsetTopAndBottom(footerDiff);
            setBottom(getBottom() + footerDiff);
            view.setBottom(view.getBottom() + footerDiff);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t() {
        if (getChildCount() <= 1 || this.f29457c) {
            return;
        }
        int childCount = getChildCount();
        d[] dVarArr = new d[childCount];
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof d)) {
                throw new IllegalStateException("CellRendererComponent outer view should always be CellContainer. Learn more here: https://shopify.github.io/flash-list/docs/usage#cellrenderercomponent.");
            }
            dVarArr[i10] = childAt;
        }
        if (childCount > 1) {
            AbstractC3574i.r(dVarArr, new a());
        }
        com.shopify.reactnative.flash_list.a aVar = this.f29455a;
        aVar.j(aVar.e() ? getLeft() : getTop());
        this.f29455a.a(dVarArr);
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        t();
        s();
        super.dispatchDraw(canvas);
        View parentScrollView = getParentScrollView();
        if (!this.f29456b || parentScrollView == null) {
            return;
        }
        int width = this.f29455a.e() ? parentScrollView.getWidth() : parentScrollView.getHeight();
        int scrollX = this.f29455a.e() ? parentScrollView.getScrollX() : parentScrollView.getScrollY();
        this.f29455a.b(scrollX, Math.max((this.f29455a.e() ? getLeft() : getTop()) - scrollX, 0), Math.max((width + scrollX) - (this.f29455a.e() ? getRight() : getBottom()), 0));
        r();
    }

    public final com.shopify.reactnative.flash_list.a getAlShadow() {
        return this.f29455a;
    }

    public final boolean getDisableAutoLayout() {
        return this.f29457c;
    }

    public final boolean getEnableInstrumentation() {
        return this.f29456b;
    }

    public final double getPixelDensity() {
        return this.f29458d;
    }

    public final void setDisableAutoLayout(boolean z10) {
        this.f29457c = z10;
    }

    public final void setEnableInstrumentation(boolean z10) {
        this.f29456b = z10;
    }

    public final void setPixelDensity(double d10) {
        this.f29458d = d10;
    }
}
