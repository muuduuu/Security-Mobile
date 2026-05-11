package expo.modules.kotlin.views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.C1931a;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public abstract class h extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final C3862a f32734a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, C3862a appContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f32734a = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    public final void b() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getClipToPadding()) {
            C1931a.a(this, canvas);
            super.dispatchDraw(canvas);
        }
    }

    public final C3862a getAppContext() {
        return this.f32734a;
    }

    public boolean getShouldUseAndroidLayout() {
        return this.f32735b;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getShouldUseAndroidLayout()) {
            post(new Runnable() { // from class: expo.modules.kotlin.views.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.c(h.this);
                }
            });
        }
    }
}
