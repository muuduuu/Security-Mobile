package com.horcrux.svg;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import v4.AbstractC4929e;

/* loaded from: classes2.dex */
public class SvgPackage extends com.facebook.react.a0 implements com.facebook.react.b0 {
    private Map<String, ModuleSpec> mViewManagers;

    class A implements Provider {
        A() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    class B implements Provider {
        B() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    class C implements Provider {
        C() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$a, reason: case insensitive filesystem */
    class C2895a implements Provider {
        C2895a() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$b, reason: case insensitive filesystem */
    class C2896b implements Provider {
        C2896b() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$c, reason: case insensitive filesystem */
    class C2897c implements Provider {
        C2897c() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    class d implements Provider {
        d() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    class e implements Provider {
        e() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    class f implements Provider {
        f() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    class g implements Provider {
        g() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    class h implements Provider {
        h() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    class i implements Provider {
        i() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    class j implements Provider {
        j() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FilterManager();
        }
    }

    class k implements Provider {
        k() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    class l implements Provider {
        l() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeBlendManager();
        }
    }

    class m implements Provider {
        m() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeColorMatrixManager();
        }
    }

    class n implements Provider {
        n() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeFloodManager();
        }
    }

    class o implements Provider {
        o() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeGaussianBlurManager();
        }
    }

    class p implements Provider {
        p() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeMergeManager();
        }
    }

    class q implements Provider {
        q() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeOffsetManager();
        }
    }

    class r implements Provider {
        r() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    class s implements Provider {
        s() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    class t implements Provider {
        t() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new SvgViewManager();
        }
    }

    class u implements L4.a {
        u() {
        }

        @Override // L4.a
        public Map a() {
            HashMap hashMap = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i10 = 0; i10 < 2; i10++) {
                Class cls = clsArr[i10];
                K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), true));
            }
            return hashMap;
        }
    }

    class v implements Provider {
        v() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    class w implements Provider {
        w() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    class x implements Provider {
        x() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    class y implements Provider {
        y() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    class z implements Provider {
        z() {
        }

        @Override // javax.inject.Provider
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap b10 = AbstractC4929e.b();
            b10.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new k()));
            b10.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new v()));
            b10.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new w()));
            b10.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new x()));
            b10.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new y()));
            b10.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new z()));
            b10.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new A()));
            b10.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new B()));
            b10.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C()));
            b10.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C2895a()));
            b10.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C2896b()));
            b10.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C2897c()));
            b10.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new d()));
            b10.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new e()));
            b10.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new f()));
            b10.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new g()));
            b10.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new h()));
            b10.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new i()));
            b10.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new j()));
            b10.put(RenderableViewManager.FeBlendManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new l()));
            b10.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new m()));
            b10.put(RenderableViewManager.FeFloodManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new n()));
            b10.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new o()));
            b10.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new p()));
            b10.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new q()));
            b10.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new r()));
            b10.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new s()));
            b10.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new t()));
            this.mViewManagers = b10;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.b0
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals("RNSVGRenderableModule")) {
            return new RNSVGRenderableManager(reactApplicationContext);
        }
        if (str.equals("RNSVGSvgViewModule")) {
            return new SvgViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        try {
            return (L4.a) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new u();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.AbstractC1862b
    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.b0
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }
}
