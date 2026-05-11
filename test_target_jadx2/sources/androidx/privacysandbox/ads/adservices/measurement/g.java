package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context) {
        super(f.a(r2));
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
    }
}
