package androidx.lifecycle;

import a1.AbstractC1337b;
import a1.C1336a;
import a1.C1340e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static final C1340e f17092a = new C1340e();

    public static final Jd.N a(S s10) {
        C1336a c1336a;
        Intrinsics.checkNotNullParameter(s10, "<this>");
        synchronized (f17092a) {
            c1336a = (C1336a) s10.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c1336a == null) {
                c1336a = AbstractC1337b.a();
                s10.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c1336a);
            }
        }
        return c1336a;
    }
}
