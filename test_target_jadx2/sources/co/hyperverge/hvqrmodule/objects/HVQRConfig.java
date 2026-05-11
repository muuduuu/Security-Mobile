package co.hyperverge.hvqrmodule.objects;

import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class HVQRConfig implements Serializable {
    private String customUIStrings;
    private String moduleId;
    private String qrCaptureDescText;
    private String qrCaptureSkipText;
    private String qrCaptureSubText;
    private String qrCaptureTitleText;
    private String qrInstructionTitleText;
    private String qrInstructionsDescText;
    private String qrInstructionsProceedText;
    private HVBarcodeType hvBarcodeType = HVBarcodeType.QR;
    private boolean showInstructions = false;
    private boolean maskAadhaar = true;
    private int skipButtonDelay = 5000;
    private boolean showModuleBackButton = true;
    private boolean showCloseIcon = false;
    private Boolean useCameraX = null;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'QR' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class HVBarcodeType {
        private static final /* synthetic */ HVBarcodeType[] $VALUES;
        public static final HVBarcodeType AZTEC;
        public static final HVBarcodeType DATA_MATRIX;
        public static final HVBarcodeType PDF417;
        public static final HVBarcodeType QR;
        float aspectRatio;

        static {
            float f10 = 1.0f;
            HVBarcodeType hVBarcodeType = new HVBarcodeType("QR", 0, f10) { // from class: co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType.1
                @Override // co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType
                public void setAspectRatio(float f11) {
                }
            };
            QR = hVBarcodeType;
            HVBarcodeType hVBarcodeType2 = new HVBarcodeType("AZTEC", 1, f10) { // from class: co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType.2
                @Override // co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType
                public void setAspectRatio(float f11) {
                }
            };
            AZTEC = hVBarcodeType2;
            HVBarcodeType hVBarcodeType3 = new HVBarcodeType("DATA_MATRIX", 2, f10) { // from class: co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType.3
                @Override // co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType
                public void setAspectRatio(float f11) {
                }
            };
            DATA_MATRIX = hVBarcodeType3;
            HVBarcodeType hVBarcodeType4 = new HVBarcodeType("PDF417", 3, 0.6f) { // from class: co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType.4
                @Override // co.hyperverge.hvqrmodule.objects.HVQRConfig.HVBarcodeType
                public void setAspectRatio(float f11) {
                }
            };
            PDF417 = hVBarcodeType4;
            $VALUES = new HVBarcodeType[]{hVBarcodeType, hVBarcodeType2, hVBarcodeType3, hVBarcodeType4};
        }

        public static HVBarcodeType valueOf(String str) {
            return (HVBarcodeType) Enum.valueOf(HVBarcodeType.class, str);
        }

        public static HVBarcodeType[] values() {
            return (HVBarcodeType[]) $VALUES.clone();
        }

        public float getAspectRatio() {
            return this.aspectRatio;
        }

        public abstract void setAspectRatio(float f10);

        private HVBarcodeType(String str, int i10, float f10) {
            this.aspectRatio = f10;
        }
    }

    public HVJSONObject getCustomUIStrings() {
        HVJSONObject hVJSONObject = new HVJSONObject();
        if (this.customUIStrings == null) {
            return hVJSONObject;
        }
        try {
            return new HVJSONObject(this.customUIStrings);
        } catch (JSONException e10) {
            Log.e("TAG", Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return hVJSONObject;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return hVJSONObject;
        }
    }

    public HVBarcodeType getHVBarcodeType() {
        return this.hvBarcodeType;
    }

    public String getModuleId() {
        return this.moduleId;
    }

    public String getQrCaptureDescText() {
        return this.qrCaptureDescText;
    }

    public String getQrCaptureSkipText() {
        return this.qrCaptureSkipText;
    }

    public String getQrCaptureSubText() {
        return this.qrCaptureSubText;
    }

    public String getQrCaptureTitleText() {
        return this.qrCaptureTitleText;
    }

    public String getQrInstructionTitleText() {
        return this.qrInstructionTitleText;
    }

    public String getQrInstructionsDescText() {
        return this.qrInstructionsDescText;
    }

    public String getQrInstructionsProceedText() {
        return this.qrInstructionsProceedText;
    }

    public int getSkipButtonDelay() {
        return this.skipButtonDelay;
    }

    public void setCustomUIStrings(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.customUIStrings = jSONObject.toString();
        }
    }

    public void setHVBarcodeType(HVBarcodeType hVBarcodeType) {
        this.hvBarcodeType = hVBarcodeType;
    }

    public void setMaskAadhaar(boolean z10) {
        this.maskAadhaar = z10;
    }

    public void setModuleId(String str) {
        this.moduleId = str;
    }

    public void setQrCaptureDescText(String str) {
        this.qrCaptureDescText = str;
    }

    public void setQrCaptureSkipText(String str) {
        this.qrCaptureSkipText = str;
    }

    public void setQrCaptureSubText(String str) {
        this.qrCaptureSubText = str;
    }

    public void setQrCaptureTitleText(String str) {
        this.qrCaptureTitleText = str;
    }

    public void setQrInstructionTitleText(String str) {
        this.qrInstructionTitleText = str;
    }

    public void setQrInstructionsDescText(String str) {
        this.qrInstructionsDescText = str;
    }

    public void setQrInstructionsProceedText(String str) {
        this.qrInstructionsProceedText = str;
    }

    public void setShowCloseIcon(boolean z10) {
        this.showCloseIcon = z10;
    }

    public void setShowInstructions(boolean z10) {
        this.showInstructions = z10;
    }

    public void setShowModuleBackButton(boolean z10) {
        this.showModuleBackButton = z10;
    }

    public void setSkipButtonDelay(int i10) {
        this.skipButtonDelay = i10;
    }

    public void setUseCameraX(boolean z10) {
        this.useCameraX = Boolean.valueOf(z10);
    }

    public boolean shouldMaskAadhaar() {
        return this.maskAadhaar;
    }

    public boolean shouldShowCloseIcon() {
        return this.showCloseIcon;
    }

    public boolean shouldShowInstructions() {
        return this.showInstructions;
    }

    public boolean shouldShowModuleBackButton() {
        return this.showModuleBackButton;
    }

    public Boolean shouldUseCameraX() {
        return this.useCameraX;
    }
}
