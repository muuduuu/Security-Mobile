package N0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
abstract class b {
    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(f(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String f10 = f(context, uri);
        int i10 = i(context, uri, "flags", 0);
        if (TextUtils.isEmpty(f10)) {
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(f10) || (i10 & 8) == 0) {
            return (TextUtils.isEmpty(f10) || (i10 & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e10) {
            Log.w("DocumentFile", "Failed query: " + e10);
            return false;
        } finally {
            c(cursor);
        }
    }

    public static String e(Context context, Uri uri) {
        return k(context, uri, "_display_name", null);
    }

    private static String f(Context context, Uri uri) {
        return k(context, uri, "mime_type", null);
    }

    public static boolean g(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(f(context, uri));
    }

    public static boolean h(Context context, Uri uri) {
        String f10 = f(context, uri);
        return ("vnd.android.document/directory".equals(f10) || TextUtils.isEmpty(f10)) ? false : true;
    }

    private static int i(Context context, Uri uri, String str, int i10) {
        return (int) j(context, uri, str, i10);
    }

    private static long j(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j10 : cursor.getLong(0);
        } catch (Exception e10) {
            Log.w("DocumentFile", "Failed query: " + e10);
            return j10;
        } finally {
            c(cursor);
        }
    }

    private static String k(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e10) {
            Log.w("DocumentFile", "Failed query: " + e10);
            return str2;
        } finally {
            c(cursor);
        }
    }
}
