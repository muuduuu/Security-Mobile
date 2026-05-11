package m9;

import android.content.Context;
import com.google.gson.e;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import xc.m;

/* renamed from: m9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3661a {

    /* renamed from: b, reason: collision with root package name */
    private static Context f37423b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3661a f37422a = new C3661a();

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy f37424c = i.a(C0560a.f37425a);

    /* renamed from: m9.a$a, reason: collision with other inner class name */
    static final class C0560a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0560a f37425a = new C0560a();

        C0560a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e();
        }
    }

    private C3661a() {
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        f37423b = applicationContext;
    }
}
