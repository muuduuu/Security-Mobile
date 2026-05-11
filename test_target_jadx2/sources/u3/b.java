package U3;

import Z3.n;
import b4.g;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10333a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10334b;

    /* renamed from: c, reason: collision with root package name */
    private static a f10335c;

    private b() {
    }

    public static final a a(Y3.d dVar, g gVar, n nVar, boolean z10, boolean z11, int i10, ExecutorService executorService) {
        if (!f10334b) {
            try {
                Class cls = Boolean.TYPE;
                Object newInstance = AnimatedFactoryV2Impl.class.getConstructor(Y3.d.class, g.class, n.class, cls, cls, Integer.TYPE, Z2.g.class).newInstance(dVar, gVar, nVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10), executorService);
                Intrinsics.e(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f10335c = (a) newInstance;
            } catch (Throwable unused) {
            }
            if (f10335c != null) {
                f10334b = true;
            }
        }
        return f10335c;
    }
}
