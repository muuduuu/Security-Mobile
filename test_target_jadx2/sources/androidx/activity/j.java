package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.Y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j extends Dialog implements InterfaceC1599p, q, k1.f {

    /* renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.r f12968a;

    /* renamed from: b, reason: collision with root package name */
    private final k1.e f12969b;

    /* renamed from: c, reason: collision with root package name */
    private final o f12970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12969b = k1.e.f35976d.a(this);
        this.f12970c = new o(new Runnable() { // from class: androidx.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                j.d(j.this);
            }
        });
    }

    private final androidx.lifecycle.r b() {
        androidx.lifecycle.r rVar = this.f12968a;
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r(this);
        this.f12968a = rVar2;
        return rVar2;
    }

    private final void c() {
        Window window = getWindow();
        Intrinsics.d(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        Y.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.d(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        t.a(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.d(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        k1.g.a(decorView3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC1599p
    public AbstractC1592i getLifecycle() {
        return b();
    }

    @Override // androidx.activity.q
    public final o getOnBackPressedDispatcher() {
        return this.f12970c;
    }

    @Override // k1.f
    public k1.d getSavedStateRegistry() {
        return this.f12969b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f12970c.e();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            o oVar = this.f12970c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            oVar.f(onBackInvokedDispatcher);
        }
        this.f12969b.d(bundle);
        b().i(AbstractC1592i.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f12969b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(AbstractC1592i.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(AbstractC1592i.a.ON_DESTROY);
        this.f12968a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
