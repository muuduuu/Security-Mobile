package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f19957d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final DeviceEventManagerModule.RCTDeviceEventEmitter f19958a;

    /* renamed from: b, reason: collision with root package name */
    private String f19959b = "base64";

    /* renamed from: c, reason: collision with root package name */
    private OutputStream f19960c = null;

    m(ReactApplicationContext reactApplicationContext) {
        this.f19958a = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static void a(String str, Callback callback) {
        try {
            HashMap hashMap = f19957d;
            OutputStream outputStream = ((m) hashMap.get(str)).f19960c;
            hashMap.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    private void b(String str, String str2, WritableArray writableArray) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Keys.EVENT, str2);
        createMap.putArray("detail", writableArray);
        createMap.putString("streamId", str);
        this.f19958a.emit("ReactNativeBlobUtilFilesystem", createMap);
    }

    private void c(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Keys.EVENT, str2);
        createMap.putString("detail", str3);
        createMap.putString("streamId", str);
        this.f19958a.emit("ReactNativeBlobUtilFilesystem", createMap);
    }

    private void d(String str, String str2, String str3, String str4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Keys.EVENT, str2);
        createMap.putString(AppConstants.RETAKE_ERROR_CODE, str3);
        createMap.putString("detail", str4);
        createMap.putString("streamId", str);
        this.f19958a.emit("ReactNativeBlobUtilFilesystem", createMap);
    }

    static void f(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = ((m) f19957d.get(str)).f19960c;
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    static void g(String str, String str2, Callback callback) {
        m mVar = (m) f19957d.get(str);
        try {
            mVar.f19960c.write(n.g(str2, mVar.f19959b));
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    void e(String str, String str2, int i10, int i11, String str3, ReactApplicationContext reactApplicationContext) {
        char[] cArr;
        String f10 = n.f(str);
        String str4 = f10 != null ? f10 : str;
        try {
            int i12 = str2.equalsIgnoreCase("base64") ? 4095 : 4096;
            if (i10 > 0) {
                i12 = i10;
            }
            InputStream openInputStream = (f10 == null || !str4.startsWith("bundle-assets://")) ? f10 == null ? e.f19857b.getContentResolver().openInputStream(Uri.parse(str4)) : new FileInputStream(new File(str4)) : e.f19857b.getAssets().open(str4.replace("bundle-assets://", BuildConfig.FLAVOR));
            int i13 = -1;
            int i14 = 0;
            if (str2.equalsIgnoreCase("utf8")) {
                InputStreamReader inputStreamReader = new InputStreamReader(openInputStream, Charset.forName("UTF-8"));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader, i12);
                char[] cArr2 = new char[i12];
                while (true) {
                    int read = bufferedReader.read(cArr2, i14, i12);
                    if (read == i13) {
                        break;
                    }
                    c(str3, "data", new String(cArr2, i14, read));
                    if (i11 > 0) {
                        cArr = cArr2;
                        SystemClock.sleep(i11);
                    } else {
                        cArr = cArr2;
                    }
                    cArr2 = cArr;
                    i13 = -1;
                    i14 = 0;
                }
                bufferedReader.close();
                inputStreamReader.close();
            } else if (str2.equalsIgnoreCase("ascii")) {
                byte[] bArr = new byte[i12];
                while (true) {
                    int read2 = openInputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    WritableArray createArray = Arguments.createArray();
                    for (int i15 = 0; i15 < read2; i15++) {
                        createArray.pushInt(bArr[i15]);
                    }
                    b(str3, "data", createArray);
                    if (i11 > 0) {
                        SystemClock.sleep(i11);
                    }
                }
            } else {
                if (!str2.equalsIgnoreCase("base64")) {
                    d(str3, AppConstants.VIDEO_RECORDING_ERROR, "EINVAL", "Unrecognized encoding `" + str2 + "`, should be one of `base64`, `utf8`, `ascii`");
                    openInputStream.close();
                }
                byte[] bArr2 = new byte[i12];
                while (true) {
                    int read3 = openInputStream.read(bArr2);
                    if (read3 == -1) {
                        break;
                    }
                    if (read3 < i12) {
                        byte[] bArr3 = new byte[read3];
                        System.arraycopy(bArr2, 0, bArr3, 0, read3);
                        c(str3, "data", Base64.encodeToString(bArr3, 2));
                    } else {
                        c(str3, "data", Base64.encodeToString(bArr2, 2));
                    }
                    if (i11 > 0) {
                        SystemClock.sleep(i11);
                    }
                }
            }
            c(str3, "end", BuildConfig.FLAVOR);
            openInputStream.close();
        } catch (FileNotFoundException unused) {
            d(str3, AppConstants.VIDEO_RECORDING_ERROR, "ENOENT", "No such file '" + str4 + "'");
        } catch (Exception e10) {
            d(str3, AppConstants.VIDEO_RECORDING_ERROR, "EUNSPECIFIED", "Failed to convert data to " + str2 + " encoded string. This might be because this encoding cannot be used for this data.");
            e10.printStackTrace();
        }
    }

    void h(String str, String str2, boolean z10, Callback callback) {
        String f10 = n.f(str);
        if (f10 != null) {
            str = f10;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (f10 == null || file.exists()) {
                if (file.isDirectory()) {
                    callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                    return;
                }
            } else {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            OutputStream openOutputStream = (f10 == null || !str.startsWith("bundle-assets://")) ? f10 == null ? e.f19857b.getContentResolver().openOutputStream(Uri.parse(str)) : new FileOutputStream(str, z10) : e.f19857b.getAssets().openFd(str.replace("bundle-assets://", BuildConfig.FLAVOR)).createOutputStream();
            this.f19959b = str2;
            String uuid = UUID.randomUUID().toString();
            f19957d.put(uuid, this);
            this.f19960c = openOutputStream;
            callback.invoke(null, null, uuid);
        } catch (Exception e10) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e10.getLocalizedMessage());
        }
    }
}
