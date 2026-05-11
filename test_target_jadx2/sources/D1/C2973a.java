package d1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2973a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2973a f31195a = new C2973a();

    /* renamed from: d1.a$a, reason: collision with other inner class name */
    private static final class C0449a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0449a f31196a = new C0449a();

        private C0449a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            return extensionVersion;
        }
    }

    /* renamed from: d1.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31197a = new b();

        private b() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(HVFrameRecorder.BITRATE);
            return extensionVersion;
        }
    }

    private C2973a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f31197a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0449a.f31196a.a();
        }
        return 0;
    }
}
