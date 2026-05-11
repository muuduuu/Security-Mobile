package co.hyperverge.hypersnapsdk.helpers;

import android.location.Location;
import android.media.ExifInterface;
import android.util.Log;
import co.hyperverge.hypersnapsdk.BuildConfig;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.objects.IPAddress;
import co.hyperverge.hypersnapsdk.utils.GPSHelper;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class ExifHelper {
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.ExifHelper";
    private String city;
    private String country;
    private String countryCode;
    private String ipAddress;
    private String aperature = null;
    private String datetime = null;
    private String exposureTime = null;
    private String flash = null;
    private String focalLength = null;
    private String gpsAltitude = null;
    private String gpsAltitudeRef = null;
    private String gpsDateStamp = null;
    private String gpsLatitude = null;
    private String gpsLatitudeRef = null;
    private String gpsLongitude = null;
    private String gpsLongitudeRef = null;
    private String gpsProcessingMethod = null;
    private String gpsTimestamp = null;
    private String iso = null;
    private String make = null;
    private String model = null;
    private final String orientation = null;
    private String whiteBalance = null;
    private String userComment = null;
    private final double longitude = 0.0d;
    private final double latitude = 0.0d;

    public String getUserCommentString(String str, IPAddress iPAddress) {
        HVLogUtils.d(TAG, "getUserCommentString() called with: transactionID = [" + str + "], geoDetails = [" + iPAddress + "]");
        StringBuilder sb2 = new StringBuilder("hvsdk_android_");
        String appId = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId();
        sb2.append(BuildConfig.HYPERSNAP_VERSION_NAME);
        sb2.append("_");
        sb2.append(appId);
        if (!StringUtils.isEmptyOrNull(str)) {
            sb2.append("_");
            sb2.append(str);
        } else if (!StringUtils.isEmptyOrNull(SPHelper.getTransactionID())) {
            sb2.append("_");
            sb2.append(SPHelper.getTransactionID());
        }
        if (iPAddress != null) {
            try {
                String ip = iPAddress.getIp();
                String city = iPAddress.getGeoDetails().getCity();
                String country = iPAddress.getGeoDetails().getCountry();
                String countryCode = iPAddress.getGeoDetails().getCountryCode();
                sb2.append("_");
                sb2.append(ip);
                sb2.append("_");
                sb2.append(city);
                sb2.append("_");
                sb2.append(country);
                sb2.append("_");
                sb2.append(countryCode);
            } catch (Exception e10) {
                String str2 = TAG;
                HVLogUtils.e(str2, "getUserCommentString(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(str2, "getUserCommentString: ", e10);
            }
        }
        return String.valueOf(sb2);
    }

    public void readExif(byte[] bArr, String str, Location location) {
        HVLogUtils.d(TAG, "readExif() called with: data = [" + bArr + "], filePath = [" + str + "], location = [" + location + "]");
        if (StringUtils.isEmptyOrNull(str)) {
            return;
        }
        File file = new File(str);
        try {
            new FileOutputStream(file).write(bArr);
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            this.aperature = exifInterface.getAttribute("FNumber");
            this.datetime = exifInterface.getAttribute("DateTime");
            this.exposureTime = exifInterface.getAttribute("ExposureTime");
            this.flash = exifInterface.getAttribute("Flash");
            this.focalLength = exifInterface.getAttribute("FocalLength");
            this.gpsAltitude = exifInterface.getAttribute("GPSAltitude");
            this.gpsAltitudeRef = exifInterface.getAttribute("GPSAltitudeRef");
            this.gpsDateStamp = exifInterface.getAttribute("GPSDateStamp");
            if (location != null) {
                this.gpsLatitude = GPSHelper.convert(location.getLatitude());
                this.gpsLongitude = GPSHelper.convert(location.getLongitude());
                this.gpsLatitudeRef = GPSHelper.latitudeRef(location.getLatitude());
                this.gpsLongitudeRef = GPSHelper.latitudeRef(location.getLongitude());
            }
            this.gpsProcessingMethod = exifInterface.getAttribute("GPSProcessingMethod");
            this.gpsTimestamp = exifInterface.getAttribute("GPSTimeStamp");
            this.iso = exifInterface.getAttribute("ISOSpeedRatings");
            this.make = exifInterface.getAttribute("Make");
            this.model = exifInterface.getAttribute("Model");
            this.whiteBalance = exifInterface.getAttribute("WhiteBalance");
            this.userComment = exifInterface.getAttribute("UserComment");
            exifInterface.getLatLong(new float[2]);
            file.delete();
        } catch (Exception e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "readExif(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void readExifFromFile(File file, Location location) {
        HVLogUtils.d(TAG, "readExifFromFile() called with: file = [" + file + "], location = [" + location + "]");
        ExifInterface exifInterface = new ExifInterface(file.getPath());
        this.aperature = exifInterface.getAttribute("FNumber");
        this.datetime = exifInterface.getAttribute("DateTime");
        this.exposureTime = exifInterface.getAttribute("ExposureTime");
        this.flash = exifInterface.getAttribute("Flash");
        this.focalLength = exifInterface.getAttribute("FocalLength");
        this.gpsAltitude = exifInterface.getAttribute("GPSAltitude");
        this.gpsAltitudeRef = exifInterface.getAttribute("GPSAltitudeRef");
        this.gpsDateStamp = exifInterface.getAttribute("GPSDateStamp");
        if (location != null) {
            this.gpsLatitude = GPSHelper.convert(location.getLatitude());
            this.gpsLongitude = GPSHelper.convert(location.getLongitude());
            this.gpsLatitudeRef = GPSHelper.latitudeRef(location.getLatitude());
            this.gpsLongitudeRef = GPSHelper.latitudeRef(location.getLongitude());
        }
        this.gpsProcessingMethod = exifInterface.getAttribute("GPSProcessingMethod");
        this.gpsTimestamp = exifInterface.getAttribute("GPSTimeStamp");
        this.iso = exifInterface.getAttribute("ISOSpeedRatings");
        this.make = exifInterface.getAttribute("Make");
        this.model = exifInterface.getAttribute("Model");
        this.whiteBalance = exifInterface.getAttribute("WhiteBalance");
        this.userComment = exifInterface.getAttribute("UserComment");
        exifInterface.getLatLong(new float[2]);
    }

    public void writeExifData(String str, String str2, IPAddress iPAddress) {
        HVLogUtils.d(TAG, "writeExifData() called with: filePath = [" + str + "], transactionID = [" + str2 + "], geoDetails = [" + iPAddress + "]");
        try {
            if (StringUtils.isEmptyOrNull(str)) {
                return;
            }
            ExifInterface exifInterface = new ExifInterface(str);
            String str3 = this.aperature;
            if (str3 != null) {
                exifInterface.setAttribute("FNumber", str3);
            }
            String str4 = this.datetime;
            if (str4 != null) {
                exifInterface.setAttribute("DateTime", str4);
            }
            String str5 = this.exposureTime;
            if (str5 != null) {
                exifInterface.setAttribute("ExposureTime", str5);
            }
            String str6 = this.flash;
            if (str6 != null) {
                exifInterface.setAttribute("Flash", str6);
            }
            String str7 = this.focalLength;
            if (str7 != null) {
                exifInterface.setAttribute("FocalLength", str7);
            }
            String str8 = this.gpsAltitude;
            if (str8 != null) {
                exifInterface.setAttribute("GPSAltitude", str8);
            }
            String str9 = this.gpsAltitudeRef;
            if (str9 != null) {
                exifInterface.setAttribute("GPSAltitudeRef", str9);
            }
            String str10 = this.gpsDateStamp;
            if (str10 != null) {
                exifInterface.setAttribute("GPSDateStamp", str10);
            }
            exifInterface.setAttribute("GPSLatitude", this.gpsLatitude);
            exifInterface.setAttribute("GPSLongitude", this.gpsLongitude);
            exifInterface.setAttribute("GPSLatitudeRef", this.gpsLatitudeRef);
            exifInterface.setAttribute("GPSLongitudeRef", this.gpsLongitudeRef);
            String userCommentString = getUserCommentString(str2, iPAddress);
            this.userComment = userCommentString;
            exifInterface.setAttribute("UserComment", userCommentString);
            String str11 = this.gpsProcessingMethod;
            if (str11 != null) {
                exifInterface.setAttribute("GPSProcessingMethod", str11);
            }
            String str12 = this.gpsTimestamp;
            if (str12 != null) {
                exifInterface.setAttribute("GPSTimeStamp", str12);
            }
            String str13 = this.iso;
            if (str13 != null) {
                exifInterface.setAttribute("ISOSpeedRatings", str13);
            }
            String str14 = this.make;
            if (str14 != null) {
                exifInterface.setAttribute("Make", str14);
            }
            String str15 = this.model;
            if (str15 != null) {
                exifInterface.setAttribute("Model", str15);
            }
            String str16 = this.whiteBalance;
            if (str16 != null) {
                exifInterface.setAttribute("WhiteBalance", str16);
            }
            exifInterface.saveAttributes();
        } catch (Exception e10) {
            String str17 = TAG;
            HVLogUtils.e(str17, "writeExifData(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str17, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }
}
