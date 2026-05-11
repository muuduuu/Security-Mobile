package t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t.K1;
import u.AbstractC4838b;
import u.AbstractC4841e;

/* loaded from: classes.dex */
final class V1 extends K1.c {

    /* renamed from: a, reason: collision with root package name */
    private final List f41933a;

    V1(List list) {
        ArrayList arrayList = new ArrayList();
        this.f41933a = arrayList;
        arrayList.addAll(list);
    }

    static K1.c w(K1.c... cVarArr) {
        return new V1(Arrays.asList(cVarArr));
    }

    @Override // t.K1.c
    public void o(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).o(k12);
        }
    }

    @Override // t.K1.c
    public void p(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).p(k12);
        }
    }

    @Override // t.K1.c
    public void q(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).q(k12);
        }
    }

    @Override // t.K1.c
    public void r(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).r(k12);
        }
    }

    @Override // t.K1.c
    public void s(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).s(k12);
        }
    }

    @Override // t.K1.c
    public void t(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).t(k12);
        }
    }

    @Override // t.K1.c
    void u(K1 k12) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).u(k12);
        }
    }

    @Override // t.K1.c
    public void v(K1 k12, Surface surface) {
        Iterator it = this.f41933a.iterator();
        while (it.hasNext()) {
            ((K1.c) it.next()).v(k12, surface);
        }
    }

    static class a extends K1.c {

        /* renamed from: a, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f41934a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f41934a = stateCallback;
        }

        @Override // t.K1.c
        public void o(K1 k12) {
            this.f41934a.onActive(k12.h().c());
        }

        @Override // t.K1.c
        public void p(K1 k12) {
            AbstractC4841e.a(this.f41934a, k12.h().c());
        }

        @Override // t.K1.c
        public void q(K1 k12) {
            this.f41934a.onClosed(k12.h().c());
        }

        @Override // t.K1.c
        public void r(K1 k12) {
            this.f41934a.onConfigureFailed(k12.h().c());
        }

        @Override // t.K1.c
        public void s(K1 k12) {
            this.f41934a.onConfigured(k12.h().c());
        }

        @Override // t.K1.c
        public void t(K1 k12) {
            this.f41934a.onReady(k12.h().c());
        }

        @Override // t.K1.c
        public void v(K1 k12, Surface surface) {
            AbstractC4838b.a(this.f41934a, k12.h().c(), surface);
        }

        a(List list) {
            this(K0.a(list));
        }

        @Override // t.K1.c
        void u(K1 k12) {
        }
    }
}
