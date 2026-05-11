package V6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* renamed from: V6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1284o {

    /* renamed from: b, reason: collision with root package name */
    private static final C1279j f10987b = new C1279j("LibraryVersion", BuildConfig.FLAVOR);

    /* renamed from: c, reason: collision with root package name */
    private static final C1284o f10988c = new C1284o();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f10989a = new ConcurrentHashMap();

    protected C1284o() {
    }

    public static C1284o a() {
        return f10988c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b(String str) {
        String str2;
        InputStream inputStream;
        AbstractC1287s.h(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f10989a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r4 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = C1284o.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (IOException e10) {
                e = e10;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                C1279j c1279j = f10987b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                sb2.append(str);
                sb2.append(" version is ");
                sb2.append(str3);
                c1279j.e("LibraryVersion", sb2.toString());
            } else {
                C1279j c1279j2 = f10987b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                c1279j2.f("LibraryVersion", sb3.toString());
            }
        } catch (IOException e11) {
            e = e11;
            str2 = str3;
            inputStream2 = inputStream;
            C1279j c1279j3 = f10987b;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
            sb4.append("Failed to get app version for libraryName: ");
            sb4.append(str);
            c1279j3.d("LibraryVersion", sb4.toString(), e);
            inputStream = inputStream2;
            str3 = str2;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            this.f10989a.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                com.google.android.gms.common.util.l.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            com.google.android.gms.common.util.l.a(inputStream);
        }
        if (str3 == null) {
            f10987b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            str3 = "UNKNOWN";
        }
        this.f10989a.put(str, str3);
        return str3;
    }
}
