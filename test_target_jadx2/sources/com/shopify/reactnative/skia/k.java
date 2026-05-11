package com.shopify.reactnative.skia;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class k {
    private static void b(Canvas canvas, View view) {
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate((view.getLeft() + view.getPaddingLeft()) - view.getScrollX(), (view.getTop() + view.getPaddingTop()) - view.getScrollY());
        canvas.concat(matrix2);
        canvas.concat(matrix);
    }

    private static Paint c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private static void d(Canvas canvas, View view, float f10) {
        Drawable background = view.getBackground();
        if (background != null) {
            canvas.saveLayerAlpha(null, Math.round(f10 * 255.0f));
            background.draw(canvas);
            canvas.restore();
        }
    }

    private static void e(Canvas canvas, ViewGroup viewGroup, Paint paint, float f10) {
        if (viewGroup instanceof com.facebook.react.views.view.j) {
            try {
                Method declaredMethod = com.facebook.react.views.view.j.class.getDeclaredMethod("g", Canvas.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(viewGroup, canvas);
            } catch (Exception e10) {
                Log.e("SkiaScreenshot", "couldn't invoke dispatchOverflowDraw() on ReactViewGroup", e10);
            }
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof TextureView) {
                    h(canvas, (TextureView) childAt, paint, f10);
                } else if (childAt instanceof SurfaceView) {
                    f(canvas, (SurfaceView) childAt, paint, f10);
                } else {
                    l(canvas, childAt, paint, f10);
                }
            }
        }
    }

    private static void f(final Canvas canvas, final SurfaceView surfaceView, final Paint paint, final float f10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            PixelCopy.request(surfaceView, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.shopify.reactnative.skia.j
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    k.j(canvas, surfaceView, paint, f10, createBitmap, countDownLatch, i10);
                }
            }, new Handler(Looper.getMainLooper()));
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (Exception e10) {
            Log.e("SkiaScreenshot", "Cannot PixelCopy for " + surfaceView, e10);
            g(canvas, surfaceView, paint, f10);
        }
    }

    private static void g(Canvas canvas, SurfaceView surfaceView, Paint paint, float f10) {
        Bitmap drawingCache = surfaceView.getDrawingCache();
        if (drawingCache != null) {
            canvas.save();
            b(canvas, surfaceView);
            paint.setAlpha(Math.round(f10 * 255.0f));
            canvas.drawBitmap(drawingCache, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    private static void h(Canvas canvas, TextureView textureView, Paint paint, float f10) {
        textureView.setOpaque(false);
        Bitmap bitmap = textureView.getBitmap(Bitmap.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888));
        canvas.save();
        b(canvas, textureView);
        paint.setAlpha(Math.round(f10 * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    private static void i(Canvas canvas, View view, Paint paint, float f10) {
        canvas.saveLayerAlpha(null, Math.round(f10 * 255.0f));
        view.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Canvas canvas, SurfaceView surfaceView, Paint paint, float f10, Bitmap bitmap, CountDownLatch countDownLatch, int i10) {
        canvas.save();
        b(canvas, surfaceView);
        paint.setAlpha(Math.round(f10 * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
        countDownLatch.countDown();
    }

    public static Bitmap k(ReactContext reactContext, int i10) {
        View view;
        try {
            view = L0.i(reactContext, i10).resolveView(i10);
        } catch (RuntimeException e10) {
            reactContext.handleException(e10);
            view = null;
        }
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint c10 = c();
        canvas.save();
        canvas.translate(-view.getLeft(), -view.getTop());
        l(canvas, view, c10, 1.0f);
        canvas.restore();
        return createBitmap;
    }

    private static void l(Canvas canvas, View view, Paint paint, float f10) {
        float alpha = f10 * view.getAlpha();
        canvas.save();
        b(canvas, view);
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            int scrollX = scrollView.getScrollX();
            int scrollY = scrollView.getScrollY();
            canvas.clipRect(scrollX, scrollY, scrollView.getWidth() + scrollX, scrollView.getHeight() + scrollY);
        }
        if (view instanceof ViewGroup) {
            d(canvas, view, alpha);
            e(canvas, (ViewGroup) view, paint, alpha);
        } else {
            i(canvas, view, paint, alpha);
        }
        canvas.restore();
    }
}
