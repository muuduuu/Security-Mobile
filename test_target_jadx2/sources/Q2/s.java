package Q2;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f8124a = new s();

    private s() {
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("Chucker", message);
    }

    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w("Chucker", message);
    }
}
