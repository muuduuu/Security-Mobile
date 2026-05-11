package E;

import A.AbstractC0700h0;
import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.EnumC1467w;
import com.appsflyer.attribution.RequestError;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    static final String[] f1829c = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d, reason: collision with root package name */
    private static final k[] f1830d;

    /* renamed from: e, reason: collision with root package name */
    private static final k[] f1831e;

    /* renamed from: f, reason: collision with root package name */
    private static final k[] f1832f;

    /* renamed from: g, reason: collision with root package name */
    static final k[] f1833g;

    /* renamed from: h, reason: collision with root package name */
    private static final k[] f1834h;

    /* renamed from: i, reason: collision with root package name */
    static final k[][] f1835i;

    /* renamed from: j, reason: collision with root package name */
    static final HashSet f1836j;

    /* renamed from: a, reason: collision with root package name */
    private final List f1837a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteOrder f1838b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1839a;

        static {
            int[] iArr = new int[EnumC1467w.values().length];
            f1839a = iArr;
            try {
                iArr[EnumC1467w.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1839a[EnumC1467w.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1839a[EnumC1467w.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f1840c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f1841d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f1842e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f, reason: collision with root package name */
        static final List f1843f = Collections.list(new a());

        /* renamed from: a, reason: collision with root package name */
        final List f1844a = Collections.list(new C0035b());

        /* renamed from: b, reason: collision with root package name */
        private final ByteOrder f1845b;

        class a implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            int f1846a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap nextElement() {
                HashMap hashMap = new HashMap();
                for (k kVar : i.f1835i[this.f1846a]) {
                    hashMap.put(kVar.f1859b, kVar);
                }
                this.f1846a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1846a < i.f1835i.length;
            }
        }

        /* renamed from: E.i$b$b, reason: collision with other inner class name */
        class C0035b implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            int f1847a = 0;

            C0035b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                this.f1847a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1847a < i.f1835i.length;
            }
        }

        class c implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            final Enumeration f1849a;

            c() {
                this.f1849a = Collections.enumeration(b.this.f1844a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                return new HashMap((Map) this.f1849a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1849a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f1845b = byteOrder;
        }

        private static Pair b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair b10 = b(split[0]);
                if (((Integer) b10.first).intValue() == 2) {
                    return b10;
                }
                for (int i10 = 1; i10 < split.length; i10++) {
                    Pair b11 = b(split[i10]);
                    int intValue = (((Integer) b11.first).equals(b10.first) || ((Integer) b11.second).equals(b10.first)) ? ((Integer) b10.first).intValue() : -1;
                    int intValue2 = (((Integer) b10.second).intValue() == -1 || !(((Integer) b11.first).equals(b10.second) || ((Integer) b11.second).equals(b10.second))) ? -1 : ((Integer) b10.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (intValue == -1) {
                        b10 = new Pair(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b10 = new Pair(Integer.valueOf(intValue), -1);
                    }
                }
                return b10;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            }
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        private void d(String str, String str2, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x018c, code lost:
        
            if (r7 != r0) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void e(String str, String str2, List list) {
            int i10;
            int i11;
            int i12;
            b bVar = this;
            String str3 = str;
            String str4 = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
                boolean find = f1841d.matcher(str4).find();
                boolean find2 = f1842e.matcher(str4).find();
                if (str2.length() != 19 || (!find && !find2)) {
                    AbstractC0700h0.l("ExifData", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str5 = str3;
            int i13 = 2;
            int i14 = 1;
            if (str4 != null && i.f1836j.contains(str5)) {
                if (str5.equals("GPSTimeStamp")) {
                    Matcher matcher = f1840c.matcher(str4);
                    if (!matcher.find()) {
                        AbstractC0700h0.l("ExifData", "Invalid value for " + str5 + " : " + str4);
                        return;
                    }
                    str4 = Integer.parseInt((String) y0.f.g(matcher.group(1))) + "/1," + Integer.parseInt((String) y0.f.g(matcher.group(2))) + "/1," + Integer.parseInt((String) y0.f.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        str4 = new l(Double.parseDouble(str4)).toString();
                    } catch (NumberFormatException e10) {
                        AbstractC0700h0.m("ExifData", "Invalid value for " + str5 + " : " + str4, e10);
                        return;
                    }
                }
            }
            int i15 = 0;
            int i16 = 0;
            while (i16 < i.f1835i.length) {
                k kVar = (k) ((HashMap) f1843f.get(i16)).get(str5);
                if (kVar != null) {
                    if (str4 == null) {
                        ((Map) list.get(i16)).remove(str5);
                    } else {
                        Pair b10 = b(str4);
                        if (kVar.f1860c == ((Integer) b10.first).intValue() || kVar.f1860c == ((Integer) b10.second).intValue()) {
                            i12 = kVar.f1860c;
                        } else {
                            int i17 = kVar.f1861d;
                            if (i17 == -1 || !(i17 == ((Integer) b10.first).intValue() || kVar.f1861d == ((Integer) b10.second).intValue())) {
                                i12 = kVar.f1860c;
                                if (i12 != i14) {
                                    if (i12 != 7) {
                                    }
                                }
                            } else {
                                i12 = kVar.f1861d;
                            }
                        }
                        String str6 = "/";
                        switch (i12) {
                            case 1:
                                i10 = i16;
                                i11 = i14;
                                ((Map) list.get(i10)).put(str5, h.a(str4));
                                break;
                            case 2:
                            case 7:
                                i10 = i16;
                                i11 = i14;
                                ((Map) list.get(i10)).put(str5, h.e(str4));
                                break;
                            case 3:
                                i10 = i16;
                                i11 = i14;
                                String[] split = str4.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i18 = 0; i18 < split.length; i18++) {
                                    iArr[i18] = Integer.parseInt(split[i18]);
                                }
                                ((Map) list.get(i10)).put(str5, h.i(iArr, bVar.f1845b));
                                break;
                            case 4:
                                i10 = i16;
                                i11 = i14;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i19 = 0; i19 < split2.length; i19++) {
                                    jArr[i19] = Long.parseLong(split2[i19]);
                                }
                                ((Map) list.get(i10)).put(str5, h.g(jArr, bVar.f1845b));
                                break;
                            case 5:
                                String str7 = "/";
                                String[] split3 = str4.split(",", -1);
                                l[] lVarArr = new l[split3.length];
                                int i20 = i15;
                                while (i20 < split3.length) {
                                    String str8 = str7;
                                    String[] split4 = split3[i20].split(str8, -1);
                                    lVarArr[i20] = new l((long) Double.parseDouble(split4[i15]), (long) Double.parseDouble(split4[1]));
                                    i20++;
                                    str7 = str8;
                                    i16 = i16;
                                    i15 = 0;
                                }
                                i10 = i16;
                                i11 = 1;
                                ((Map) list.get(i10)).put(str5, h.h(lVarArr, bVar.f1845b));
                                break;
                            case 9:
                                String[] split5 = str4.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i21 = i15; i21 < split5.length; i21++) {
                                    iArr2[i21] = Integer.parseInt(split5[i21]);
                                }
                                ((Map) list.get(i16)).put(str5, h.c(iArr2, bVar.f1845b));
                                i10 = i16;
                                i11 = 1;
                                break;
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                String[] split6 = str4.split(",", -1);
                                l[] lVarArr2 = new l[split6.length];
                                int i22 = i15;
                                while (i22 < split6.length) {
                                    String[] split7 = split6[i22].split(str6, -1);
                                    lVarArr2[i22] = new l((long) Double.parseDouble(split7[i15]), (long) Double.parseDouble(split7[i14]));
                                    i22++;
                                    str6 = str6;
                                    i14 = 1;
                                }
                                bVar = this;
                                ((Map) list.get(i16)).put(str5, h.d(lVarArr2, bVar.f1845b));
                                i10 = i16;
                                i11 = 1;
                                break;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i23 = i15; i23 < split8.length; i23++) {
                                    dArr[i23] = Double.parseDouble(split8[i23]);
                                }
                                ((Map) list.get(i16)).put(str5, h.b(dArr, bVar.f1845b));
                                break;
                        }
                        i16 = i10 + 1;
                        i14 = i11;
                        i13 = 2;
                        i15 = 0;
                    }
                }
                i10 = i16;
                i11 = i14;
                i16 = i10 + 1;
                i14 = i11;
                i13 = 2;
                i15 = 0;
            }
        }

        public i a() {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new i(this.f1845b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f1844a);
            return this;
        }

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(EnumC1467w enumC1467w) {
            int i10;
            if (enumC1467w == EnumC1467w.UNKNOWN) {
                return this;
            }
            int i11 = a.f1839a[enumC1467w.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    AbstractC0700h0.l("ExifData", "Unknown flash state: " + enumC1467w);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new l((long) (f10 * 1000.0f), 1000L).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                AbstractC0700h0.l("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        public b n(c cVar) {
            int ordinal = cVar.ordinal();
            return c("WhiteBalance", ordinal != 0 ? ordinal != 1 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        k[] kVarArr = {new k("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new k("ImageLength", 257, 3, 4), new k("Make", 271, 2), new k("Model", 272, 2), new k("Orientation", 274, 3), new k("XResolution", 282, 5), new k("YResolution", 283, 5), new k("ResolutionUnit", 296, 3), new k("Software", 305, 2), new k("DateTime", 306, 2), new k("YCbCrPositioning", 531, 3), new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4)};
        f1830d = kVarArr;
        k[] kVarArr2 = {new k("ExposureTime", 33434, 5), new k("FNumber", 33437, 5), new k("ExposureProgram", 34850, 3), new k("PhotographicSensitivity", 34855, 3), new k("SensitivityType", 34864, 3), new k("ExifVersion", 36864, 2), new k("DateTimeOriginal", 36867, 2), new k("DateTimeDigitized", 36868, 2), new k("ComponentsConfiguration", 37121, 7), new k("ShutterSpeedValue", 37377, 10), new k("ApertureValue", 37378, 5), new k("BrightnessValue", 37379, 10), new k("ExposureBiasValue", 37380, 10), new k("MaxApertureValue", 37381, 5), new k("MeteringMode", 37383, 3), new k("LightSource", 37384, 3), new k("Flash", 37385, 3), new k("FocalLength", 37386, 5), new k("SubSecTime", 37520, 2), new k("SubSecTimeOriginal", 37521, 2), new k("SubSecTimeDigitized", 37522, 2), new k("FlashpixVersion", 40960, 7), new k("ColorSpace", 40961, 3), new k("PixelXDimension", 40962, 3, 4), new k("PixelYDimension", 40963, 3, 4), new k("InteroperabilityIFDPointer", 40965, 4), new k("FocalPlaneResolutionUnit", 41488, 3), new k("SensingMethod", 41495, 3), new k("FileSource", 41728, 7), new k("SceneType", 41729, 7), new k("CustomRendered", 41985, 3), new k("ExposureMode", 41986, 3), new k("WhiteBalance", 41987, 3), new k("SceneCaptureType", 41990, 3), new k("Contrast", 41992, 3), new k("Saturation", 41993, 3), new k("Sharpness", 41994, 3)};
        f1831e = kVarArr2;
        k[] kVarArr3 = {new k("GPSVersionID", 0, 1), new k("GPSLatitudeRef", 1, 2), new k("GPSLatitude", 2, 5, 10), new k("GPSLongitudeRef", 3, 2), new k("GPSLongitude", 4, 5, 10), new k("GPSAltitudeRef", 5, 1), new k("GPSAltitude", 6, 5), new k("GPSTimeStamp", 7, 5), new k("GPSSpeedRef", 12, 2), new k("GPSTrackRef", 14, 2), new k("GPSImgDirectionRef", 16, 2), new k("GPSDestBearingRef", 23, 2), new k("GPSDestDistanceRef", 25, 2)};
        f1832f = kVarArr3;
        f1833g = new k[]{new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4), new k("InteroperabilityIFDPointer", 40965, 4)};
        k[] kVarArr4 = {new k("InteroperabilityIndex", 1, 2)};
        f1834h = kVarArr4;
        f1835i = new k[][]{kVarArr, kVarArr2, kVarArr3, kVarArr4};
        f1836j = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    i(ByteOrder byteOrder, List list) {
        y0.f.j(list.size() == f1835i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f1838b = byteOrder;
        this.f1837a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static i b(androidx.camera.core.n nVar, int i10) {
        b a10 = a();
        if (nVar.G() != null) {
            nVar.G().b(a10);
        }
        a10.m(i10);
        return a10.j(nVar.getWidth()).i(nVar.getHeight()).a();
    }

    Map c(int i10) {
        y0.f.c(i10, 0, f1835i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f1837a.get(i10);
    }

    public ByteOrder d() {
        return this.f1838b;
    }
}
