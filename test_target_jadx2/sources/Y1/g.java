package Y1;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final e f11993a;

    public g(e eVar) {
        this.f11993a = eVar;
    }

    private static String b(String str, c cVar, boolean z10) {
        String tempExtension = z10 ? cVar.tempExtension() : cVar.extension;
        String replaceAll = str.replaceAll("\\W+", BuildConfig.FLAVOR);
        int length = 242 - tempExtension.length();
        if (replaceAll.length() > length) {
            replaceAll = d(replaceAll, length);
        }
        return "lottie_cache_" + replaceAll + tempExtension;
    }

    private File c(String str) {
        File file = new File(e(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(e(), b(str, c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private static String d(String str, int i10) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i10);
        }
    }

    private File e() {
        File a10 = this.f11993a.a();
        if (a10.isFile()) {
            a10.delete();
        }
        if (!a10.exists()) {
            a10.mkdirs();
        }
        return a10;
    }

    Pair a(String str) {
        try {
            File c10 = c(str);
            if (c10 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c10);
            c cVar = c10.getAbsolutePath().endsWith(".zip") ? c.ZIP : c10.getAbsolutePath().endsWith(".gz") ? c.GZIP : c.JSON;
            b2.f.a("Cache hit for " + str + " at " + c10.getAbsolutePath());
            return new Pair(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, c cVar) {
        File file = new File(e(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
        boolean renameTo = file.renameTo(file2);
        b2.f.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        b2.f.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File g(String str, InputStream inputStream, c cVar) {
        File file = new File(e(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
