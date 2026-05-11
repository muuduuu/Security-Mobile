package v6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C4959k implements InterfaceC4953e {

    /* renamed from: a, reason: collision with root package name */
    private final a f43988a;

    /* renamed from: b, reason: collision with root package name */
    private final C4957i f43989b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f43990c;

    /* renamed from: v6.k$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f43991a;

        /* renamed from: b, reason: collision with root package name */
        private Map f43992b = null;

        a(Context context) {
            this.f43991a = context;
        }

        private Map a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map c() {
            if (this.f43992b == null) {
                this.f43992b = a(this.f43991a);
            }
            return this.f43992b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        InterfaceC4952d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC4952d) Class.forName(str2).asSubclass(InterfaceC4952d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }
    }

    C4959k(Context context, C4957i c4957i) {
        this(new a(context), c4957i);
    }

    @Override // v6.InterfaceC4953e
    public synchronized InterfaceC4961m a(String str) {
        if (this.f43990c.containsKey(str)) {
            return (InterfaceC4961m) this.f43990c.get(str);
        }
        InterfaceC4952d b10 = this.f43988a.b(str);
        if (b10 == null) {
            return null;
        }
        InterfaceC4961m create = b10.create(this.f43989b.a(str));
        this.f43990c.put(str, create);
        return create;
    }

    C4959k(a aVar, C4957i c4957i) {
        this.f43990c = new HashMap();
        this.f43988a = aVar;
        this.f43989b = c4957i;
    }
}
