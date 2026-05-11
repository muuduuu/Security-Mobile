package I2;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103 A[Catch: Exception -> 0x007a, TryCatch #3 {Exception -> 0x007a, blocks: (B:9:0x0031, B:19:0x0073, B:41:0x0103, B:43:0x0108, B:44:0x010b, B:30:0x00f8, B:32:0x00fd), top: B:8:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[Catch: Exception -> 0x007a, TryCatch #3 {Exception -> 0x007a, blocks: (B:9:0x0031, B:19:0x0073, B:41:0x0103, B:43:0x0108, B:44:0x010b, B:30:0x00f8, B:32:0x00fd), top: B:8:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri a(Context context, File file) {
        File externalCacheDir;
        FileOutputStream fileOutputStream;
        Path path;
        FileInputStream fileInputStream;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        String str = context.getPackageName() + ".cropper.fileprovider";
        try {
            Log.i("AIC", "Try get URI for scope storage - content://");
            Uri h10 = androidx.core.content.b.h(context, str, file);
            Intrinsics.checkNotNullExpressionValue(h10, "getUriForFile(context, authority, file)");
            return h10;
        } catch (Exception e10) {
            try {
                Log.e("AIC", String.valueOf(e10.getMessage()));
                Log.w("AIC", "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices");
                File file2 = new File(new File(context.getCacheDir(), "CROP_LIB_CACHE"), file.getName());
                FileInputStream fileInputStream2 = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
                try {
                    kotlin.io.b.b(fileInputStream, fileOutputStream, 0, 2, null);
                    Log.i("AIC", "Completed Android N+ file copy. Attempting to return the cached file");
                    Uri h11 = androidx.core.content.b.h(context, str, file2);
                    Intrinsics.checkNotNullExpressionValue(h11, "getUriForFile(context, authority, cacheLocation)");
                    fileInputStream.close();
                    fileOutputStream.close();
                    return h11;
                } catch (Exception e13) {
                    e = e13;
                    fileInputStream2 = fileInputStream;
                    try {
                        Log.e("AIC", String.valueOf(e.getMessage()));
                        Log.i("AIC", "Trying to provide URI manually");
                        String str2 = "content://" + str + "/files/my_images/";
                        if (G2.a.f2841a.b()) {
                            path = Paths.get(str2, new String[0]);
                            Files.createDirectories(path, new FileAttribute[0]);
                        } else {
                            File file3 = new File(str2);
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                        }
                        Uri parse = Uri.parse(str2 + file.getName());
                        Intrinsics.checkNotNullExpressionValue(parse, "parse(\"$path${file.name}\")");
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return parse;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e14) {
                Log.e("AIC", String.valueOf(e14.getMessage()));
                if (!G2.a.f2841a.c() && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Log.i("AIC", "Use External storage, do not work for OS 29 and above");
                        Uri fromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(File(cacheDir.path, file.absolutePath))");
                        return fromFile;
                    } catch (Exception e15) {
                        Log.e("AIC", String.valueOf(e15.getMessage()));
                        Log.i("AIC", "Try get URI using file://");
                        Uri fromFile2 = Uri.fromFile(file);
                        Intrinsics.checkNotNullExpressionValue(fromFile2, "fromFile(file)");
                        return fromFile2;
                    }
                }
                Log.i("AIC", "Try get URI using file://");
                Uri fromFile22 = Uri.fromFile(file);
                Intrinsics.checkNotNullExpressionValue(fromFile22, "fromFile(file)");
                return fromFile22;
            }
        }
    }
}
