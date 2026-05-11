package i5;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3321a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3321a f34140a = new C3321a();

    private C3321a() {
    }

    public static final Object a(Context context, Class clazz) {
        Context baseContext;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        while (!clazz.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}
