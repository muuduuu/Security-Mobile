package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final View f21544a;

    static final class a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f21545a = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0 invoke(View view, K0 windowInsets) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
            androidx.core.graphics.e f10 = windowInsets.f(this.f21545a);
            Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(f10.f15924a, f10.f15925b, f10.f15926c, f10.f15927d);
            return K0.f16032b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Activity context, View view) {
        super(context, com.facebook.react.r.f21953b);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21544a = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K0 b(Function2 tmp0, View p02, K0 p12) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (K0) tmp0.invoke(p02, p12);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.f21544a;
        if (view != null) {
            final a aVar = new a(K0.m.g() | K0.m.a());
            AbstractC1484a0.F0(view, new androidx.core.view.I() { // from class: com.facebook.react.devsupport.P
                @Override // androidx.core.view.I
                public final K0 p(View view2, K0 k02) {
                    K0 b10;
                    b10 = Q.b(Function2.this, view2, k02);
                    return b10;
                }
            });
        }
    }
}
