package co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services;

import androidx.camera.core.n;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import g9.C3201a;
import java.io.File;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b \u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0016\u001a\u00020\u00062\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H&¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H&¢\u0006\u0004\b-\u0010.J'\u00103\u001a\u00020\u00062\u0006\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020%2\u0006\u00102\u001a\u000201H&¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0004H&¢\u0006\u0004\b6\u0010\bJ\u000f\u00107\u001a\u000201H&¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b9\u0010!¨\u0006;"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/services/HyperCameraXHost;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "count", BuildConfig.FLAVOR, "onCamerasFound", "(I)V", "onPictureTaken", "Ljava/io/File;", "file", "onPictureSaved", "(Ljava/io/File;)V", BuildConfig.FLAVOR, "data", "onPictureReady", "([B)V", "onPictureFailed", BuildConfig.FLAVOR, "Lg9/a;", "faces", "onFaceDetection", "([Lg9/a;)V", "onLayoutChange", "onReady", "Landroidx/camera/core/n;", "imageProxy", "onNewPreviewFrame", "(Landroidx/camera/core/n;)V", "width", "height", "onViewDimensionChange", "(II)V", "onCameraFlipCallback", "getAspectRatio", "()I", BuildConfig.FLAVOR, "getPreviewMegapixels", "()F", "getPictureMegapixels", "getPhotoPath", "()Ljava/io/File;", "getPhotoDirectory", BuildConfig.FLAVOR, "getPhotoFilename", "()Ljava/lang/String;", "x", "y", BuildConfig.FLAVOR, "isVisible", "showCrossHair", "(FFZ)V", "zoomMax", "zoomMaxLevel", "isShouldCaptureHighResolutionImage", "()Z", "onPictureSizeSet", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HyperCameraXHost {
    private static final String TAG = "HyperCameraXHost";

    public abstract int getAspectRatio();

    public abstract File getPhotoDirectory();

    public abstract String getPhotoFilename();

    public final File getPhotoPath() {
        HVLogUtils.d(TAG, "getPhotoPath() called");
        File photoDirectory = getPhotoDirectory();
        if (photoDirectory != null) {
            photoDirectory.mkdirs();
        }
        return new File(photoDirectory, getPhotoFilename());
    }

    public abstract float getPictureMegapixels();

    public abstract float getPreviewMegapixels();

    public abstract boolean isShouldCaptureHighResolutionImage();

    public abstract void onCameraFlipCallback();

    public abstract void onCamerasFound(int count);

    public abstract void onFaceDetection(C3201a[] faces);

    public abstract void onLayoutChange();

    public abstract void onNewPreviewFrame(n imageProxy);

    public abstract void onPictureFailed();

    public abstract void onPictureReady(byte[] data);

    public abstract void onPictureSaved(File file);

    public abstract void onPictureSizeSet(int width, int height);

    public abstract void onPictureTaken();

    public abstract void onReady();

    public abstract void onViewDimensionChange(int width, int height);

    public abstract void showCrossHair(float x10, float y10, boolean isVisible);

    public abstract void zoomMaxLevel(int zoomMax);
}
