package bc;

import android.content.Context;
import android.location.Location;
import cc.InterfaceC1749a;
import ec.InterfaceC3119a;
import fc.C3164b;
import hc.C3304a;
import ic.AbstractC3365c;
import ic.InterfaceC3364b;
import io.nlopez.smartlocation.geocoding.providers.AndroidGeocodingProvider;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Context f18920a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3364b f18921b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18922c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f18923a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18924b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f18925c = true;

        public b(Context context) {
            this.f18923a = context;
        }

        public d a() {
            return new d(this.f18923a, AbstractC3365c.a(this.f18924b), this.f18925c);
        }
    }

    public static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final Map f18926e = new WeakHashMap();

        /* renamed from: a, reason: collision with root package name */
        private final d f18927a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1749a f18928b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f18929c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18930d = false;

        public c(d dVar, InterfaceC1749a interfaceC1749a) {
            this.f18927a = dVar;
            Map map = f18926e;
            if (!map.containsKey(dVar.f18920a)) {
                map.put(dVar.f18920a, interfaceC1749a);
            }
            this.f18928b = (InterfaceC1749a) map.get(dVar.f18920a);
            if (dVar.f18922c) {
                this.f18928b.a(dVar.f18920a, dVar.f18921b);
            }
        }

        public void a() {
            this.f18928b.stop();
        }
    }

    /* renamed from: bc.d$d, reason: collision with other inner class name */
    public static class C0329d {

        /* renamed from: e, reason: collision with root package name */
        private static final Map f18931e = new WeakHashMap();

        /* renamed from: a, reason: collision with root package name */
        private final d f18932a;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC3119a f18934c;

        /* renamed from: b, reason: collision with root package name */
        private C3164b f18933b = C3164b.f32980e;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18935d = false;

        public C0329d(d dVar, InterfaceC3119a interfaceC3119a) {
            this.f18932a = dVar;
            Map map = f18931e;
            if (!map.containsKey(dVar.f18920a)) {
                map.put(dVar.f18920a, interfaceC3119a);
            }
            this.f18934c = (InterfaceC3119a) map.get(dVar.f18920a);
            if (dVar.f18922c) {
                this.f18934c.a(dVar.f18920a, dVar.f18921b);
            }
        }

        public C0329d a(C3164b c3164b) {
            this.f18933b = c3164b;
            return this;
        }

        public Location b() {
            return this.f18934c.b();
        }

        public C0329d c() {
            this.f18935d = true;
            return this;
        }

        public void d(InterfaceC1672b interfaceC1672b) {
            InterfaceC3119a interfaceC3119a = this.f18934c;
            if (interfaceC3119a == null) {
                throw new RuntimeException("A provider must be initialized");
            }
            interfaceC3119a.d(interfaceC1672b, this.f18933b, this.f18935d);
        }

        public C3304a e() {
            return C3304a.e(this.f18932a.f18920a);
        }
    }

    public static d h(Context context) {
        return new b(context).a();
    }

    public c d() {
        return e(new AndroidGeocodingProvider());
    }

    public c e(InterfaceC1749a interfaceC1749a) {
        return new c(this, interfaceC1749a);
    }

    public C0329d f() {
        return g(new gc.b(this.f18920a));
    }

    public C0329d g(InterfaceC3119a interfaceC3119a) {
        return new C0329d(this, interfaceC3119a);
    }

    private d(Context context, InterfaceC3364b interfaceC3364b, boolean z10) {
        this.f18920a = context;
        this.f18921b = interfaceC3364b;
        this.f18922c = z10;
    }
}
