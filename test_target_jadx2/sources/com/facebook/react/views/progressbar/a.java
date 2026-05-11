package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final C0386a f22589f = new C0386a(null);

    /* renamed from: a, reason: collision with root package name */
    private Integer f22590a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22591b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22592c;

    /* renamed from: d, reason: collision with root package name */
    private double f22593d;

    /* renamed from: e, reason: collision with root package name */
    private ProgressBar f22594e;

    /* renamed from: com.facebook.react.views.progressbar.a$a, reason: collision with other inner class name */
    private static final class C0386a {
        public /* synthetic */ C0386a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0386a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22591b = true;
        this.f22592c = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Unit unit;
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f22590a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            unit = Unit.f36324a;
        } else {
            unit = null;
        }
        if (unit == null) {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        Unit unit;
        ProgressBar progressBar = this.f22594e;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.f22591b);
            setColor(progressBar);
            progressBar.setProgress((int) (this.f22593d * 1000));
            progressBar.setVisibility(this.f22592c ? 0 : 4);
            unit = Unit.f36324a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.f22592c;
    }

    public final Integer getColor$ReactAndroid_release() {
        return this.f22590a;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.f22591b;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.f22593d;
    }

    public final void setAnimating$ReactAndroid_release(boolean z10) {
        this.f22592c = z10;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.f22590a = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z10) {
        this.f22591b = z10;
    }

    public final void setProgress$ReactAndroid_release(double d10) {
        this.f22593d = d10;
    }

    public final void setStyle$ReactAndroid_release(String str) {
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        ProgressBar a10 = companion.a(getContext(), companion.b(str));
        a10.setMax(1000);
        this.f22594e = a10;
        removeAllViews();
        addView(this.f22594e, new ViewGroup.LayoutParams(-1, -1));
    }
}
