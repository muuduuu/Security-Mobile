package d5;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC2992n implements Interpolator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31232b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f31233a;

    /* renamed from: d5.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(ReadableMap params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params.getType("springDamping") == ReadableType.Number) {
                return (float) params.getDouble("springDamping");
            }
            return 0.5f;
        }

        private a() {
        }
    }

    public InterpolatorC2992n(float f10) {
        this.f31233a = f10;
    }

    public static final float a(ReadableMap readableMap) {
        return f31232b.a(readableMap);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) (1 + (Math.pow(2.0d, (-10) * f10) * Math.sin((((f10 - (r4 / 4)) * 3.141592653589793d) * 2) / this.f31233a)));
    }
}
