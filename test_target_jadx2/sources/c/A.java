package C;

import A.W;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class A implements M.y {

    static abstract class a {
        a() {
        }

        static a c(M.z zVar, W.g gVar) {
            return new C0726d(zVar, gVar);
        }

        abstract W.g a();

        abstract M.z b();
    }

    A() {
    }

    private static Uri b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new A.X(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri c(File file, W.g gVar) {
        Uri insert;
        ContentResolver a10 = gVar.a();
        Objects.requireNonNull(a10);
        ContentValues contentValues = gVar.b() != null ? new ContentValues(gVar.b()) : new ContentValues();
        l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                insert = a10.insert(gVar.f(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (SecurityException e11) {
            e = e11;
        }
        try {
            if (insert == null) {
                throw new A.X(1, "Failed to insert a MediaStore URI.", null);
            }
            e(file, insert, a10);
            n(insert, a10, 0);
            return insert;
        } catch (IOException e12) {
            e = e12;
            uri = insert;
            throw new A.X(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e13) {
            e = e13;
            uri = insert;
            throw new A.X(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = insert;
            if (uri != null) {
                n(uri, a10, 0);
            }
            throw th;
        }
    }

    private static void d(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void e(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                d(file, openOutputStream);
                openOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static File f(W.g gVar) {
        try {
            File c10 = gVar.c();
            if (c10 == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(c10.getParent(), "CameraX" + UUID.randomUUID().toString() + g(c10));
        } catch (IOException e10) {
            throw new A.X(1, "Failed to create temp file.", e10);
        }
    }

    private static String g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : BuildConfig.FLAVOR;
    }

    private static boolean h(W.g gVar) {
        return gVar.c() != null;
    }

    private static boolean i(W.g gVar) {
        return (gVar.f() == null || gVar.a() == null || gVar.b() == null) ? false : true;
    }

    private static boolean j(W.g gVar) {
        return gVar.e() != null;
    }

    static Uri k(File file, W.g gVar) {
        Uri uri = null;
        try {
            try {
                if (i(gVar)) {
                    uri = c(file, gVar);
                } else if (j(gVar)) {
                    OutputStream e10 = gVar.e();
                    Objects.requireNonNull(e10);
                    d(file, e10);
                } else if (h(gVar)) {
                    File c10 = gVar.c();
                    Objects.requireNonNull(c10);
                    uri = b(file, c10);
                }
                file.delete();
                return uri;
            } catch (IOException unused) {
                throw new A.X(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    private static void l(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    private static void m(File file, E.g gVar, W.g gVar2, int i10) {
        try {
            E.g h10 = E.g.h(file);
            gVar.g(h10);
            if (h10.s() == 0 && i10 != 0) {
                h10.z(i10);
            }
            W.d d10 = gVar2.d();
            if (d10.b()) {
                h10.l();
            }
            if (d10.c()) {
                h10.m();
            }
            if (d10.a() != null) {
                h10.b(d10.a());
            }
            h10.A();
        } catch (IOException e10) {
            throw new A.X(1, "Failed to update Exif data", e10);
        }
    }

    private static void n(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void o(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new K.c().b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new A.X(1, "Failed to write to temp file", e10);
        }
    }

    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W.h apply(a aVar) {
        M.z b10 = aVar.b();
        W.g a10 = aVar.a();
        File f10 = f(a10);
        o(f10, (byte[]) b10.c());
        E.g d10 = b10.d();
        Objects.requireNonNull(d10);
        m(f10, d10, a10, b10.f());
        return new W.h(k(f10, a10));
    }
}
