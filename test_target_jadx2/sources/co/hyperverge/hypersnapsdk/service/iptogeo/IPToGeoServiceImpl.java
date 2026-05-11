package co.hyperverge.hypersnapsdk.service.iptogeo;

import android.util.Log;
import co.hyperverge.hypersnapsdk.data.DataRepository;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.listeners.APICompletionCallback;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.IPAddress;
import co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService;
import co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoServiceImpl;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import java.util.Date;

/* loaded from: classes.dex */
public class IPToGeoServiceImpl implements IPToGeoService {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoServiceImpl";

    private boolean doesIPAddressCacheExist(IPAddress iPAddress) {
        HVLogUtils.d(TAG, "doesIPAddressCacheExist() called with: ipDataFromCache = [" + iPAddress + "]");
        return (iPAddress == null || iPAddress.getCreatedAt() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performIp2GeoAddress$0(IPToGeoService.IPToGeoCallback iPToGeoCallback, IPAddress iPAddress, HVError hVError, HVResponse hVResponse) {
        Log.d(TAG, "onResult() called with: error = [" + hVError + "], hvResponse = [" + hVResponse + "]");
        if (hVResponse != null && hVResponse.getApiResult() != null) {
            IPAddress iPAddress2 = (IPAddress) new e().k(String.valueOf(hVResponse.getApiResult()), IPAddress.class);
            iPAddress2.setCreatedAt(new Date());
            SPHelper.saveIpToGeoData(iPAddress2);
            iPToGeoCallback.onSuccess(iPAddress2);
            return;
        }
        if (hVError != null) {
            if (doesIPAddressCacheExist(iPAddress)) {
                iPToGeoCallback.onSuccess(iPAddress);
            } else {
                iPToGeoCallback.onError();
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService
    public void performIp2GeoAddress(final IPToGeoService.IPToGeoCallback iPToGeoCallback) {
        HVLogUtils.d(TAG, "performIp2GeoAddress() called with: ipToGeoCallback = [" + iPToGeoCallback + "]");
        final IPAddress ipToGeoData = SPHelper.getIpToGeoData();
        if (!doesIPAddressCacheExist(ipToGeoData) || Utils.timeDifferenceInMinutes(ipToGeoData.getCreatedAt()) > 30) {
            DataRepository.getInstance().ipAddressToGeo(new APICompletionCallback() { // from class: L1.a
                @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
                public final void onResult(HVError hVError, HVResponse hVResponse) {
                    IPToGeoServiceImpl.this.lambda$performIp2GeoAddress$0(iPToGeoCallback, ipToGeoData, hVError, hVResponse);
                }
            });
        } else {
            iPToGeoCallback.onSuccess(ipToGeoData);
        }
    }
}
