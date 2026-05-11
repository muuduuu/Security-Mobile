package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1896k {

    /* renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f21709a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21710b = new HashMap();

    public C1896k(ReactApplicationContext reactApplicationContext, J j10) {
        this.f21709a = reactApplicationContext;
    }

    public NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f21709a, this.f21710b);
    }

    public void b(P p10) {
        for (ModuleHolder moduleHolder : p10 instanceof AbstractC1862b ? ((AbstractC1862b) p10).getNativeModuleIterator(this.f21709a) : S.b(p10, this.f21709a)) {
            String name = moduleHolder.getName();
            if (this.f21710b.containsKey(name)) {
                ModuleHolder moduleHolder2 = (ModuleHolder) this.f21710b.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
                this.f21710b.remove(moduleHolder2);
            }
            this.f21710b.put(name, moduleHolder);
        }
    }
}
