package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15960a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15961b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15962c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15963d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15964e;

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    private static final class C0269a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0269a f15965a = new C0269a();

        private C0269a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f15961b = i10 >= 30 ? C0269a.f15965a.a(30) : 0;
        f15962c = i10 >= 30 ? C0269a.f15965a.a(31) : 0;
        f15963d = i10 >= 30 ? C0269a.f15965a.a(33) : 0;
        f15964e = i10 >= 30 ? C0269a.f15965a.a(HVFrameRecorder.BITRATE) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.b("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (a("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
