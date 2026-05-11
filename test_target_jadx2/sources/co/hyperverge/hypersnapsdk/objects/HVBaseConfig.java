package co.hyperverge.hypersnapsdk.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HVBaseConfig implements Serializable {
    private List<Integer> allowedStatusCodes;
    private String captureTimeoutDialogDesc;
    private String captureTimeoutDialogTitle;
    private String closeAlertDialogDesc;
    private String closeAlertDialogTitle;
    private String errorReviewRetakeButton;
    private int errorReviewScreenDescTypeface;
    private int errorReviewScreenRetakeButtonTypeface;
    private int errorReviewScreenTitleTypeface;
    private String errorReviewTitle;
    private String moduleId;
    private boolean shouldShowCloseAlert = false;
    private boolean showTrustLogos = false;
    private boolean showCloseIcon = false;

    private List<Integer> getDefaultStatusCodes() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 200; i10 <= 208; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        arrayList.add(226);
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 433; i11 <= 450; i11++) {
            arrayList3.add(Integer.valueOf(i11));
        }
        arrayList3.add(422);
        arrayList3.add(423);
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    public List<Integer> getAllowedStatusCodes() {
        List<Integer> list = this.allowedStatusCodes;
        return (list == null || list.isEmpty()) ? getDefaultStatusCodes() : this.allowedStatusCodes;
    }

    public String getCaptureTimeoutDialogDesc() {
        return this.captureTimeoutDialogDesc;
    }

    public String getCaptureTimeoutDialogTitle() {
        return this.captureTimeoutDialogTitle;
    }

    public String getCloseAlertDialogDesc() {
        return this.closeAlertDialogDesc;
    }

    public String getCloseAlertDialogTitle() {
        return this.closeAlertDialogTitle;
    }

    public int getErroReviewScreenRetakeButtonTypeface() {
        return this.errorReviewScreenRetakeButtonTypeface;
    }

    public String getErrorReviewRetakeButton() {
        return this.errorReviewRetakeButton;
    }

    public int getErrorReviewScreenDescTypeface() {
        return this.errorReviewScreenDescTypeface;
    }

    public int getErrorReviewScreenTitleTypeface() {
        return this.errorReviewScreenTitleTypeface;
    }

    public String getErrorReviewTitle() {
        return this.errorReviewTitle;
    }

    public String getModuleId() {
        return this.moduleId;
    }

    public void setAllowedStatusCodes(List<Integer> list) {
        this.allowedStatusCodes = list;
    }

    public void setCaptureTimeoutDialogDesc(String str) {
        this.captureTimeoutDialogDesc = str;
    }

    public void setCaptureTimeoutDialogTitle(String str) {
        this.captureTimeoutDialogTitle = str;
    }

    public void setCloseAlertDialogDesc(String str) {
        this.closeAlertDialogDesc = str;
    }

    public void setCloseAlertDialogTitle(String str) {
        this.closeAlertDialogTitle = str;
    }

    public void setErroReviewScreenRetakeButtonTypeface(int i10) {
        this.errorReviewScreenRetakeButtonTypeface = i10;
    }

    public void setErrorReviewRetakeButton(String str) {
        this.errorReviewRetakeButton = str;
    }

    public void setErrorReviewScreenDescTypeface(int i10) {
        this.errorReviewScreenDescTypeface = i10;
    }

    public void setErrorReviewScreenTitleTypeface(int i10) {
        this.errorReviewScreenTitleTypeface = i10;
    }

    public void setErrorReviewTitle(String str) {
        this.errorReviewTitle = str;
    }

    public void setModuleId(String str) {
        this.moduleId = str;
    }

    public void setShouldShowCloseAlert(boolean z10) {
        this.shouldShowCloseAlert = z10;
    }

    public void setShowCloseIcon(boolean z10) {
        this.showCloseIcon = z10;
    }

    @Deprecated
    public void setShowTrustLogos(boolean z10) {
        this.showTrustLogos = z10;
    }

    public boolean shouldShowCloseAlert() {
        return this.shouldShowCloseAlert;
    }

    public boolean shouldShowCloseIcon() {
        return this.showCloseIcon;
    }

    @Deprecated
    public boolean shouldShowTrustLogos() {
        return this.showTrustLogos;
    }
}
