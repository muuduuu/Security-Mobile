package V6;

import T6.InterfaceC1179j;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class I implements DialogInterface.OnClickListener {
    public static I b(Activity activity, Intent intent, int i10) {
        return new G(intent, activity, i10);
    }

    public static I c(InterfaceC1179j interfaceC1179j, Intent intent, int i10) {
        return new H(intent, interfaceC1179j, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
