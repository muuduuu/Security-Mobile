package com.facebook.react.modules.image;

import K4.a;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import b4.k;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import f3.AbstractC3142a;
import g4.InterfaceC3190e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC3605b;
import l3.InterfaceC3606c;
import l5.C3609a;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Lb4/k;", "imagePipeline", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lb4/k;Lcom/facebook/react/views/image/f;)V", BuildConfig.FLAVOR, "requestId", "Ll3/c;", "Ljava/lang/Void;", "request", BuildConfig.FLAVOR, "registerRequest", "(ILl3/c;)V", "removeRequest", "(I)Ll3/c;", BuildConfig.FLAVOR, "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", BuildConfig.FLAVOR, "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Lb4/k;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/f;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Lb4/k;", "setImagePipeline", "(Lb4/k;)V", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private k _imagePipeline;
    private final Object callerContext;
    private f callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<InterfaceC3606c> enqueuedRequests;

    public static final class b extends AbstractC3605b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f21809a;

        b(Promise promise) {
            this.f21809a = promise;
        }

        @Override // l3.AbstractC3605b
        protected void e(InterfaceC3606c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            this.f21809a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.e());
        }

        @Override // l3.AbstractC3605b
        protected void f(InterfaceC3606c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            if (dataSource.a()) {
                AbstractC3142a abstractC3142a = (AbstractC3142a) dataSource.b();
                try {
                    if (abstractC3142a == null) {
                        this.f21809a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    try {
                        Object p10 = abstractC3142a.p();
                        Intrinsics.checkNotNullExpressionValue(p10, "get(...)");
                        InterfaceC3190e interfaceC3190e = (InterfaceC3190e) p10;
                        WritableMap createMap = Arguments.createMap();
                        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
                        createMap.putInt("width", interfaceC3190e.getWidth());
                        createMap.putInt("height", interfaceC3190e.getHeight());
                        this.f21809a.resolve(createMap);
                    } catch (Exception e10) {
                        this.f21809a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e10);
                    }
                } finally {
                    AbstractC3142a.n(abstractC3142a);
                }
            }
        }
    }

    public static final class c extends AbstractC3605b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f21810a;

        c(Promise promise) {
            this.f21810a = promise;
        }

        @Override // l3.AbstractC3605b
        protected void e(InterfaceC3606c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            this.f21810a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.e());
        }

        @Override // l3.AbstractC3605b
        protected void f(InterfaceC3606c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            if (dataSource.a()) {
                AbstractC3142a abstractC3142a = (AbstractC3142a) dataSource.b();
                try {
                    if (abstractC3142a == null) {
                        this.f21810a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    try {
                        Object p10 = abstractC3142a.p();
                        Intrinsics.checkNotNullExpressionValue(p10, "get(...)");
                        InterfaceC3190e interfaceC3190e = (InterfaceC3190e) p10;
                        WritableMap createMap = Arguments.createMap();
                        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
                        createMap.putInt("width", interfaceC3190e.getWidth());
                        createMap.putInt("height", interfaceC3190e.getHeight());
                        this.f21810a.resolve(createMap);
                    } catch (Exception e10) {
                        this.f21810a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e10);
                    }
                } finally {
                    AbstractC3142a.n(abstractC3142a);
                }
            }
        }
    }

    public static final class d extends AbstractC3605b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21812b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f21813c;

        d(int i10, Promise promise) {
            this.f21812b = i10;
            this.f21813c = promise;
        }

        @Override // l3.AbstractC3605b
        protected void e(InterfaceC3606c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            try {
                ImageLoaderModule.this.removeRequest(this.f21812b);
                this.f21813c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, dataSource.e());
            } finally {
                dataSource.close();
            }
        }

        @Override // l3.AbstractC3605b
        protected void f(InterfaceC3606c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            if (dataSource.a()) {
                try {
                    try {
                        ImageLoaderModule.this.removeRequest(this.f21812b);
                        this.f21813c.resolve(Boolean.TRUE);
                    } catch (Exception e10) {
                        this.f21813c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e10);
                    }
                } finally {
                    dataSource.close();
                }
            }
        }
    }

    public static final class e extends GuardedAsyncTask {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f21815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f21816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReadableArray readableArray, Promise promise, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f21815b = readableArray;
            this.f21816c = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... params) {
            Intrinsics.checkNotNullParameter(params, "params");
            WritableMap createMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
            k imagePipeline = ImageLoaderModule.this.getImagePipeline();
            int size = this.f21815b.size();
            for (int i10 = 0; i10 < size; i10++) {
                String string = this.f21815b.getString(i10);
                if (string.length() > 0) {
                    Uri parse = Uri.parse(string);
                    if (imagePipeline.p(parse)) {
                        createMap.putString(string, "memory");
                    } else if (imagePipeline.r(parse)) {
                        createMap.putString(string, "disk");
                    }
                }
            }
            this.f21816c.resolve(createMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getImagePipeline() {
        k kVar = this._imagePipeline;
        if (kVar != null) {
            return kVar;
        }
        k a10 = r3.c.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getImagePipeline(...)");
        return a10;
    }

    private final void registerRequest(int requestId, InterfaceC3606c request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            Unit unit = Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3606c removeRequest(int requestId) {
        InterfaceC3606c interfaceC3606c;
        synchronized (this.enqueuedRequestMonitor) {
            interfaceC3606c = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return interfaceC3606c;
    }

    private final void setImagePipeline(k kVar) {
        this._imagePipeline = kVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        InterfaceC3606c removeRequest = removeRequest((int) requestId);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        m4.b a10 = m4.c.w(new C3609a(reactApplicationContext, uriString, 0.0d, 0.0d, 12, null).e()).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        getImagePipeline().g(a10, getCallerContext()).c(new b(promise), Z2.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        m4.c w10 = m4.c.w(new C3609a(reactApplicationContext, uriString, 0.0d, 0.0d, 12, null).e());
        Intrinsics.checkNotNullExpressionValue(w10, "newBuilderWithSource(...)");
        getImagePipeline().g(R4.a.f8451B.a(w10, headers), getCallerContext()).c(new c(promise), Z2.a.a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC3606c valueAt = this.enqueuedRequests.valueAt(i10);
                    Intrinsics.checkNotNullExpressionValue(valueAt, "valueAt(...)");
                    valueAt.close();
                }
                this.enqueuedRequests.clear();
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        int i10 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        m4.b a10 = m4.c.w(Uri.parse(uriString)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        InterfaceC3606c w10 = getImagePipeline().w(a10, getCallerContext());
        d dVar = new d(i10, promise);
        registerRequest(i10, w10);
        w10.c(dVar, Z2.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        new e(uris, promise, getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, k imagePipeline, f callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }
}
