package co.hyperverge.hypersnapsdk.model;

import android.util.DisplayMetrics;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class UICharacterSpacing implements Serializable {
    private float titleTextCharSpacing = 0.0f;
    private float descriptionTextCharSpacing = 0.0f;
    private float statusTextCharSpacing = 0.0f;
    private float documentSideHintTextCharSpacing = 0.0f;
    private float retakeMessageCharSpacing = 0.0f;
    private float primaryButtonTextCharSpacing = 0.0f;
    private float secondaryButtonTextCharSpacing = 0.0f;
    private float alertTextBoxTextCharSpacing = 0.0f;
    private float pickerTextCharSpacing = 0.0f;
    private float countryListItemTextCharSpacing = 0.0f;
    private float countryListItemSelectedTextCharSpacing = 0.0f;
    private float countrySearchTextCharSpacing = 0.0f;
    private float statementHelperTextCharSpacing = 0.0f;
    private float statementTextCharSpacing = 0.0f;
    private float loaderTextCharSpacing = 0.0f;
    private float nfcStatusTextCharSpacing = 0.0f;
    private float apiLoadingTitleTextCharSpacing = 0.0f;
    private float apiLoadingHintTextCharSpacing = 0.0f;

    public void applyDimension(DisplayMetrics displayMetrics) {
        this.titleTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.titleTextCharSpacing);
        this.descriptionTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.descriptionTextCharSpacing);
        this.statusTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.statusTextCharSpacing);
        this.documentSideHintTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.documentSideHintTextCharSpacing);
        this.retakeMessageCharSpacing = UIUtils.pxToEm(displayMetrics, this.retakeMessageCharSpacing);
        this.primaryButtonTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.primaryButtonTextCharSpacing);
        this.secondaryButtonTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.secondaryButtonTextCharSpacing);
        this.alertTextBoxTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.alertTextBoxTextCharSpacing);
        this.pickerTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.pickerTextCharSpacing);
        this.countryListItemTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.countryListItemTextCharSpacing);
        this.countryListItemSelectedTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.countryListItemSelectedTextCharSpacing);
        this.countrySearchTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.countrySearchTextCharSpacing);
        this.statementHelperTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.statementHelperTextCharSpacing);
        this.statementTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.statementTextCharSpacing);
        this.loaderTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.loaderTextCharSpacing);
        this.nfcStatusTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.nfcStatusTextCharSpacing);
        this.apiLoadingTitleTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.apiLoadingTitleTextCharSpacing);
        this.apiLoadingHintTextCharSpacing = UIUtils.pxToEm(displayMetrics, this.apiLoadingHintTextCharSpacing);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof UICharacterSpacing;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UICharacterSpacing)) {
            return false;
        }
        UICharacterSpacing uICharacterSpacing = (UICharacterSpacing) obj;
        return uICharacterSpacing.canEqual(this) && Float.compare(getTitleTextCharSpacing(), uICharacterSpacing.getTitleTextCharSpacing()) == 0 && Float.compare(getDescriptionTextCharSpacing(), uICharacterSpacing.getDescriptionTextCharSpacing()) == 0 && Float.compare(getStatusTextCharSpacing(), uICharacterSpacing.getStatusTextCharSpacing()) == 0 && Float.compare(getDocumentSideHintTextCharSpacing(), uICharacterSpacing.getDocumentSideHintTextCharSpacing()) == 0 && Float.compare(getRetakeMessageCharSpacing(), uICharacterSpacing.getRetakeMessageCharSpacing()) == 0 && Float.compare(getPrimaryButtonTextCharSpacing(), uICharacterSpacing.getPrimaryButtonTextCharSpacing()) == 0 && Float.compare(getSecondaryButtonTextCharSpacing(), uICharacterSpacing.getSecondaryButtonTextCharSpacing()) == 0 && Float.compare(getAlertTextBoxTextCharSpacing(), uICharacterSpacing.getAlertTextBoxTextCharSpacing()) == 0 && Float.compare(getPickerTextCharSpacing(), uICharacterSpacing.getPickerTextCharSpacing()) == 0 && Float.compare(getCountryListItemTextCharSpacing(), uICharacterSpacing.getCountryListItemTextCharSpacing()) == 0 && Float.compare(getCountryListItemSelectedTextCharSpacing(), uICharacterSpacing.getCountryListItemSelectedTextCharSpacing()) == 0 && Float.compare(getCountrySearchTextCharSpacing(), uICharacterSpacing.getCountrySearchTextCharSpacing()) == 0 && Float.compare(getStatementHelperTextCharSpacing(), uICharacterSpacing.getStatementHelperTextCharSpacing()) == 0 && Float.compare(getStatementTextCharSpacing(), uICharacterSpacing.getStatementTextCharSpacing()) == 0 && Float.compare(getLoaderTextCharSpacing(), uICharacterSpacing.getLoaderTextCharSpacing()) == 0 && Float.compare(getNfcStatusTextCharSpacing(), uICharacterSpacing.getNfcStatusTextCharSpacing()) == 0 && Float.compare(getApiLoadingTitleTextCharSpacing(), uICharacterSpacing.getApiLoadingTitleTextCharSpacing()) == 0 && Float.compare(getApiLoadingHintTextCharSpacing(), uICharacterSpacing.getApiLoadingHintTextCharSpacing()) == 0;
    }

    public float getAlertTextBoxTextCharSpacing() {
        return this.alertTextBoxTextCharSpacing;
    }

    public float getApiLoadingHintTextCharSpacing() {
        return this.apiLoadingHintTextCharSpacing;
    }

    public float getApiLoadingTitleTextCharSpacing() {
        return this.apiLoadingTitleTextCharSpacing;
    }

    public float getCountryListItemSelectedTextCharSpacing() {
        return this.countryListItemSelectedTextCharSpacing;
    }

    public float getCountryListItemTextCharSpacing() {
        return this.countryListItemTextCharSpacing;
    }

    public float getCountrySearchTextCharSpacing() {
        return this.countrySearchTextCharSpacing;
    }

    public float getDescriptionTextCharSpacing() {
        return this.descriptionTextCharSpacing;
    }

    public float getDocumentSideHintTextCharSpacing() {
        return this.documentSideHintTextCharSpacing;
    }

    public float getLoaderTextCharSpacing() {
        return this.loaderTextCharSpacing;
    }

    public float getNfcStatusTextCharSpacing() {
        return this.nfcStatusTextCharSpacing;
    }

    public float getPickerTextCharSpacing() {
        return this.pickerTextCharSpacing;
    }

    public float getPrimaryButtonTextCharSpacing() {
        return this.primaryButtonTextCharSpacing;
    }

    public float getRetakeMessageCharSpacing() {
        return this.retakeMessageCharSpacing;
    }

    public float getSecondaryButtonTextCharSpacing() {
        return this.secondaryButtonTextCharSpacing;
    }

    public float getStatementHelperTextCharSpacing() {
        return this.statementHelperTextCharSpacing;
    }

    public float getStatementTextCharSpacing() {
        return this.statementTextCharSpacing;
    }

    public float getStatusTextCharSpacing() {
        return this.statusTextCharSpacing;
    }

    public float getTitleTextCharSpacing() {
        return this.titleTextCharSpacing;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((Float.floatToIntBits(getTitleTextCharSpacing()) + 59) * 59) + Float.floatToIntBits(getDescriptionTextCharSpacing())) * 59) + Float.floatToIntBits(getStatusTextCharSpacing())) * 59) + Float.floatToIntBits(getDocumentSideHintTextCharSpacing())) * 59) + Float.floatToIntBits(getRetakeMessageCharSpacing())) * 59) + Float.floatToIntBits(getPrimaryButtonTextCharSpacing())) * 59) + Float.floatToIntBits(getSecondaryButtonTextCharSpacing())) * 59) + Float.floatToIntBits(getAlertTextBoxTextCharSpacing())) * 59) + Float.floatToIntBits(getPickerTextCharSpacing())) * 59) + Float.floatToIntBits(getCountryListItemTextCharSpacing())) * 59) + Float.floatToIntBits(getCountryListItemSelectedTextCharSpacing())) * 59) + Float.floatToIntBits(getCountrySearchTextCharSpacing())) * 59) + Float.floatToIntBits(getStatementHelperTextCharSpacing())) * 59) + Float.floatToIntBits(getStatementTextCharSpacing())) * 59) + Float.floatToIntBits(getLoaderTextCharSpacing())) * 59) + Float.floatToIntBits(getNfcStatusTextCharSpacing())) * 59) + Float.floatToIntBits(getApiLoadingTitleTextCharSpacing())) * 59) + Float.floatToIntBits(getApiLoadingHintTextCharSpacing());
    }

    public void setAlertTextBoxTextCharSpacing(float f10) {
        this.alertTextBoxTextCharSpacing = f10;
    }

    public void setApiLoadingHintTextCharSpacing(float f10) {
        this.apiLoadingHintTextCharSpacing = f10;
    }

    public void setApiLoadingTitleTextCharSpacing(float f10) {
        this.apiLoadingTitleTextCharSpacing = f10;
    }

    public void setCountryListItemSelectedTextCharSpacing(float f10) {
        this.countryListItemSelectedTextCharSpacing = f10;
    }

    public void setCountryListItemTextCharSpacing(float f10) {
        this.countryListItemTextCharSpacing = f10;
    }

    public void setCountrySearchTextCharSpacing(float f10) {
        this.countrySearchTextCharSpacing = f10;
    }

    public void setDescriptionTextCharSpacing(float f10) {
        this.descriptionTextCharSpacing = f10;
    }

    public void setDocumentSideHintTextCharSpacing(float f10) {
        this.documentSideHintTextCharSpacing = f10;
    }

    public void setLoaderTextCharSpacing(float f10) {
        this.loaderTextCharSpacing = f10;
    }

    public void setNfcStatusTextCharSpacing(float f10) {
        this.nfcStatusTextCharSpacing = f10;
    }

    public void setPickerTextCharSpacing(float f10) {
        this.pickerTextCharSpacing = f10;
    }

    public void setPrimaryButtonTextCharSpacing(float f10) {
        this.primaryButtonTextCharSpacing = f10;
    }

    public void setRetakeMessageCharSpacing(float f10) {
        this.retakeMessageCharSpacing = f10;
    }

    public void setSecondaryButtonTextCharSpacing(float f10) {
        this.secondaryButtonTextCharSpacing = f10;
    }

    public void setStatementHelperTextCharSpacing(float f10) {
        this.statementHelperTextCharSpacing = f10;
    }

    public void setStatementTextCharSpacing(float f10) {
        this.statementTextCharSpacing = f10;
    }

    public void setStatusTextCharSpacing(float f10) {
        this.statusTextCharSpacing = f10;
    }

    public void setTitleTextCharSpacing(float f10) {
        this.titleTextCharSpacing = f10;
    }

    public String toString() {
        return "UICharacterSpacing(titleTextCharSpacing=" + getTitleTextCharSpacing() + ", descriptionTextCharSpacing=" + getDescriptionTextCharSpacing() + ", statusTextCharSpacing=" + getStatusTextCharSpacing() + ", documentSideHintTextCharSpacing=" + getDocumentSideHintTextCharSpacing() + ", retakeMessageCharSpacing=" + getRetakeMessageCharSpacing() + ", primaryButtonTextCharSpacing=" + getPrimaryButtonTextCharSpacing() + ", secondaryButtonTextCharSpacing=" + getSecondaryButtonTextCharSpacing() + ", alertTextBoxTextCharSpacing=" + getAlertTextBoxTextCharSpacing() + ", pickerTextCharSpacing=" + getPickerTextCharSpacing() + ", countryListItemTextCharSpacing=" + getCountryListItemTextCharSpacing() + ", countryListItemSelectedTextCharSpacing=" + getCountryListItemSelectedTextCharSpacing() + ", countrySearchTextCharSpacing=" + getCountrySearchTextCharSpacing() + ", statementHelperTextCharSpacing=" + getStatementHelperTextCharSpacing() + ", statementTextCharSpacing=" + getStatementTextCharSpacing() + ", loaderTextCharSpacing=" + getLoaderTextCharSpacing() + ", nfcStatusTextCharSpacing=" + getNfcStatusTextCharSpacing() + ", apiLoadingTitleTextCharSpacing=" + getApiLoadingTitleTextCharSpacing() + ", apiLoadingHintTextCharSpacing=" + getApiLoadingHintTextCharSpacing() + ")";
    }
}
