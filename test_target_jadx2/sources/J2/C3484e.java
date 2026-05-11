package j2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import l2.InterfaceC3600b;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3484e {

    /* renamed from: f, reason: collision with root package name */
    private static final C3480a f35745f = new C3480a();

    /* renamed from: a, reason: collision with root package name */
    private final C3480a f35746a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3483d f35747b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3600b f35748c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f35749d;

    /* renamed from: e, reason: collision with root package name */
    private final List f35750e;

    C3484e(List list, InterfaceC3483d interfaceC3483d, InterfaceC3600b interfaceC3600b, ContentResolver contentResolver) {
        this(list, f35745f, interfaceC3483d, interfaceC3600b, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:26:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(Uri uri) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            try {
                cursor = this.f35747b.a(uri);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(0);
                            cursor.close();
                            return string;
                        }
                    } catch (SecurityException e10) {
                        e = e10;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SecurityException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f35746a.a(file) && 0 < this.f35746a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f35749d.openInputStream(uri);
                int b10 = com.bumptech.glide.load.a.b(this.f35750e, inputStream, this.f35748c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b10;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    public InputStream d(Uri uri) {
        String b10 = b(uri);
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        File b11 = this.f35746a.b(b10);
        if (!c(b11)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b11);
        try {
            return this.f35749d.openInputStream(fromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e10));
        }
    }

    C3484e(List list, C3480a c3480a, InterfaceC3483d interfaceC3483d, InterfaceC3600b interfaceC3600b, ContentResolver contentResolver) {
        this.f35746a = c3480a;
        this.f35747b = interfaceC3483d;
        this.f35748c = interfaceC3600b;
        this.f35749d = contentResolver;
        this.f35750e = list;
    }
}
