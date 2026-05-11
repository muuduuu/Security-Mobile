package j3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import b3.l;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f35753a = Uri.withAppendedPath((Uri) AbstractC4012a.e(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (k(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    private static String b(boolean z10) {
        return "_data";
    }

    private static Uri c(boolean z10) {
        return z10 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    private static String d(boolean z10) {
        return "_id";
    }

    public static String e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String str2 = null;
        if (!k(uri)) {
            if (l(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z10 = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            l.g(documentId);
            uri2 = (Uri) l.g(c(z10));
            str = d(z10) + "=?";
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor query = contentResolver.query(uri2, new String[]{b(z10)}, str, strArr, null);
        if (query != null) {
            try {
                if (query.moveToFirst() && (columnIndexOrThrow = query.getColumnIndexOrThrow(b(z10))) != -1) {
                    str2 = query.getString(columnIndexOrThrow);
                }
            } finally {
                query.close();
            }
        }
        return query != null ? str2 : str2;
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean g(Uri uri) {
        return "data".equals(f(uri));
    }

    public static boolean h(Uri uri) {
        return "asset".equals(f(uri));
    }

    public static boolean i(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean j(Uri uri) {
        return uri.getPath() != null && k(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) AbstractC4012a.e(f35753a.getPath()));
    }

    public static boolean k(Uri uri) {
        return "content".equals(f(uri));
    }

    public static boolean l(Uri uri) {
        return "file".equals(f(uri));
    }

    public static boolean m(Uri uri) {
        return "res".equals(f(uri));
    }

    public static boolean n(Uri uri) {
        String f10 = f(uri);
        return "https".equals(f10) || "http".equals(f10);
    }

    public static boolean o(Uri uri) {
        return "android.resource".equals(f(uri));
    }

    public static URL p(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
