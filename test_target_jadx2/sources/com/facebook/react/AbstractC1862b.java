package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

/* renamed from: com.facebook.react.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1862b implements P {

    /* renamed from: com.facebook.react.b$a */
    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Map.Entry f21379a = null;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f21380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f21381c;

        a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.f21380b = it;
            this.f21381c = reactApplicationContext;
        }

        private void a() {
            while (this.f21380b.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f21380b.next();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                if (!ReactFeatureFlags.useTurboModules || !reactModuleInfo.e()) {
                    this.f21379a = entry;
                    return;
                }
            }
            this.f21379a = null;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.f21379a == null) {
                a();
            }
            Map.Entry entry = this.f21379a;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            a();
            return new ModuleHolder((ReactModuleInfo) entry.getValue(), AbstractC1862b.this.new C0372b((String) entry.getKey(), this.f21381c));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21379a == null) {
                a();
            }
            return this.f21379a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove native modules from the list");
        }
    }

    /* renamed from: com.facebook.react.b$b, reason: collision with other inner class name */
    private class C0372b implements Provider {

        /* renamed from: a, reason: collision with root package name */
        private final String f21383a;

        /* renamed from: b, reason: collision with root package name */
        private final ReactApplicationContext f21384b;

        public C0372b(String str, ReactApplicationContext reactApplicationContext) {
            this.f21383a = str;
            this.f21384b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return AbstractC1862b.this.getModule(this.f21383a, this.f21384b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator d(Iterator it, ReactApplicationContext reactApplicationContext) {
        return new a(it, reactApplicationContext);
    }

    @Override // com.facebook.react.P
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.P
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) it.next().getProvider().get());
        }
        return arrayList;
    }

    @Override // com.facebook.react.P
    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    Iterable<ModuleHolder> getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator it = getReactModuleInfoProvider().a().entrySet().iterator();
        return new Iterable() { // from class: com.facebook.react.a
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator d10;
                d10 = AbstractC1862b.this.d(it, reactApplicationContext);
                return d10;
            }
        };
    }

    public abstract L4.a getReactModuleInfoProvider();

    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
