package co.hyperverge.hypersnapsdk.model;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.Serializable;

/* loaded from: classes.dex */
public class UIBorderRadius implements Serializable {
    private float primaryButtonRadius = 5.0f;
    private float secondaryButtonRadius = 5.0f;
    private float pickerBorderRadius = 5.0f;

    public void applyDimension(DisplayMetrics displayMetrics) {
        this.primaryButtonRadius = TypedValue.applyDimension(1, this.primaryButtonRadius, displayMetrics);
        this.secondaryButtonRadius = TypedValue.applyDimension(1, this.secondaryButtonRadius, displayMetrics);
        this.pickerBorderRadius = TypedValue.applyDimension(1, this.pickerBorderRadius, displayMetrics);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof UIBorderRadius;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UIBorderRadius)) {
            return false;
        }
        UIBorderRadius uIBorderRadius = (UIBorderRadius) obj;
        return uIBorderRadius.canEqual(this) && Float.compare(getPrimaryButtonRadius(), uIBorderRadius.getPrimaryButtonRadius()) == 0 && Float.compare(getSecondaryButtonRadius(), uIBorderRadius.getSecondaryButtonRadius()) == 0 && Float.compare(getPickerBorderRadius(), uIBorderRadius.getPickerBorderRadius()) == 0;
    }

    public float getPickerBorderRadius() {
        return this.pickerBorderRadius;
    }

    public float getPrimaryButtonRadius() {
        return this.primaryButtonRadius;
    }

    public float getSecondaryButtonRadius() {
        return this.secondaryButtonRadius;
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(getPrimaryButtonRadius()) + 59) * 59) + Float.floatToIntBits(getSecondaryButtonRadius())) * 59) + Float.floatToIntBits(getPickerBorderRadius());
    }

    public void setPickerBorderRadius(float f10) {
        this.pickerBorderRadius = f10;
    }

    public void setPrimaryButtonRadius(float f10) {
        this.primaryButtonRadius = f10;
    }

    public void setSecondaryButtonRadius(float f10) {
        this.secondaryButtonRadius = f10;
    }

    public String toString() {
        return "UIBorderRadius(primaryButtonRadius=" + getPrimaryButtonRadius() + ", secondaryButtonRadius=" + getSecondaryButtonRadius() + ", pickerBorderRadius=" + getPickerBorderRadius() + ")";
    }
}
