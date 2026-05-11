package androidx.camera.extensions.internal.sessionprocessor;

import A.AbstractC0700h0;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.H0;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    T.b mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final c mCaptureResultImageMatcher = new c();
    final Object mLock = new Object();
    HashMap<Integer, Pair<d, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = UNSPECIFIED_TIMESTAMP;

    interface OnCaptureResultCallback {
        void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i10);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, H0 h02, boolean z10) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        T.b bVar = new T.b(surface, size, z10);
        this.mCaptureOutputSurface = bVar;
        captureProcessorImpl.onOutputSurface(bVar.c(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = false;
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z10, HashMap hashMap, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e10) {
                        AbstractC0700h0.d(TAG, "mCaptureProcessorImpl.process exception ", e10);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e10);
                        }
                        AbstractC0700h0.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                    if (this.mIsClosed) {
                        AbstractC0700h0.a(TAG, "Ignore process() in closed state.");
                        AbstractC0700h0.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    AbstractC0700h0.a(TAG, "CaptureProcessorImpl.process() begin");
                    R.e eVar = R.e.f8364e;
                    if (R.c.d(eVar) && R.b.c(eVar) && z10 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j10, list);
                            }

                            public void onCaptureProcessProgressed(int i10) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i10);
                            }
                        }, F.c.b());
                    } else {
                        R.e eVar2 = R.e.f8363d;
                        if (R.c.d(eVar2) && R.b.c(eVar2)) {
                            this.mCaptureProcessorImpl.process(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j10, list);
                                }

                                public void onCaptureProcessProgressed(int i10) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i10);
                                }
                            }, F.c.b());
                        } else {
                            this.mCaptureProcessorImpl.process(hashMap);
                        }
                    }
                    AbstractC0700h0.a(TAG, "CaptureProcessorImpl.process() finish");
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                AbstractC0700h0.a(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th2;
            }
        }
    }

    private /* synthetic */ void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z10, d dVar, TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    dVar.a();
                    AbstractC0700h0.a(TAG, "Ignore image in closed state");
                    return;
                }
                AbstractC0700h0.a(TAG, "onImageReferenceIncoming  captureStageId=" + i10);
                this.mCaptureResults.put(Integer.valueOf(i10), new Pair<>(dVar, totalCaptureResult));
                AbstractC0700h0.a(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<d, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next().first);
                    throw null;
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            AbstractC0700h0.a(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.e();
            this.mCaptureResultImageMatcher.d();
            this.mCaptureOutputSurface.b();
        }
    }

    void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i10) {
        Long l10;
        this.mCaptureResultImageMatcher.c(totalCaptureResult, i10);
        if (this.mTimeStampForOutputImage == UNSPECIFIED_TIMESTAMP && (l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l10.longValue();
            this.mTimeStampForOutputImage = longValue;
            this.mCaptureOutputSurface.e(longValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void notifyImage(d dVar) {
        this.mCaptureResultImageMatcher.g(dVar);
    }

    void process(Map<Integer, Pair<d, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z10) {
        final HashMap hashMap = new HashMap();
        synchronized (this.mLock) {
            Iterator<Integer> it = map.keySet().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(map.get(it.next()).first);
                throw null;
            }
        }
        F.c.d().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.h
            @Override // java.lang.Runnable
            public final void run() {
                StillCaptureProcessor.this.lambda$process$1(z10, hashMap, onCaptureResultCallback);
            }
        });
    }

    void startCapture(final boolean z10, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        AbstractC0700h0.a(TAG, "Start the capture: enablePostview=" + z10);
        this.mTimeStampForOutputImage = UNSPECIFIED_TIMESTAMP;
        synchronized (this.mLock) {
            y0.f.j(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.d();
        this.mCaptureResultImageMatcher.k(new c.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.i
        });
    }
}
