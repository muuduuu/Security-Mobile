package ea;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final a f32508f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final double f32509a;

    /* renamed from: b, reason: collision with root package name */
    private final double f32510b;

    /* renamed from: c, reason: collision with root package name */
    private final double f32511c;

    /* renamed from: d, reason: collision with root package name */
    private final double f32512d;

    /* renamed from: e, reason: collision with root package name */
    private final double f32513e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair b(double d10, double d11) {
            double atan;
            double atan2;
            if (d10 < 1.0E-9d) {
                atan = 1.5707963267948966d;
                double d12 = (d11 < 1.0E-9d || Math.abs(d11 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d13 = d11 - 1.5707963267948966d;
                double d14 = Math.abs(d13) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d15 = d11 - 3.141592653589793d;
                atan2 = -1.5707963267948966d;
                if (Math.abs(d15) < 1.0E-9d) {
                    d12 = -1.5707963267948966d;
                }
                double d16 = d11 - 4.71238898038469d;
                if (Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                }
                if (d11 > 1.0E-9d && Math.abs(d13) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = 1.5707963267948966d;
                }
                if (Math.abs(d13) > 1.0E-9d && Math.abs(d15) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d15) > 1.0E-9d && Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d16) <= 1.0E-9d || Math.abs(d11 - 6.283185307179586d) >= 1.0E-9d) {
                    atan2 = d14;
                    atan = d12;
                }
            } else {
                double tan = Math.tan(d10);
                atan = Math.atan(Math.cos(d11) / tan);
                atan2 = Math.atan(Math.sin(d11) / tan);
            }
            return new Pair(Double.valueOf(Math.rint(atan * 57.29577951308232d)), Double.valueOf(Math.rint(atan2 * 57.29577951308232d)));
        }

        public final x a(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            double axisValue = 1.5707963267948966d - event.getAxisValue(25);
            double pressure = event.getPressure(0);
            double orientation = (event.getOrientation(0) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d10 = orientation;
            Pair b10 = b(axisValue, d10);
            return new x(((Number) b10.c()).doubleValue(), ((Number) b10.d()).doubleValue(), axisValue, d10, pressure);
        }

        private a() {
        }
    }

    public x(double d10, double d11, double d12, double d13, double d14) {
        this.f32509a = d10;
        this.f32510b = d11;
        this.f32511c = d12;
        this.f32512d = d13;
        this.f32513e = d14;
    }

    public final double a() {
        return this.f32513e;
    }

    public final ReadableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("tiltX", this.f32509a);
        createMap.putDouble("tiltY", this.f32510b);
        createMap.putDouble("altitudeAngle", this.f32511c);
        createMap.putDouble("azimuthAngle", this.f32512d);
        createMap.putDouble("pressure", this.f32513e);
        Intrinsics.d(createMap);
        return createMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Double.compare(this.f32509a, xVar.f32509a) == 0 && Double.compare(this.f32510b, xVar.f32510b) == 0 && Double.compare(this.f32511c, xVar.f32511c) == 0 && Double.compare(this.f32512d, xVar.f32512d) == 0 && Double.compare(this.f32513e, xVar.f32513e) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f32509a) * 31) + Double.hashCode(this.f32510b)) * 31) + Double.hashCode(this.f32511c)) * 31) + Double.hashCode(this.f32512d)) * 31) + Double.hashCode(this.f32513e);
    }

    public String toString() {
        return "StylusData(tiltX=" + this.f32509a + ", tiltY=" + this.f32510b + ", altitudeAngle=" + this.f32511c + ", azimuthAngle=" + this.f32512d + ", pressure=" + this.f32513e + ")";
    }

    public /* synthetic */ x(double d10, double d11, double d12, double d13, double d14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? 0.0d : d12, (i10 & 8) == 0 ? d13 : 0.0d, (i10 & 16) != 0 ? -1.0d : d14);
    }
}
