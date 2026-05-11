package N1;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.ReactNativeBlobUtil.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class c {
    private static String a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex < 0) {
            return null;
        }
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor;
        ?? r72 = 0;
        r7 = null;
        String string = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return string;
            } catch (Throwable th) {
                th = th;
                r72 = context;
                if (r72 != 0) {
                    r72.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r72 != 0) {
            }
            throw th;
        }
    }

    public static String c(Context context, Uri uri) {
        String a10;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (e(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir == null) {
                        return BuildConfig.FLAVOR;
                    }
                    return externalFilesDir + "/" + split[1];
                }
            } else {
                if (d(uri)) {
                    try {
                        String documentId = DocumentsContract.getDocumentId(uri);
                        if (documentId == null || !documentId.startsWith("raw:/")) {
                            return b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), ((documentId == null || !documentId.startsWith("msf:")) ? Long.valueOf(documentId) : Long.valueOf(documentId.split(":")[1])).longValue()), null, null);
                        }
                        return Uri.parse(documentId).getPath();
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (g(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return b(context, uri2, "_id=?", new String[]{split2[1]});
                }
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return f(uri) ? uri.getLastPathSegment() : b(context, uri, null, null);
                }
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null && (a10 = a(context.getContentResolver(), uri)) != null) {
                        File file = new File(context.getCacheDir(), a10);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (openInputStream.read(bArr) > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                        openInputStream.close();
                        return file.getAbsolutePath();
                    }
                } catch (Exception e10) {
                    n.a(e10.toString());
                    return null;
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return f(uri) ? uri.getLastPathSegment() : b(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
