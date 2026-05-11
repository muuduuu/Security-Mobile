package e0;

import A.AbstractC0700h0;
import android.os.Build;
import androidx.camera.core.impl.e1;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import c0.o0;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final o0 f32131a;

    /* renamed from: b, reason: collision with root package name */
    private final e1 f32132b;

    /* renamed from: c, reason: collision with root package name */
    private final CameraUseInconsistentTimebaseQuirk f32133c;

    /* renamed from: d, reason: collision with root package name */
    private long f32134d = -1;

    /* renamed from: e, reason: collision with root package name */
    private e1 f32135e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32136a;

        static {
            int[] iArr = new int[e1.values().length];
            f32136a = iArr;
            try {
                iArr[e1.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32136a[e1.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(o0 o0Var, e1 e1Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f32131a = o0Var;
        this.f32132b = e1Var;
        this.f32133c = cameraUseInconsistentTimebaseQuirk;
    }

    private long a() {
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            long a10 = this.f32131a.a();
            long b10 = this.f32131a.b();
            long a11 = this.f32131a.a();
            long j12 = a11 - a10;
            if (i10 == 0 || j12 < j10) {
                j11 = b10 - ((a10 + a11) >> 1);
                j10 = j12;
            }
        }
        return Math.max(0L, j11);
    }

    private boolean c() {
        return this.f32131a.b() - this.f32131a.a() > 3000000;
    }

    private boolean d(long j10) {
        return Math.abs(j10 - this.f32131a.b()) < Math.abs(j10 - this.f32131a.a());
    }

    private e1 e(long j10) {
        boolean z10;
        String str;
        String str2;
        if (this.f32133c != null) {
            AbstractC0700h0.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z10 = false;
        } else {
            if (!c()) {
                return this.f32132b;
            }
            z10 = true;
        }
        e1 e1Var = d(j10) ? e1.REALTIME : e1.UPTIME;
        if (!z10 || e1Var == this.f32132b) {
            AbstractC0700h0.a("VideoTimebaseConverter", "Detect input timebase = " + e1Var);
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", SOC: ");
                str2 = Build.SOC_MODEL;
                sb2.append(str2);
                str = sb2.toString();
            } else {
                str = BuildConfig.FLAVOR;
            }
            AbstractC0700h0.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), str, this.f32132b, e1Var));
        }
        return e1Var;
    }

    public long b(long j10) {
        if (this.f32135e == null) {
            this.f32135e = e(j10);
        }
        int i10 = a.f32136a[this.f32135e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return j10;
            }
            throw new AssertionError("Unknown timebase: " + this.f32135e);
        }
        if (this.f32134d == -1) {
            this.f32134d = a();
            AbstractC0700h0.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f32134d);
        }
        return j10 - this.f32134d;
    }
}
