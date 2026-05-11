package com.facebook.react.modules.core;

import C4.e;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.JavascriptException;
import g5.C3191a;
import g5.C3192b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@K4.a(name = NativeExceptionsManagerSpec.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/modules/core/ExceptionsManagerModule;", "Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;", "LC4/e;", "devSupportManager", "<init>", "(LC4/e;)V", BuildConfig.FLAVOR, "message", "Lcom/facebook/react/bridge/ReadableArray;", "stack", BuildConfig.FLAVOR, "idDouble", BuildConfig.FLAVOR, "reportFatalException", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;D)V", "reportSoftException", "Lcom/facebook/react/bridge/ReadableMap;", "data", "reportException", "(Lcom/facebook/react/bridge/ReadableMap;)V", "title", AppConstants.DETAILS, "exceptionIdDouble", "updateExceptionMessage", "dismissRedbox", "()V", "LC4/e;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    private final e devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsManagerModule(e devSupportManager) {
        super(null);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.devSupportManager.n()) {
            this.devSupportManager.o();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.getString("message");
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        ReadableArray array = data.getArray("stack");
        if (array == null) {
            array = Arguments.createArray();
        }
        boolean z10 = data.hasKey("isFatal") ? data.getBoolean("isFatal") : false;
        String a10 = C3191a.a(data);
        if (z10) {
            Intrinsics.d(array);
            JavascriptException javascriptException = new JavascriptException(C3192b.a(string, array));
            javascriptException.a(a10);
            throw javascriptException;
        }
        Intrinsics.d(array);
        AbstractC1721a.m("ReactNative", C3192b.a(string, array));
        if (a10 != null) {
            AbstractC1721a.c("ReactNative", "extraData: %s", a10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String message, ReadableArray stack, double idDouble) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", message);
        javaOnlyMap.putArray("stack", stack);
        javaOnlyMap.putInt("id", (int) idDouble);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String message, ReadableArray stack, double idDouble) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", message);
        javaOnlyMap.putArray("stack", stack);
        javaOnlyMap.putInt("id", (int) idDouble);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String title, ReadableArray details, double exceptionIdDouble) {
        int i10 = (int) exceptionIdDouble;
        if (this.devSupportManager.n()) {
            this.devSupportManager.F(title, details, i10);
        }
    }
}
