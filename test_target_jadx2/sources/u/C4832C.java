package u;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4832C {

    /* renamed from: b, reason: collision with root package name */
    private final a f43383b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43384c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f43382a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private V f43385d = null;

    /* renamed from: u.C$a */
    public interface a {
        Object a(CameraCharacteristics.Key key);
    }

    private C4832C(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f43383b = new z(cameraCharacteristics);
        } else {
            this.f43383b = new C4830A(cameraCharacteristics);
        }
        this.f43384c = str;
    }

    private boolean c(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static C4832C e(CameraCharacteristics cameraCharacteristics, String str) {
        return new C4832C(cameraCharacteristics, str);
    }

    public Object a(CameraCharacteristics.Key key) {
        if (c(key)) {
            return this.f43383b.a(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f43382a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object a10 = this.f43383b.a(key);
                if (a10 != null) {
                    this.f43382a.put(key, a10);
                }
                return a10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public V b() {
        if (this.f43385d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f43385d = V.e(streamConfigurationMap, new x.n(this.f43384c));
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f43385d;
    }

    public boolean d() {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 34) {
            a aVar = this.f43383b;
            key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) aVar.a(key);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
