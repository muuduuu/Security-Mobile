package com.webengage.sdk.android;

import android.content.Context;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.webengage.sdk.android.actions.exception.GCMRegistrationException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class a1 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30270c;

    protected a1(Context context) {
        super(context);
        this.f30270c = null;
        this.f30270c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public Object d(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (!n2.g()) {
            Logger.e("WebEngage", "GoogleCloudMessaging class not found");
            return null;
        }
        int i10 = C2017i.q().i(this.f30270c);
        if (i10 == 0 || i10 == 2) {
            if (i10 == 2) {
                Logger.w("WebEngage", "Please update your google play service");
                b(new GCMRegistrationException("Google play service update required"));
            }
            try {
                String register = GoogleCloudMessaging.getInstance(this.f30270c).register(new String[]{(String) obj});
                if (register == null || register.isEmpty() || i().equals(register)) {
                    return null;
                }
                h(register);
                return register;
            } catch (Exception e10) {
                return e10;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Google play services ");
        if (i10 == 1) {
            str = "is missing ";
        } else if (i10 == 3) {
            str = "is disabled ";
        } else {
            if (i10 != 9) {
                if (i10 == 18) {
                    str = "is currently updating ";
                }
                sb2.append("on this device");
                Logger.e("WebEngage", sb2.toString());
                b(new GCMRegistrationException(sb2.toString()));
                return null;
            }
            str = "version is invalid ";
        }
        sb2.append(str);
        sb2.append("on this device");
        Logger.e("WebEngage", sb2.toString());
        b(new GCMRegistrationException(sb2.toString()));
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public Object e(Map<String, Object> map) {
        String gcmProjectNumber = WebEngage.get().getWebEngageConfig().getGcmProjectNumber();
        if (gcmProjectNumber != null) {
            return gcmProjectNumber;
        }
        Logger.e("WebEngage", "AndroidManifest : GCM Project Number is not set,unable to register");
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public void e(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                HashMap hashMap = new HashMap();
                hashMap.put("gcm_regId", str);
                hashMap.put("gcm_project_number", WebEngage.get().getWebEngageConfig().getGcmProjectNumber());
                a(n0.b("gcm_registered", null, hashMap, null, this.f30270c));
                a(this.f30270c).onGCMRegistered(this.f30270c, str);
            } else if (obj instanceof Exception) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GCM Register Error : ");
                Exception exc = (Exception) obj;
                sb2.append(exc.getMessage());
                Logger.e("WebEngage", sb2.toString());
                b(new GCMRegistrationException(exc.getMessage()));
            }
        }
        b1.f30468b.set(false);
    }
}
