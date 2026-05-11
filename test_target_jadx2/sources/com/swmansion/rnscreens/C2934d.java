package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.F0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2934d extends Toolbar {

    /* renamed from: q0, reason: collision with root package name */
    private final F f29945q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f29946r0;

    /* renamed from: s0, reason: collision with root package name */
    private final O4.a f29947s0;

    /* renamed from: com.swmansion.rnscreens.d$a */
    public static final class a extends O4.a {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C2934d.this.f29946r0 = false;
            C2934d c2934d = C2934d.this;
            c2934d.measure(View.MeasureSpec.makeMeasureSpec(c2934d.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C2934d.this.getHeight(), Integer.MIN_VALUE));
            C2934d c2934d2 = C2934d.this;
            c2934d2.layout(c2934d2.getLeft(), C2934d.this.getTop(), C2934d.this.getRight(), C2934d.this.getBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2934d(Context context, F config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f29945q0 = config;
        this.f29947s0 = new a();
    }

    public final F getConfig() {
        return this.f29945q0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29945q0.a(getNavigationIcon() != null ? getContentInsetStartWithNavigation() : getContentInsetStart(), getContentInsetEnd());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((F0) context).getCurrentActivity();
        Integer valueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || valueOf == null || valueOf.intValue() != 32 || this.f29946r0 || this.f29947s0 == null) {
            return;
        }
        this.f29946r0 = true;
        com.facebook.react.modules.core.a.f21757f.a().k(a.EnumC0379a.NATIVE_ANIMATED_MODULE, this.f29947s0);
    }
}
