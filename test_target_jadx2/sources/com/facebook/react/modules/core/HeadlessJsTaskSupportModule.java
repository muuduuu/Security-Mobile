package com.facebook.react.modules.core;

import J4.c;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@K4.a(name = NativeHeadlessJsTaskSupportSpec.NAME)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;", "Lcom/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "notifyTaskFinished", BuildConfig.FLAVOR, "taskIdDouble", BuildConfig.FLAVOR, "notifyTaskRetry", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double taskIdDouble) {
        int i10 = (int) taskIdDouble;
        c f10 = c.f(getReactApplicationContext());
        if (f10.h(i10)) {
            f10.i(i10);
        } else {
            AbstractC1721a.H(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i10));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double taskIdDouble, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        int i10 = (int) taskIdDouble;
        c f10 = c.f(getReactApplicationContext());
        if (f10.h(i10)) {
            promise.resolve(Boolean.valueOf(f10.l(i10)));
        } else {
            AbstractC1721a.H(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i10));
            promise.resolve(Boolean.FALSE);
        }
    }
}
