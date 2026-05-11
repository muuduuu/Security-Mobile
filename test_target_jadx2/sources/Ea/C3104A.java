package ea;

import android.view.VelocityTracker;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ea.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3104A {

    /* renamed from: f, reason: collision with root package name */
    public static final a f32302f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final C3104A f32303g = new C3104A(-1.0d, 0.0d);

    /* renamed from: h, reason: collision with root package name */
    private static final C3104A f32304h = new C3104A(1.0d, 0.0d);

    /* renamed from: i, reason: collision with root package name */
    private static final C3104A f32305i = new C3104A(0.0d, -1.0d);

    /* renamed from: j, reason: collision with root package name */
    private static final C3104A f32306j = new C3104A(0.0d, 1.0d);

    /* renamed from: k, reason: collision with root package name */
    private static final C3104A f32307k = new C3104A(1.0d, -1.0d);

    /* renamed from: l, reason: collision with root package name */
    private static final C3104A f32308l = new C3104A(1.0d, 1.0d);

    /* renamed from: m, reason: collision with root package name */
    private static final C3104A f32309m = new C3104A(-1.0d, -1.0d);

    /* renamed from: n, reason: collision with root package name */
    private static final C3104A f32310n = new C3104A(-1.0d, 1.0d);

    /* renamed from: o, reason: collision with root package name */
    private static final C3104A f32311o = new C3104A(0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    private final double f32312a;

    /* renamed from: b, reason: collision with root package name */
    private final double f32313b;

    /* renamed from: c, reason: collision with root package name */
    private final double f32314c;

    /* renamed from: d, reason: collision with root package name */
    private final double f32315d;

    /* renamed from: e, reason: collision with root package name */
    private final double f32316e;

    /* renamed from: ea.A$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3104A a(int i10) {
            switch (i10) {
                case 1:
                    return C3104A.f32304h;
                case 2:
                    return C3104A.f32303g;
                case 3:
                case 7:
                default:
                    return C3104A.f32311o;
                case 4:
                    return C3104A.f32305i;
                case 5:
                    return C3104A.f32307k;
                case 6:
                    return C3104A.f32309m;
                case 8:
                    return C3104A.f32306j;
                case 9:
                    return C3104A.f32308l;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return C3104A.f32310n;
            }
        }

        public final C3104A b(VelocityTracker tracker) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new C3104A(tracker.getXVelocity(), tracker.getYVelocity());
        }

        private a() {
        }
    }

    public C3104A(double d10, double d11) {
        this.f32312a = d10;
        this.f32313b = d11;
        double hypot = Math.hypot(d10, d11);
        this.f32316e = hypot;
        boolean z10 = hypot > 0.1d;
        this.f32314c = z10 ? d10 / hypot : 0.0d;
        this.f32315d = z10 ? d11 / hypot : 0.0d;
    }

    private final double j(C3104A c3104a) {
        return (this.f32314c * c3104a.f32314c) + (this.f32315d * c3104a.f32315d);
    }

    public final double k() {
        return this.f32316e;
    }

    public final boolean l(C3104A vector, double d10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return j(vector) > d10;
    }
}
