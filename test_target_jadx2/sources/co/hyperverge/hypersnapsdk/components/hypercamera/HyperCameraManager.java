package co.hyperverge.hypersnapsdk.components.hypercamera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.core.n;
import androidx.camera.view.m;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hypersnapsdk.activities.HVFaceActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.HyperCameraX;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.models.HyperCameraXConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraManagerConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraPosition;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraSelector;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import g9.C3201a;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J%\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0012J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0012J\u0015\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020(¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/hypercamera/HyperCameraManager;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Landroid/app/Activity;", "activity", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraManagerConfig;", "hyperCameraManagerConfig", "Lco/hyperverge/hypersnapsdk/components/hypercamera/HyperCameraManagerHost;", "hyperCameraManagerHost", "<init>", "(Landroid/content/Context;Landroid/app/Activity;Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraManagerConfig;Lco/hyperverge/hypersnapsdk/components/hypercamera/HyperCameraManagerHost;)V", "Landroid/view/View;", "setupCameraView", "()Landroid/view/View;", "getCameraView", BuildConfig.FLAVOR, "resumeCamera", "()V", "pauseCamera", "stopCamera", "flipCamera", "takePicture", "startAccelerometer", "nextFlashMode", "Landroid/view/MotionEvent;", Keys.EVENT, BuildConfig.FLAVOR, "camViewWidth", "camViewHeight", "onTouchToFocus", "(Landroid/view/MotionEvent;II)V", "onPause", "onResume", "clearHandlers", "resetZoom", BuildConfig.FLAVOR, "level", "setDefaultZoom", "(F)V", BuildConfig.FLAVOR, "shouldUse", "setShouldUseDefaultZoom", "(Z)V", "isCameraReleased", "()Z", "Landroid/content/Context;", "Landroid/app/Activity;", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/HyperCameraManagerConfig;", "Lco/hyperverge/hypersnapsdk/components/hypercamera/HyperCameraManagerHost;", "Lco/hyperverge/hvcamera/HVMagicView;", "hvCameraView", "Lco/hyperverge/hvcamera/HVMagicView;", "Landroidx/camera/view/m;", "hyperCameraXView", "Landroidx/camera/view/m;", "Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/HyperCameraX;", "hyperCameraX", "Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/HyperCameraX;", "shouldUseCameraX", "Z", "Lco/hyperverge/hvcamera/HVCamHost;", "hvCameraHost", "Lco/hyperverge/hvcamera/HVCamHost;", "Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/services/HyperCameraXHost;", "hyperCameraXHost", "Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/services/HyperCameraXHost;", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HyperCameraManager {
    public static final int ASPECT_16_9 = 2;
    public static final int ASPECT_4_3 = 1;
    private static final String TAG = "HyperCameraManager";
    private final Activity activity;
    private final Context context;
    private final HVCamHost hvCameraHost;
    private HVMagicView hvCameraView;
    private final HyperCameraManagerConfig hyperCameraManagerConfig;
    private final HyperCameraManagerHost hyperCameraManagerHost;
    private HyperCameraX hyperCameraX;
    private final HyperCameraXHost hyperCameraXHost;
    private m hyperCameraXView;
    private final boolean shouldUseCameraX;

    public HyperCameraManager(Context context, Activity activity, HyperCameraManagerConfig hyperCameraManagerConfig, HyperCameraManagerHost hyperCameraManagerHost) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(hyperCameraManagerConfig, "hyperCameraManagerConfig");
        Intrinsics.checkNotNullParameter(hyperCameraManagerHost, "hyperCameraManagerHost");
        this.context = context;
        this.activity = activity;
        this.hyperCameraManagerConfig = hyperCameraManagerConfig;
        this.hyperCameraManagerHost = hyperCameraManagerHost;
        this.shouldUseCameraX = hyperCameraManagerConfig.getCamera() == HyperCameraSelector.CAMERAX;
        this.hvCameraHost = new HVCamHost() { // from class: co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManager$hvCameraHost$1
            @Override // co.hyperverge.hvcamera.HVCamHost
            public void flashScreen() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.flashScreen();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public int getAspectRatio() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getAspectRatio();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void getCurrentVideoLength(long p02) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.getCurrentVideoLength(p02);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public File getPhotoDirectory() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPhotoDirectory();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public String getPhotoFilename() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPhotoFilename();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public File getPhotoPath() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPhotoPath();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public float getPictureMegapixels() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPictureMegapixels();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public float getPreviewMegapixels() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPreviewMegapixels();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public String getVideoFilename() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getVideoFilename();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public boolean isShouldCaptureHighResolutionImage() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.isShouldCaptureHighResolutionImage();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onCameraFlipCallback() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onCameraFlipCallback();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onCamerasFound(int count) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onCamerasFound(count);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFaceDetection(Camera.Face[] p02) {
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFilterMode(int p02, String p12) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                Intrinsics.checkNotNullParameter(p12, "p1");
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onFilterMode(p02, p12);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFlashAuto() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onFlashAuto();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFlashNull() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onFlashNull();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFlashOff() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onFlashOff();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFlashOn() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onFlashOn();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onFlashTorchOn() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onFlashTorchOn();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onLayoutChange() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onLayoutChange();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onNewPreviewFrame(byte[] p02, int p12, int p22, int p32, int p42, byte[] p52) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onNewPreviewFrame(p02, p12, p22, p32, p42, p52);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onPictureFailed() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureFailed();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onPictureReady(byte[] byteArray) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureReady(byteArray);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onPictureSaved(File p02) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                Intrinsics.checkNotNullParameter(p02, "p0");
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureSaved(p02);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onPictureSizeSet(int p02, int p12) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureSizeSet(p02, p12);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onPictureTaken() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureTaken();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onReady() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onReady();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onVideoSaved(File p02) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                Intrinsics.checkNotNullParameter(p02, "p0");
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onVideoSaved(p02);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void onViewDimensionChange(int p02, int p12) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onViewDimensionChange(p02, p12);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void setScreenFlashOff() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.setScreenFlashOff();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void setScreenFlashOn() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.setScreenFlashOn();
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void showCrossHair(float p02, float p12, boolean p22) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.showCrossHair(p02, p12, p22);
            }

            @Override // co.hyperverge.hvcamera.HVCamHost
            public void zoomMaxLevel(int p02) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.zoomMaxLevel(p02);
            }
        };
        this.hyperCameraXHost = new HyperCameraXHost() { // from class: co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManager$hyperCameraXHost$1
            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public int getAspectRatio() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getAspectRatio();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public File getPhotoDirectory() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPhotoDirectory();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public String getPhotoFilename() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPhotoFilename();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public float getPictureMegapixels() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPictureMegapixels();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public float getPreviewMegapixels() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.getPreviewMegapixels();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public boolean isShouldCaptureHighResolutionImage() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                return hyperCameraManagerHost2.isShouldCaptureHighResolutionImage();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onCameraFlipCallback() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onCameraFlipCallback();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onCamerasFound(int count) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onCamerasFound(count);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onLayoutChange() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onLayoutChange();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onNewPreviewFrame(n imageProxy) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onNewPreviewFrame(imageProxy);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onPictureFailed() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureFailed();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onPictureReady(byte[] data) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureReady(data);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onPictureSaved(File file) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                Intrinsics.checkNotNullParameter(file, "file");
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureSaved(file);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onPictureSizeSet(int width, int height) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureSizeSet(width, height);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onPictureTaken() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onPictureTaken();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onReady() {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onReady();
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onViewDimensionChange(int width, int height) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.onViewDimensionChange(width, height);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void showCrossHair(float x10, float y10, boolean isVisible) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.showCrossHair(x10, y10, isVisible);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void zoomMaxLevel(int zoomMax) {
                HyperCameraManagerHost hyperCameraManagerHost2;
                hyperCameraManagerHost2 = HyperCameraManager.this.hyperCameraManagerHost;
                hyperCameraManagerHost2.zoomMaxLevel(zoomMax);
            }

            @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
            public void onFaceDetection(C3201a[] faces) {
            }
        };
    }

    private static final View setupCameraView$setupCameraXView(HyperCameraManager hyperCameraManager) {
        m mVar = new m(hyperCameraManager.context);
        Activity activity = hyperCameraManager.activity;
        Intrinsics.e(activity, "null cannot be cast to non-null type co.hyperverge.hypersnapsdk.activities.HVFaceActivity");
        mVar.setContentDescription(((HVFaceActivity) activity).camViewTag);
        hyperCameraManager.hyperCameraXView = mVar;
        Context context = hyperCameraManager.context;
        m mVar2 = hyperCameraManager.hyperCameraXView;
        Intrinsics.d(mVar2);
        HyperCameraX hyperCameraX = new HyperCameraX(context, mVar2, hyperCameraManager.hyperCameraXHost, new HyperCameraXConfig(hyperCameraManager.hyperCameraManagerConfig.getCameraPosition(), hyperCameraManager.hyperCameraManagerConfig.getDefaultZoom(), hyperCameraManager.hyperCameraManagerConfig.getHyperPreviewConfig()));
        hyperCameraX.startCamera();
        hyperCameraManager.hyperCameraX = hyperCameraX;
        m mVar3 = hyperCameraManager.hyperCameraXView;
        Intrinsics.d(mVar3);
        return mVar3;
    }

    private static final View setupCameraView$setupLegacyCameraView(HyperCameraManager hyperCameraManager) {
        HVMagicView hVMagicView = HVMagicView.getInstance(hyperCameraManager.context, hyperCameraManager.hvCameraHost, hyperCameraManager.hyperCameraManagerConfig.getCameraPosition() == HyperCameraPosition.FRONT);
        hVMagicView.disableRotation();
        Activity activity = hyperCameraManager.activity;
        Intrinsics.e(activity, "null cannot be cast to non-null type co.hyperverge.hypersnapsdk.activities.HVFaceActivity");
        hVMagicView.setContentDescription(((HVFaceActivity) activity).camViewTag);
        hyperCameraManager.hvCameraView = hVMagicView;
        Point point = new Point();
        Display defaultDisplay = hyperCameraManager.activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "activity.windowManager.defaultDisplay");
        defaultDisplay.getSize(point);
        CameraEngine.setScreenSize(point);
        CameraEngine.setPreviewCallback(hyperCameraManager.hyperCameraManagerConfig.getHyperPreviewConfig().getNeedPreviewCallback());
        CameraEngine.setCaptureMode(true);
        Size lastUsedCameraResolution = SPHelper.getLastUsedCameraResolution();
        CameraEngine.setLastUsedResolution(lastUsedCameraResolution.getWidth(), lastUsedCameraResolution.getHeight());
        CameraEngine.setShouldRandomize(hyperCameraManager.hyperCameraManagerConfig.getHyperPreviewConfig().getRandomiseResolution());
        if (hyperCameraManager.hyperCameraManagerConfig.getHyperPreviewConfig().getEnhancedFeatures()) {
            CameraEngine.setUseEnhancedCameraFeatures(true);
        }
        HVMagicView hVMagicView2 = hyperCameraManager.hvCameraView;
        Intrinsics.d(hVMagicView2);
        return hVMagicView2;
    }

    public final void clearHandlers() {
        if (this.shouldUseCameraX) {
            return;
        }
        HVMagicView hVMagicView = this.hvCameraView;
        if (hVMagicView != null) {
            hVMagicView.clearHandlers();
        }
        this.hvCameraView = null;
    }

    public final void flipCamera() {
        if (this.shouldUseCameraX) {
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.flipCamera();
                return;
            }
            return;
        }
        HVMagicView hVMagicView = this.hvCameraView;
        if (hVMagicView != null) {
            hVMagicView.rotateCamera();
        }
    }

    public final View getCameraView() {
        return this.shouldUseCameraX ? this.hyperCameraXView : this.hvCameraView;
    }

    public final boolean isCameraReleased() {
        if (this.shouldUseCameraX) {
            return true;
        }
        return CameraEngine.isCameraReleased();
    }

    public final void nextFlashMode() {
        HVMagicView hVMagicView;
        if (this.shouldUseCameraX || (hVMagicView = this.hvCameraView) == null) {
            return;
        }
        hVMagicView.nextFlashMode();
    }

    public final void onPause() {
        HVMagicView hVMagicView;
        if (this.shouldUseCameraX || (hVMagicView = this.hvCameraView) == null) {
            return;
        }
        hVMagicView.onPause();
    }

    public final void onResume() {
        HVMagicView hVMagicView;
        if (this.shouldUseCameraX || (hVMagicView = this.hvCameraView) == null) {
            return;
        }
        hVMagicView.onResume();
    }

    public final void onTouchToFocus(MotionEvent event, int camViewWidth, int camViewHeight) {
        HVMagicView hVMagicView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.shouldUseCameraX || (hVMagicView = this.hvCameraView) == null) {
            return;
        }
        hVMagicView.onTouchToFocus(event.getX() / camViewWidth, event.getY() / camViewHeight, null);
    }

    public final void pauseCamera() {
        if (this.shouldUseCameraX) {
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.pauseCamera();
                return;
            }
            return;
        }
        HVMagicView hVMagicView = this.hvCameraView;
        if (hVMagicView != null) {
            hVMagicView.onPause();
        }
    }

    public final void resetZoom() {
        if (this.hyperCameraManagerConfig.getDefaultZoom().getUseZoom()) {
            if (!this.shouldUseCameraX) {
                CameraEngine.resetZoom();
                return;
            }
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.resetZoom();
            }
        }
    }

    public final void resumeCamera() {
        if (this.shouldUseCameraX) {
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.resumeCamera();
                return;
            }
            return;
        }
        HVMagicView hVMagicView = this.hvCameraView;
        if (hVMagicView != null) {
            hVMagicView.onResume();
        }
    }

    public final void setDefaultZoom(float level) {
        if (this.shouldUseCameraX) {
            return;
        }
        CameraEngine.setDefaultZoom(level);
    }

    public final void setShouldUseDefaultZoom(boolean shouldUse) {
        if (this.shouldUseCameraX) {
            return;
        }
        CameraEngine.setShouldUseDefaultZoom(shouldUse);
    }

    public final View setupCameraView() {
        return this.shouldUseCameraX ? setupCameraView$setupCameraXView(this) : setupCameraView$setupLegacyCameraView(this);
    }

    public final void startAccelerometer() {
        HVMagicView hVMagicView;
        if (this.shouldUseCameraX || (hVMagicView = this.hvCameraView) == null) {
            return;
        }
        hVMagicView.startAccelerometer();
    }

    public final void stopCamera() {
        if (this.shouldUseCameraX) {
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.destroyCamera();
                return;
            }
            return;
        }
        HVMagicView hVMagicView = this.hvCameraView;
        if (hVMagicView != null) {
            hVMagicView.setSensorCallback(null);
            hVMagicView.onDestroy();
            hVMagicView.onPause();
        }
    }

    public final void takePicture() {
        if (this.shouldUseCameraX) {
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.takePicture(null);
                Unit unit = Unit.f36324a;
                return;
            }
            return;
        }
        HVMagicView hVMagicView = this.hvCameraView;
        if (hVMagicView != null) {
            hVMagicView.takePicture(null);
            Unit unit2 = Unit.f36324a;
        }
    }
}
