package E;

import A.AbstractC0700h0;
import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final String f1812c = "g";

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f1813d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f1814e = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f1815f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final List f1816g = n();

    /* renamed from: h, reason: collision with root package name */
    private static final List f1817h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.exifinterface.media.a f1818a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1819b = false;

    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class b extends ThreadLocal {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    class c extends ThreadLocal {
        c() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private static final class d {

        static final class a {

            /* renamed from: a, reason: collision with root package name */
            final double f1820a;

            a(double d10) {
                this.f1820a = d10;
            }

            double a() {
                return this.f1820a / 2.23694d;
            }
        }

        static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        static a c(double d10) {
            return new a(d10);
        }
    }

    private g(androidx.exifinterface.media.a aVar) {
        this.f1818a = aVar;
    }

    private void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String f10 = f(currentTimeMillis);
        this.f1818a.b0("DateTime", f10);
        try {
            this.f1818a.b0("SubSecTime", Long.toString(currentTimeMillis - d(f10).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date c(String str) {
        return ((SimpleDateFormat) f1813d.get()).parse(str);
    }

    private static Date d(String str) {
        return ((SimpleDateFormat) f1815f.get()).parse(str);
    }

    private static Date e(String str) {
        return ((SimpleDateFormat) f1814e.get()).parse(str);
    }

    private static String f(long j10) {
        return ((SimpleDateFormat) f1815f.get()).format(new Date(j10));
    }

    public static g h(File file) {
        return i(file.toString());
    }

    public static g i(String str) {
        return new g(new androidx.exifinterface.media.a(str));
    }

    public static g j(androidx.camera.core.n nVar) {
        ByteBuffer m10 = nVar.S()[0].m();
        m10.rewind();
        byte[] bArr = new byte[m10.capacity()];
        m10.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static g k(InputStream inputStream) {
        return new g(new androidx.exifinterface.media.a(inputStream));
    }

    public static List n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void A() {
        if (!this.f1819b) {
            a();
        }
        this.f1818a.W();
    }

    public void b(Location location) {
        this.f1818a.c0(location);
    }

    public void g(g gVar) {
        ArrayList<String> arrayList = new ArrayList(f1816g);
        arrayList.removeAll(f1817h);
        for (String str : arrayList) {
            String g10 = this.f1818a.g(str);
            String g11 = gVar.f1818a.g(str);
            if (g10 != null && !g10.equals(g11)) {
                gVar.f1818a.b0(str, g10);
            }
        }
    }

    public void l() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 2;
                break;
        }
        this.f1818a.b0("Orientation", String.valueOf(i10));
    }

    public void m() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 4;
                break;
        }
        this.f1818a.b0("Orientation", String.valueOf(i10));
    }

    public String o() {
        return this.f1818a.g("ImageDescription");
    }

    public int p() {
        return this.f1818a.i("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Location q() {
        char c10;
        String g10 = this.f1818a.g("GPSProcessingMethod");
        double[] m10 = this.f1818a.m();
        double f10 = this.f1818a.f(0.0d);
        double h10 = this.f1818a.h("GPSSpeed", 0.0d);
        String g11 = this.f1818a.g("GPSSpeedRef");
        if (g11 == null) {
            g11 = "K";
        }
        long y10 = y(this.f1818a.g("GPSDateStamp"), this.f1818a.g("GPSTimeStamp"));
        if (m10 == null) {
            return null;
        }
        if (g10 == null) {
            g10 = f1812c;
        }
        Location location = new Location(g10);
        location.setLatitude(m10[0]);
        location.setLongitude(m10[1]);
        if (f10 != 0.0d) {
            location.setAltitude(f10);
        }
        if (h10 != 0.0d) {
            int hashCode = g11.hashCode();
            if (hashCode == 75) {
                if (g11.equals("K")) {
                    c10 = 2;
                    location.setSpeed((float) (c10 == 0 ? c10 != 1 ? d.a(h10).a() : d.b(h10).a() : d.c(h10).a()));
                }
                c10 = 65535;
                location.setSpeed((float) (c10 == 0 ? c10 != 1 ? d.a(h10).a() : d.b(h10).a() : d.c(h10).a()));
            } else if (hashCode != 77) {
                if (hashCode == 78 && g11.equals("N")) {
                    c10 = 1;
                    location.setSpeed((float) (c10 == 0 ? c10 != 1 ? d.a(h10).a() : d.b(h10).a() : d.c(h10).a()));
                }
                c10 = 65535;
                location.setSpeed((float) (c10 == 0 ? c10 != 1 ? d.a(h10).a() : d.b(h10).a() : d.c(h10).a()));
            } else {
                if (g11.equals("M")) {
                    c10 = 0;
                    location.setSpeed((float) (c10 == 0 ? c10 != 1 ? d.a(h10).a() : d.b(h10).a() : d.c(h10).a()));
                }
                c10 = 65535;
                location.setSpeed((float) (c10 == 0 ? c10 != 1 ? d.a(h10).a() : d.b(h10).a() : d.c(h10).a()));
            }
        }
        if (y10 != -1) {
            location.setTime(y10);
        }
        return location;
    }

    public int r() {
        return this.f1818a.i("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long t() {
        long x10 = x(this.f1818a.g("DateTimeOriginal"));
        if (x10 == -1) {
            return -1L;
        }
        String g10 = this.f1818a.g("SubSecTimeOriginal");
        if (g10 == null) {
            return x10;
        }
        try {
            long parseLong = Long.parseLong(g10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return x10 + parseLong;
        } catch (NumberFormatException unused) {
            return x10;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f1818a.i("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int r10 = r();
        return r10 == 4 || r10 == 5 || r10 == 7;
    }

    public void z(int i10) {
        if (i10 % 90 != 0) {
            AbstractC0700h0.l(f1812c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f1818a.b0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int r10 = r();
        while (i11 < 0) {
            i11 += 90;
            switch (r10) {
                case 2:
                    r10 = 5;
                    break;
                case 3:
                case 8:
                    r10 = 6;
                    break;
                case 4:
                    r10 = 7;
                    break;
                case 5:
                    r10 = 4;
                    break;
                case 6:
                    r10 = 1;
                    break;
                case 7:
                    r10 = 2;
                    break;
                default:
                    r10 = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (r10) {
                case 2:
                    r10 = 7;
                    break;
                case 3:
                    r10 = 8;
                    break;
                case 4:
                    r10 = 5;
                    break;
                case 5:
                    r10 = 2;
                    break;
                case 6:
                    r10 = 3;
                    break;
                case 7:
                    r10 = 4;
                    break;
                case 8:
                    r10 = 1;
                    break;
                default:
                    r10 = 6;
                    break;
            }
        }
        this.f1818a.b0("Orientation", String.valueOf(r10));
    }
}
