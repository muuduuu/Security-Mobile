package androidx.camera.extensions.internal.sessionprocessor;

import A.AbstractC0700h0;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.c;
import java.util.List;

/* loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final c mCaptureResultImageMatcher = new c();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    interface OnCaptureResultCallback {
        void onCaptureResult(long j10, List<Pair<CaptureResult.Key, Object>> list);
    }

    PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    private /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, d dVar, TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    dVar.a();
                    AbstractC0700h0.a(TAG, "Ignore image in closed or paused state");
                    return;
                }
                try {
                    R.e eVar = R.e.f8363d;
                    if (R.b.c(eVar) && R.c.d(eVar)) {
                        this.mPreviewImageProcessor.process(dVar.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j10, list);
                            }

                            public void onCaptureProcessProgressed(int i11) {
                            }
                        }, F.c.d());
                    } else {
                        this.mPreviewImageProcessor.process(dVar.get(), totalCaptureResult);
                    }
                    dVar.a();
                } catch (Throwable th) {
                    dVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.d();
            this.mCaptureResultImageMatcher.e();
        }
    }

    void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.b(totalCaptureResult);
    }

    void notifyImage(d dVar) {
        this.mCaptureResultImageMatcher.g(dVar);
    }

    void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    void start(final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.k(new c.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
        });
    }
}
