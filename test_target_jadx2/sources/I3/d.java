package I3;

import I3.k;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4265a;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f4266b;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f4267c;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f4268d;

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f4269e;

    /* renamed from: f, reason: collision with root package name */
    private static final Lazy f4270f;

    /* renamed from: g, reason: collision with root package name */
    private static final Runnable f4271g;

    /* renamed from: h, reason: collision with root package name */
    private static final Runnable f4272h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4273a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.NEAREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4273a = iArr;
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4274a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    static {
        d dVar = new d();
        f4265a = dVar;
        f4266b = new AtomicInteger(0);
        f4267c = new AtomicInteger(0);
        f4268d = new AtomicInteger(0);
        f4269e = new ConcurrentHashMap();
        f4270f = lc.i.a(b.f4274a);
        Runnable runnable = new Runnable() { // from class: I3.b
            @Override // java.lang.Runnable
            public final void run() {
                d.c();
            }
        };
        f4271g = runnable;
        Runnable runnable2 = new Runnable() { // from class: I3.c
            @Override // java.lang.Runnable
            public final void run() {
                d.d();
            }
        };
        f4272h = runnable2;
        dVar.e().post(runnable);
        dVar.e().post(runnable2);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        float andSet = f4266b.getAndSet(0);
        float andSet2 = f4267c.getAndSet(0);
        float andSet3 = f4268d.getAndSet(0);
        float f10 = andSet + andSet2 + andSet3;
        if (f10 > 0.0f) {
            float f11 = andSet / f10;
            float f12 = andSet3 / f10;
            if (andSet2 / f10 > 0.25f || f12 > 0.1f) {
                for (Map.Entry entry : f4269e.entrySet()) {
                    f4265a.i((h) entry.getKey(), -((Number) entry.getValue()).intValue());
                }
            } else if (f11 > 0.98f) {
                for (Map.Entry entry2 : f4269e.entrySet()) {
                    f4265a.i((h) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                }
            }
            f4269e.clear();
        }
        f4265a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        j.f4294c.a(new Date(System.currentTimeMillis() - 10000));
        f4265a.g();
    }

    private final Handler e() {
        return (Handler) f4270f.getValue();
    }

    private final boolean g() {
        return e().postDelayed(f4272h, 10000L);
    }

    private final boolean h() {
        return e().postDelayed(f4271g, 2000L);
    }

    private final void i(h hVar, int i10) {
        int k10 = kotlin.ranges.d.k(hVar.b() + i10, (int) kotlin.ranges.d.c(hVar.a() * 0.5f, 1.0f), hVar.a());
        if (k10 != hVar.b()) {
            hVar.c(k10);
        }
    }

    public final void f(h animation, k frameResult) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(frameResult, "frameResult");
        ConcurrentHashMap concurrentHashMap = f4269e;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.a() * 0.2f)));
        }
        int i10 = a.f4273a[frameResult.b().ordinal()];
        if (i10 == 1) {
            f4266b.incrementAndGet();
        } else if (i10 == 2) {
            f4267c.incrementAndGet();
        } else {
            if (i10 != 3) {
                return;
            }
            f4268d.incrementAndGet();
        }
    }
}
