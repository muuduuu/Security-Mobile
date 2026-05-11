package co.hyperverge.hypersnapsdk.model;

import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lco/hyperverge/hypersnapsdk/model/HVStateData;", "Ljava/io/Serializable;", "hvError", "Lco/hyperverge/hypersnapsdk/objects/HVError;", "hvResponse", "Lco/hyperverge/hypersnapsdk/objects/HVResponse;", "qrResult", "Lorg/json/JSONObject;", "(Lco/hyperverge/hypersnapsdk/objects/HVError;Lco/hyperverge/hypersnapsdk/objects/HVResponse;Lorg/json/JSONObject;)V", "getHvError", "()Lco/hyperverge/hypersnapsdk/objects/HVError;", "getHvResponse", "()Lco/hyperverge/hypersnapsdk/objects/HVResponse;", "getQrResult", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HVStateData implements Serializable {
    private final HVError hvError;
    private final HVResponse hvResponse;
    private final JSONObject qrResult;

    public HVStateData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ HVStateData copy$default(HVStateData hVStateData, HVError hVError, HVResponse hVResponse, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVError = hVStateData.hvError;
        }
        if ((i10 & 2) != 0) {
            hVResponse = hVStateData.hvResponse;
        }
        if ((i10 & 4) != 0) {
            jSONObject = hVStateData.qrResult;
        }
        return hVStateData.copy(hVError, hVResponse, jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final HVError getHvError() {
        return this.hvError;
    }

    /* renamed from: component2, reason: from getter */
    public final HVResponse getHvResponse() {
        return this.hvResponse;
    }

    /* renamed from: component3, reason: from getter */
    public final JSONObject getQrResult() {
        return this.qrResult;
    }

    public final HVStateData copy(HVError hvError, HVResponse hvResponse, JSONObject qrResult) {
        return new HVStateData(hvError, hvResponse, qrResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HVStateData)) {
            return false;
        }
        HVStateData hVStateData = (HVStateData) other;
        return Intrinsics.b(this.hvError, hVStateData.hvError) && Intrinsics.b(this.hvResponse, hVStateData.hvResponse) && Intrinsics.b(this.qrResult, hVStateData.qrResult);
    }

    public final HVError getHvError() {
        return this.hvError;
    }

    public final HVResponse getHvResponse() {
        return this.hvResponse;
    }

    public final JSONObject getQrResult() {
        return this.qrResult;
    }

    public int hashCode() {
        HVError hVError = this.hvError;
        int hashCode = (hVError == null ? 0 : hVError.hashCode()) * 31;
        HVResponse hVResponse = this.hvResponse;
        int hashCode2 = (hashCode + (hVResponse == null ? 0 : hVResponse.hashCode())) * 31;
        JSONObject jSONObject = this.qrResult;
        return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        return "HVStateData(hvError=" + this.hvError + ", hvResponse=" + this.hvResponse + ", qrResult=" + this.qrResult + ')';
    }

    public HVStateData(HVError hVError, HVResponse hVResponse, JSONObject jSONObject) {
        this.hvError = hVError;
        this.hvResponse = hVResponse;
        this.qrResult = jSONObject;
    }

    public /* synthetic */ HVStateData(HVError hVError, HVResponse hVResponse, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : hVError, (i10 & 2) != 0 ? null : hVResponse, (i10 & 4) != 0 ? null : jSONObject);
    }
}
