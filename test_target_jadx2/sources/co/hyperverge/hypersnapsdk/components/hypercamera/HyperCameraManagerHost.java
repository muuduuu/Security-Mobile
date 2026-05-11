package co.hyperverge.hypersnapsdk.components.hypercamera;

import androidx.camera.core.n;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import g9.C3201a;
import java.io.File;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b \u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0016\u001a\u00020\u00062\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\u001c\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u001c\u0010#J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H&¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H&¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\n¢\u0006\u0004\b3\u0010.J\u000f\u00104\u001a\u000200H&¢\u0006\u0004\b4\u00102J\u0017\u00105\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b5\u0010\rJ\u000f\u00106\u001a\u00020\u0006H&¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u0006H&¢\u0006\u0004\b7\u0010\u0003J\u000f\u00108\u001a\u00020\u0006H&¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\u0006H&¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\u0006H&¢\u0006\u0004\b:\u0010\u0003J\u001f\u0010=\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u000200H&¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0006H&¢\u0006\u0004\bC\u0010\u0003J\u000f\u0010D\u001a\u00020\u0006H&¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010E\u001a\u00020\u0006H&¢\u0006\u0004\bE\u0010\u0003J'\u0010J\u001a\u00020\u00062\u0006\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020)2\u0006\u0010I\u001a\u00020HH&¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0004H&¢\u0006\u0004\bM\u0010\bJ\u000f\u0010N\u001a\u00020HH&¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\bP\u0010%¨\u0006R"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/HyperCameraManagerHost;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "count", BuildConfig.FLAVOR, "onCamerasFound", "(I)V", "onPictureTaken", "Ljava/io/File;", "file", "onPictureSaved", "(Ljava/io/File;)V", BuildConfig.FLAVOR, "data", "onPictureReady", "([B)V", "onPictureFailed", BuildConfig.FLAVOR, "Lg9/a;", "faces", "onFaceDetection", "([Lg9/a;)V", "onLayoutChange", "onReady", "Landroidx/camera/core/n;", "imageProxy", "onNewPreviewFrame", "(Landroidx/camera/core/n;)V", "width", "height", "orientation", "mRotation", "rgbData", "([BIIII[B)V", "onViewDimensionChange", "(II)V", "onCameraFlipCallback", "getAspectRatio", "()I", BuildConfig.FLAVOR, "getPreviewMegapixels", "()F", "getPictureMegapixels", "getPhotoPath", "()Ljava/io/File;", "getPhotoDirectory", BuildConfig.FLAVOR, "getPhotoFilename", "()Ljava/lang/String;", "getVideoPath", "getVideoFilename", "onVideoSaved", "onFlashNull", "onFlashOff", "onFlashOn", "onFlashAuto", "onFlashTorchOn", "mode", "description", "onFilterMode", "(ILjava/lang/String;)V", BuildConfig.FLAVOR, "length", "getCurrentVideoLength", "(J)V", "flashScreen", "setScreenFlashOff", "setScreenFlashOn", "x", "y", BuildConfig.FLAVOR, "isVisible", "showCrossHair", "(FFZ)V", "zoomMax", "zoomMaxLevel", "isShouldCaptureHighResolutionImage", "()Z", "onPictureSizeSet", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HyperCameraManagerHost {
    private static final String TAG = "HyperCameraManagerHost";

    public abstract void flashScreen();

    public abstract int getAspectRatio();

    public abstract void getCurrentVideoLength(long length);

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

    public abstract String getVideoFilename();

    public final File getVideoPath() {
        HVLogUtils.d(TAG, "getVideoPath() called");
        File photoDirectory = getPhotoDirectory();
        if (photoDirectory != null) {
            photoDirectory.mkdirs();
        }
        return new File(photoDirectory, getVideoFilename());
    }

    public abstract boolean isShouldCaptureHighResolutionImage();

    public abstract void onCameraFlipCallback();

    public abstract void onCamerasFound(int count);

    public abstract void onFaceDetection(C3201a[] faces);

    public abstract void onFilterMode(int mode, String description);

    public abstract void onFlashAuto();

    public abstract void onFlashNull();

    public abstract void onFlashOff();

    public abstract void onFlashOn();

    public abstract void onFlashTorchOn();

    public abstract void onLayoutChange();

    public abstract void onNewPreviewFrame(n imageProxy);

    public abstract void onNewPreviewFrame(byte[] data, int width, int height, int orientation, int mRotation, byte[] rgbData);

    public abstract void onPictureFailed();

    public abstract void onPictureReady(byte[] data);

    public abstract void onPictureSaved(File file);

    public abstract void onPictureSizeSet(int width, int height);

    public abstract void onPictureTaken();

    public abstract void onReady();

    public abstract void onVideoSaved(File file);

    public abstract void onViewDimensionChange(int width, int height);

    public abstract void setScreenFlashOff();

    public abstract void setScreenFlashOn();

    public abstract void showCrossHair(float x10, float y10, boolean isVisible);

    public abstract void zoomMaxLevel(int zoomMax);
}
