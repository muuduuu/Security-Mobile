package f9;

import V6.AbstractC1287s;
import V6.C1279j;
import android.os.SystemClock;
import e9.C3102a;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3154a {

    /* renamed from: c, reason: collision with root package name */
    private static final C1279j f32882c = new C1279j("StreamingFormatChecker", BuildConfig.FLAVOR);

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f32883a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private long f32884b = -1;

    public void a(C3102a c3102a) {
        if (c3102a.h() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f32883a.add(Long.valueOf(elapsedRealtime));
        if (this.f32883a.size() > 5) {
            this.f32883a.removeFirst();
        }
        if (this.f32883a.size() != 5 || elapsedRealtime - ((Long) AbstractC1287s.m((Long) this.f32883a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f32884b;
        if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f32884b = elapsedRealtime;
            f32882c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
