package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14765a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final LongSparseArray f14766b = new LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    Map f14767c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final LongSparseArray f14768d = new LongSparseArray();

    /* renamed from: e, reason: collision with root package name */
    a f14769e;

    interface a {
    }

    c() {
    }

    private void a(LongSparseArray longSparseArray, long j10, Object obj) {
        List list = (List) longSparseArray.get(j10);
        if (list == null) {
            list = new ArrayList();
            longSparseArray.put(j10, list);
        }
        list.add(obj);
    }

    private long f(TotalCaptureResult totalCaptureResult) {
        Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    private void h() {
        synchronized (this.f14765a) {
            try {
                int size = this.f14766b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    List list = (List) this.f14766b.valueAt(size);
                    if (!list.isEmpty()) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) list.get(0);
                        long f10 = f(totalCaptureResult);
                        y0.f.i(f10 == this.f14766b.keyAt(size));
                        List list2 = (List) this.f14768d.get(f10);
                        if (list2 != null && !list2.isEmpty()) {
                            android.support.v4.media.session.b.a(list2.get(0));
                            i(this.f14768d, f10, null);
                            list.remove(totalCaptureResult);
                            if (list.isEmpty()) {
                                this.f14766b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(LongSparseArray longSparseArray, long j10, Object obj) {
        List list = (List) longSparseArray.get(j10);
        if (list != null) {
            list.remove(obj);
            if (list.isEmpty()) {
                longSparseArray.remove(j10);
            }
        }
    }

    private void j() {
        synchronized (this.f14765a) {
            try {
                if (this.f14768d.size() != 0 && this.f14766b.size() != 0) {
                    long keyAt = this.f14768d.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f14766b.keyAt(0);
                    y0.f.a(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f14768d.size() - 1; size >= 0; size--) {
                            if (this.f14768d.keyAt(size) < keyAt2) {
                                Iterator it = ((List) this.f14768d.valueAt(size)).iterator();
                                if (it.hasNext()) {
                                    android.support.v4.media.session.b.a(it.next());
                                    throw null;
                                }
                                this.f14768d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f14766b.size() - 1; size2 >= 0; size2--) {
                            if (this.f14766b.keyAt(size2) < keyAt) {
                                this.f14766b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    void b(TotalCaptureResult totalCaptureResult) {
        c(totalCaptureResult, 0);
    }

    void c(TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.f14765a) {
            try {
                long f10 = f(totalCaptureResult);
                if (f10 == -1) {
                    return;
                }
                a(this.f14766b, f10, totalCaptureResult);
                this.f14767c.put(totalCaptureResult, Integer.valueOf(i10));
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d() {
        synchronized (this.f14765a) {
            try {
                this.f14766b.clear();
                for (int i10 = 0; i10 < this.f14768d.size(); i10++) {
                    Iterator it = ((List) this.f14768d.get(this.f14768d.keyAt(i10))).iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.session.b.a(it.next());
                        throw null;
                    }
                }
                this.f14768d.clear();
                this.f14767c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void e() {
        synchronized (this.f14765a) {
            this.f14769e = null;
        }
    }

    void g(d dVar) {
        synchronized (this.f14765a) {
            a(this.f14768d, dVar.get().getTimestamp(), dVar);
        }
        h();
    }

    void k(a aVar) {
        synchronized (this.f14765a) {
            this.f14769e = aVar;
        }
    }
}
