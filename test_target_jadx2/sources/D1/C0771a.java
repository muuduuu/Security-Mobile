package D1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0771a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0771a f1136a = new C0771a();

    private C0771a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
