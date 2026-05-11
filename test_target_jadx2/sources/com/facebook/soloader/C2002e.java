package com.facebook.soloader;

import android.os.StrictMode;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.soloader.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2002e extends E {

    /* renamed from: a, reason: collision with root package name */
    protected final String f23047a;

    /* renamed from: b, reason: collision with root package name */
    protected q f23048b = null;

    /* renamed from: c, reason: collision with root package name */
    protected Set f23049c = null;

    public C2002e(String str) {
        this.f23047a = str;
    }

    static String g(String str) {
        if ("base".equals(str)) {
            return SoLoader.f23027d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f23027d.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set set = this.f23049c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return h(str, i10);
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) {
        InputStream open = SoLoader.f23027d.getAssets().open(this.f23047a + ".soloader-manifest");
        try {
            this.f23048b = q.b(open);
            if (open != null) {
                open.close();
            }
            this.f23049c = new HashSet(this.f23048b.f23077b);
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String f(String str) {
        Set set = this.f23049c;
        if (set == null || this.f23048b == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return g(this.f23047a) + "!/lib/" + this.f23048b.f23076a + "/" + str;
    }

    protected int h(String str, int i10) {
        String f10 = f(str);
        f10.getClass();
        System.load(f10);
        return 1;
    }
}
