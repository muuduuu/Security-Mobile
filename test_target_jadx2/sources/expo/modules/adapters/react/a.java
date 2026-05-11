package expo.modules.adapters.react;

import Ea.d;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.ExpoBridgeModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import pb.AbstractC3864c;
import pb.i;
import pb.l;

/* loaded from: classes2.dex */
public class a implements P {

    /* renamed from: a, reason: collision with root package name */
    protected b f32572a;

    /* renamed from: b, reason: collision with root package name */
    protected l f32573b;

    /* renamed from: d, reason: collision with root package name */
    private NativeModulesProxy f32575d;

    /* renamed from: c, reason: collision with root package name */
    protected ReactAdapterPackage f32574c = new ReactAdapterPackage();

    /* renamed from: e, reason: collision with root package name */
    private List f32576e = null;

    /* renamed from: f, reason: collision with root package name */
    private FabricComponentsRegistry f32577f = null;

    public a(List list) {
        this.f32572a = new b(list, null);
    }

    private synchronized NativeModulesProxy b(ReactApplicationContext reactApplicationContext, Ba.b bVar) {
        try {
            NativeModulesProxy nativeModulesProxy = this.f32575d;
            if (nativeModulesProxy != null && nativeModulesProxy.getReactContext() != reactApplicationContext) {
                c(null);
            }
            if (this.f32575d == null) {
                Ba.b b10 = bVar != null ? bVar : this.f32572a.b(reactApplicationContext);
                l lVar = this.f32573b;
                if (lVar != null) {
                    c(new NativeModulesProxy(reactApplicationContext, b10, lVar));
                } else {
                    c(new NativeModulesProxy(reactApplicationContext, b10));
                }
            }
            if (bVar != null && bVar != this.f32575d.getModuleRegistry()) {
                AbstractC3864c.a().a("❌ NativeModuleProxy was configured with a different instance of the modules registry.", null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32575d;
    }

    private void c(NativeModulesProxy nativeModulesProxy) {
        this.f32575d = nativeModulesProxy;
        if (nativeModulesProxy != null) {
            nativeModulesProxy.getKotlinInteropModuleRegistry().k(this.f32575d);
        }
    }

    protected List a(ReactApplicationContext reactApplicationContext, Ba.b bVar, Ea.c cVar) {
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy b10 = b(reactApplicationContext, bVar);
        if (cVar != null) {
            cVar.apply(b10.getKotlinInteropModuleRegistry().f());
        }
        arrayList.add(b10);
        arrayList.add(new ModuleRegistryReadyNotifier(bVar));
        Iterator it = ((c) bVar.b(c.class)).b().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((P) it.next()).createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(b10)));
        return arrayList;
    }

    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy b10 = b(reactApplicationContext, null);
        Ba.b moduleRegistry = b10.getModuleRegistry();
        Iterator it = this.f32574c.f(reactApplicationContext).iterator();
        while (it.hasNext()) {
            moduleRegistry.e((d) it.next());
        }
        List a10 = a(reactApplicationContext, moduleRegistry, null);
        if (this.f32576e != null) {
            b10.getKotlinInteropModuleRegistry().l(this.f32576e);
        }
        return a10;
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList(this.f32572a.c(reactApplicationContext));
        NativeModulesProxy b10 = b(reactApplicationContext, null);
        Objects.requireNonNull(b10);
        i kotlinInteropModuleRegistry = b10.getKotlinInteropModuleRegistry();
        List d10 = kotlinInteropModuleRegistry.d();
        this.f32576e = kotlinInteropModuleRegistry.e(d10);
        arrayList.addAll(d10);
        this.f32577f = new FabricComponentsRegistry(d10);
        return arrayList;
    }
}
