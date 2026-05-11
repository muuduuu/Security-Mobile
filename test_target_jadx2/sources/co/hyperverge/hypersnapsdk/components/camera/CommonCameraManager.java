package co.hyperverge.hypersnapsdk.components.camera;

import android.util.Log;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.HyperCameraX;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/camera/CommonCameraManager;", BuildConfig.FLAVOR, "hvCamera", "Lco/hyperverge/hvcamera/HVMagicView;", "hyperCameraX", "Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/HyperCameraX;", "(Lco/hyperverge/hvcamera/HVMagicView;Lco/hyperverge/hypersnapsdk/components/hypercamera/cameras/camerax/HyperCameraX;)V", "isCameraReleased", BuildConfig.FLAVOR, "pauseCamera", BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "resumeCamera", "startCamera", "stopCamera", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonCameraManager {
    private static final String TAG = "CommonCameraManager";
    private HVMagicView hvCamera;
    private HyperCameraX hyperCameraX;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonCameraManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean isCameraReleased() {
        if (this.hvCamera != null) {
            return CameraEngine.isCameraReleased();
        }
        return true;
    }

    public final void pauseCamera(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            HVMagicView hVMagicView = this.hvCamera;
            if (hVMagicView != null) {
                hVMagicView.onPause();
            }
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.pauseCamera();
            }
        } catch (Exception e10) {
            HVLogUtils.e(tag, "onPause(): exception = [" + Utils.getErrorMessage(e10) + ']', e10);
            Log.e(tag, Utils.getErrorMessage(e10));
        }
    }

    public final void resumeCamera(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            HVMagicView hVMagicView = this.hvCamera;
            if (hVMagicView != null) {
                hVMagicView.onResume();
            }
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.resumeCamera();
            }
        } catch (Exception e10) {
            HVLogUtils.e(tag, "onResume(): exception = [" + Utils.getErrorMessage(e10) + ']', e10);
            Log.e(tag, Utils.getErrorMessage(e10));
        }
    }

    public final void startCamera(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            HVMagicView hVMagicView = this.hvCamera;
            if (hVMagicView != null) {
                hVMagicView.onResume();
            }
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.startCamera();
            }
        } catch (Exception e10) {
            HVLogUtils.e(tag, "startCamera(): exception = [" + Utils.getErrorMessage(e10) + ']', e10);
            Log.e(tag, Utils.getErrorMessage(e10));
        }
    }

    public final void stopCamera(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            HVMagicView hVMagicView = this.hvCamera;
            if (hVMagicView != null) {
                hVMagicView.onDestroy();
            }
            HVMagicView hVMagicView2 = this.hvCamera;
            if (hVMagicView2 != null) {
                hVMagicView2.onPause();
            }
            HyperCameraX hyperCameraX = this.hyperCameraX;
            if (hyperCameraX != null) {
                hyperCameraX.destroyCamera();
            }
        } catch (Exception e10) {
            HVLogUtils.e(tag, "stopCamera(): exception = [" + Utils.getErrorMessage(e10) + ']', e10);
            Log.e(tag, Utils.getErrorMessage(e10));
        }
    }

    public CommonCameraManager(HVMagicView hVMagicView, HyperCameraX hyperCameraX) {
        this.hvCamera = hVMagicView;
        this.hyperCameraX = hyperCameraX;
    }

    public /* synthetic */ CommonCameraManager(HVMagicView hVMagicView, HyperCameraX hyperCameraX, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : hVMagicView, (i10 & 2) != 0 ? null : hyperCameraX);
    }
}
