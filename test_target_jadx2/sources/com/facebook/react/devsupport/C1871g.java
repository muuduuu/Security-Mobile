package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1901p;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import xc.C5146G;

/* renamed from: com.facebook.react.devsupport.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871g implements C4.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21610d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static boolean f21611e = true;

    /* renamed from: a, reason: collision with root package name */
    private final d0 f21612a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f21613b;

    /* renamed from: c, reason: collision with root package name */
    private PopupWindow f21614c;

    /* renamed from: com.facebook.react.devsupport.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1871g(d0 reactInstanceDevHelper) {
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.f21612a = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C1871g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g();
    }

    private final void g() {
        PopupWindow popupWindow = this.f21614c;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.f21614c = null;
            this.f21613b = null;
        }
    }

    private final void h(String str) {
        PopupWindow popupWindow = this.f21614c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity a10 = this.f21612a.a();
            if (a10 == null) {
                AbstractC1721a.m("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                a10.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i10 = rect.top;
                Object systemService = a10.getSystemService("layout_inflater");
                Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(AbstractC1901p.f21909a, (ViewGroup) null);
                Intrinsics.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(str);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(a10.getWindow().getDecorView(), 0, 0, i10);
                this.f21613b = textView;
                this.f21614c = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                AbstractC1721a.m("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C1871g this$0, String message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        this$0.h(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Integer num, Integer num2, C1871g this$0, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = BuildConfig.FLAVOR;
        } else {
            C5146G c5146g = C5146G.f44966a;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        TextView textView = this$0.f21613b;
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "Loading";
        }
        textView.setText(str + str2 + "…");
    }

    @Override // C4.c
    public void c() {
        if (f21611e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1871g.f(C1871g.this);
                }
            });
        }
    }

    @Override // C4.c
    public void d(final String str, final Integer num, final Integer num2) {
        if (f21611e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.f
                @Override // java.lang.Runnable
                public final void run() {
                    C1871g.j(num, num2, this, str);
                }
            });
        }
    }

    @Override // C4.c
    public void showMessage(final String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (f21611e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.e
                @Override // java.lang.Runnable
                public final void run() {
                    C1871g.i(C1871g.this, message);
                }
            });
        }
    }
}
