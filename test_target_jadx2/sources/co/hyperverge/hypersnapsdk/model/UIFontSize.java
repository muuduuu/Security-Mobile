package co.hyperverge.hypersnapsdk.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class UIFontSize implements Serializable {
    private float titleTextSize = 20.0f;
    private float descriptionTextSize = 14.0f;
    private float statusTextSize = 20.0f;
    private float documentSideHintTextSize = 12.0f;
    private float retakeMessageTextSize = 14.0f;
    private float primaryButtonTextSize = 14.0f;
    private float secondaryButtonTextSize = 14.0f;
    private float alertTextBoxTextSize = 14.0f;
    private float pickerTextSize = 14.0f;
    private float countryListItemTextSize = 16.0f;
    private float countrySearchTextSize = 16.0f;
    private float statementHelperTextSize = 20.0f;
    private float statementTextSize = 24.0f;
    private float loaderTextSize = 12.0f;
    private float nfcStatusTextSize = 14.0f;
    private float apiLoadingTitleTextSize = 20.0f;
    private float apiLoadingHintTextSize = 14.0f;

    protected boolean canEqual(Object obj) {
        return obj instanceof UIFontSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UIFontSize)) {
            return false;
        }
        UIFontSize uIFontSize = (UIFontSize) obj;
        return uIFontSize.canEqual(this) && Float.compare(getTitleTextSize(), uIFontSize.getTitleTextSize()) == 0 && Float.compare(getDescriptionTextSize(), uIFontSize.getDescriptionTextSize()) == 0 && Float.compare(getStatusTextSize(), uIFontSize.getStatusTextSize()) == 0 && Float.compare(getDocumentSideHintTextSize(), uIFontSize.getDocumentSideHintTextSize()) == 0 && Float.compare(getRetakeMessageTextSize(), uIFontSize.getRetakeMessageTextSize()) == 0 && Float.compare(getPrimaryButtonTextSize(), uIFontSize.getPrimaryButtonTextSize()) == 0 && Float.compare(getSecondaryButtonTextSize(), uIFontSize.getSecondaryButtonTextSize()) == 0 && Float.compare(getAlertTextBoxTextSize(), uIFontSize.getAlertTextBoxTextSize()) == 0 && Float.compare(getPickerTextSize(), uIFontSize.getPickerTextSize()) == 0 && Float.compare(getCountryListItemTextSize(), uIFontSize.getCountryListItemTextSize()) == 0 && Float.compare(getCountrySearchTextSize(), uIFontSize.getCountrySearchTextSize()) == 0 && Float.compare(getStatementHelperTextSize(), uIFontSize.getStatementHelperTextSize()) == 0 && Float.compare(getStatementTextSize(), uIFontSize.getStatementTextSize()) == 0 && Float.compare(getLoaderTextSize(), uIFontSize.getLoaderTextSize()) == 0 && Float.compare(getNfcStatusTextSize(), uIFontSize.getNfcStatusTextSize()) == 0 && Float.compare(getApiLoadingTitleTextSize(), uIFontSize.getApiLoadingTitleTextSize()) == 0 && Float.compare(getApiLoadingHintTextSize(), uIFontSize.getApiLoadingHintTextSize()) == 0;
    }

    public float getAlertTextBoxTextSize() {
        return this.alertTextBoxTextSize;
    }

    public float getApiLoadingHintTextSize() {
        return this.apiLoadingHintTextSize;
    }

    public float getApiLoadingTitleTextSize() {
        return this.apiLoadingTitleTextSize;
    }

    public float getCountryListItemTextSize() {
        return this.countryListItemTextSize;
    }

    public float getCountrySearchTextSize() {
        return this.countrySearchTextSize;
    }

    public float getDescriptionTextSize() {
        return this.descriptionTextSize;
    }

    public float getDocumentSideHintTextSize() {
        return this.documentSideHintTextSize;
    }

    public float getLoaderTextSize() {
        return this.loaderTextSize;
    }

    public float getNfcStatusTextSize() {
        return this.nfcStatusTextSize;
    }

    public float getPickerTextSize() {
        return this.pickerTextSize;
    }

    public float getPrimaryButtonTextSize() {
        return this.primaryButtonTextSize;
    }

    public float getRetakeMessageTextSize() {
        return this.retakeMessageTextSize;
    }

    public float getSecondaryButtonTextSize() {
        return this.secondaryButtonTextSize;
    }

    public float getStatementHelperTextSize() {
        return this.statementHelperTextSize;
    }

    public float getStatementTextSize() {
        return this.statementTextSize;
    }

    public float getStatusTextSize() {
        return this.statusTextSize;
    }

    public float getTitleTextSize() {
        return this.titleTextSize;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((Float.floatToIntBits(getTitleTextSize()) + 59) * 59) + Float.floatToIntBits(getDescriptionTextSize())) * 59) + Float.floatToIntBits(getStatusTextSize())) * 59) + Float.floatToIntBits(getDocumentSideHintTextSize())) * 59) + Float.floatToIntBits(getRetakeMessageTextSize())) * 59) + Float.floatToIntBits(getPrimaryButtonTextSize())) * 59) + Float.floatToIntBits(getSecondaryButtonTextSize())) * 59) + Float.floatToIntBits(getAlertTextBoxTextSize())) * 59) + Float.floatToIntBits(getPickerTextSize())) * 59) + Float.floatToIntBits(getCountryListItemTextSize())) * 59) + Float.floatToIntBits(getCountrySearchTextSize())) * 59) + Float.floatToIntBits(getStatementHelperTextSize())) * 59) + Float.floatToIntBits(getStatementTextSize())) * 59) + Float.floatToIntBits(getLoaderTextSize())) * 59) + Float.floatToIntBits(getNfcStatusTextSize())) * 59) + Float.floatToIntBits(getApiLoadingTitleTextSize())) * 59) + Float.floatToIntBits(getApiLoadingHintTextSize());
    }

    public void setAlertTextBoxTextSize(float f10) {
        this.alertTextBoxTextSize = f10;
    }

    public void setApiLoadingHintTextSize(float f10) {
        this.apiLoadingHintTextSize = f10;
    }

    public void setApiLoadingTitleTextSize(float f10) {
        this.apiLoadingTitleTextSize = f10;
    }

    public void setCountryListItemTextSize(float f10) {
        this.countryListItemTextSize = f10;
    }

    public void setCountrySearchTextSize(float f10) {
        this.countrySearchTextSize = f10;
    }

    public void setDescriptionTextSize(float f10) {
        this.descriptionTextSize = f10;
    }

    public void setDocumentSideHintTextSize(float f10) {
        this.documentSideHintTextSize = f10;
    }

    public void setLoaderTextSize(float f10) {
        this.loaderTextSize = f10;
    }

    public void setNfcStatusTextSize(float f10) {
        this.nfcStatusTextSize = f10;
    }

    public void setPickerTextSize(float f10) {
        this.pickerTextSize = f10;
    }

    public void setPrimaryButtonTextSize(float f10) {
        this.primaryButtonTextSize = f10;
    }

    public void setRetakeMessageTextSize(float f10) {
        this.retakeMessageTextSize = f10;
    }

    public void setSecondaryButtonTextSize(float f10) {
        this.secondaryButtonTextSize = f10;
    }

    public void setStatementHelperTextSize(float f10) {
        this.statementHelperTextSize = f10;
    }

    public void setStatementTextSize(float f10) {
        this.statementTextSize = f10;
    }

    public void setStatusTextSize(float f10) {
        this.statusTextSize = f10;
    }

    public void setTitleTextSize(float f10) {
        this.titleTextSize = f10;
    }

    public String toString() {
        return "UIFontSize(titleTextSize=" + getTitleTextSize() + ", descriptionTextSize=" + getDescriptionTextSize() + ", statusTextSize=" + getStatusTextSize() + ", documentSideHintTextSize=" + getDocumentSideHintTextSize() + ", retakeMessageTextSize=" + getRetakeMessageTextSize() + ", primaryButtonTextSize=" + getPrimaryButtonTextSize() + ", secondaryButtonTextSize=" + getSecondaryButtonTextSize() + ", alertTextBoxTextSize=" + getAlertTextBoxTextSize() + ", pickerTextSize=" + getPickerTextSize() + ", countryListItemTextSize=" + getCountryListItemTextSize() + ", countrySearchTextSize=" + getCountrySearchTextSize() + ", statementHelperTextSize=" + getStatementHelperTextSize() + ", statementTextSize=" + getStatementTextSize() + ", loaderTextSize=" + getLoaderTextSize() + ", nfcStatusTextSize=" + getNfcStatusTextSize() + ", apiLoadingTitleTextSize=" + getApiLoadingTitleTextSize() + ", apiLoadingHintTextSize=" + getApiLoadingHintTextSize() + ")";
    }
}
