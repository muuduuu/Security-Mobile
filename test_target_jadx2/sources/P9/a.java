package P9;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7630a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7631b = false;

    private a() {
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        aVar.a(str, str2, th);
    }

    public static /* synthetic */ void d(a aVar, String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        aVar.c(str, str2, th);
    }

    public final void a(String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (f7631b) {
            Log.i(str, message, th);
        }
    }

    public final void c(String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (f7631b) {
            Log.w(str, message, th);
        }
    }
}
