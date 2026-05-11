package co.hyperverge.hvcamera.magicfilter.utils;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import co.hyperverge.hvcamera.HVLog;

/* loaded from: classes.dex */
public class AutoFocusHelper {
    private static final int CAMERA2_REGION_WEIGHT = 1000;
    private static final String TAG = "AutoFocusHelper";
    private static final MeteringRectangle[] ZERO_WEIGHT_3A_REGION = {new MeteringRectangle(0, 0, 0, 0, 0)};

    public static MeteringRectangle[] aeRegionsForNormalizedCoord(float f10, float f11, Rect rect, int i10) {
        HVLog.d(TAG, "aeRegionsForNormalizedCoord() called with: nx = [" + f10 + "], ny = [" + f11 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        return regionsForNormalizedCoord(f10, f11, Settings3A.getMeteringRegionWidth(), rect, i10);
    }

    public static MeteringRectangle[] aeRegionsForRectangle(float f10, float f11, float f12, float f13, Rect rect, int i10) {
        HVLog.d(TAG, "aeRegionsForRectangle() called with: top = [" + f10 + "], bottom = [" + f11 + "], left = [" + f12 + "], right = [" + f13 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        return regionsForRectangle(f10, f11, f12, f13, rect, i10);
    }

    public static MeteringRectangle[] afRegionsForNormalizedCoord(float f10, float f11, Rect rect, int i10) {
        HVLog.d(TAG, "afRegionsForNormalizedCoord() called with: nx = [" + f10 + "], ny = [" + f11 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        return regionsForNormalizedCoord(f10, f11, Settings3A.getAutoFocusRegionWidth(), rect, i10);
    }

    public static MeteringRectangle[] afRegionsForRectangle(float f10, float f11, float f12, float f13, Rect rect, int i10) {
        HVLog.d(TAG, "afRegionsForRectangle() called with: top = [" + f10 + "], bottom = [" + f11 + "], left = [" + f12 + "], right = [" + f13 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        return regionsForRectangle(f10, f11, f12, f13, rect, i10);
    }

    public static int clamp(int i10, int i11, int i12) {
        HVLog.d(TAG, "clamp() called with: x = [" + i10 + "], min = [" + i11 + "], max = [" + i12 + "]");
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private static String controlAFStateToString(int i10) {
        HVLog.d(TAG, "controlAFStateToString() called with: controlAFState = [" + i10 + "]");
        switch (i10) {
            case 0:
                return "inactive";
            case 1:
                return "passive_scan";
            case 2:
                return "passive_focused";
            case 3:
                return "active_scan";
            case 4:
                return "focus_locked";
            case 5:
                return "not_focus_locked";
            case 6:
                return "passive_unfocused";
            default:
                return "unknown";
        }
    }

    public static Rect cropRegionForZoom(CameraCharacteristics cameraCharacteristics, float f10, float f11) {
        HVLog.d(TAG, "cropRegionForZoom() called with: characteristics = [" + cameraCharacteristics + "], zoomLevel = [" + f10 + "], maxZoom = [" + f11 + "]");
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null) {
            throw new Exception("sensor rect is null");
        }
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((rect.width() * 0.5f) / f10);
        int height2 = (int) ((rect.height() * 0.5f) / f10);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }

    public static MeteringRectangle[] gcamAERegionsForNormalizedCoord(float f10, float f11, Rect rect, int i10) {
        HVLog.d(TAG, "gcamAERegionsForNormalizedCoord() called with: nx = [" + f10 + "], ny = [" + f11 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        return regionsForNormalizedCoord(f10, f11, Settings3A.getGcamMeteringRegionFraction(), rect, i10);
    }

    public static MeteringRectangle[] getZeroWeightRegion() {
        return ZERO_WEIGHT_3A_REGION;
    }

    private static String lensStateToString(int i10) {
        HVLog.d(TAG, "lensStateToString() called with: lensState = [" + i10 + "]");
        return i10 != 0 ? i10 != 1 ? "unknown" : "moving" : "stationary";
    }

    public static PointF normalizedSensorCoordsForNormalizedDisplayCoords(float f10, float f11, int i10) {
        HVLog.d(TAG, "normalizedSensorCoordsForNormalizedDisplayCoords() called with: nx = [" + f10 + "], ny = [" + f11 + "], sensorOrientation = [" + i10 + "]");
        if (i10 == 0) {
            return new PointF(f10, f11);
        }
        if (i10 == 90) {
            return new PointF(f11, 1.0f - f10);
        }
        if (i10 == 180) {
            return new PointF(1.0f - f10, 1.0f - f11);
        }
        if (i10 != 270) {
            return null;
        }
        return new PointF(1.0f - f11, f10);
    }

    private static MeteringRectangle[] regionsForNormalizedCoord(float f10, float f11, float f12, Rect rect, int i10) {
        HVLog.d(TAG, "regionsForNormalizedCoord() called with: nx = [" + f10 + "], ny = [" + f11 + "], fraction = [" + f12 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        if (rect != null && rect.width() >= 0 && rect.height() >= 0) {
            int min = (int) (f12 * 0.5f * Math.min(rect.width(), rect.height()));
            PointF normalizedSensorCoordsForNormalizedDisplayCoords = normalizedSensorCoordsForNormalizedDisplayCoords(f10, f11, i10);
            if (normalizedSensorCoordsForNormalizedDisplayCoords != null) {
                float f13 = normalizedSensorCoordsForNormalizedDisplayCoords.x;
                if (f13 >= 0.0f && normalizedSensorCoordsForNormalizedDisplayCoords.y >= 0.0f) {
                    int width = (int) (rect.left + (f13 * rect.width()));
                    int height = (int) (rect.top + (normalizedSensorCoordsForNormalizedDisplayCoords.y * rect.height()));
                    Rect rect2 = new Rect(width - min, height - min, width + min, height + min);
                    rect2.left = clamp(rect2.left, rect.left, rect.right);
                    rect2.top = clamp(rect2.top, rect.top, rect.bottom);
                    rect2.right = clamp(rect2.right, rect.left, rect.right);
                    rect2.bottom = clamp(rect2.bottom, rect.top, rect.bottom);
                    return new MeteringRectangle[]{new MeteringRectangle(rect2, CAMERA2_REGION_WEIGHT)};
                }
            }
        }
        return null;
    }

    private static MeteringRectangle[] regionsForRectangle(float f10, float f11, float f12, float f13, Rect rect, int i10) {
        PointF normalizedSensorCoordsForNormalizedDisplayCoords;
        PointF normalizedSensorCoordsForNormalizedDisplayCoords2;
        HVLog.d(TAG, "regionsForRectangle() called with: t = [" + f10 + "], b = [" + f11 + "], l = [" + f12 + "], r = [" + f13 + "], cropRegion = [" + rect + "], sensorOrientation = [" + i10 + "]");
        if (rect == null || (normalizedSensorCoordsForNormalizedDisplayCoords = normalizedSensorCoordsForNormalizedDisplayCoords(f12, f10, i10)) == null || (normalizedSensorCoordsForNormalizedDisplayCoords2 = normalizedSensorCoordsForNormalizedDisplayCoords(f13, f11, i10)) == null) {
            return null;
        }
        Rect rect2 = new Rect((int) Math.min(normalizedSensorCoordsForNormalizedDisplayCoords2.x * rect.width(), normalizedSensorCoordsForNormalizedDisplayCoords.x * rect.width()), (int) Math.min(normalizedSensorCoordsForNormalizedDisplayCoords2.y * rect.height(), normalizedSensorCoordsForNormalizedDisplayCoords.y * rect.height()), (int) Math.max(normalizedSensorCoordsForNormalizedDisplayCoords2.x * rect.width(), normalizedSensorCoordsForNormalizedDisplayCoords.x * rect.width()), (int) Math.max(normalizedSensorCoordsForNormalizedDisplayCoords2.y * rect.height(), normalizedSensorCoordsForNormalizedDisplayCoords.y * rect.height()));
        rect2.left = clamp(rect2.left, rect.left, rect.right);
        rect2.top = clamp(rect2.top, rect.top, rect.bottom);
        rect2.right = clamp(rect2.right, rect.left, rect.right);
        rect2.bottom = clamp(rect2.bottom, rect.top, rect.bottom);
        return new MeteringRectangle[]{new MeteringRectangle(rect2, CAMERA2_REGION_WEIGHT)};
    }
}
