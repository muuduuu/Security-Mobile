package r5;

import com.facebook.soloader.p;
import java.io.File;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4013a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f39242a;

    /* renamed from: b, reason: collision with root package name */
    private int f39243b;

    public C4013a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f39242a = new String[i10];
        this.f39243b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f39242a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append("\n");
        b(sb2);
        p.g("SoLoader", sb2.toString());
        String[] strArr = this.f39242a;
        int i10 = this.f39243b;
        strArr[i10 % strArr.length] = str;
        this.f39243b = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f39243b);
            sb2.append(" base apk paths.");
            if (this.f39243b > 0) {
                sb2.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f39242a;
                if (i10 < strArr.length) {
                    int i11 = (this.f39243b - i10) - 1;
                    if (i11 >= 0) {
                        String str = strArr[i11 % strArr.length];
                        sb2.append("\n");
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.f39243b;
    }
}
