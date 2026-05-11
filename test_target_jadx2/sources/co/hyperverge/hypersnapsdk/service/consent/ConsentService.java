package co.hyperverge.hypersnapsdk.service.consent;

import co.hyperverge.hypersnapsdk.objects.Consent;
import co.hyperverge.hypersnapsdk.objects.ConsentConfig;

/* loaded from: classes.dex */
public interface ConsentService {

    public interface ConsentCallback {
        void onError();

        void onSuccess(ConsentConfig consentConfig);
    }

    public interface SaveConsentCallback {
        void onError();

        void onSuccess(String str, String str2);
    }

    void getIsConsentToBeShown(ConsentCallback consentCallback);

    void saveConsent(boolean z10, Consent.DeviceDetails deviceDetails, SaveConsentCallback saveConsentCallback);
}
