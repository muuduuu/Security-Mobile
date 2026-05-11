package db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import lc.t;
import yc.InterfaceC5191a;

/* renamed from: db.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3014i {

    /* renamed from: a, reason: collision with root package name */
    public static final C3014i f31337a = new C3014i();

    /* renamed from: b, reason: collision with root package name */
    private static final Iterable f31338b = new a();

    /* renamed from: db.i$a */
    public static final class a implements Iterable, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f31339a = G.k(t.a("string", CollectionsKt.m("Artist", "CFAPattern", "ComponentsConfiguration", "Copyright", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DeviceSettingDescription", "ExifVersion", "FileSource", "FlashpixVersion", "GPSAreaInformation", "GPSDateStamp", "GPSDestBearingRef", "GPSDestDistanceRef", "GPSDestLatitudeRef", "GPSDestLongitudeRef", "GPSHPositioningError", "GPSImgDirectionRef", "GPSLatitudeRef", "GPSLongitudeRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageUniqueID", "InteroperabilityIndex", "Make", "MakerNote", "Model", "OECF", "RelatedSoundFile", "SceneType", "Software", "SpatialFrequencyResponse", "SpectralSensitivity", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "UserComment")), t.a("double", CollectionsKt.m("ApertureValue", "BrightnessValue", "CompressedBitsPerPixel", "DigitalZoomRatio", "ExposureBiasValue", "ExposureIndex", "ExposureTime", "FlashEnergy", "FocalLength", "FocalPlaneXResolution", "FocalPlaneYResolution", "FNumber", "GPSAltitude", "GPSDestBearing", "GPSDestDistance", "GPSDestLatitude", "GPSDestLongitude", "GPSDOP", "GPSImgDirection", "GPSLatitude", "GPSLongitude", "GPSSpeed", "GPSTrack", "MaxApertureValue", "PrimaryChromaticities", "ReferenceBlackWhite", "ShutterSpeedValue", "SubjectDistance", "WhitePoint", "XResolution", "YCbCrCoefficients", "YResolution")), t.a("int", CollectionsKt.m("BitsPerSample", "ColorSpace", "Compression", "Contrast", "CustomRendered", "DefaultCropSize", "DNGVersion", "ExposureMode", "ExposureProgram", "Flash", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "GainControl", "GPSAltitudeRef", "GPSDifferential", "ImageLength", "ImageWidth", "ISOSpeedRatings", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LightSource", "MeteringMode", "NewSubfileType", "AspectFrame", "PreviewImageLength", "PreviewImageStart", "Orientation", "PhotometricInterpretation", "PixelXDimension", "PixelYDimension", "PlanarConfiguration", "ResolutionUnit", "RowsPerStrip", "ISO", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "SamplesPerPixel", "Saturation", "SceneCaptureType", "SensingMethod", "Sharpness", "StripByteCounts", "StripOffsets", "SubfileType", "SubjectArea", "SubjectDistanceRange", "SubjectLocation", "ThumbnailImageLength", "ThumbnailImageWidth", "TransferFunction", "WhiteBalance", "YCbCrPositioning", "YCbCrSubSampling")));

        a() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Map map = this.f31339a;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(t.a(str, (String) it.next()));
                }
                CollectionsKt.z(arrayList, arrayList2);
            }
            return arrayList.iterator();
        }
    }

    private C3014i() {
    }

    public final Iterable a() {
        return f31338b;
    }
}
