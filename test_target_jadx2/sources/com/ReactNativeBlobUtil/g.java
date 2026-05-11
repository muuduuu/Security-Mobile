package com.ReactNativeBlobUtil;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class g {

    public enum a {
        Audio,
        Image,
        Video,
        Download
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00a2 -> B:17:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Uri uri, String str, Promise promise) {
        FileOutputStream fileOutputStream;
        InputStream openInputStream;
        ContentResolver contentResolver = e.f19857b.getApplicationContext().getContentResolver();
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("ReactNativeBlobUtil.copyToInternal: Cannot create parent folders<'" + str);
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ReactNativeBlobUtil.copyToInternal: Destination file at '" + str + "' already exists");
                    return;
                }
            } catch (IOException e10) {
                promise.reject("ReactNativeBlobUtil.copyToInternal: Could not create file: " + e10.getLocalizedMessage());
            }
        }
        InputStream inputStream = null;
        try {
            try {
                openInputStream = contentResolver.openInputStream(uri);
                try {
                    fileOutputStream = new FileOutputStream(str);
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            try {
                byte[] bArr = new byte[10240];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                }
                openInputStream.close();
                fileOutputStream.close();
            } catch (IOException e14) {
                e = e14;
                inputStream = openInputStream;
                try {
                    promise.reject("ReactNativeBlobUtil.copyToInternal:  Could not write data: " + e.getLocalizedMessage());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    promise.resolve(BuildConfig.FLAVOR);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException e17) {
                        e17.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = openInputStream;
                if (inputStream != null) {
                }
                if (fileOutputStream != null) {
                }
            }
        } catch (IOException e18) {
            e = e18;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        promise.resolve(BuildConfig.FLAVOR);
    }

    public static Uri b(N1.a aVar, a aVar2, ReactApplicationContext reactApplicationContext) {
        ContentResolver contentResolver = e.f19857b.getApplicationContext().getContentResolver();
        ContentValues contentValues = new ContentValues();
        String e10 = e(aVar2, reactApplicationContext);
        String str = aVar.f6530c;
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("mime_type", str);
            contentValues.put("_display_name", aVar.f6528a);
            contentValues.put("relative_path", e10 + '/' + aVar.f6529b);
            try {
                return contentResolver.insert(d(aVar2), contentValues);
            } catch (Exception unused) {
                return null;
            }
        }
        File file = new File(e10 + aVar.a());
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return null;
        }
        try {
            file.createNewFile();
            return Uri.fromFile(file);
        } catch (IOException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: IOException -> 0x003c, TRY_LEAVE, TryCatch #0 {IOException -> 0x003c, blocks: (B:3:0x000a, B:5:0x001d, B:8:0x003e, B:16:0x006c, B:18:0x0075, B:20:0x007b, B:22:0x0083, B:24:0x0087, B:26:0x0053, B:29:0x005d), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Uri uri, String str, Promise promise) {
        char c10;
        try {
            InputStream openInputStream = e.f19857b.getApplicationContext().getContentResolver().openInputStream(uri);
            int available = openInputStream.available();
            byte[] bArr = new byte[available];
            int read = openInputStream.read(bArr);
            openInputStream.close();
            if (read < available) {
                promise.reject("EUNSPECIFIED", "Read only " + read + " bytes of " + available);
                return;
            }
            String lowerCase = str.toLowerCase();
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1396204209) {
                if (hashCode == 93106001 && lowerCase.equals("ascii")) {
                    c10 = 1;
                    if (c10 != 0) {
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        return;
                    }
                    if (c10 != 1) {
                        promise.resolve(new String(bArr));
                        return;
                    }
                    WritableArray createArray = Arguments.createArray();
                    for (int i10 = 0; i10 < available; i10++) {
                        createArray.pushInt(bArr[i10]);
                    }
                    promise.resolve(createArray);
                    return;
                }
                c10 = 65535;
                if (c10 != 0) {
                }
            } else {
                if (lowerCase.equals("base64")) {
                    c10 = 0;
                    if (c10 != 0) {
                    }
                }
                c10 = 65535;
                if (c10 != 0) {
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private static Uri d(a aVar) {
        Uri contentUri;
        if (aVar == a.Audio) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Audio.Media.getContentUri("external_primary") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        if (aVar == a.Video) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external_primary") : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        if (aVar == a.Image) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if (aVar != a.Download || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        contentUri = MediaStore.Downloads.getContentUri("external_primary");
        return contentUri;
    }

    private static String e(a aVar, ReactApplicationContext reactApplicationContext) {
        return Build.VERSION.SDK_INT >= 29 ? aVar == a.Audio ? Environment.DIRECTORY_MUSIC : aVar == a.Video ? Environment.DIRECTORY_MOVIES : aVar == a.Image ? Environment.DIRECTORY_PICTURES : aVar == a.Download ? Environment.DIRECTORY_DOWNLOADS : Environment.DIRECTORY_DOWNLOADS : aVar == a.Audio ? d.j(reactApplicationContext).get("LegacyMusicDir").toString() : aVar == a.Video ? d.j(reactApplicationContext).get("LegacyMovieDir").toString() : aVar == a.Image ? d.j(reactApplicationContext).get("LegacyPictureDir").toString() : aVar == a.Download ? d.j(reactApplicationContext).get("LegacyDownloadDir").toString() : d.j(reactApplicationContext).get("LegacyDownloadDir").toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static boolean f(Uri uri, String str, boolean z10, Promise promise, ReactApplicationContext reactApplicationContext) {
        OutputStream outputStream;
        if (Build.VERSION.SDK_INT < 29) {
            return d.E(n.f(uri.toString()), "uri", str, false);
        }
        try {
            Context applicationContext = reactApplicationContext.getApplicationContext();
            ContentResolver contentResolver = applicationContext.getContentResolver();
            ?? r22 = 0;
            try {
                try {
                    try {
                        ParcelFileDescriptor openFileDescriptor = applicationContext.getContentResolver().openFileDescriptor(uri, "w");
                        String f10 = n.f(str);
                        File file = new File(f10);
                        if (!file.exists()) {
                            promise.reject("ENOENT", "No such file ('" + f10 + "')");
                            return false;
                        }
                        FileInputStream fileInputStream = new FileInputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                        if (z10) {
                            fileInputStream.read(new byte[(int) file.length()]);
                            throw new IllegalStateException("Write to media file with transform was specified but the shared file transformer is not set");
                        }
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    r22 = uri;
                                    th = th;
                                    if (r22 != 0) {
                                        r22.close();
                                    }
                                    throw th;
                                }
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileInputStream.close();
                        fileOutputStream.close();
                        openFileDescriptor.close();
                        outputStream = contentResolver.openOutputStream(uri);
                        if (outputStream != null) {
                            outputStream.close();
                            return true;
                        }
                        try {
                            promise.reject(new IOException("Failed to get output stream."));
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            return false;
                        } catch (IOException e10) {
                            e = e10;
                            contentResolver.delete(null, null, null);
                            promise.reject(e);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            return false;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        promise.reject(new IOException("Failed to get output stream."));
                        return false;
                    }
                } catch (IOException e12) {
                    e = e12;
                    outputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "Cannot write to file, file might not exist");
            return false;
        }
    }
}
