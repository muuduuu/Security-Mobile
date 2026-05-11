package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0297a {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0297a.a(context))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
