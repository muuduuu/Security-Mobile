package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

@K4.a(name = "RNSVGSvgViewModule")
/* loaded from: classes2.dex */
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28979a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableMap f28980b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f28981c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28982d;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a, reason: collision with other inner class name */
        class RunnableC0427a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            class RunnableC0428a implements Runnable {
                RunnableC0428a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f28979a, aVar.f28980b, aVar.f28981c, aVar.f28982d + 1);
                }
            }

            RunnableC0427a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f28979a);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0428a());
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f28979a, aVar.f28980b, aVar.f28981c, aVar.f28982d + 1);
            }
        }

        a(int i10, ReadableMap readableMap, Callback callback, int i11) {
            this.f28979a = i10;
            this.f28980b = readableMap;
            this.f28981c = callback;
            this.f28982d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f28979a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f28979a, new RunnableC0427a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.f28980b;
            if (readableMap != null) {
                this.f28981c.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f28980b.getInt("height")));
            } else {
                this.f28981c.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i10, ReadableMap readableMap, Callback callback, int i11) {
        UiThreadUtil.runOnUiThread(new a(i10, readableMap, callback, i11));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d10, ReadableMap readableMap, Callback callback) {
        toDataURL(d10.intValue(), readableMap, callback, 0);
    }
}
