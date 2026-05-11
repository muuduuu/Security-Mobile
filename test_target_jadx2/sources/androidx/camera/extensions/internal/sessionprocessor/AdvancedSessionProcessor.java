package androidx.camera.extensions.internal.sessionprocessor;

import R.d;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C1454p;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.d1;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.lifecycle.C1607y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class AdvancedSessionProcessor extends g {

    private static class CallbackAdapter implements R0.a {
        private final RequestProcessorImpl.Callback mCallback;

        CallbackAdapter(RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(R0.b bVar) {
            y0.f.a(bVar instanceof RequestAdapter);
            return ((RequestAdapter) bVar).getImplRequest();
        }

        public void onCaptureBufferLost(R0.b bVar, long j10, int i10) {
            this.mCallback.onCaptureBufferLost(getImplRequest(bVar), j10, i10);
        }

        public void onCaptureCompleted(R0.b bVar, InterfaceC1469x interfaceC1469x) {
            CaptureResult i10 = interfaceC1469x.i();
            y0.f.b(i10 instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(bVar), (TotalCaptureResult) i10);
        }

        public void onCaptureFailed(R0.b bVar, C1454p c1454p) {
            Object a10 = c1454p.a();
            y0.f.b(a10 instanceof CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(bVar), (CaptureFailure) a10);
        }

        public void onCaptureProgressed(R0.b bVar, InterfaceC1469x interfaceC1469x) {
            CaptureResult i10 = interfaceC1469x.i();
            y0.f.b(i10 != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(bVar), i10);
        }

        public void onCaptureSequenceAborted(int i10) {
            this.mCallback.onCaptureSequenceAborted(i10);
        }

        public void onCaptureSequenceCompleted(int i10, long j10) {
            this.mCallback.onCaptureSequenceCompleted(i10, j10);
        }

        public void onCaptureStarted(R0.b bVar, long j10, long j11) {
            this.mCallback.onCaptureStarted(getImplRequest(bVar), j10, j11);
        }
    }

    private static class ExtensionMetadataMonitor {
        private final C1607y mCurrentExtensionTypeLiveData;
        private final C1607y mExtensionStrengthLiveData;

        ExtensionMetadataMonitor(C1607y c1607y, C1607y c1607y2) {
            this.mCurrentExtensionTypeLiveData = c1607y;
            this.mExtensionStrengthLiveData = c1607y2;
        }

        private int convertExtensionMode(int i10) {
            if (i10 == 0) {
                return 5;
            }
            if (i10 == 1) {
                return 4;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 != 3) {
                return i10 != 4 ? 0 : 3;
            }
            return 2;
        }

        void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            CaptureResult.Key key;
            CaptureResult.Key key2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null) {
                    key2 = CaptureResult.EXTENSION_CURRENT_TYPE;
                    Object obj = map.get(key2);
                    if (obj != null) {
                        Integer num = (Integer) obj;
                        if (!Objects.equals(this.mCurrentExtensionTypeLiveData.f(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                            this.mCurrentExtensionTypeLiveData.m(Integer.valueOf(convertExtensionMode(num.intValue())));
                        }
                    }
                }
                if (this.mExtensionStrengthLiveData != null) {
                    key = CaptureResult.EXTENSION_STRENGTH;
                    Object obj2 = map.get(key);
                    if (obj2 == null || Objects.equals(this.mExtensionStrengthLiveData.f(), obj2)) {
                        return;
                    }
                    this.mExtensionStrengthLiveData.m((Integer) obj2);
                }
            }
        }
    }

    private static class ImageProcessorAdapter {
        private final ImageProcessorImpl mImpl;

        ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        public void onNextImageAvailable(int i10, long j10, d dVar, String str) {
            this.mImpl.onNextImageAvailable(i10, j10, new ImageReferenceImplAdapter(dVar), str);
        }
    }

    private static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final d mImageReference;

        ImageReferenceImplAdapter(d dVar) {
        }

        public boolean decrement() {
            throw null;
        }

        public Image get() {
            throw null;
        }

        public boolean increment() {
            throw null;
        }
    }

    private static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        OutputSurfaceConfigurationImplAdapter(I0 i02) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(i02.d());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(i02.b());
            i02.a();
            this.mAnalysisOutputSurface = null;
            i02.c();
            this.mPostviewOutputSurface = null;
        }

        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    private static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final H0 mOutputSurface;

        OutputSurfaceImplAdapter(H0 h02) {
        }

        public int getImageFormat() {
            return this.mOutputSurface.a();
        }

        public Size getSize() {
            return this.mOutputSurface.b();
        }

        public Surface getSurface() {
            return this.mOutputSurface.c();
        }
    }

    private static class RequestAdapter implements R0.b {
        private final RequestProcessorImpl.Request mImplRequest;
        private final V mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        RequestAdapter(RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            d.b bVar = new d.b();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                bVar.b(key, request.getParameters().get(key));
            }
            this.mParameters = bVar.a();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        public V getParameters() {
            return this.mParameters;
        }

        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    private class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final R0 mRequestProcessor;
        final /* synthetic */ AdvancedSessionProcessor this$0;

        RequestProcessorImplAdapter(AdvancedSessionProcessor advancedSessionProcessor, R0 r02) {
        }

        public void abortCaptures() {
            this.mRequestProcessor.a();
        }

        public void setImageProcessor(int i10, ImageProcessorImpl imageProcessorImpl) {
            new ImageProcessorAdapter(imageProcessorImpl);
            throw null;
        }

        public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.e(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.d();
        }

        public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.g(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return this.mRequestProcessor.f(arrayList, new CallbackAdapter(callback));
        }
    }

    private static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final X0.a mCaptureCallback;
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;
        private final d1 mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        SessionProcessorImplCaptureCallbackAdapter(X0.a aVar, d1 d1Var, boolean z10) {
            this(aVar, d1Var, null, z10);
        }

        public void onCaptureCompleted(long j10, int i10, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.d(j10, i10, new e(j10, this.mTagBundle, map));
                this.mCaptureCallback.b(i10);
            }
        }

        public void onCaptureFailed(int i10) {
            this.mCaptureCallback.c(i10);
        }

        public void onCaptureProcessProgressed(int i10) {
            this.mCaptureCallback.onCaptureProcessProgressed(i10);
        }

        public void onCaptureProcessStarted(int i10) {
            this.mCaptureCallback.a(i10);
        }

        public void onCaptureSequenceAborted(int i10) {
            this.mCaptureCallback.f(i10);
        }

        public void onCaptureSequenceCompleted(int i10) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            X0.a aVar = this.mCaptureCallback;
            long j10 = this.mOnCaptureStartedTimestamp;
            aVar.d(j10, i10, new e(j10, this.mTagBundle, Collections.emptyMap()));
            this.mCaptureCallback.b(i10);
        }

        public void onCaptureStarted(int i10, long j10) {
            this.mOnCaptureStartedTimestamp = j10;
            this.mCaptureCallback.e(i10, j10);
        }

        SessionProcessorImplCaptureCallbackAdapter(X0.a aVar, d1 d1Var, ExtensionMetadataMonitor extensionMetadataMonitor, boolean z10) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mTagBundle = d1Var;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z10;
        }
    }
}
