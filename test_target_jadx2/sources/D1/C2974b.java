package d1;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2974b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2974b f31198a = new C2974b();

    private C2974b() {
    }

    public final Object a(Context context, String tag, Function1 manager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + C2973a.f31195a.b());
            return null;
        }
    }
}
