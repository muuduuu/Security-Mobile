package co.hyperverge.hvcamera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.View;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay;
import co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2;
import co.hyperverge.hvcamera.magicfilter.display.MagicDisplay;
import co.hyperverge.hvcamera.magicfilter.filter.helper.MagicFilterType;
import co.hyperverge.hvcamera.sensor.AccelerometerEngine;
import java.io.File;

/* loaded from: classes.dex */
public class HVMagicView extends GLTextureView {
    private static final String LOG_TAG = "co.hyperverge.hvcamera.HVMagicView";
    public static HVCamHost camHost = null;
    private static HVMagicView instance = null;
    private static int mRatioHeight = 4;
    private static int mRatioWidth = 3;
    private AccelerometerEngine accelerometerEngine;
    int filterType;
    private MagicDisplay magicDisplay;
    private OnOrientationChange orientationChange;
    private boolean rotationDisabled;

    /* renamed from: s, reason: collision with root package name */
    Camera.ShutterCallback f19503s;

    private class OnOrientationChange extends OrientationEventListener {
        public OnOrientationChange(Context context) {
            super(context);
            disable();
        }

        @Override // android.view.OrientationEventListener
        public void disable() {
            super.disable();
        }

        @Override // android.view.OrientationEventListener
        public void enable() {
            super.enable();
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            try {
                CameraEngine.setOrientation(i10);
            } catch (Throwable th) {
                Log.d(HVMagicView.LOG_TAG, th.getMessage());
            }
        }
    }

    public interface SensorCallback {
        void onSensorCallback();
    }

    private HVMagicView(Context context, HVCamHost hVCamHost, boolean z10) {
        super(context);
        this.rotationDisabled = false;
        this.f19503s = new Camera.ShutterCallback() { // from class: co.hyperverge.hvcamera.HVMagicView.3
            @Override // android.hardware.Camera.ShutterCallback
            public void onShutter() {
                try {
                    HVCamHost hVCamHost2 = HVMagicView.camHost;
                    if (hVCamHost2 != null) {
                        hVCamHost2.flashScreen();
                    }
                } catch (Exception e10) {
                    Log.d(HVMagicView.LOG_TAG, e10.getMessage());
                }
            }
        };
        this.filterType = 0;
        camHost = hVCamHost;
        hVCamHost.onCamerasFound(Camera.getNumberOfCameras());
        CameraEngine.init(context, z10);
        this.accelerometerEngine = new AccelerometerEngine(context, 9);
        if (CameraEngine.isCamera2(context)) {
            this.magicDisplay = new MagicCameraDisplay2(this);
        } else {
            this.magicDisplay = new MagicCameraDisplay(this);
        }
        updateRatios();
        OnOrientationChange onOrientationChange = new OnOrientationChange(context);
        this.orientationChange = onOrientationChange;
        onOrientationChange.enable();
    }

