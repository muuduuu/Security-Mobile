package y1;

import androidx.work.impl.A;
import androidx.work.impl.N;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x1.w;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5163d {

    /* renamed from: a, reason: collision with root package name */
    private final w f45159a;

    /* renamed from: b, reason: collision with root package name */
    private final N f45160b;

    /* renamed from: c, reason: collision with root package name */
    private final long f45161c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f45162d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f45163e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5163d(w runnableScheduler, N launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5163d this$0, A token) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(token, "$token");
        this$0.f45160b.c(token, 3);
    }

    public final void b(A token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f45162d) {
            runnable = (Runnable) this.f45163e.remove(token);
        }
        if (runnable != null) {
            this.f45159a.b(runnable);
        }
    }

    public final void c(final A token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Runnable runnable = new Runnable() { // from class: y1.c
            @Override // java.lang.Runnable
            public final void run() {
                C5163d.d(C5163d.this, token);
            }
        };
        synchronized (this.f45162d) {
        }
        this.f45159a.a(this.f45161c, runnable);
    }

    public C5163d(w runnableScheduler, N launcher, long j10) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f45159a = runnableScheduler;
        this.f45160b = launcher;
        this.f45161c = j10;
        this.f45162d = new Object();
        this.f45163e = new LinkedHashMap();
    }

    public /* synthetic */ C5163d(w wVar, N n10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, n10, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
