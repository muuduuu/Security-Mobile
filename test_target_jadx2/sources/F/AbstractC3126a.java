package f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3126a {

    /* renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C0476a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f32772a;

        public C0476a(Object obj) {
            this.f32772a = obj;
        }

        public final Object a() {
            return this.f32772a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0476a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
