package co.hyperverge.hypersnapsdk.listeners;

import co.hyperverge.hypersnapsdk.objects.HVError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface QRCompletionHandler {
    void onResult(HVError hVError, JSONObject jSONObject);
}
