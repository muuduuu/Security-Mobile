package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
abstract class BlobCollector {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f21723a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlobModule f21724b;

        a(ReactContext reactContext, BlobModule blobModule) {
            this.f21723a = reactContext;
            this.f21724b = blobModule;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.f21723a.getJavaScriptContextHolder();
            if (javaScriptContextHolder == null || javaScriptContextHolder.get() == 0) {
                return;
            }
            BlobCollector.nativeInstall(this.f21724b, javaScriptContextHolder.get());
        }
    }

    static {
        SoLoader.t("reactnativeblob");
    }

    static void b(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new a(reactContext, blobModule));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j10);
}
