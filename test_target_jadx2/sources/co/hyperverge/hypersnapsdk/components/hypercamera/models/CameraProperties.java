package co.hyperverge.hypersnapsdk.components.hypercamera.models;

import androidx.camera.core.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CameraProperties {
    public byte[] data;
    public int height;
    public n imageProxy;
    public boolean isCapturedFramePreviewed;
    public boolean isFrontFacingCam;
    public int orientation;
    public byte[] rgbData;
    public long rgbDataLength;
    public int rotation;
    public int viewHeight;
    public int viewWidth;
    public int width;

    public CameraProperties(int i10, int i11, int i12, int i13, long j10, int i14, int i15, byte[] bArr, byte[] bArr2, n nVar, boolean z10, boolean z11) {
        this.width = i10;
        this.height = i11;
        this.viewWidth = i12;
        this.viewHeight = i13;
        this.rgbDataLength = j10;
        this.orientation = i14;
        this.rotation = i15;
        this.data = bArr;
        this.rgbData = bArr2;
        this.imageProxy = nVar;
        this.isFrontFacingCam = z10;
        this.isCapturedFramePreviewed = z11;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof CameraProperties;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraProperties)) {
            return false;
        }
        CameraProperties cameraProperties = (CameraProperties) obj;
        if (!cameraProperties.canEqual(this) || getWidth() != cameraProperties.getWidth() || getHeight() != cameraProperties.getHeight() || getViewWidth() != cameraProperties.getViewWidth() || getViewHeight() != cameraProperties.getViewHeight() || getRgbDataLength() != cameraProperties.getRgbDataLength() || getOrientation() != cameraProperties.getOrientation() || getRotation() != cameraProperties.getRotation() || isFrontFacingCam() != cameraProperties.isFrontFacingCam() || isCapturedFramePreviewed() != cameraProperties.isCapturedFramePreviewed() || !Arrays.equals(getData(), cameraProperties.getData()) || !Arrays.equals(getRgbData(), cameraProperties.getRgbData())) {
            return false;
        }
        n imageProxy = getImageProxy();
        n imageProxy2 = cameraProperties.getImageProxy();
        return imageProxy != null ? imageProxy.equals(imageProxy2) : imageProxy2 == null;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public n getImageProxy() {
        return this.imageProxy;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public byte[] getRgbData() {
        return this.rgbData;
    }

    public long getRgbDataLength() {
        return this.rgbDataLength;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getViewHeight() {
        return this.viewHeight;
    }

    public int getViewWidth() {
        return this.viewWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int width = ((((((getWidth() + 59) * 59) + getHeight()) * 59) + getViewWidth()) * 59) + getViewHeight();
        long rgbDataLength = getRgbDataLength();
        int orientation = (((((((((((((width * 59) + ((int) (rgbDataLength ^ (rgbDataLength >>> 32)))) * 59) + getOrientation()) * 59) + getRotation()) * 59) + (isFrontFacingCam() ? 79 : 97)) * 59) + (isCapturedFramePreviewed() ? 79 : 97)) * 59) + Arrays.hashCode(getData())) * 59) + Arrays.hashCode(getRgbData());
        n imageProxy = getImageProxy();
        return (orientation * 59) + (imageProxy == null ? 43 : imageProxy.hashCode());
    }

    public boolean isCapturedFramePreviewed() {
        return this.isCapturedFramePreviewed;
    }

    public boolean isFrontFacingCam() {
        return this.isFrontFacingCam;
    }

    public void setCapturedFramePreviewed(boolean z10) {
        this.isCapturedFramePreviewed = z10;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setFrontFacingCam(boolean z10) {
        this.isFrontFacingCam = z10;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setImageProxy(n nVar) {
        this.imageProxy = nVar;
    }

    public void setOrientation(int i10) {
        this.orientation = i10;
    }

    public void setRgbData(byte[] bArr) {
        this.rgbData = bArr;
    }

    public void setRgbDataLength(long j10) {
        this.rgbDataLength = j10;
    }

    public void setRotation(int i10) {
        this.rotation = i10;
    }

    public void setViewHeight(int i10) {
        this.viewHeight = i10;
    }

    public void setViewWidth(int i10) {
        this.viewWidth = i10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        return "CameraProperties(width=" + getWidth() + ", height=" + getHeight() + ", viewWidth=" + getViewWidth() + ", viewHeight=" + getViewHeight() + ", rgbDataLength=" + getRgbDataLength() + ", orientation=" + getOrientation() + ", rotation=" + getRotation() + ", data=" + Arrays.toString(getData()) + ", rgbData=" + Arrays.toString(getRgbData()) + ", imageProxy=" + getImageProxy() + ", isFrontFacingCam=" + isFrontFacingCam() + ", isCapturedFramePreviewed=" + isCapturedFramePreviewed() + ")";
    }

    public CameraProperties() {
        this.isCapturedFramePreviewed = false;
    }
}
