package com.ReactNativeBlobUtil;

import com.facebook.fbreact.specs.NativeBlobUtilsSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ReactNativeBlobUtil extends NativeBlobUtilsSpec {
    private final e delegate;

    public ReactNativeBlobUtil(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new e(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void actionViewIntent(String str, String str2, String str3, Promise promise) {
        this.delegate.c(str, str2, str3, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        this.delegate.d(readableMap, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void cancelRequest(String str, Callback callback) {
        this.delegate.e(str, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void closeStream(String str, Callback callback) {
        this.delegate.f(str, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void copyToInternal(String str, String str2, Promise promise) {
        this.delegate.g(str, str2, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void copyToMediaStore(ReadableMap readableMap, String str, String str2, Promise promise) {
        this.delegate.h(readableMap, str, str2, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void cp(String str, String str2, Callback callback) {
        this.delegate.i(str, str2, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void createFile(String str, String str2, String str3, Promise promise) {
        this.delegate.j(str, str2, str3, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        this.delegate.k(str, readableArray, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void createMediaFile(ReadableMap readableMap, String str, Promise promise) {
        this.delegate.l(readableMap, str, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void df(Callback callback) {
        this.delegate.m(callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void emitExpiredEvent(Callback callback) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void enableProgressReport(String str, double d10, double d11) {
        this.delegate.n(str, (int) d10, (int) d11);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void enableUploadProgressReport(String str, double d10, double d11) {
        this.delegate.o(str, (int) d10, (int) d11);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void excludeFromBackupKey(String str, Promise promise) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void exists(String str, Callback callback) {
        this.delegate.p(str, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        this.delegate.q(readableMap, str, str2, str3, readableMap2, str4, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        this.delegate.r(readableMap, str, str2, str3, readableMap2, readableArray, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void getBlob(String str, String str2, Promise promise) {
        this.delegate.s(str, str2, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void getContentIntent(String str, Promise promise) {
        this.delegate.t(str, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void getEnvironmentDirs(Callback callback) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeBlobUtilsSpec.NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void getSDCardApplicationDir(Promise promise) {
        this.delegate.u(promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void getSDCardDir(Promise promise) {
        this.delegate.v(promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    protected Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(d.m(getReactApplicationContext()));
        hashMap.putAll(d.j(getReactApplicationContext()));
        return hashMap;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void hash(String str, String str2, Promise promise) {
        this.delegate.w(str, str2, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void ls(String str, Promise promise) {
        this.delegate.x(str, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void lstat(String str, Callback callback) {
        this.delegate.y(str, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void mkdir(String str, Promise promise) {
        this.delegate.z(str, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void mv(String str, String str2, Callback callback) {
        this.delegate.A(str, str2, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void pathForAppGroup(String str, Promise promise) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void presentOpenInMenu(String str, String str2, Promise promise) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void presentOptionsMenu(String str, String str2, Promise promise) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void presentPreview(String str, String str2, Promise promise) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void readFile(String str, String str2, boolean z10, Promise promise) {
        this.delegate.B(str, str2, z10, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void readStream(String str, String str2, double d10, double d11, String str3) {
        this.delegate.C(str, str2, (int) d10, (int) d11, str3);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    @ReactMethod
    public void removeListeners(double d10) {
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void removeSession(ReadableArray readableArray, Callback callback) {
        this.delegate.D(readableArray, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void scanFile(ReadableArray readableArray, Callback callback) {
        this.delegate.E(readableArray, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void slice(String str, String str2, double d10, double d11, Promise promise) {
        this.delegate.F(str, str2, (long) d10, (long) d11, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void stat(String str, Callback callback) {
        this.delegate.G(str, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public String syncPathAppGroup(String str) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void unlink(String str, Callback callback) {
        this.delegate.H(str, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        this.delegate.I(str, readableArray, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void writeChunk(String str, String str2, Callback callback) {
        this.delegate.J(str, str2, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void writeFile(String str, String str2, String str3, boolean z10, boolean z11, Promise promise) {
        this.delegate.K(str, str2, str3, z10, z11, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void writeFileArray(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        this.delegate.L(str, readableArray, z10, promise);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void writeStream(String str, String str2, boolean z10, Callback callback) {
        this.delegate.M(str, str2, z10, callback);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobUtilsSpec
    public void writeToMediaFile(String str, String str2, boolean z10, Promise promise) {
        this.delegate.N(str, str2, z10, promise);
    }
}
