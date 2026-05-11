package Zb;

import ac.InterfaceC1373a;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    private static g f12495g = new g();

    /* renamed from: d, reason: collision with root package name */
    private ReactContext f12499d;

    /* renamed from: f, reason: collision with root package name */
    private int f12501f;

    /* renamed from: a, reason: collision with root package name */
    private final List f12496a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f12497b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f12498c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private Boolean f12500e = Boolean.FALSE;

    private boolean g(InterfaceC1373a interfaceC1373a) {
        ReactContext reactContext;
        if (this.f12500e.booleanValue() && (reactContext = this.f12499d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f12499d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + interfaceC1373a.b(), interfaceC1373a.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + interfaceC1373a.b(), e10);
            }
        }
        return false;
    }

    public static g i() {
        return f12495g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ReactContext reactContext) {
        this.f12499d = reactContext;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Boolean bool) {
        this.f12500e = bool;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(InterfaceC1373a interfaceC1373a) {
        synchronized (this.f12498c) {
            try {
                if (this.f12498c.containsKey(interfaceC1373a.b())) {
                    if (!g(interfaceC1373a)) {
                    }
                }
                this.f12496a.add(interfaceC1373a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        synchronized (this.f12498c) {
            try {
                Iterator it = new ArrayList(this.f12496a).iterator();
                while (it.hasNext()) {
                    InterfaceC1373a interfaceC1373a = (InterfaceC1373a) it.next();
                    if (this.f12498c.containsKey(interfaceC1373a.b())) {
                        this.f12496a.remove(interfaceC1373a);
                        o(interfaceC1373a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str) {
        synchronized (this.f12498c) {
            try {
                this.f12501f++;
                if (this.f12498c.containsKey(str)) {
                    this.f12498c.put(str, Integer.valueOf(((Integer) this.f12498c.get(str)).intValue() + 1));
                } else {
                    this.f12498c.put(str, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12497b.post(new Runnable() { // from class: Zb.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.p();
            }
        });
    }

    public void f(final ReactContext reactContext) {
        this.f12497b.post(new Runnable() { // from class: Zb.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.j(reactContext);
            }
        });
    }

    public WritableMap h() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("listeners", this.f12501f);
        createMap.putInt("queued", this.f12496a.size());
        synchronized (this.f12498c) {
            try {
                for (Map.Entry entry : this.f12498c.entrySet()) {
                    createMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        createMap.putMap("events", createMap2);
        return createMap;
    }

    public void m(final Boolean bool) {
        this.f12497b.post(new Runnable() { // from class: Zb.c
            @Override // java.lang.Runnable
            public final void run() {
                g.this.k(bool);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(String str, Boolean bool) {
        synchronized (this.f12498c) {
            try {
                if (this.f12498c.containsKey(str)) {
                    int intValue = ((Integer) this.f12498c.get(str)).intValue();
                    if (intValue > 1 && !bool.booleanValue()) {
                        this.f12498c.put(str, Integer.valueOf(intValue - 1));
                        int i10 = this.f12501f;
                        if (bool.booleanValue()) {
                            intValue = 1;
                        }
                        this.f12501f = i10 - intValue;
                    }
                    this.f12498c.remove(str);
                    int i102 = this.f12501f;
                    if (bool.booleanValue()) {
                    }
                    this.f12501f = i102 - intValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(final InterfaceC1373a interfaceC1373a) {
        this.f12497b.post(new Runnable() { // from class: Zb.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.l(interfaceC1373a);
            }
        });
    }
}
