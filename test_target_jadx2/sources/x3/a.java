package X3;

import Td.B;
import android.content.Context;
import b4.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11737a = new a();

    private a() {
    }

    public static final l.a a(Context context, B okHttpClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return l.f18582M.i(context).Q(new b(okHttpClient));
    }
}
