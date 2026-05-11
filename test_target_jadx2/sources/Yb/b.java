package Yb;

import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent c() {
        androidx.browser.customtabs.d b10 = new d.b().b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        Intent intent = b10.f14291a;
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        intent.setData(Uri.parse("https://expo.dev"));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent d() {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        return intent;
    }
}
