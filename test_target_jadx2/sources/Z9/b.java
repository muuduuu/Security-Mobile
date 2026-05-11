package Z9;

import aa.AbstractC1369a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12477a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12478b = true;

    public b(Context context) {
        this.f12477a = context;
    }

    private boolean n(List list) {
        PackageManager packageManager = this.f12477a.getPackageManager();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                AbstractC1369a.b(str + " ROOT management app detected!");
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }

    private String[] o() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            AbstractC1369a.a(e10);
            return null;
        }
    }

    private String[] p() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            AbstractC1369a.a(e10);
            return null;
        }
    }

    public boolean a() {
        return new RootBeerNative().a();
    }

    public boolean b(String str) {
        boolean z10 = false;
        for (String str2 : a.a()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                AbstractC1369a.f(str3 + " binary detected!");
                z10 = true;
            }
        }
        return z10;
    }

    public boolean c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] p10 = p();
        if (p10 == null) {
            return false;
        }
        boolean z10 = false;
        for (String str : p10) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        AbstractC1369a.f(str2 + " = " + str3 + " detected!");
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public boolean d() {
        return b("magisk");
    }

    public boolean e() {
        String[] o10 = o();
        int i10 = 0;
        if (o10 == null) {
            return false;
        }
        int length = o10.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            String str = o10[i11];
            String[] split = str.split(" ");
            if (split.length < 6) {
                AbstractC1369a.b("Error formatting mount line: " + str);
            } else {
                String str2 = split[2];
                String str3 = split[5];
                String[] strArr = a.f12476e;
                int length2 = strArr.length;
                int i12 = i10;
                while (i12 < length2) {
                    String str4 = strArr[i12];
                    if (str2.equalsIgnoreCase(str4)) {
                        str3 = str3.replace("(", BuildConfig.FLAVOR).replace(")", BuildConfig.FLAVOR);
                        String[] split2 = str3.split(",");
                        int length3 = split2.length;
                        int i13 = i10;
                        while (true) {
                            if (i13 >= length3) {
                                break;
                            }
                            if (split2[i13].equalsIgnoreCase("rw")) {
                                AbstractC1369a.f(str4 + " path is mounted with rw permissions! " + str);
                                z10 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    i12++;
                    i10 = 0;
                }
            }
            i11++;
            i10 = 0;
        }
        return z10;
    }

    public boolean f() {
        if (!a()) {
            AbstractC1369a.b("We could not load the native library to test for root");
            return false;
        }
        String[] a10 = a.a();
        int length = a10.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = a10[i10] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f12478b);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean g() {
        return b("su");
    }

    public boolean h() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z10 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z10;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public boolean i() {
        return j(null);
    }

    public boolean j(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(a.f12473b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return n(arrayList);
    }

    public boolean k() {
        return l(null);
    }

    public boolean l(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(a.f12472a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return n(arrayList);
    }

    public boolean m() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public void q(boolean z10) {
        this.f12478b = z10;
        AbstractC1369a.f12647a = z10 ? 5 : 0;
    }
}
