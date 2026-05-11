package M1;

import Td.G;
import Td.z;
import com.ReactNativeBlobUtil.j;
import com.ReactNativeBlobUtil.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import org.conscrypt.BuildConfig;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;
import pe.c0;

/* loaded from: classes.dex */
public class c extends G {

    /* renamed from: c, reason: collision with root package name */
    String f5982c;

    /* renamed from: d, reason: collision with root package name */
    G f5983d;

    /* renamed from: e, reason: collision with root package name */
    String f5984e;

    /* renamed from: g, reason: collision with root package name */
    ReactApplicationContext f5986g;

    /* renamed from: h, reason: collision with root package name */
    FileOutputStream f5987h;

    /* renamed from: f, reason: collision with root package name */
    long f5985f = 0;

    /* renamed from: i, reason: collision with root package name */
    boolean f5988i = false;

    private class a implements b0 {
        private void a(String str, long j10, long j11) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", str);
            createMap.putString("written", String.valueOf(j10));
            createMap.putString("total", String.valueOf(j11));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) c.this.f5986g.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", createMap);
        }

        @Override // pe.b0
        public c0 A() {
            return null;
        }

        @Override // pe.b0
        public long b2(C3877e c3877e, long j10) {
            float f10;
            int i10 = (int) j10;
            try {
                byte[] bArr = new byte[i10];
                long read = c.this.f5983d.a().read(bArr, 0, i10);
                c cVar = c.this;
                cVar.f5985f += read > 0 ? read : 0L;
                if (read > 0) {
                    cVar.f5987h.write(bArr, 0, (int) read);
                } else if (cVar.e() == -1 && read == -1) {
                    c.this.f5988i = true;
                }
                j l10 = l.l(c.this.f5982c);
                if (c.this.e() != 0) {
                    if (c.this.e() != -1) {
                        c cVar2 = c.this;
                        f10 = cVar2.f5985f / cVar2.e();
                    } else {
                        f10 = c.this.f5988i ? 1.0f : 0.0f;
                    }
                    if (l10 != null && l10.a(f10)) {
                        if (c.this.e() != -1) {
                            c cVar3 = c.this;
                            a(cVar3.f5982c, cVar3.f5985f, cVar3.e());
                        } else {
                            c cVar4 = c.this;
                            if (cVar4.f5988i) {
                                String str = cVar4.f5982c;
                                long j11 = cVar4.f5985f;
                                a(str, j11, j11);
                            } else {
                                a(cVar4.f5982c, 0L, cVar4.e());
                            }
                        }
                    }
                }
                return read;
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            c.this.f5987h.close();
        }

        private a() {
        }
    }

    public c(ReactApplicationContext reactApplicationContext, String str, G g10, String str2, boolean z10) {
        this.f5986g = reactApplicationContext;
        this.f5982c = str;
        this.f5983d = g10;
        this.f5984e = str2;
        if (str2 != null) {
            boolean z11 = !z10;
            String replace = str2.replace("?append=true", BuildConfig.FLAVOR);
            this.f5984e = replace;
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.f5987h = new FileOutputStream(new File(replace), z11);
            } else {
                throw new IllegalStateException("Couldn't create dir: " + parentFile);
            }
        }
    }

    @Override // Td.G
    public long e() {
        if (this.f5983d.e() > 2147483647L) {
            return 2147483647L;
        }
        return this.f5983d.e();
    }

    @Override // Td.G
    public z f() {
        return this.f5983d.f();
    }

    @Override // Td.G
    public InterfaceC3879g j() {
        return M.c(new a());
    }

    public boolean n() {
        return this.f5985f == e() || (e() == -1 && this.f5988i);
    }
}
