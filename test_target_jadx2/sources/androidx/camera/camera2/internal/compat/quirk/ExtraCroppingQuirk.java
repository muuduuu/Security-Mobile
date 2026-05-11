package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.b1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f14314a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14315a;

        static {
            int[] iArr = new int[b1.b.values().length];
            f14315a = iArr;
            try {
                iArr[b1.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14315a[b1.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14315a[b1.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f14314a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    private static boolean g() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map map = f14314a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    static boolean h() {
        return g();
    }

    public Size f(b1.b bVar) {
        if (!g()) {
            return null;
        }
        int i10 = a.f14315a[bVar.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(1280, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
