package co.hyperverge.hypersnapsdk.objects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVDocConfig extends HVBaseConfig implements Serializable {
    public static final String KEY = "hvDocConfig";
    private static final String TAG = "co.hyperverge.hypersnapsdk.objects.HVDocConfig";
    private Map<String, String> cprCheckSessionHeaders;
    String customUIStrings;
    private int descTypeface;
    String docCaptureDescription;
    String docCaptureSubText;
    String docCaptureSubtitle;
    String docCaptureTitle;
    String docReviewDescription;
    String docReviewSubtitle;
    String docReviewTitle;
    private byte[] documentCaptureOverlay;
    private int hintTypeface;
    public String ocrEndpoint;
    public String ocrHeaders;
    public String ocrParams;
    private byte[] readBarcodeOverlay;
    private int reviewScreenConfirmButtonTypeface;
    private int reviewScreenDescTypeface;
    private int reviewScreenRetakeButtonTypeface;
    private int reviewScreenSubtitleTypeface;
    private int reviewScreenTitleTypeface;
    boolean shouldEnableRetries;
    private int subtitleTypeface;
    private int titleTypeface;
    public float padding = 0.0f;
    Document document = Document.CARD;
    boolean shouldShowReviewScreen = false;
    boolean shouldShowInstructionPage = false;
    boolean shouldShowNetworkRetryDialog = false;
    boolean shouldShowFlashIcon = false;
    boolean shouldSetPadding = true;
    boolean shouldAllowPhoneTilt = true;
    boolean shouldExportPDF = false;
    boolean shouldDoOCR = false;
    boolean shouldReadNIDQR = false;
    boolean shouldReadBarcode = false;
    boolean enableDocumentUpload = false;
    private boolean showModuleBackButton = true;
    List<String> uploadFileTypes = null;
    boolean shouldDoIpToGeo = false;
    DocumentSide documentSide = DocumentSide.FRONT;
    int allowedTiltRoll = 10;
    int allowedTiltPitch = 10;
    private boolean encryptPayload = false;
    private boolean shouldAutoCapture = false;
    private int autoCaptureDuration = 1000;
    private boolean shouldPerformAssistiveCapture = false;
    private int documentCaptureOverlayDuration = 3000;
    private int readBarcodeTimeout = 5000;
    private boolean disableBarcodeSkip = false;
    private boolean enableOverlay = true;

    public enum Document {
        CARD(0.625f) { // from class: co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document.1
            @Override // co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document
            public void setAspectRatio(float f10) {
            }
        },
        A4(1.5f) { // from class: co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document.2
            @Override // co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document
            public void setAspectRatio(float f10) {
            }
        },
        PASSPORT(0.6666667f) { // from class: co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document.3
            @Override // co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document
            public void setAspectRatio(float f10) {
            }
        },
        OTHER(0.5f) { // from class: co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document.4
            @Override // co.hyperverge.hypersnapsdk.objects.HVDocConfig.Document
            public void setAspectRatio(float f10) {
                this.aspectRatio = f10;
            }
        };

        float aspectRatio;

        public float getAspectRatio() {
            return this.aspectRatio;
        }

        public abstract void setAspectRatio(float f10);

        Document(float f10) {
            this.aspectRatio = f10;
        }
    }

    public enum DocumentSide {
        FRONT,
        BACK
    }

    public int getAllowedTiltPitch() {
        return this.allowedTiltPitch;
    }

    public int getAllowedTiltRoll() {
        return this.allowedTiltRoll;
    }

    public int getAutoCaptureDuration() {
        return this.autoCaptureDuration;
    }

    public Map<String, String> getCPRCheckSessionHeaders() {
        return this.cprCheckSessionHeaders;
    }

    @Deprecated
    public String getCapturePageSubtitleText() {
        return this.docCaptureSubtitle;
    }

    public String getCapturePageTitleText() {
        return this.docCaptureTitle;
    }

    public HVJSONObject getCustomUIStrings() {
        HVJSONObject hVJSONObject = new HVJSONObject();
        if (this.customUIStrings == null) {
            return hVJSONObject;
        }
        try {
            return new HVJSONObject(this.customUIStrings);
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return hVJSONObject;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return hVJSONObject;
        }
    }

    public int getDescTypeface() {
        return this.descTypeface;
    }

    public String getDocCaptureDescription() {
        return this.docCaptureDescription;
    }

    public String getDocCaptureSubText() {
        return this.docCaptureSubText;
    }

    public String getDocReviewDescription() {
        return this.docReviewDescription;
    }

    @Deprecated
    public String getDocReviewSubtitle() {
        return this.docReviewSubtitle;
    }

    public String getDocReviewTitle() {
        return this.docReviewTitle;
    }

    public Document getDocument() {
        return this.document;
    }

    public Bitmap getDocumentCaptureOverlay() {
        byte[] bArr = this.documentCaptureOverlay;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public int getDocumentCaptureOverlayDuration() {
        return this.documentCaptureOverlayDuration;
    }

    public DocumentSide getDocumentSide() {
        return this.documentSide;
    }

    public int getHintTypeface() {
        return this.hintTypeface;
    }

    public JSONObject getOcrHeaders() {
        try {
            return this.ocrHeaders != null ? new JSONObject(this.ocrHeaders) : new JSONObject();
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public JSONObject getOcrParams() {
        try {
            return this.ocrParams != null ? new JSONObject(this.ocrParams) : new JSONObject();
        } catch (Exception e10) {
            Log.e(TAG, "getOcrParams: " + Utils.getErrorMessage(e10));
            return new JSONObject();
        }
    }

    public Bitmap getReadBarcodeOverlay() {
        byte[] bArr = this.readBarcodeOverlay;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public int getReadBarcodeTimeout() {
        return this.readBarcodeTimeout;
    }

    public int getReviewScreenConfirmButtonTypeface() {
        return this.reviewScreenConfirmButtonTypeface;
    }

    public int getReviewScreenDescTypeface() {
        return this.reviewScreenDescTypeface;
    }

    public int getReviewScreenRetakeButtonTypeface() {
        return this.reviewScreenRetakeButtonTypeface;
    }

    @Deprecated
    public int getReviewScreenSubtitleTypeface() {
        return this.reviewScreenSubtitleTypeface;
    }

    public int getReviewScreenTitleTypeface() {
        return this.reviewScreenTitleTypeface;
    }

    @Deprecated
    public int getSubtitleTypeface() {
        return this.subtitleTypeface;
    }

    public String getSuffixForDocument() {
        return this.documentSide == DocumentSide.FRONT ? "front" : "back";
    }

    public String getSuffixModuleId() {
        if (StringUtils.isEmptyOrNull(getModuleId())) {
            return getSuffixForDocument();
        }
        return getSuffixForDocument() + "_" + getModuleId();
    }

    public int getTitleTypeface() {
        return this.titleTypeface;
    }

    public List<String> getUploadFileTypes() {
        return this.uploadFileTypes;
    }

    public boolean isBarcodeSkipDisabled() {
        return this.disableBarcodeSkip;
    }

    public boolean isDocumentUploadEnabled() {
        return this.enableDocumentUpload;
    }

    public boolean isOverlayEnabled() {
        return this.enableOverlay;
    }

    public boolean isShouldAllowPhoneTilt() {
        return this.shouldAllowPhoneTilt;
    }

    public boolean isShouldAutoCapture() {
        return this.shouldAutoCapture;
    }

    public boolean isShouldDoIpToGeo() {
        return this.shouldDoIpToGeo;
    }

    public boolean isShouldDoOCR() {
        return this.shouldDoOCR;
    }

    public boolean isShouldEnableRetries() {
        return this.shouldEnableRetries;
    }

    public boolean isShouldExportPDF() {
        return this.shouldExportPDF;
    }

    public boolean isShouldPerformAssistiveCapture() {
        return this.shouldPerformAssistiveCapture;
    }

    public boolean isShouldReadBarcode() {
        return this.shouldReadBarcode;
    }

    public boolean isShouldReadNIDQR() {
        return this.shouldReadNIDQR;
    }

    @Deprecated
    public boolean isShouldReadQR() {
        return this.shouldReadNIDQR;
    }

    public boolean isShouldSetPadding() {
        return this.shouldSetPadding;
    }

    public boolean isShouldShowFlashIcon() {
        return this.shouldShowFlashIcon;
    }

    public boolean isShouldShowInstructionPage() {
        return this.shouldShowInstructionPage;
    }

    public boolean isShouldShowNetworkRetryDialog() {
        return this.shouldShowNetworkRetryDialog;
    }

    public void setAutoCaptureDuration(int i10) {
        if (i10 > this.autoCaptureDuration) {
            this.autoCaptureDuration = i10;
        }
    }

    public void setCPRCheckSessionHeaders(Map<String, String> map) {
        this.cprCheckSessionHeaders = map;
    }

    public void setCustomUIStrings(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.customUIStrings = jSONObject.toString();
        }
    }

    public void setDescTypeFace(int i10) {
        this.descTypeface = i10;
    }

    public void setDisableBarcodeSkip(boolean z10) {
        this.disableBarcodeSkip = z10;
    }

    public void setDocCaptureDescription(String str) {
        this.docCaptureDescription = str;
    }

    public void setDocCaptureSubText(String str) {
        this.docCaptureSubText = str;
    }

    @Deprecated
    public void setDocCaptureSubtitle(String str) {
        this.docCaptureSubtitle = str;
    }

    public void setDocCaptureTitle(String str) {
        this.docCaptureTitle = str;
    }

    public void setDocReviewDescription(String str) {
        this.docReviewDescription = str;
    }

    @Deprecated
    public void setDocReviewSubtitle(String str) {
        this.docReviewSubtitle = str;
    }

    public void setDocReviewTitle(String str) {
        this.docReviewTitle = str;
    }

    public void setDocumentCaptureOverlay(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        this.documentCaptureOverlay = byteArray;
    }

    public void setDocumentCaptureOverlayDuration(int i10) {
        this.documentCaptureOverlayDuration = i10;
    }

    public void setDocumentType(Document document) {
        this.document = document;
    }

    public void setEnableDocumentUpload(boolean z10) {
        this.enableDocumentUpload = z10;
    }

    public void setEncryptPayload(boolean z10) {
        this.encryptPayload = z10;
    }

    public void setHintTypeface(int i10) {
        this.hintTypeface = i10;
    }

    public void setOCRDetails(String str, DocumentSide documentSide, String str2, String str3) {
        this.ocrEndpoint = str;
        this.ocrParams = str2;
        this.ocrHeaders = str3;
        this.documentSide = documentSide;
        this.shouldEnableRetries = true;
        this.shouldDoOCR = true;
    }

    public void setPadding(float f10) {
        this.shouldSetPadding = true;
        this.padding = f10;
    }

    public void setPhoneTiltConstraints(int i10, int i11) {
        this.allowedTiltRoll = i10;
        this.allowedTiltPitch = i11;
    }

    public void setReadBarcodeOverlay(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        this.readBarcodeOverlay = byteArray;
    }

    public void setReadBarcodeTimeout(int i10) {
        this.readBarcodeTimeout = i10;
    }

    public void setReviewScreenConfirmButtonTypeface(int i10) {
        this.reviewScreenConfirmButtonTypeface = i10;
    }

    public void setReviewScreenDescTypeface(int i10) {
        this.reviewScreenDescTypeface = i10;
    }

    public void setReviewScreenRetakeButtonTypeface(int i10) {
        this.reviewScreenRetakeButtonTypeface = i10;
    }

    @Deprecated
    public void setReviewScreenSubtitleTypeface(int i10) {
        this.reviewScreenSubtitleTypeface = i10;
    }

    public void setReviewScreenTitleTypeface(int i10) {
        this.reviewScreenTitleTypeface = i10;
    }

    public void setShouldAddPadding(boolean z10) {
        this.shouldSetPadding = z10;
        if (z10) {
            setPadding(0.2f);
        }
    }

    public void setShouldAllowPhoneTilt(boolean z10) {
        this.shouldAllowPhoneTilt = z10;
    }

    public void setShouldAutoCapture(boolean z10) {
        this.shouldAutoCapture = z10;
    }

    public void setShouldEnableOverlay(boolean z10) {
        this.enableOverlay = z10;
    }

    public void setShouldEnableRetries(boolean z10) {
        this.shouldEnableRetries = z10;
    }

    public void setShouldExportPDF(boolean z10) {
        this.shouldExportPDF = z10;
    }

    public void setShouldPerformAssistiveCapture(boolean z10) {
        this.shouldPerformAssistiveCapture = z10;
    }

    public void setShouldReadBarcode(boolean z10) {
        this.shouldReadBarcode = z10;
    }

    public void setShouldReadNIDQR(boolean z10) {
        this.shouldReadNIDQR = z10;
    }

    @Deprecated
    public void setShouldReadQR(boolean z10) {
        this.shouldReadNIDQR = this.shouldReadNIDQR;
    }

    public void setShouldShowFlashIcon(boolean z10) {
        this.shouldShowFlashIcon = z10;
    }

    public void setShouldShowInstructionPage(boolean z10) {
        this.shouldShowInstructionPage = z10;
    }

    public void setShouldShowNetworkRetryDialog(boolean z10) {
        this.shouldShowNetworkRetryDialog = z10;
    }

    public void setShouldShowReviewScreen(boolean z10) {
        this.shouldShowReviewScreen = z10;
    }

    public void setShowModuleBackButton(boolean z10) {
        this.showModuleBackButton = z10;
    }

    @Deprecated
    public void setSubtitleTypeFace(int i10) {
        this.subtitleTypeface = i10;
    }

    public void setTitleTypeFace(int i10) {
        this.titleTypeface = i10;
    }

    public void setUploadFileTypes(List<String> list) {
        this.uploadFileTypes = list;
    }

    public boolean shouldEncryptPayload() {
        return this.encryptPayload;
    }

    public boolean shouldShowModuleBackButton() {
        return this.showModuleBackButton;
    }

    public boolean shouldShowReviewScreen() {
        return this.shouldShowReviewScreen;
    }
}
