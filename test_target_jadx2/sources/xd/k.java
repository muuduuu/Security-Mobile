package xd;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45027a = a.f45028a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f45028a = new a();

        private a() {
        }

        public final d a(Runnable runnable, Function1 function1) {
            return (runnable == null || function1 == null) ? new d(null, 1, null) : new c(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
