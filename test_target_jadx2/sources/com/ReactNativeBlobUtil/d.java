package com.ReactNativeBlobUtil;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private ReactApplicationContext f19851a;

    /* renamed from: b, reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f19852b;

    class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19853a;

        a(Callback callback) {
            this.f19853a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... strArr) {
            WritableArray createArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.f19853a.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.f19853a.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    createArray.pushMap(d.A(file.getPath() + "/" + str));
                }
            } else {
                createArray.pushMap(d.A(file.getAbsolutePath()));
            }
            this.f19853a.invoke(null, createArray);
            return 0;
        }
    }

    class b implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f19855b;

        b(d dVar, Callback callback) {
            this.f19854a = callback;
            this.f19855b = dVar;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f19854a.invoke(null, Boolean.TRUE);
        }
    }

    class c extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19856a;

        c(Callback callback) {
            this.f19856a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < readableArrayArr[0].size(); i10++) {
                    String string = readableArrayArr[0].getString(i10);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f19856a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append(", ");
                    }
                    this.f19856a.invoke(sb2.toString());
                }
            } catch (Exception e10) {
                this.f19856a.invoke(e10.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    d(ReactApplicationContext reactApplicationContext) {
        this.f19851a = reactApplicationContext;
        this.f19852b = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static WritableMap A(String str) {
        try {
            String f10 = n.f(str);
            WritableMap createMap = Arguments.createMap();
            if (q(f10)) {
                String replace = f10.replace("bundle-assets://", BuildConfig.FLAVOR);
                AssetFileDescriptor openFd = e.f19857b.getAssets().openFd(replace);
                createMap.putString("filename", replace);
                createMap.putString("path", f10);
                createMap.putString("type", "asset");
                createMap.putString("size", String.valueOf(openFd.getLength()));
                createMap.putInt("lastModified", 0);
            } else {
                File file = new File(f10);
                if (!file.exists()) {
                    return null;
                }
                createMap.putString("filename", file.getName());
                createMap.putString("path", file.getPath());
                createMap.putString("type", file.isDirectory() ? "directory" : "file");
                createMap.putString("size", String.valueOf(file.length()));
                createMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return createMap;
        } catch (Exception unused) {
            return null;
        }
    }

    static void B(String str, Callback callback) {
        try {
            d(new File(n.f(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    static void C(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z10);
            try {
                byte[] bArr = new byte[readableArray.size()];
                for (int i10 = 0; i10 < readableArray.size(); i10++) {
                    bArr[i10] = (byte) readableArray.getInt(i10);
                }
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                promise.resolve(Integer.valueOf(readableArray.size()));
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void D(String str, String str2, String str3, boolean z10, boolean z11, Promise promise) {
        int length;
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            if (str2.equalsIgnoreCase("uri")) {
                String f10 = n.f(str3);
                File file2 = new File(f10);
                if (!file2.exists()) {
                    promise.reject("ENOENT", "No such file '" + str + "' ('" + f10 + "')");
                    return;
                }
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z11);
                        length = 0;
                        while (true) {
                            try {
                                int read = fileInputStream2.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                length += read;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                byte[] g10 = n.g(str3, str2);
                if (z10) {
                    throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z11);
                try {
                    fileOutputStream2.write(g10);
                    length = g10.length;
                } finally {
                    fileOutputStream2.close();
                }
            }
            promise.resolve(Integer.valueOf(length));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created, or it is a directory");
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static boolean E(String str, String str2, String str3, boolean z10) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(n.f(str));
            File parentFile = file.getParentFile();
            if (!file.exists() && ((parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) || !file.createNewFile())) {
                return false;
            }
            if (!str2.equalsIgnoreCase("uri")) {
                byte[] g10 = n.g(str3, str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z10);
                try {
                    fileOutputStream2.write(g10);
                    int length = g10.length;
                    return true;
                } finally {
                    fileOutputStream2.close();
                }
            }
            File file2 = new File(n.f(str3));
            if (!file2.exists()) {
                return false;
            }
            byte[] bArr = new byte[10240];
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    fileOutputStream = new FileOutputStream(file, z10);
                    while (true) {
                        try {
                            int read = fileInputStream2.read(bArr);
                            if (read <= 0) {
                                fileInputStream2.close();
                                fileOutputStream.close();
                                return true;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d A[Catch: Exception -> 0x0109, TRY_LEAVE, TryCatch #4 {Exception -> 0x0109, blocks: (B:73:0x0105, B:66:0x010d), top: B:72:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(String str, String str2, Callback callback) {
        FileOutputStream fileOutputStream;
        String str3;
        InputStream p10;
        String f10 = n.f(str2);
        InputStream inputStream = null;
        try {
            p10 = p(str);
            try {
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
                inputStream = p10;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
                inputStream = p10;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        if (p10 == null) {
            callback.invoke("Source file at path`" + str + "` does not exist or can not be opened");
            if (p10 != null) {
                try {
                    p10.close();
                    return;
                } catch (Exception e12) {
                    e12.getLocalizedMessage();
                    return;
                }
            }
            return;
        }
        if (!new File(f10).exists() && !new File(f10).createNewFile()) {
            callback.invoke("Destination file at '" + f10 + "' already exists");
            try {
                p10.close();
                return;
            } catch (Exception e13) {
                e13.getLocalizedMessage();
                return;
            }
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(f10);
        try {
            byte[] bArr = new byte[10240];
            while (true) {
                int read = p10.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (Exception e14) {
                        str3 = BuildConfig.FLAVOR + e14.getLocalizedMessage();
                    }
                }
            }
            p10.close();
            fileOutputStream2.close();
            str3 = BuildConfig.FLAVOR;
        } catch (Exception e15) {
            inputStream = p10;
            fileOutputStream = fileOutputStream2;
            e = e15;
            try {
                str3 = BuildConfig.FLAVOR + e.getLocalizedMessage();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e16) {
                        str3 = str3 + e16.getLocalizedMessage();
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (str3 == BuildConfig.FLAVOR) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e17) {
                        e17.getLocalizedMessage();
                        throw th;
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            inputStream = p10;
            fileOutputStream = fileOutputStream2;
            th = th4;
            if (inputStream != null) {
            }
            if (fileOutputStream != null) {
            }
            throw th;
        }
        if (str3 == BuildConfig.FLAVOR) {
            callback.invoke(str3);
        } else {
            callback.invoke(new Object[0]);
        }
    }

    static void b(String str, String str2, String str3, Promise promise) {
        try {
            String f10 = n.f(str);
            File file = new File(f10);
            boolean createNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace("ReactNativeBlobUtil-file://", BuildConfig.FLAVOR));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int read = fileInputStream.read(bArr); read > 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                if (!createNewFile) {
                    promise.reject("EEXIST", "File `" + f10 + "` already exists");
                    return;
                }
                new FileOutputStream(file).write(n.g(str2, str3));
            }
            promise.resolve(f10);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void c(String str, ReadableArray readableArray, Promise promise) {
        try {
            String f10 = n.f(str);
            File file = new File(f10);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + f10 + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            fileOutputStream.write(bArr);
            promise.resolve(f10);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    private static void d(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    static void e(Callback callback, ReactApplicationContext reactApplicationContext) {
        StatFs statFs = new StatFs(reactApplicationContext.getFilesDir().getPath());
        WritableMap createMap = Arguments.createMap();
        createMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
        createMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs2 = new StatFs(externalFilesDir.getPath());
            createMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            createMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        } else {
            createMap.putString("external_free", "-1");
            createMap.putString("external_total", "-1");
        }
        callback.invoke(null, createMap);
    }

    static void f(String str, Callback callback) {
        if (q(str)) {
            try {
                e.f19857b.getAssets().openFd(str.replace("bundle-assets://", BuildConfig.FLAVOR));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
                return;
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
                return;
            }
        }
        String f10 = n.f(str);
        if (f10 == null) {
            Boolean bool2 = Boolean.FALSE;
            callback.invoke(bool2, bool2);
        } else {
            callback.invoke(Boolean.valueOf(new File(f10).exists()), Boolean.valueOf(new File(f10).isDirectory()));
        }
    }

    static String g(ReactApplicationContext reactApplicationContext) {
        File cacheDir = reactApplicationContext.getCacheDir();
        return cacheDir != null ? cacheDir.getAbsolutePath() : BuildConfig.FLAVOR;
    }

    static String h(ReactApplicationContext reactApplicationContext, String str) {
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : BuildConfig.FLAVOR;
    }

    static String i(ReactApplicationContext reactApplicationContext) {
        File filesDir = reactApplicationContext.getFilesDir();
        return filesDir != null ? filesDir.getAbsolutePath() : BuildConfig.FLAVOR;
    }

    static Map j(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("LegacyDCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        hashMap.put("LegacyPictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put("LegacyMusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put("LegacyDownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put("LegacyMovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        hashMap.put("LegacyRingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("LegacySDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            hashMap.put("LegacySDCardDir", BuildConfig.FLAVOR);
        }
        return hashMap;
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        } catch (Exception e10) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", e10.getLocalizedMessage());
        }
    }

    public static void l(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getAbsolutePath());
        } catch (Exception e10) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", e10.getLocalizedMessage());
        }
    }

    static Map m(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("DocumentDir", i(reactApplicationContext));
        hashMap.put("CacheDir", g(reactApplicationContext));
        hashMap.put("DCIMDir", h(reactApplicationContext, Environment.DIRECTORY_DCIM));
        hashMap.put("PictureDir", h(reactApplicationContext, Environment.DIRECTORY_PICTURES));
        hashMap.put("MusicDir", h(reactApplicationContext, Environment.DIRECTORY_MUSIC));
        hashMap.put("DownloadDir", h(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS));
        hashMap.put("MovieDir", h(reactApplicationContext, Environment.DIRECTORY_MOVIES));
        hashMap.put("RingtoneDir", h(reactApplicationContext, Environment.DIRECTORY_RINGTONES));
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("SDCardDir", h(reactApplicationContext, null));
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            if (externalFilesDir == null || externalFilesDir.getParentFile() == null) {
                hashMap.put("SDCardApplicationDir", BuildConfig.FLAVOR);
            } else {
                hashMap.put("SDCardApplicationDir", externalFilesDir.getParentFile().getAbsolutePath());
            }
        } else {
            hashMap.put("SDCardDir", BuildConfig.FLAVOR);
            hashMap.put("SDCardApplicationDir", BuildConfig.FLAVOR);
        }
        hashMap.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        hashMap.put("LibraryDir", BuildConfig.FLAVOR);
        hashMap.put("ApplicationSupportDir", BuildConfig.FLAVOR);
        return hashMap;
    }

    static String n(String str) {
        return e.f19857b.getFilesDir() + "/ReactNativeBlobUtilTmp_" + str;
    }

    static void o(String str, String str2, Promise promise) {
        int i10;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", "SHA-1");
            hashMap.put("sha224", "SHA-224");
            hashMap.put("sha256", "SHA-256");
            hashMap.put("sha384", "SHA-384");
            hashMap.put("sha512", "SHA-512");
            if (!hashMap.containsKey(str2)) {
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
                return;
            }
            if (!str.startsWith("content://") && new File(n.f(str)).isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) hashMap.get(str2));
            InputStream p10 = p(str);
            if (p10 == null) {
                promise.reject("ENOENT", "No such file '" + str + "'");
                return;
            }
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = p10.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, read);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : messageDigest.digest()) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            promise.resolve(sb2.toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    private static InputStream p(String str) {
        return str.startsWith("bundle-assets://") ? e.f19857b.getAssets().open(str.replace("bundle-assets://", BuildConfig.FLAVOR)) : str.startsWith("content://") ? e.f19857b.getContentResolver().openInputStream(Uri.parse(str)) : new FileInputStream(new File(n.f(str)));
    }

    static boolean q(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    static void r(String str, Promise promise) {
        try {
            String f10 = n.f(str);
            File file = new File(f10);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + f10 + "'");
                return;
            }
            if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + f10 + "'");
                return;
            }
            String[] list = new File(f10).list();
            WritableArray createArray = Arguments.createArray();
            for (String str2 : list) {
                createArray.pushString(str2);
            }
            promise.resolve(createArray);
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void s(String str, Callback callback) {
        new a(callback).execute(n.f(str));
    }

    static void t(String str, Promise promise) {
        String f10 = n.f(str);
        File file = new File(f10);
        if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.isDirectory() ? "Folder" : "File");
            sb2.append(" '");
            sb2.append(f10);
            sb2.append("' already exists");
            promise.reject("EEXIST", sb2.toString());
            return;
        }
        try {
            if (file.mkdirs()) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + f10 + "'");
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void u(String str, String str2, Callback callback) {
        String f10 = n.f(str);
        String f11 = n.f(str2);
        File file = new File(f10);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + f10 + "` does not exist");
            return;
        }
        try {
            File file2 = new File(f11);
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                callback.invoke("mv failed because the destination directory doesn't exist");
                return;
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (file.renameTo(file2)) {
                callback.invoke(new Object[0]);
            } else {
                callback.invoke("mv failed for unknown reasons");
            }
        } catch (Exception e10) {
            callback.invoke(e10.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8 A[Catch: Exception -> 0x0032, FileNotFoundException -> 0x0035, TryCatch #2 {FileNotFoundException -> 0x0035, Exception -> 0x0032, blocks: (B:49:0x000e, B:51:0x0014, B:9:0x0071, B:13:0x0090, B:24:0x00d1, B:26:0x00db, B:28:0x00e5, B:30:0x00ec, B:32:0x00f4, B:34:0x00f8, B:36:0x00ac, B:39:0x00b6, B:42:0x00c0, B:45:0x0100, B:46:0x0107, B:7:0x003a, B:47:0x0056), top: B:48:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071 A[Catch: Exception -> 0x0032, FileNotFoundException -> 0x0035, TryCatch #2 {FileNotFoundException -> 0x0035, Exception -> 0x0032, blocks: (B:49:0x000e, B:51:0x0014, B:9:0x0071, B:13:0x0090, B:24:0x00d1, B:26:0x00db, B:28:0x00e5, B:30:0x00ec, B:32:0x00f4, B:34:0x00f8, B:36:0x00ac, B:39:0x00b6, B:42:0x00c0, B:45:0x0100, B:46:0x0107, B:7:0x003a, B:47:0x0056), top: B:48:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void v(String str, String str2, boolean z10, Promise promise) {
        int available;
        byte[] bArr;
        int read;
        char c10;
        String f10 = n.f(str);
        if (f10 != null) {
            str = f10;
        }
        if (f10 != null) {
            try {
                if (f10.startsWith("bundle-assets://")) {
                    InputStream open = e.f19857b.getAssets().open(str.replace("bundle-assets://", BuildConfig.FLAVOR));
                    available = open.available();
                    bArr = new byte[available];
                    read = open.read(bArr, 0, available);
                    open.close();
                    if (read >= available) {
                        promise.reject("EUNSPECIFIED", "Read only " + read + " bytes of " + available);
                        return;
                    }
                    if (z10) {
                        throw new IllegalStateException("Read file with transform was specified but the shared file transformer is not set");
                    }
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    int hashCode = lowerCase.hashCode();
                    if (hashCode == -1396204209) {
                        if (lowerCase.equals("base64")) {
                            c10 = 0;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else if (hashCode != 3600241) {
                        if (hashCode == 93106001 && lowerCase.equals("ascii")) {
                            c10 = 1;
                            if (c10 != 0) {
                                promise.resolve(Base64.encodeToString(bArr, 2));
                                return;
                            }
                            if (c10 != 1) {
                                if (c10 != 2) {
                                    promise.resolve(new String(bArr));
                                    return;
                                } else {
                                    promise.resolve(new String(bArr));
                                    return;
                                }
                            }
                            WritableArray createArray = Arguments.createArray();
                            for (byte b10 : bArr) {
                                createArray.pushInt(b10);
                            }
                            promise.resolve(createArray);
                            return;
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else {
                        if (lowerCase.equals("utf8")) {
                            c10 = 2;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    }
                }
            } catch (FileNotFoundException e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage.contains("EISDIR")) {
                    promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory; " + localizedMessage);
                    return;
                }
                promise.reject("ENOENT", "No such file '" + str + "'; " + localizedMessage);
                return;
            } catch (Exception e11) {
                promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
                return;
            }
        }
        if (f10 == null) {
            InputStream openInputStream = e.f19857b.getContentResolver().openInputStream(Uri.parse(str));
            available = openInputStream.available();
            bArr = new byte[available];
            read = openInputStream.read(bArr);
            openInputStream.close();
        } else {
            File file = new File(str);
            available = (int) file.length();
            bArr = new byte[available];
            FileInputStream fileInputStream = new FileInputStream(file);
            int read2 = fileInputStream.read(bArr);
            fileInputStream.close();
            read = read2;
        }
        if (read >= available) {
        }
    }

    static void w(ReadableArray readableArray, Callback callback) {
        new c(callback).execute(readableArray);
    }

    static void y(String str, String str2, long j10, long j11, String str3, Promise promise) {
        try {
            String f10 = n.f(str2);
            if (!str.startsWith("content://") && new File(n.f(str)).isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            InputStream p10 = p(str);
            if (p10 == null) {
                promise.reject("ENOENT", "No such file '" + str + "'");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f10));
            long skip = p10.skip(j10);
            if (skip != j10) {
                promise.reject("EUNSPECIFIED", "Skipped " + skip + " instead of the specified " + j10 + " bytes");
                return;
            }
            byte[] bArr = new byte[10240];
            int i10 = (int) (j11 - j10);
            while (i10 > 0) {
                int read = p10.read(bArr, 0, 10240);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, Math.min(i10, read));
                i10 -= read;
            }
            p10.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            promise.resolve(f10);
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void z(String str, Callback callback) {
        try {
            String f10 = n.f(str);
            WritableMap A10 = A(f10);
            if (A10 == null) {
                callback.invoke("failed to stat path `" + f10 + "` because it does not exist or it is not a folder", null);
            } else {
                callback.invoke(null, A10);
            }
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    void x(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f19851a, strArr, strArr2, new b(this, callback));
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), null);
        }
    }
}
