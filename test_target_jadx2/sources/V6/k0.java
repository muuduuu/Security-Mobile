package V6;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f10980a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Intent a(Context context, v0 v0Var) {
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        String a10 = v0Var.a();
        if (a10 == null) {
            return new Intent().setComponent(v0Var.c());
        }
        Intent intent = null;
        if (v0Var.d()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", a10);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f10980a);
            } catch (RemoteException e10) {
                e = e10;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
                if (bundle != null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
                if (bundle != null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                acquireUnstableContentProviderClient.release();
                if (bundle != null) {
                    Intent intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            StringBuilder sb2 = new StringBuilder(a10.length() + 72);
                            sb2.append("Dynamic lookup for intent failed for action ");
                            sb2.append(a10);
                            sb2.append(" but has possible resolution");
                            Log.w("ServiceBindIntentUtils", sb2.toString());
                            throw new i0(new C2010b(25, pendingIntent));
                        }
                    }
                }
                if (intent == null) {
                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(a10));
                }
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new Intent(a10).setPackage(v0Var.b()) : intent;
    }
}
