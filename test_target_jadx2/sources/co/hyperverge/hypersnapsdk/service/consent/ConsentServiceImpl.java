package co.hyperverge.hypersnapsdk.service.consent;

import co.hyperverge.hypersnapsdk.data.DataRepository;
import co.hyperverge.hypersnapsdk.listeners.APICompletionCallback;
import co.hyperverge.hypersnapsdk.objects.Consent;
import co.hyperverge.hypersnapsdk.objects.ConsentConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.service.consent.ConsentService;
import co.hyperverge.hypersnapsdk.service.consent.ConsentServiceImpl;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConsentServiceImpl implements ConsentService {
    private ConsentConfig consentConfig;

    private Consent generateConfig(String str, Consent.DeviceDetails deviceDetails) {
        if (this.consentConfig == null || Utils.getSDKVersion() == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String timeStamp = Utils.getTimeStamp(simpleDateFormat);
        return new Consent(timeStamp, deviceDetails, this.consentConfig.getScope(), this.consentConfig.getPurpose(), this.consentConfig.getTenure(), new Consent.SDKVersion(Utils.getSDKVersion()), this.consentConfig.getPrivacyPolicy(), new Consent.UserAction(str, timeStamp, getActionMethods(str)));
    }

    private ArrayList<Consent.UserAction.ActionMethod> getActionMethods(String str) {
        String str2 = str.equalsIgnoreCase("accept") ? "User clicked \"Accept\" button on consent screen" : str.equalsIgnoreCase("deny") ? "User clicked \"Deny\" button on consent screen" : BuildConfig.FLAVOR;
        ArrayList<Consent.UserAction.ActionMethod> arrayList = new ArrayList<>();
        arrayList.add(new Consent.UserAction.ActionMethod("button-click", str2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getIsConsentToBeShown$0(ConsentService.ConsentCallback consentCallback, HVError hVError, HVResponse hVResponse) {
        if (hVResponse == null || hVResponse.getApiResult() == null) {
            consentCallback.onError();
            return;
        }
        try {
            JSONObject jSONObject = hVResponse.getApiResult().getJSONObject("result");
            JSONObject jSONObject2 = jSONObject.getJSONObject("consentConfig");
            boolean optBoolean = jSONObject.optBoolean("isEnabled");
            ConsentConfig consentConfig = (ConsentConfig) new e().k(String.valueOf(jSONObject2), ConsentConfig.class);
            this.consentConfig = consentConfig;
            consentConfig.setEnabled(Boolean.valueOf(optBoolean));
            consentCallback.onSuccess(this.consentConfig);
        } catch (JSONException unused) {
            consentCallback.onError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveConsent$1(ConsentService.SaveConsentCallback saveConsentCallback, HVError hVError, HVResponse hVResponse) {
        if (hVResponse == null || hVResponse.getApiResult() == null) {
            saveConsentCallback.onError();
            return;
        }
        try {
            JSONObject jSONObject = hVResponse.getApiResult().getJSONObject("result");
            saveConsentCallback.onSuccess(jSONObject.getString("consentId"), jSONObject.getString("consentToken"));
        } catch (JSONException unused) {
            saveConsentCallback.onError();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.service.consent.ConsentService
    public void getIsConsentToBeShown(final ConsentService.ConsentCallback consentCallback) {
        DataRepository.getInstance().getShouldShowConsent(new APICompletionCallback() { // from class: K1.a
            @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
            public final void onResult(HVError hVError, HVResponse hVResponse) {
                ConsentServiceImpl.this.lambda$getIsConsentToBeShown$0(consentCallback, hVError, hVResponse);
            }
        });
    }

    @Override // co.hyperverge.hypersnapsdk.service.consent.ConsentService
    public void saveConsent(boolean z10, Consent.DeviceDetails deviceDetails, final ConsentService.SaveConsentCallback saveConsentCallback) {
        DataRepository.getInstance().saveConsent(generateConfig(z10 ? "accept" : "deny", deviceDetails), new APICompletionCallback() { // from class: K1.b
            @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
            public final void onResult(HVError hVError, HVResponse hVResponse) {
                ConsentServiceImpl.lambda$saveConsent$1(ConsentService.SaveConsentCallback.this, hVError, hVResponse);
            }
        });
    }
}
