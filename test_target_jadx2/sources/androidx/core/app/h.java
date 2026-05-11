package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC1520t;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1599p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h extends Activity implements InterfaceC1599p, AbstractC1520t.a {
    private final j0.i extraDataMap = new j0.i();
    private final androidx.lifecycle.r lifecycleRegistry = new androidx.lifecycle.r(this);

    public static class a {
    }

    private final boolean f(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (AbstractC1520t.d(decorView, event)) {
            return true;
        }
        return AbstractC1520t.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (AbstractC1520t.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public <T extends a> T getExtraData(Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        android.support.v4.media.session.b.a(this.extraDataMap.get(extraDataClass));
        return null;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.D.f17036b.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.n(AbstractC1592i.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(a extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        throw null;
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !f(strArr);
    }

    @Override // androidx.core.view.AbstractC1520t.a
    public boolean superDispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
