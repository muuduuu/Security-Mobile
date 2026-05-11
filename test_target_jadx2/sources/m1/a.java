package M1;

import Td.G;
import Td.z;
import com.ReactNativeBlobUtil.j;
import com.ReactNativeBlobUtil.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;
import pe.c0;

/* loaded from: classes.dex */
public class a extends G {

    /* renamed from: c, reason: collision with root package name */
    String f5975c;

    /* renamed from: d, reason: collision with root package name */
    ReactApplicationContext f5976d;

    /* renamed from: e, reason: collision with root package name */
    G f5977e;

    /* renamed from: f, reason: collision with root package name */
    boolean f5978f;

    public a(ReactApplicationContext reactApplicationContext, String str, G g10, boolean z10) {
        this.f5976d = reactApplicationContext;
        this.f5975c = str;
        this.f5977e = g10;
        this.f5978f = z10;
    }

    @Override // Td.G
    public long e() {
        return this.f5977e.e();
    }

    @Override // Td.G
    public z f() {
        return this.f5977e.f();
    }

    @Override // Td.G
    public InterfaceC3879g j() {
        return M.c(new C0118a(this.f5977e.j()));
    }

    /* renamed from: M1.a$a, reason: collision with other inner class name */
    private class C0118a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        InterfaceC3879g f5979a;

        /* renamed from: b, reason: collision with root package name */
        long f5980b = 0;

        C0118a(InterfaceC3879g interfaceC3879g) {
            this.f5979a = interfaceC3879g;
        }

        @Override // pe.b0
        public c0 A() {
            return null;
        }

        @Override // pe.b0
        public long b2(C3877e c3877e, long j10) {
            long b22 = this.f5979a.b2(c3877e, j10);
            this.f5980b += b22 > 0 ? b22 : 0L;
            j l10 = l.l(a.this.f5975c);
            long e10 = a.this.e();
            if (l10 != null && e10 != 0 && l10.a(this.f5980b / a.this.e())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", a.this.f5975c);
                createMap.putString("written", String.valueOf(this.f5980b));
                createMap.putString("total", String.valueOf(a.this.e()));
                if (a.this.f5978f) {
                    createMap.putString("chunk", c3877e.Y0(Charset.defaultCharset()));
                } else {
                    createMap.putString("chunk", BuildConfig.FLAVOR);
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) a.this.f5976d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", createMap);
            }
            return b22;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
