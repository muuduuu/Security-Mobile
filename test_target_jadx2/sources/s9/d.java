package S9;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f8910c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f8911a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8912b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(ReactApplicationContext mReactContext) {
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.f8911a = mReactContext;
        this.f8912b = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Activity activity, View view, boolean z10) {
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        if (z10) {
            return;
        }
        view.clearFocus();
    }

    private final int f() {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity currentActivity = this.f8911a.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        T9.a.f9501a.a();
    }

    private final void k(final int i10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.b
            @Override // java.lang.Runnable
            public final void run() {
                d.l(d.this, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(d this$0, int i10) {
        Activity currentActivity;
        Window window;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f() == i10 || (currentActivity = this$0.f8911a.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i10);
    }

    public final void d(final boolean z10) {
        final Activity currentActivity = this.f8911a.getCurrentActivity();
        final EditText b10 = T9.a.f9501a.b();
        if (b10 != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.e(currentActivity, b10, z10);
                }
            });
        }
    }

    public final void g() {
        k(this.f8912b);
    }

    public final void h(String direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (Intrinsics.b(direction, "current")) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.a
                @Override // java.lang.Runnable
                public final void run() {
                    d.i();
                }
            });
            return;
        }
        EditText b10 = T9.a.f9501a.b();
        if (b10 != null) {
            T9.c.f9504a.j(direction, b10);
        }
    }

    public final void j(int i10) {
        k(i10);
    }
}
