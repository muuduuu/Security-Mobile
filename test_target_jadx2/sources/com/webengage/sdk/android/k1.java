package com.webengage.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* loaded from: classes2.dex */
public class k1 implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    private Context f30681a;

    /* renamed from: b, reason: collision with root package name */
    private InstallReferrerClient f30682b;

    k1(Context context) {
        this.f30681a = context;
    }

    void a() {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f30681a).build();
        this.f30682b = build;
        build.startConnection(this);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        Logger.w("WebEngage", "onInstallReferrerService Disconnected");
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i10) {
        ReferrerDetails installReferrer;
        String str;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "Install referrer Connection couldn't be established";
            } else if (i10 != 2) {
                return;
            } else {
                str = "Install referrer API not available on the current Play Store app";
            }
            Logger.d("WebEngage", str);
            return;
        }
        try {
            boolean isFirstAcquisitionTrackingDisabled = WebEngage.get().getWebEngageConfig().isFirstAcquisitionTrackingDisabled();
            Logger.d("WebEngage", "is First Acq. Tracking Disabled? " + isFirstAcquisitionTrackingDisabled);
            Intent intent = new Intent();
            if (!isFirstAcquisitionTrackingDisabled && (installReferrer = this.f30682b.getInstallReferrer()) != null) {
                String installReferrer2 = installReferrer.getInstallReferrer();
                Logger.d("WebEngage", "Referrer Url: " + installReferrer2);
                intent.putExtra("referrer", installReferrer2);
            }
            WebEngage.get().analytics().installed(intent);
        } catch (RemoteException e10) {
            Logger.d("WebEngage", "Exception while getting install-referrer " + e10);
        }
        this.f30682b.endConnection();
    }
}
