package com.reactnativecommunity.webview;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29377b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f29378a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Object parent = webView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return view.getId();
            }
            return -1;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, d webView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setBackgroundColor(0);
        addView(webView);
        View childAt = getChildAt(0);
        Intrinsics.e(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.f29378a = (d) childAt;
    }

    public static final int a(WebView webView) {
        return f29377b.a(webView);
    }

    public final d getWebView() {
        return this.f29378a;
    }
}
