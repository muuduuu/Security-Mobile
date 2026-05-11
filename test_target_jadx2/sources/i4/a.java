package I4;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements JavaScriptExecutorFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f4302a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4303b;

    public a(String appName, String deviceName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.f4302a = appName;
        this.f4303b = deviceName;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f4302a);
        writableNativeMap.putString("DeviceIdentity", this.f4303b);
        return new JSCExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + this);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + this);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
