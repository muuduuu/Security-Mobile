package Y5;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class b implements a {
    private boolean b() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean c() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                process.destroy();
                return true;
            }
            process.destroy();
            return false;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    @Override // Y5.a
    public boolean a() {
        return b() || c();
    }
}
