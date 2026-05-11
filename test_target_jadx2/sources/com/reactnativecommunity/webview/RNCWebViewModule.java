package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

@K4.a(name = NativeRNCWebViewModuleSpec.NAME)
/* loaded from: classes2.dex */
public class RNCWebViewModule extends NativeRNCWebViewModuleSpec {
    private final l mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new l(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.h(str);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRNCWebViewModuleSpec.NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        return this.mRNCWebViewModuleImpl.t(str, str2);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.valueOf(this.mRNCWebViewModuleImpl.u()));
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.x(request);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void shouldStartLoadWithLockIdentifier(boolean z10, double d10) {
        this.mRNCWebViewModuleImpl.y(z10, d10);
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.mRNCWebViewModuleImpl.z(str, valueCallback);
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z10, boolean z11) {
        return this.mRNCWebViewModuleImpl.A(strArr, z10, valueCallback, z11);
    }
}
