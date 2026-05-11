package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.devsupport.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1867c {

    /* renamed from: a, reason: collision with root package name */
    private final WindowManager f21579a;

    /* renamed from: b, reason: collision with root package name */
    private final ReactContext f21580b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f21581c;

    /* renamed from: com.facebook.react.devsupport.c$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21582a;

        a(boolean z10) {
            this.f21582a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f21582a || C1867c.this.f21581c != null) {
                if (this.f21582a || C1867c.this.f21581c == null) {
                    return;
                }
                C1867c.this.f21581c.removeAllViews();
                C1867c.this.f21579a.removeView(C1867c.this.f21581c);
                C1867c.this.f21581c = null;
                return;
            }
            if (!C1867c.g(C1867c.this.f21580b)) {
                AbstractC1721a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            }
            C1867c.this.f21581c = new M(C1867c.this.f21580b);
            C1867c.this.f21579a.addView(C1867c.this.f21581c, new WindowManager.LayoutParams(-1, -1, m0.f21662b, 24, -3));
        }
    }

    public C1867c(ReactContext reactContext) {
        this.f21580b = reactContext;
        this.f21579a = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean f(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void h(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        AbstractC1721a.J("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
        if (f(context, intent)) {
            context.startActivity(intent);
        }
    }

    public void i(boolean z10) {
        UiThreadUtil.runOnUiThread(new a(z10));
    }
}
