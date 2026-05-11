package co.hyperverge.hypersnapsdk.service.qr;

import O8.c;
import co.hyperverge.hypersnapsdk.objects.AadhaarQRResponse;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AadhaarQrData implements Serializable {

    @c(alternate = {"QDB", "QDA"}, value = "PrintLetterBarcodeData")
    AadhaarQRResponse aadhaarQRResponse;

    protected boolean canEqual(Object obj) {
        return obj instanceof AadhaarQrData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AadhaarQrData)) {
            return false;
        }
        AadhaarQrData aadhaarQrData = (AadhaarQrData) obj;
        if (!aadhaarQrData.canEqual(this)) {
            return false;
        }
        AadhaarQRResponse aadhaarQRResponse = getAadhaarQRResponse();
        AadhaarQRResponse aadhaarQRResponse2 = aadhaarQrData.getAadhaarQRResponse();
        return aadhaarQRResponse != null ? aadhaarQRResponse.equals(aadhaarQRResponse2) : aadhaarQRResponse2 == null;
    }

    public AadhaarQRResponse getAadhaarQRResponse() {
        return this.aadhaarQRResponse;
    }

    public int hashCode() {
        AadhaarQRResponse aadhaarQRResponse = getAadhaarQRResponse();
        return 59 + (aadhaarQRResponse == null ? 43 : aadhaarQRResponse.hashCode());
    }

    public void setAadhaarQRResponse(AadhaarQRResponse aadhaarQRResponse) {
        this.aadhaarQRResponse = aadhaarQRResponse;
    }

    public String toString() {
        return "AadhaarQrData(aadhaarQRResponse=" + getAadhaarQRResponse() + ")";
    }
}
