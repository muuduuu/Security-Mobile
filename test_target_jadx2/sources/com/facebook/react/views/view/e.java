package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f22989a = new e();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22990a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22990a = iArr;
        }
    }

    private e() {
    }

    public static final int a(float f10, p mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i10 = a.f22990a[mode.ordinal()];
        return i10 != 1 ? i10 != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) f10, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824);
    }
}
