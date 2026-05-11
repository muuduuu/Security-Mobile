package ya;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ya.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5181a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5181a f45382a = new C5181a();

    private C5181a() {
    }

    public static final void a(androidx.exifinterface.media.a baseExif, androidx.exifinterface.media.a additionalExif) {
        Intrinsics.checkNotNullParameter(baseExif, "baseExif");
        Intrinsics.checkNotNullParameter(additionalExif, "additionalExif");
        for (String[] strArr : AbstractC5182b.a()) {
            String str = strArr[1];
            String g10 = additionalExif.g(str);
            if (g10 != null) {
                baseExif.b0(str, g10);
            }
        }
        baseExif.W();
    }

    public static final Bundle b(androidx.exifinterface.media.a exifInterface) {
        Intrinsics.checkNotNullParameter(exifInterface, "exifInterface");
        Bundle bundle = new Bundle();
        for (String[] strArr : AbstractC5182b.a()) {
            String str = strArr[0];
            String str2 = strArr[1];
            if (exifInterface.g(str2) != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1325958191) {
                    if (hashCode != -891985903) {
                        if (hashCode == 104431 && str.equals("int")) {
                            bundle.putInt(str2, exifInterface.i(str2, 0));
                        }
                    } else if (str.equals("string")) {
                        bundle.putString(str2, exifInterface.g(str2));
                    }
                } else if (str.equals("double")) {
                    bundle.putDouble(str2, exifInterface.h(str2, 0.0d));
                }
            }
        }
        double[] m10 = exifInterface.m();
        if (m10 != null) {
            bundle.putDouble("GPSLatitude", m10[0]);
            bundle.putDouble("GPSLongitude", m10[1]);
            bundle.putDouble("GPSAltitude", exifInterface.f(0.0d));
        }
        return bundle;
    }

    public static final void c(androidx.exifinterface.media.a baseExif, Map exifMap) {
        Intrinsics.checkNotNullParameter(baseExif, "baseExif");
        Intrinsics.checkNotNullParameter(exifMap, "exifMap");
        for (String[] strArr : AbstractC5182b.a()) {
            String str = strArr[1];
            Object obj = exifMap.get(str);
            if (obj != null) {
                if (obj instanceof String) {
                    baseExif.b0(str, (String) obj);
                } else if (obj instanceof Number) {
                    baseExif.b0(str, new BigDecimal(String.valueOf(((Number) obj).doubleValue())).toPlainString());
                } else if (obj instanceof Boolean) {
                    baseExif.b0(str, obj.toString());
                }
            }
        }
        if (exifMap.containsKey("GPSLatitude") && exifMap.containsKey("GPSLongitude") && (exifMap.get("GPSLatitude") instanceof Number) && (exifMap.get("GPSLongitude") instanceof Number)) {
            Object obj2 = exifMap.get("GPSLatitude");
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((Double) obj2).doubleValue();
            Object obj3 = exifMap.get("GPSLongitude");
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.Double");
            baseExif.d0(doubleValue, ((Double) obj3).doubleValue());
        }
        if (exifMap.containsKey("GPSAltitude") && (exifMap.get("GPSAltitude") instanceof Number)) {
            Object obj4 = exifMap.get("GPSAltitude");
            Intrinsics.e(obj4, "null cannot be cast to non-null type kotlin.Double");
            baseExif.a0(((Double) obj4).doubleValue());
        }
    }
}
