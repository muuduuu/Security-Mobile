package v1;

import android.webkit.WebSettings;
import w1.AbstractC5024f;
import w1.C5021c;
import w1.EnumC5022d;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4909b {
    private static C5021c a(WebSettings webSettings) {
        return AbstractC5024f.c().a(webSettings);
    }

    public static void b(WebSettings webSettings, int i10) {
        EnumC5022d enumC5022d = EnumC5022d.FORCE_DARK;
        if (enumC5022d.isSupportedByFramework()) {
            webSettings.setForceDark(i10);
        } else {
            if (!enumC5022d.isSupportedByWebView()) {
                throw EnumC5022d.getUnsupportedOperationException();
            }
            a(webSettings).a(i10);
        }
    }

    public static void c(WebSettings webSettings, int i10) {
        if (!EnumC5022d.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            throw EnumC5022d.getUnsupportedOperationException();
        }
        a(webSettings).b(i10);
    }
}
