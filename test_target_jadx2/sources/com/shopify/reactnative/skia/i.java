package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Log;
import android.view.TextureView;

/* loaded from: classes2.dex */
public abstract class i extends com.facebook.react.views.view.j implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    private TextureView f29489a;

    /* renamed from: b, reason: collision with root package name */
    private String f29490b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29491c;

    public i(Context context) {
        super(context);
        this.f29490b = "SkiaView";
        this.f29491c = false;
        TextureView textureView = new TextureView(context);
        this.f29489a = textureView;
        textureView.setSurfaceTextureListener(this);
        this.f29489a.setOpaque(false);
        addView(this.f29489a);
    }

    private void r() {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i(this.f29490b, "Create SurfaceTexture");
            SurfaceTexture a10 = h.a(false);
            this.f29489a.setSurfaceTexture(a10);
            onSurfaceTextureAvailable(a10, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getMeasuredWidth() == 0) {
            r();
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Log.i(this.f29490b, "onLayout " + getMeasuredWidth() + "/" + getMeasuredHeight());
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29489a.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i(this.f29490b, "onSurfaceTextureAvailable " + i10 + "/" + i11);
        surfaceAvailable(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.i(this.f29490b, "onSurfaceTextureDestroyed");
        surfaceDestroyed();
        if (this.f29491c) {
            return false;
        }
        r();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.f29491c) {
            return;
        }
        Log.i(this.f29490b, "onSurfaceTextureSizeChanged " + i10 + "/" + i11);
        surfaceSizeChanged(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    protected abstract void registerView(int i10);

    void s() {
        this.f29491c = true;
        unregisterView();
    }

    protected abstract void setDebugMode(boolean z10);

    protected abstract void setMode(String str);

    protected abstract void surfaceAvailable(Object obj, int i10, int i11);

    protected abstract void surfaceDestroyed();

    protected abstract void surfaceSizeChanged(int i10, int i11);

    protected abstract void unregisterView();
}
