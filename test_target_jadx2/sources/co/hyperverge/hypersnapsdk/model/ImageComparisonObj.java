package co.hyperverge.hypersnapsdk.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ImageComparisonObj {
    private float blueChannelDistance;
    private int captureHeight;
    private int captureWidth;
    private float greenChannelDistance;
    private int imageHeight;
    private int imageWidth;
    private float redChannelDistance;
    private float similarityScore;
    private List<Integer> frameDistanceValue = new ArrayList();
    private List<Long> frameDataLength = new ArrayList(Collections.nCopies(10, 0L));

    protected boolean canEqual(Object obj) {
        return obj instanceof ImageComparisonObj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageComparisonObj)) {
            return false;
        }
        ImageComparisonObj imageComparisonObj = (ImageComparisonObj) obj;
        if (!imageComparisonObj.canEqual(this) || Float.compare(getRedChannelDistance(), imageComparisonObj.getRedChannelDistance()) != 0 || Float.compare(getGreenChannelDistance(), imageComparisonObj.getGreenChannelDistance()) != 0 || Float.compare(getBlueChannelDistance(), imageComparisonObj.getBlueChannelDistance()) != 0 || Float.compare(getSimilarityScore(), imageComparisonObj.getSimilarityScore()) != 0 || getCaptureWidth() != imageComparisonObj.getCaptureWidth() || getCaptureHeight() != imageComparisonObj.getCaptureHeight() || getImageWidth() != imageComparisonObj.getImageWidth() || getImageHeight() != imageComparisonObj.getImageHeight()) {
            return false;
        }
        List<Integer> frameDistanceValue = getFrameDistanceValue();
        List<Integer> frameDistanceValue2 = imageComparisonObj.getFrameDistanceValue();
        if (frameDistanceValue != null ? !frameDistanceValue.equals(frameDistanceValue2) : frameDistanceValue2 != null) {
            return false;
        }
        List<Long> frameDataLength = getFrameDataLength();
        List<Long> frameDataLength2 = imageComparisonObj.getFrameDataLength();
        return frameDataLength != null ? frameDataLength.equals(frameDataLength2) : frameDataLength2 == null;
    }

    public float getBlueChannelDistance() {
        return this.blueChannelDistance;
    }

    public int getCaptureHeight() {
        return this.captureHeight;
    }

    public int getCaptureWidth() {
        return this.captureWidth;
    }

    public List<Long> getFrameDataLength() {
        return this.frameDataLength;
    }

    public List<Integer> getFrameDistanceValue() {
        return this.frameDistanceValue;
    }

    public float getGreenChannelDistance() {
        return this.greenChannelDistance;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public float getRedChannelDistance() {
        return this.redChannelDistance;
    }

    public float getSimilarityScore() {
        return this.similarityScore;
    }

    public int hashCode() {
        int floatToIntBits = ((((((((((((((Float.floatToIntBits(getRedChannelDistance()) + 59) * 59) + Float.floatToIntBits(getGreenChannelDistance())) * 59) + Float.floatToIntBits(getBlueChannelDistance())) * 59) + Float.floatToIntBits(getSimilarityScore())) * 59) + getCaptureWidth()) * 59) + getCaptureHeight()) * 59) + getImageWidth()) * 59) + getImageHeight();
        List<Integer> frameDistanceValue = getFrameDistanceValue();
        int hashCode = (floatToIntBits * 59) + (frameDistanceValue == null ? 43 : frameDistanceValue.hashCode());
        List<Long> frameDataLength = getFrameDataLength();
        return (hashCode * 59) + (frameDataLength != null ? frameDataLength.hashCode() : 43);
    }

    public void setBlueChannelDistance(float f10) {
        this.blueChannelDistance = f10;
    }

    public void setCaptureHeight(int i10) {
        this.captureHeight = i10;
    }

    public void setCaptureWidth(int i10) {
        this.captureWidth = i10;
    }

    public void setFrameDataLength(List<Long> list) {
        this.frameDataLength = list;
    }

    public void setFrameDistanceValue(List<Integer> list) {
        this.frameDistanceValue = list;
    }

    public void setGreenChannelDistance(float f10) {
        this.greenChannelDistance = f10;
    }

    public void setImageHeight(int i10) {
        this.imageHeight = i10;
    }

    public void setImageWidth(int i10) {
        this.imageWidth = i10;
    }

    public void setRedChannelDistance(float f10) {
        this.redChannelDistance = f10;
    }

    public void setSimilarityScore(float f10) {
        this.similarityScore = f10;
    }

    public String toString() {
        return "ImageComparisonObj(redChannelDistance=" + getRedChannelDistance() + ", greenChannelDistance=" + getGreenChannelDistance() + ", blueChannelDistance=" + getBlueChannelDistance() + ", similarityScore=" + getSimilarityScore() + ", frameDistanceValue=" + getFrameDistanceValue() + ", frameDataLength=" + getFrameDataLength() + ", captureWidth=" + getCaptureWidth() + ", captureHeight=" + getCaptureHeight() + ", imageWidth=" + getImageWidth() + ", imageHeight=" + getImageHeight() + ")";
    }
}
