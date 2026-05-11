package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;

@K4.a(name = NativeJSCHeapCaptureSpec.NAME, needsEagerInit = true)
/* loaded from: classes.dex */
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    private a mCaptureInProgress;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    public interface a {
        void a(File file);

        void b(b bVar);
    }

    public static class b extends Exception {
        b(String str) {
            super(str);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCaptureInProgress = null;
    }

    @Override // com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec
    public synchronized void captureComplete(String str, String str2) {
        try {
            a aVar = this.mCaptureInProgress;
            if (aVar != null) {
                if (str2 == null) {
                    aVar.a(new File(str));
                } else {
                    aVar.b(new b(str2));
                }
                this.mCaptureInProgress = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void captureHeap(String str, a aVar) {
        if (this.mCaptureInProgress != null) {
            aVar.b(new b("Heap capture already in progress."));
            return;
        }
        File file = new File(str + "/capture.json");
        file.delete();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.getJSModule(HeapCapture.class);
            if (heapCapture == null) {
                aVar.b(new b("Heap capture js module not registered."));
            } else {
                this.mCaptureInProgress = aVar;
                heapCapture.captureHeap(file.getPath());
            }
        }
    }
}
