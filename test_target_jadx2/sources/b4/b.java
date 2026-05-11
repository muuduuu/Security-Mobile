package b4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f18556f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18557a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18558b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18559c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f18560d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f18561e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(int i10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new r(10, "FrescoIoBoundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(\n    …oIoBoundExecutor\", true))");
        this.f18557a = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i10, new r(10, "FrescoDecodeExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool2, "newFixedThreadPool(\n    …coDecodeExecutor\", true))");
        this.f18558b = newFixedThreadPool2;
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i10, new r(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool3, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        this.f18559c = newFixedThreadPool3;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new r(10, "FrescoLightWeightBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool4, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        this.f18560d = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i10, new r(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "newScheduledThreadPool(\n…ckgroundExecutor\", true))");
        this.f18561e = newScheduledThreadPool;
    }

    @Override // b4.g
    public Executor a() {
        return this.f18558b;
    }

    @Override // b4.g
    public Executor b() {
        return this.f18560d;
    }

    @Override // b4.g
    public Executor c() {
        return this.f18559c;
    }

    @Override // b4.g
    public Executor d() {
        return this.f18557a;
    }

    @Override // b4.g
    public Executor e() {
        return this.f18557a;
    }

    @Override // b4.g
    public Executor f() {
        return this.f18557a;
    }

    @Override // b4.g
    public ScheduledExecutorService g() {
        return this.f18561e;
    }
}