    public static void fallBackAspectRatio() {
        mRatioWidth = 3;
        mRatioHeight = 4;
        if (instance != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hvcamera.HVMagicView.1
                @Override // java.lang.Runnable
                public void run() {
                    HVMagicView.instance.requestLayout();
                }
            });
        }
    }

    public static int getAspectRatio() {
        return mRatioHeight == 4 ? 1 : 2;
    }

    public static HVMagicView getInstance(Context context, HVCamHost hVCamHost, boolean z10) {
        HVMagicView hVMagicView = new HVMagicView(context, hVCamHost, z10);
        instance = hVMagicView;
        return hVMagicView;
    }

    public static int getmRatioHeight() {
        return mRatioHeight;
    }

    public static int getmRatioWidth() {
        return mRatioWidth;
    }

    public static void reLayout() {
        HVMagicView hVMagicView = instance;
        if (hVMagicView != null) {
            hVMagicView.requestLayout();
        }
    }

    public static void updateRatios() {
        HVCamHost hVCamHost = camHost;
        if (hVCamHost != null) {
            if (hVCamHost.getAspectRatio() == 1) {
                mRatioWidth = 3;
                mRatioHeight = 4;
            } else if (camHost.getAspectRatio() == 2) {
                mRatioWidth = 9;
                mRatioHeight = 16;
            }
        }
    }

    public void autoFocusOnly() {
    }

    public void clearHandlers() {
        MagicDisplay magicDisplay = this.magicDisplay;
        if (magicDisplay != null) {
            magicDisplay.clearHandlers();
        }
    }

    public void destroyGL() {
        super.onPause();
    }

    public void disableRotation() {
        this.orientationChange.disable();
        this.rotationDisabled = true;
        CameraEngine.setOrientation(0);
    }

    public HVCamHost getCamHost() {
        return camHost;
    }

    public void nextFlashMode() {
        CameraEngine.nextFlashMode();
    }

    public void onCameraChanged() {
        this.magicDisplay.onCameraChanged();
    }

    public void onDestroy() {
        queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.HVMagicView.2
            @Override // java.lang.Runnable
            public void run() {
                if (HVMagicView.this.magicDisplay != null) {
                    HVMagicView.this.magicDisplay.onDestroy();
                }
            }
        });
        destroyGL();
        instance = null;
        camHost = null;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = mRatioWidth;
        if (i13 == 0 || (i12 = mRatioHeight) == 0) {
            setMeasuredDimension(size, size2);
            HVCamHost hVCamHost = camHost;
            if (hVCamHost != null) {
                hVCamHost.onViewDimensionChange(size, size2);
                return;
            }
            return;
        }
        setMeasuredDimension(size, (i12 * size) / i13);
        HVCamHost hVCamHost2 = camHost;
        if (hVCamHost2 != null) {
            hVCamHost2.onViewDimensionChange(size, (mRatioHeight * size) / mRatioWidth);
        }
    }

    @Override // co.hyperverge.hvcamera.GLTextureView
    public void onPause() {
        MagicDisplay magicDisplay = this.magicDisplay;
        if (magicDisplay != null) {
            magicDisplay.onPause();
        }
        removeCallbacks(null);
        this.orientationChange.disable();
        this.accelerometerEngine.stop();
    }

    @Override // co.hyperverge.hvcamera.GLTextureView
    public void onResume() {
        super.onResume();
        if (!this.rotationDisabled) {
            this.orientationChange.enable();
        }
        this.accelerometerEngine.start();
        MagicDisplay magicDisplay = this.magicDisplay;
        if (magicDisplay != null) {
            magicDisplay.onResume();
        }
    }

    public void onTouchToFocus(float f10, float f11, Camera.AutoFocusCallback autoFocusCallback) {
        this.magicDisplay.setTouchEvent(f10, f11, autoFocusCallback);
        this.accelerometerEngine.touchEventRunning();
    }

    public void resumeGL() {
        super.onResume();
    }

    public void rotateCamera() {
        this.magicDisplay.onCameraFlip();
    }

    public void setCamHost(HVCamHost hVCamHost) {
        camHost = hVCamHost;
    }

    public void setFilter(int i10) {
        this.filterType = i10;
        this.magicDisplay.setFilter(i10);
        HVCamHost hVCamHost = camHost;
        if (hVCamHost != null) {
            hVCamHost.onFilterMode(i10, MagicFilterType.filterTypeToNameString(getContext(), i10));
        }
    }

    public void setSensorCallback(SensorCallback sensorCallback) {
        this.accelerometerEngine.setCallback(sensorCallback);
    }

    public void startAccelerometer() {
        this.accelerometerEngine.start();
    }

    public void stopAccelerometer() {
        this.accelerometerEngine.stop();
    }

    @Override // co.hyperverge.hvcamera.GLTextureView
    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
        super.surfaceDestroyed(surfaceTexture);
        Log.i(LOG_TAG, "destroyed");
        this.magicDisplay.onDestroy();
    }

    public void takePicture(String str) {
        HVCamHost hVCamHost;
        this.accelerometerEngine.stop();
        if (str != null || (hVCamHost = camHost) == null) {
            this.magicDisplay.onTakePicture(new File(str), null, this.f19503s);
        } else {
            this.magicDisplay.onTakePicture(hVCamHost.getPhotoPath(), null, this.f19503s);
        }
    }
}
