package co.hyperverge.hypersnapsdk.utils;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Point;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.ComponentCallbacksC1573o;
import co.hyperverge.hvcamera.magicfilter.utils.Exif;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.data.remote.SignatureHelper;
import co.hyperverge.hypersnapsdk.helpers.FileHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.xmlparser.XmlToJson;
import co.hyperverge.hypersnapsdk.model.HVFaceObj;
import co.hyperverge.hypersnapsdk.objects.ExternalConfigs;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.utils.threading.ThreadExecutor;
import g9.C3201a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Utils {
    public static int JPEG_COMPRESSION_QUALITY = 95;
    private static final String TAG = "co.hyperverge.hypersnapsdk.utils.Utils";
    private static final ArrayList<String> requiredPermissions = new ArrayList<>(Arrays.asList("android.permission.CAMERA"));

    public interface FileOperationCallback {
        void onSaved(File file);
    }

    public static String XMLToJSON(String str) {
        try {
            return new XmlToJson.Builder(str).build().toJson().toString();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            return str;
        }
    }

    private static JSONObject addBonusDataToResult(byte[] bArr, int i10, JSONObject jSONObject, int i11, int[] iArr) {
        int i12;
        if (i10 > 256) {
            int i13 = i10 - 1;
            try {
                jSONObject.put("signature", Base64.encodeToString(reverseBytes(Arrays.copyOfRange(bArr, i10 - 257, i13)), 0));
                if (i11 != 0) {
                    if ((i11 == 3 || i11 == 1) && i10 > 288) {
                        jSONObject.put("mobile_hash", SignatureHelper.bytesToHex(reverseBytes(Arrays.copyOfRange(bArr, i10 - 290, i10 - 258))));
                    }
                    if (i11 == 3 || i11 == 2) {
                        if (i10 > ((i11 == 2 ? 1 : 2) * 32) + PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                            int i14 = (i10 - 258) - ((i11 == 2 ? 1 : 2) * 32);
                            jSONObject.put("email_hash", SignatureHelper.bytesToHex(reverseBytes(Arrays.copyOfRange(bArr, i14, i14 + 32))));
                        }
                    }
                }
                if (i11 == 3) {
                    i12 = i10 - 65;
                } else {
                    i12 = i13 - (i11 == 0 ? 0 : 32);
                }
                jSONObject.put("photo_jp2000", Base64.encodeToString(Arrays.copyOfRange(bArr, iArr[15] + 1, i12), 0));
            } catch (Exception e10) {
                HVLogUtils.e(TAG, getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        return jSONObject;
    }

    public static boolean canDismissLoader(Activity activity) {
        return isActivityActive(activity);
    }

    public static int checkForOrientationCorrection(int i10) {
        if (i10 == 0 && SDKInternalConfig.getInstance() != null && SDKInternalConfig.getInstance().shouldCorrectOrientation()) {
            return 6;
        }
        return i10;
    }

    public static ArrayList<String> checkIfPermissionsGranted(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = requiredPermissions.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (context.checkCallingOrSelfPermission(next) != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean containsSubstring(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().toLowerCase().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] convertFileToBytes(Context context, File file) {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
        } catch (FileNotFoundException e10) {
            HVLogUtils.e(TAG, "convertFileToBytes: " + getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            return null;
        } catch (IOException e11) {
            HVLogUtils.e(TAG, "convertFileToBytes: " + getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
            return null;
        } catch (Exception e12) {
            HVLogUtils.e(TAG, "convertFileToBytes: " + getErrorMessage(e12));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
            }
        }
        return bArr;
    }

    public static void copyFile(String str, String str2) {
        try {
            File parentFile = new File(str2).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public static Bitmap cropQR(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap, (int) (bitmap.getWidth() * 0.6666666666666667d), 0, (int) (bitmap.getWidth() * 0.3333333333333333d), (int) (bitmap.getHeight() * 0.5d));
        } catch (Exception | OutOfMemoryError e10) {
            HVLogUtils.e(TAG, "cropQR : " + getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static byte[] decompressByteArray(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        int i10 = 0;
        while (i10 >= 0) {
            i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String extractFileExtension(String str) {
        HVLogUtils.d(TAG, "extractFileExtension() called with: filePath = [" + str + "]");
        try {
            return str.substring(str.lastIndexOf(".") + 1);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "extractFileExtension: ", e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    private static String formatDate(String str) {
        if (str.equals(BuildConfig.FLAVOR)) {
            return BuildConfig.FLAVOR;
        }
        String[] strArr = {"dd-MM-yyyy", "dd/MM/yyyy"};
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date date = null;
        ParseException e10 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                date = new SimpleDateFormat(strArr[i10], Locale.getDefault()).parse(str);
                break;
            } catch (ParseException e11) {
                e10 = e11;
            }
        }
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        if (e10 != null) {
            return str;
        }
        throw new AssertionError("This code is unreachable");
    }

    public static int generateRandomInteger(int i10) {
        return new SecureRandom().nextInt(i10);
    }

    public static Point getAppUsableScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static Bitmap getBitmapFromUri(ContentResolver contentResolver, Uri uri) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT < 28) {
            return MediaStore.Images.Media.getBitmap(contentResolver, uri);
        }
        createSource = ImageDecoder.createSource(contentResolver, uri);
        decodeBitmap = ImageDecoder.decodeBitmap(createSource);
        return decodeBitmap;
    }

    public static int getBuildVersion() {
        return Build.VERSION.SDK_INT;
    }

    private static byte[] getBytesArrayFromURI(ContentResolver contentResolver, Uri uri) {
        HVLogUtils.d(TAG, "getBytesArrayFromURI() called with: contentResolver = [" + contentResolver + "], uri = [" + uri + "]");
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, String.format("getBytesArrayFromURI: Error getting bytes from uri: %s,\nerror: %s", uri.toString(), getErrorMessage(e10)));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        } catch (OutOfMemoryError e11) {
            HVLogUtils.e(TAG, String.format("getBytesArrayFromURI: Out of memory error: %s,\nerror: %s", uri.toString(), getErrorMessage(e11)));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            return null;
        }
    }

    private static String getCameraId(CameraManager cameraManager, int i10) {
        try {
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == i10) {
                    return str;
                }
            }
            return null;
        } catch (AssertionError | Exception e10) {
            HVLogUtils.e(TAG, getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static String getDeviceAbi() {
        return Build.SUPPORTED_ABIS[0];
    }

    public static String getErrorMessage(Throwable th) {
        if (th == null) {
            return "Exception is null";
        }
        String message = th.getMessage();
        return (message == null || message.isEmpty()) ? "Exception has no message" : message;
    }

    public static ArrayList<Float> getFaceCoordinates(ArrayList<ArrayList<Float>> arrayList) {
        ArrayList<Float> largestMatrix = getLargestMatrix(arrayList);
        if (largestMatrix == null) {
            return null;
        }
        ArrayList<Float> arrayList2 = new ArrayList<>();
        float floatValue = largestMatrix.get(4).floatValue() - largestMatrix.get(0).floatValue();
        float floatValue2 = largestMatrix.get(5).floatValue() - largestMatrix.get(1).floatValue();
        float f10 = floatValue * 0.35f;
        float floatValue3 = (largestMatrix.get(0).floatValue() - f10) * 100.0f < 0.0f ? 0.0f : (largestMatrix.get(0).floatValue() - f10) * 100.0f;
        float f11 = floatValue2 * 0.45f;
        float floatValue4 = (largestMatrix.get(1).floatValue() - f11) * 100.0f >= 0.0f ? (largestMatrix.get(1).floatValue() - f11) * 100.0f : 0.0f;
        float floatValue5 = (largestMatrix.get(4).floatValue() + f10) * 100.0f > 100.0f ? 100.0f : (largestMatrix.get(4).floatValue() + f10) * 100.0f;
        float floatValue6 = (largestMatrix.get(5).floatValue() + f11) * 100.0f <= 100.0f ? 100.0f * (largestMatrix.get(5).floatValue() + f11) : 100.0f;
        arrayList2.add(Float.valueOf(floatValue3));
        arrayList2.add(Float.valueOf(floatValue4));
        arrayList2.add(Float.valueOf(floatValue5));
        arrayList2.add(Float.valueOf(floatValue6));
        return arrayList2;
    }

    public static String getFileExtension(boolean z10, ContentResolver contentResolver, Uri uri) {
        HVLogUtils.d(TAG, "getFileExtension() called with: contentResolver = [" + contentResolver + "], uri = [" + uri + "]");
        if (z10) {
            return uri.toString().substring(uri.toString().lastIndexOf(".") + 1);
        }
        String type = contentResolver.getType(uri);
        if (type == null) {
            return null;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        if (extensionFromMimeType != null) {
            return extensionFromMimeType;
        }
        if (type.startsWith("image/")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType("image/jpeg");
        }
        return null;
    }

    public static String getFileMimeType(boolean z10, ContentResolver contentResolver, Uri uri) {
        String fileExtensionFromUrl;
        HVLogUtils.d(TAG, "getFileMimeType() called with: contentResolver = [" + contentResolver + "], uri = [" + uri + "]");
        return (!z10 || (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString())) == null) ? contentResolver.getType(uri) : MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    public static List<Integer> getHVFaceObj(C3201a c3201a, Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        if (c3201a != null) {
            new HVFaceObj();
            c3201a.a().width();
            c3201a.a().height();
            int i10 = c3201a.a().left;
            int i11 = c3201a.a().top;
            int i12 = c3201a.a().right;
            int i13 = c3201a.a().bottom;
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
            arrayList.add(Integer.valueOf(i12));
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList;
    }

    public static String getIPAddress(boolean z10) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z11 = hostAddress.indexOf(58) < 0;
                        if (z10) {
                            if (z11) {
                                return hostAddress;
                            }
                        } else if (!z11) {
                            int indexOf = hostAddress.indexOf(37);
                            return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                        }
                    }
                }
            }
            return BuildConfig.FLAVOR;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return BuildConfig.FLAVOR;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getInfoHardwareLevel(Context context, boolean z10) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            String cameraId = z10 ? getCameraId(cameraManager, 1) : null;
            if (cameraId == null || !z10) {
                cameraId = getCameraId(cameraManager, 0);
            }
            if (cameraId == null) {
                return null;
            }
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            AppConstants.cameraLevel = getInfoLevelHardwareMapper(((Integer) cameraCharacteristics.get(key)).intValue());
            AppConstants.sensorOrientation = String.valueOf(cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION));
            return getInfoLevelHardwareMapper(((Integer) cameraCharacteristics.get(key)).intValue());
        } catch (AssertionError e10) {
            e = e10;
            HVLogUtils.e(TAG, getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
            }
            return null;
        } catch (Exception e11) {
            e = e11;
            HVLogUtils.e(TAG, getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            }
            return null;
        }
    }

    public static String getInfoLevelHardwareMapper(int i10) {
        if (i10 == 0) {
            return AppConstants.LEVEL_LIMITED;
        }
        if (i10 == 1) {
            return AppConstants.LEVEL_FULL;
        }
        if (i10 == 2) {
            return AppConstants.LEVEL_LEGACY;
        }
        if (i10 != 3) {
            return null;
        }
        return AppConstants.LEVEL_3;
    }

    public static ArrayList<Float> getLargestMatrix(ArrayList<ArrayList<Float>> arrayList) {
        ArrayList<Float> arrayList2 = arrayList.get(0);
        float floatValue = (arrayList2.get(4).floatValue() - arrayList2.get(0).floatValue()) * (arrayList2.get(3).floatValue() - arrayList2.get(1).floatValue());
        Iterator<ArrayList<Float>> it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<Float> next = it.next();
            if ((next.get(4).floatValue() - next.get(0).floatValue()) * (next.get(3).floatValue() - next.get(1).floatValue()) > floatValue) {
                floatValue = (next.get(4).floatValue() - next.get(0).floatValue()) * (next.get(3).floatValue() - next.get(1).floatValue());
                arrayList2 = next;
            }
        }
        return arrayList2;
    }

    public static String getLocalizedErrorMessage(Throwable th, String str) {
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        return (localizedMessage == null || localizedMessage.isEmpty()) ? str : localizedMessage;
    }

    private static int getNextDelimiterIndex(byte[] bArr, int i10) {
        while (i10 < bArr.length && bArr[i10] != -1) {
            i10++;
        }
        return i10;
    }

    public static String getPermissionNotGrantedErrorMessage(ArrayList<String> arrayList) {
        String str = arrayList.get(0);
        for (int i10 = 1; i10 < arrayList.size() - 1; i10++) {
            str = str + ", " + arrayList.get(i10);
        }
        if (arrayList.size() <= 1) {
            return str;
        }
        return str + " & " + arrayList.get(arrayList.size() - 1);
    }

    public static Point getRealScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static String getSDKVersion() {
        ExternalConfigs externalConfigs = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getExternalConfigs();
        return (externalConfigs == null || StringUtils.isEmptyOrNull(externalConfigs.getMetadataMap().get("sdk-version"))) ? co.hyperverge.hypersnapsdk.BuildConfig.HYPERSNAP_VERSION_NAME : externalConfigs.getMetadataMap().get("sdk-version");
    }

    public static String getSensorDataZipFileName(String str) {
        StringBuilder sb2 = new StringBuilder("hvsdk_android_");
        String appId = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId();
        String valueOf = String.valueOf(System.currentTimeMillis());
        sb2.append(co.hyperverge.hypersnapsdk.BuildConfig.HYPERSNAP_VERSION_NAME);
        sb2.append("_");
        sb2.append(appId);
        sb2.append("_");
        sb2.append(valueOf);
        sb2.append("_");
        sb2.append(str);
        sb2.append(".zip");
        return sb2.toString();
    }

    public static String getStringDocument(HVDocConfig.Document document) {
        return document == HVDocConfig.Document.CARD ? "CARD" : document == HVDocConfig.Document.PASSPORT ? "PASSPORT" : document == HVDocConfig.Document.A4 ? "A4" : document == HVDocConfig.Document.OTHER ? "OTHER" : BuildConfig.FLAVOR;
    }

    public static String getStringMode(HVFaceConfig.LivenessMode livenessMode) {
        return livenessMode == HVFaceConfig.LivenessMode.NONE ? "NONE" : livenessMode == HVFaceConfig.LivenessMode.TEXTURELIVENESS ? "TEXTURELIVENESS" : BuildConfig.FLAVOR;
    }

    public static String getTimeStamp(SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }

    private static String getValueInRange(byte[] bArr, int i10, int i11) {
        return new String(Arrays.copyOfRange(bArr, i10, i11), StandardCharsets.ISO_8859_1);
    }

    public static long getVideoDuration(String str, Context context, MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata;
        if (str != null) {
            try {
                mediaMetadataRetriever.setDataSource(context, Uri.fromFile(new File(str)));
                extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "videoTime: " + getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
                return 0L;
            }
        } else {
            HVLogUtils.d(TAG, "videoTime: no time");
            extractMetadata = null;
        }
        if (extractMetadata != null) {
            return Long.parseLong(extractMetadata);
        }
        return 0L;
    }

    private static void handleFileOperationCallback(final FileOperationCallback fileOperationCallback, final File file) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.utils.t
            @Override // java.lang.Runnable
            public final void run() {
                Utils.FileOperationCallback.this.onSaved(file);
            }
        });
    }

    public static boolean hasNavBar(Context context) {
        return getAppUsableScreenSize(context).y < getRealScreenSize(context).y;
    }

    public static boolean isActivityActive(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static boolean isEmulator() {
        String str = Build.BRAND;
        if (!str.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic") && !str2.startsWith("unknown")) {
                String str3 = Build.HARDWARE;
                if (!str3.contains("goldfish") && !str3.contains("ranchu") && !str3.contains("qemu")) {
                    String str4 = Build.MODEL;
                    if (!str4.contains("google_sdk") && !str4.contains("Emulator") && !str4.contains("Android SDK built for x86") && !str4.contains("Android SDK built for arm64") && !str4.contains("vbox86")) {
                        String str5 = Build.MANUFACTURER;
                        if (!str5.contains("Genymotion") && !str5.contains("unknown")) {
                            String str6 = Build.PRODUCT;
                            if (!str6.contains("sdk_google") && !str6.contains("google_sdk") && !str6.contains("sdk") && !str6.contains("sdk_x86") && !str6.contains("sdk_gphone64_arm64") && !str6.contains("sdk_gphone64_x86_64") && !str6.contains("vbox86p") && !str6.contains("emulator") && !str6.contains("simulator") && !str6.contains("Andy") && !str6.contains("Droid4X") && !str6.contains("nox") && !str6.contains("nox_vm") && !str6.contains("msf") && !str6.contains("samsung_emulator") && (!str.startsWith("generic") || !Build.DEVICE.startsWith("emulator"))) {
                                String str7 = Build.DEVICE;
                                if (!str7.contains("emulator") && !str7.contains("simulator")) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean isFragmentActive(ComponentCallbacksC1573o componentCallbacksC1573o) {
        return (componentCallbacksC1573o == null || componentCallbacksC1573o.isDetached()) ? false : true;
    }

    public static boolean isReleaseBuild(Context context) {
        return !((context.getApplicationContext().getApplicationInfo().flags & 2) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveDocToFilesDir$0(boolean z10, ContentResolver contentResolver, Uri uri, FileOperationCallback fileOperationCallback, File file) {
        String fileExtension = getFileExtension(z10, contentResolver, uri);
        if (fileExtension == null) {
            HVLogUtils.e(TAG, "saveDocToFilesDir: getFileExtension has returned null => 'extension' is null");
            handleFileOperationCallback(fileOperationCallback, null);
            return;
        }
        File file2 = new File(file, System.currentTimeMillis() + "." + fileExtension);
        try {
            byte[] bytesArrayFromURI = getBytesArrayFromURI(contentResolver, uri);
            if (bytesArrayFromURI == null) {
                HVLogUtils.e(TAG, "saveDocToFilesDir: getBytesArrayFromURI has returned null => 'bytes' is null");
                handleFileOperationCallback(fileOperationCallback, null);
                return;
            }
            if (fileExtension.equals("pdf")) {
                new FileOutputStream(file2).write(bytesArrayFromURI);
            } else {
                Bitmap resizeBitmap = resizeBitmap(FileHelper.fixRotation(getBitmapFromUri(contentResolver, uri), Exif.getOrientation(bytesArrayFromURI)));
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                if (resizeBitmap == null) {
                    HVLogUtils.e(TAG, "saveDocToFilesDir: cannot create bitmap");
                    handleFileOperationCallback(fileOperationCallback, null);
                    return;
                } else {
                    resizeBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    resizeBitmap.recycle();
                }
            }
            handleFileOperationCallback(fileOperationCallback, file2);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, String.format("saveDocToFilesDir: Error writing bytes to file: %s,\nerror: %s", file2.getPath(), getErrorMessage(e10)));
            handleFileOperationCallback(fileOperationCallback, null);
            fileOperationCallback.onSaved(null);
        } catch (OutOfMemoryError e11) {
            HVLogUtils.e(TAG, String.format("saveDocToFilesDir: Out of memory error: %s,\nerror: %s", file2.getPath(), getErrorMessage(e11)));
            handleFileOperationCallback(fileOperationCallback, null);
        }
    }

    private static int[] locateDelimiters(byte[] bArr) {
        int[] iArr = new int[17];
        int i10 = 0;
        for (int i11 = 0; i11 <= 16; i11++) {
            int nextDelimiterIndex = getNextDelimiterIndex(bArr, i10);
            iArr[i11] = nextDelimiterIndex;
            i10 = nextDelimiterIndex + 1;
        }
        return iArr;
    }

    public static void printLargeErrorMessageOnLogcat(String str, String str2) {
        if (str2.length() <= 4000) {
            Log.e(str, str2);
            return;
        }
        Log.e(str, "sb.length = " + str2.length());
        int length = str2.length() / 4000;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = i10 + 1;
            int i12 = i11 * 4000;
            if (i12 >= str2.length()) {
                Log.e(str, "chunk " + i10 + " of " + length + ": \n" + str2.substring(i10 * 4000));
            } else {
                Log.e(str, "chunk " + i10 + " of " + length + ": \n" + str2.substring(i10 * 4000, i12));
            }
            i10 = i11;
        }
    }

    public static Bitmap resizeBitmap(Bitmap bitmap) {
        double d10;
        double d11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d12 = 1.0d;
        if (width > height) {
            if (width > 1500) {
                d10 = 1500 * 1.0d;
                d11 = width;
                d12 = d10 / d11;
            }
        } else if (height > 1500) {
            d10 = 1500 * 1.0d;
            d11 = height;
            d12 = d10 / d11;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (width * d12), (int) (height * d12), true);
    }

    public static byte[] reverseBytes(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - i10) - 1];
            bArr[(bArr.length - i10) - 1] = b10;
        }
        return bArr;
    }

    public static void saveDocToFilesDir(final boolean z10, final ContentResolver contentResolver, final Uri uri, final File file, final FileOperationCallback fileOperationCallback) {
        HVLogUtils.d(TAG, "saveDocToFilesDir() called with: contentResolver = [" + contentResolver + "], uri = [" + uri + "], hvDir = [" + file + "]");
        ThreadExecutor.getInstance().execute(new Runnable() { // from class: co.hyperverge.hypersnapsdk.utils.u
            @Override // java.lang.Runnable
            public final void run() {
                Utils.lambda$saveDocToFilesDir$0(z10, contentResolver, uri, fileOperationCallback, file);
            }
        });
    }

    public static String secureQRDataToJSON(String str) {
        byte[] decompressByteArray = decompressByteArray(new BigInteger(str).toByteArray());
        int[] locateDelimiters = locateDelimiters(decompressByteArray);
        String[] strArr = new String[16];
        String valueInRange = getValueInRange(decompressByteArray, 0, 1);
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            strArr[i10] = getValueInRange(decompressByteArray, locateDelimiters[i10] + 1, locateDelimiters[i11]);
            i10 = i11;
        }
        if (strArr[0].length() > 1) {
            String[] strArr2 = new String[16];
            System.arraycopy(strArr, 0, strArr2, 1, 15);
            strArr2[0] = BuildConfig.FLAVOR;
            strArr = strArr2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aadhaar", strArr[1].substring(0, 4));
        jSONObject.put("name", strArr[2]);
        String formatDate = formatDate(strArr[3]);
        jSONObject.put("dob", formatDate);
        jSONObject.put("gender", strArr[4]);
        jSONObject.put("care_of", strArr[5]);
        jSONObject.put("district", strArr[6]);
        jSONObject.put("landmark", strArr[7]);
        jSONObject.put("house_number", strArr[8]);
        jSONObject.put("locality", strArr[9]);
        jSONObject.put("pin", strArr[10]);
        jSONObject.put("po", strArr[11]);
        jSONObject.put(Keys.STATE, strArr[12]);
        jSONObject.put("street", strArr[13]);
        jSONObject.put("subdist", strArr[14]);
        jSONObject.put("city", strArr[15]);
        jSONObject.put("yob", formatDate.substring(0, 4));
        jSONObject.put("value", str);
        try {
            addBonusDataToResult(decompressByteArray, decompressByteArray.length, jSONObject, Integer.parseInt(valueInRange), locateDelimiters);
        } catch (NumberFormatException e10) {
            HVLogUtils.e(TAG, getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String secureQRDataToJSON_FAULTY(String str) {
        int i10;
        String str2;
        String str3;
        byte[] decompressByteArray = decompressByteArray(new BigInteger(str).toByteArray());
        int length = decompressByteArray.length;
        String[] strArr = new String[16];
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            byte b10 = decompressByteArray[i11];
            if (b10 != -1) {
                arrayList.add(Byte.valueOf(b10));
            }
            if (i11 != length - 1) {
                int i14 = i11 + 1;
                if (decompressByteArray[i14] == -1) {
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        bArr[i15] = ((Byte) arrayList.get(i15)).byteValue();
                    }
                    strArr[i12] = new String(bArr, 0, size, StandardCharsets.ISO_8859_1);
                    arrayList.clear();
                    if (i11 != length - 2 && decompressByteArray[i11 + 2] != -1) {
                        i11 = i14;
                    }
                    i12++;
                    i13 = i11;
                }
            }
            i11++;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            i10 = Integer.parseInt(strArr[0]);
        } catch (Exception e10) {
            e = e10;
            i10 = 0;
        }
        try {
            jSONObject.put("aadhaar", strArr[1].substring(0, 4));
            jSONObject.put("name", strArr[2]);
            String formatDate = formatDate(strArr[3]);
            jSONObject.put("dob", formatDate);
            jSONObject.put("yob", formatDate.substring(0, 4));
            jSONObject.put("gender", strArr[4]);
            jSONObject.put("care_of", strArr[5]);
            jSONObject.put("district", strArr[6]);
            jSONObject.put("landmark", strArr[7]);
            jSONObject.put("house_number", strArr[8]);
            jSONObject.put("locality", strArr[9]);
            jSONObject.put("pin", strArr[10]);
            jSONObject.put("po", strArr[11]);
            jSONObject.put(Keys.STATE, strArr[12]);
            jSONObject.put("street", strArr[13]);
            jSONObject.put("subdist", strArr[14]);
            jSONObject.put("city", strArr[15]);
        } catch (Exception e11) {
            e = e11;
            HVLogUtils.e(TAG, "secureQRDataToJSON: params mapping failed: " + getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
            }
            str2 = null;
            if (length > 256) {
            }
            jSONObject.put("value", str);
            String sha256Hash = SignatureHelper.getSha256Hash(Arrays.copyOfRange(decompressByteArray, 0, str.length() - 257));
            if (str2 == null) {
            }
            z10 = sha256Hash.contentEquals(str2);
            jSONObject.put("is_valid_data", z10);
            return jSONObject.toString();
        }
        str2 = null;
        if (length > 256) {
            try {
                str3 = new String(reverseBytes(Arrays.copyOfRange(decompressByteArray, length - 257, length - 1)), StandardCharsets.UTF_8);
                try {
                    jSONObject.put("signature", str3);
                    int i16 = 32;
                    if (i10 != 0) {
                        if ((i10 == 3 || i10 == 1) && length > 288) {
                            jSONObject.put("mobile_hash", SignatureHelper.bytesToHex(reverseBytes(Arrays.copyOfRange(decompressByteArray, length - 290, length - 258))));
                        }
                        if (i10 == 3 || i10 == 2) {
                            if (length > ((i10 == 2 ? 1 : 2) * 32) + PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                                int i17 = (length - 258) - ((i10 == 2 ? 1 : 2) * 32);
                                jSONObject.put("email_hash", SignatureHelper.bytesToHex(reverseBytes(Arrays.copyOfRange(decompressByteArray, i17, i17 + 32))));
                            }
                        }
                    }
                    int i18 = length - 258;
                    if (i10 == 3) {
                        i16 = 64;
                    } else if (i10 == 0) {
                        i16 = 0;
                    }
                    jSONObject.put("photo_jp2000", new String(Arrays.copyOfRange(decompressByteArray, i13, i18 - i16)));
                } catch (Exception e12) {
                    e = e12;
                    HVLogUtils.e(TAG, getErrorMessage(e));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                    }
                    jSONObject.put("photo_jp2000", (Object) null);
                    str2 = str3;
                    jSONObject.put("value", str);
                    String sha256Hash2 = SignatureHelper.getSha256Hash(Arrays.copyOfRange(decompressByteArray, 0, str.length() - 257));
                    if (str2 == null) {
                    }
                    z10 = sha256Hash2.contentEquals(str2);
                    jSONObject.put("is_valid_data", z10);
                    return jSONObject.toString();
                }
            } catch (Exception e13) {
                e = e13;
                str3 = null;
            }
            str2 = str3;
        }
        jSONObject.put("value", str);
        try {
            String sha256Hash22 = SignatureHelper.getSha256Hash(Arrays.copyOfRange(decompressByteArray, 0, str.length() - 257));
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            z10 = sha256Hash22.contentEquals(str2);
        } catch (Exception e14) {
            HVLogUtils.e(TAG, getErrorMessage(e14));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e14);
            }
        }
        jSONObject.put("is_valid_data", z10);
        return jSONObject.toString();
    }

    private static int selectTrack(MediaExtractor mediaExtractor, String str) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static long timeDifferenceInMinutes(Date date) {
        return (new Date().getTime() - date.getTime()) / 60000;
    }

    public static void trimVideo(String str, String str2, long j10) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaMuxer mediaMuxer = new MediaMuxer(str2, 0);
        try {
            try {
                mediaExtractor.setDataSource(str);
                int selectTrack = selectTrack(mediaExtractor, "video/");
                if (selectTrack >= 0) {
                    mediaExtractor.selectTrack(selectTrack);
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(selectTrack);
                    long j11 = trackFormat.getLong("durationUs") - (j10 * 1000000);
                    mediaMuxer.addTrack(trackFormat);
                    mediaMuxer.start();
                    ByteBuffer allocate = ByteBuffer.allocate(1048576);
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    mediaExtractor.seekTo(j11, 2);
                    while (true) {
                        int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                        if (readSampleData < 0) {
                            break;
                        }
                        bufferInfo.size = readSampleData;
                        bufferInfo.offset = 0;
                        bufferInfo.flags = mediaExtractor.getSampleFlags();
                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                        mediaMuxer.writeSampleData(selectTrack, allocate, bufferInfo);
                        mediaExtractor.advance();
                    }
                    mediaMuxer.stop();
                } else {
                    HVLogUtils.e(TAG, "trimVideo() - No video track found in the input video.");
                }
            } catch (IOException e10) {
                HVLogUtils.e(TAG, "trimVideo() - Error trimming video: " + getErrorMessage(e10));
            }
            mediaExtractor.release();
            mediaMuxer.release();
        } catch (Throwable th) {
            mediaExtractor.release();
            mediaMuxer.release();
            throw th;
        }
    }

    public static void writeIntoZipFile(Context context, List<String> list, File file) {
        FileInputStream fileInputStream;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                try {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        File file2 = new File(it.next());
                        try {
                            fileInputStream = new FileInputStream(file2);
                        } catch (Exception e10) {
                            HVLogUtils.e(TAG, getErrorMessage(e10));
                            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                            }
                        }
                        try {
                            zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                } else {
                                    zipOutputStream.write(bArr, 0, read);
                                }
                            }
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    zipOutputStream.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e11) {
            HVLogUtils.e(TAG, "writeIntoZipFile error: " + getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
        }
    }

    public static boolean canDismissLoader(ComponentCallbacksC1573o componentCallbacksC1573o) {
        return isFragmentActive(componentCallbacksC1573o);
    }
}
