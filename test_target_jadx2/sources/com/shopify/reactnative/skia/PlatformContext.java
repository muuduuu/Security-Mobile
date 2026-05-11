package com.shopify.reactnative.skia;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes2.dex */
public class PlatformContext {

    /* renamed from: a, reason: collision with root package name */
    private final ReactContext f29463a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29464b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29465c = false;

    /* renamed from: d, reason: collision with root package name */
    private final String f29466d = "PlatformContext";

    /* renamed from: e, reason: collision with root package name */
    private final Handler f29467e = new Handler(Looper.getMainLooper());
    private final HybridData mHybridData;

    class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (PlatformContext.this.f29464b) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (PlatformContext.this.f29465c) {
                return;
            }
            PlatformContext.this.notifyDrawLoop();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformContext.this.notifyTaskReady();
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29470a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PlatformContext f29471b;

        c(PlatformContext platformContext, String str) {
            this.f29470a = str;
            this.f29471b = platformContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29471b.f29463a.handleException(new Exception(this.f29470a));
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformContext.this.j();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformContext.this.j();
        }
    }

    public PlatformContext(ReactContext reactContext) {
        this.f29463a = reactContext;
        this.mHybridData = initHybrid(reactContext.getResources().getDisplayMetrics().density);
    }

    private byte[] g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private native HybridData initHybrid(float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Choreographer.getInstance().postFrameCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void notifyDrawLoop();

    /* JADX INFO: Access modifiers changed from: private */
    public native void notifyTaskReady();

    public void beginDrawLoop() {
        if (this.f29464b) {
            return;
        }
        this.f29464b = true;
        this.f29467e.post(new d());
    }

    public Object createVideo(String str) {
        return new com.shopify.reactnative.skia.e(this.f29463a, str);
    }

    public void endDrawLoop() {
        if (this.f29464b) {
            this.f29464b = false;
        }
    }

    protected void finalize() {
        this.mHybridData.resetNative();
        super.finalize();
    }

    public byte[] getJniStreamFromSource(String str) {
        int identifier = this.f29463a.getResources().getIdentifier(str, "drawable", this.f29463a.getPackageName());
        if (identifier == 0) {
            identifier = this.f29463a.getResources().getIdentifier(str, "raw", this.f29463a.getPackageName());
        }
        if (identifier != 0) {
            return g(this.f29463a.getResources().openRawResource(identifier));
        }
        try {
            URI uri = new URI(str);
            if (uri.getScheme() == null) {
                throw new Exception("Invalid URI scheme");
            }
            URL url = uri.toURL();
            url.openConnection().connect();
            return g(new BufferedInputStream(url.openStream(), 8192));
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (URISyntaxException e12) {
            e12.printStackTrace();
            return null;
        } catch (Exception e13) {
            e13.printStackTrace();
            return null;
        }
    }

    void h() {
        Log.i("PlatformContext", "Paused");
        this.f29465c = true;
    }

    void i() {
        this.f29465c = false;
        Log.i("PlatformContext", "Resume");
        if (this.f29464b) {
            this.f29467e.post(new e());
        }
    }

    public void notifyTaskReadyOnMainThread() {
        this.f29467e.post(new b());
    }

    public void raise(String str) {
        this.f29467e.post(new c(this, str));
    }

    Object takeScreenshotFromViewTag(int i10) {
        return k.k(this.f29463a, i10);
    }
}
