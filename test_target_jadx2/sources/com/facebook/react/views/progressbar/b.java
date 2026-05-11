package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.V;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends V implements o {

    /* renamed from: A, reason: collision with root package name */
    private final SparseIntArray f22595A = new SparseIntArray();

    /* renamed from: B, reason: collision with root package name */
    private final SparseIntArray f22596B = new SparseIntArray();

    /* renamed from: C, reason: collision with root package name */
    private final Set f22597C = new HashSet();

    /* renamed from: D, reason: collision with root package name */
    private String f22598D;

    public b() {
        Y0(this);
        this.f22598D = ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    @Override // com.facebook.yoga.o
    public long W(r node, float f10, p widthMode, float f11, p heightMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        int b10 = companion.b(this.f22598D);
        if (!this.f22597C.contains(Integer.valueOf(b10))) {
            ProgressBar a10 = companion.a(H(), b10);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            a10.measure(makeMeasureSpec, makeMeasureSpec);
            this.f22595A.put(b10, a10.getMeasuredHeight());
            this.f22596B.put(b10, a10.getMeasuredWidth());
            this.f22597C.add(Integer.valueOf(b10));
        }
        return q.b(this.f22596B.get(b10), this.f22595A.get(b10));
    }

    @Z4.a(name = ReactProgressBarViewManager.PROP_STYLE)
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.f22598D = str;
    }
}
