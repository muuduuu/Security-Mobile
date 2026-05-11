package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.InterfaceC1964q0;
import ea.InterfaceC3105B;
import ea.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements InterfaceC3105B {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29796a;

        static {
            int[] iArr = new int[EnumC1946h0.values().length];
            try {
                iArr[EnumC1946h0.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1946h0.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1946h0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1946h0.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29796a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ea.InterfaceC3105B
    public t a(View view) {
        EnumC1946h0 enumC1946h0;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof InterfaceC1964q0) {
            enumC1946h0 = ((InterfaceC1964q0) view).getPointerEvents();
            Intrinsics.d(enumC1946h0);
        } else {
            enumC1946h0 = EnumC1946h0.AUTO;
        }
        if (!view.isEnabled()) {
            if (enumC1946h0 == EnumC1946h0.AUTO) {
                return t.BOX_NONE;
            }
            if (enumC1946h0 == EnumC1946h0.BOX_ONLY) {
                return t.NONE;
            }
        }
        int i10 = a.f29796a[enumC1946h0.ordinal()];
        if (i10 == 1) {
            return t.BOX_ONLY;
        }
        if (i10 == 2) {
            return t.BOX_NONE;
        }
        if (i10 == 3) {
            return t.NONE;
        }
        if (i10 == 4) {
            return t.AUTO;
        }
        throw new lc.m();
    }

    @Override // ea.InterfaceC3105B
    public boolean b(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof com.facebook.react.views.scroll.c) {
            if (!Intrinsics.b(((com.facebook.react.views.scroll.c) view).getOverflow(), "visible")) {
                return true;
            }
        } else if (view instanceof com.facebook.react.views.scroll.b) {
            if (!Intrinsics.b(((com.facebook.react.views.scroll.b) view).getOverflow(), "visible")) {
                return true;
            }
        } else if (view instanceof com.facebook.react.views.view.j) {
            return Intrinsics.b(((com.facebook.react.views.view.j) view).getOverflow(), "hidden");
        }
        return false;
    }

    @Override // ea.InterfaceC3105B
    public View c(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent instanceof com.facebook.react.views.view.j) {
            View childAt = parent.getChildAt(((com.facebook.react.views.view.j) parent).getZIndexMappedChildIndex(i10));
            Intrinsics.d(childAt);
            return childAt;
        }
        View childAt2 = parent.getChildAt(i10);
        Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
        return childAt2;
    }
}
