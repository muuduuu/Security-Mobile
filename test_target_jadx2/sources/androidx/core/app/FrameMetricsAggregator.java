package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    private final b f15705a;

    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static HandlerThread f15706e;

        /* renamed from: f, reason: collision with root package name */
        private static Handler f15707f;

        /* renamed from: a, reason: collision with root package name */
        int f15708a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f15709b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f15710c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f15711d = new WindowOnFrameMetricsAvailableListenerC0257a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0257a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0257a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f15708a & 1) != 0) {
                    aVar.f(aVar.f15709b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f15708a & 2) != 0) {
                    aVar2.f(aVar2.f15709b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f15708a & 4) != 0) {
                    aVar3.f(aVar3.f15709b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f15708a & 8) != 0) {
                    aVar4.f(aVar4.f15709b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f15708a & 16) != 0) {
                    aVar5.f(aVar5.f15709b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f15708a & 64) != 0) {
                    aVar6.f(aVar6.f15709b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f15708a & 32) != 0) {
                    aVar7.f(aVar7.f15709b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f15708a & 128) != 0) {
                    aVar8.f(aVar8.f15709b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f15708a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    aVar9.f(aVar9.f15709b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f15708a = i10;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f15706e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f15706e = handlerThread;
                handlerThread.start();
                f15707f = new Handler(f15706e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f15709b;
                if (sparseIntArrayArr[i10] == null && (this.f15708a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f15711d, f15707f);
            this.f15710c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f15709b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f15710c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f15710c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f15711d);
            return this.f15709b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f15709b;
            this.f15709b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f15710c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f15710c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f15711d);
                    this.f15710c.remove(size);
                }
            }
            return this.f15709b;
        }

        void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((HVFrameRecorder.TIMEOUT_USEC + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f15705a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f15705a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f15705a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f15705a.d();
    }

    public SparseIntArray[] e() {
        return this.f15705a.e();
    }

    public FrameMetricsAggregator(int i10) {
        this.f15705a = new a(i10);
    }
}
