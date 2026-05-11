package T6;

import c7.ThreadFactoryC1739c;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f9343a = l7.k.a().a(2, new ThreadFactoryC1739c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f9343a;
    }
}
