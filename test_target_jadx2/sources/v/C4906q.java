package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: v.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4906q {

    /* renamed from: a, reason: collision with root package name */
    private final c f43802a;

    /* renamed from: v.q$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final List f43805a;

        /* renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f43806b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f43807c;

        /* renamed from: d, reason: collision with root package name */
        private final int f43808d;

        /* renamed from: e, reason: collision with root package name */
        private C4899j f43809e = null;

        /* renamed from: f, reason: collision with root package name */
        private CaptureRequest f43810f = null;

        b(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f43808d = i10;
            this.f43805a = Collections.unmodifiableList(new ArrayList(list));
            this.f43806b = stateCallback;
            this.f43807c = executor;
        }

        @Override // v.C4906q.c
        public C4899j a() {
            return this.f43809e;
        }

        @Override // v.C4906q.c
        public Executor b() {
            return this.f43807c;
        }

        @Override // v.C4906q.c
        public CameraCaptureSession.StateCallback c() {
            return this.f43806b;
        }

        @Override // v.C4906q.c
        public void d(C4899j c4899j) {
            if (this.f43808d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f43809e = c4899j;
        }

        @Override // v.C4906q.c
        public Object e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f43809e, bVar.f43809e) && this.f43808d == bVar.f43808d && this.f43805a.size() == bVar.f43805a.size()) {
                    for (int i10 = 0; i10 < this.f43805a.size(); i10++) {
                        if (!((C4900k) this.f43805a.get(i10)).equals(bVar.f43805a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // v.C4906q.c
        public int f() {
            return this.f43808d;
        }

        @Override // v.C4906q.c
        public List g() {
            return this.f43805a;
        }

        @Override // v.C4906q.c
        public void h(CaptureRequest captureRequest) {
            this.f43810f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f43805a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            C4899j c4899j = this.f43809e;
            int hashCode2 = (c4899j == null ? 0 : c4899j.hashCode()) ^ i10;
            return this.f43808d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* renamed from: v.q$c */
    private interface c {
        C4899j a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        void d(C4899j c4899j);

        Object e();

        int f();

        List g();

        void h(CaptureRequest captureRequest);
    }

    public C4906q(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f43802a = new b(i10, list, executor, stateCallback);
        } else {
            this.f43802a = new a(i10, list, executor, stateCallback);
        }
    }

    public static List h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((C4900k) it.next()).i());
        }
        return arrayList;
    }

    static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C4900k.j((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f43802a.b();
    }

    public C4899j b() {
        return this.f43802a.a();
    }

    public List c() {
        return this.f43802a.g();
    }

    public int d() {
        return this.f43802a.f();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f43802a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4906q) {
            return this.f43802a.equals(((C4906q) obj).f43802a);
        }
        return false;
    }

    public void f(C4899j c4899j) {
        this.f43802a.d(c4899j);
    }

    public void g(CaptureRequest captureRequest) {
        this.f43802a.h(captureRequest);
    }

    public int hashCode() {
        return this.f43802a.hashCode();
    }

    public Object j() {
        return this.f43802a.e();
    }

    /* renamed from: v.q$a */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f43803a;

        /* renamed from: b, reason: collision with root package name */
        private final List f43804b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f43803a = sessionConfiguration;
            this.f43804b = Collections.unmodifiableList(C4906q.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // v.C4906q.c
        public C4899j a() {
            return C4899j.b(this.f43803a.getInputConfiguration());
        }

        @Override // v.C4906q.c
        public Executor b() {
            return this.f43803a.getExecutor();
        }

        @Override // v.C4906q.c
        public CameraCaptureSession.StateCallback c() {
            return this.f43803a.getStateCallback();
        }

        @Override // v.C4906q.c
        public void d(C4899j c4899j) {
            this.f43803a.setInputConfiguration((InputConfiguration) c4899j.a());
        }

        @Override // v.C4906q.c
        public Object e() {
            return this.f43803a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f43803a, ((a) obj).f43803a);
            }
            return false;
        }

        @Override // v.C4906q.c
        public int f() {
            return this.f43803a.getSessionType();
        }

        @Override // v.C4906q.c
        public List g() {
            return this.f43804b;
        }

        @Override // v.C4906q.c
        public void h(CaptureRequest captureRequest) {
            this.f43803a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f43803a.hashCode();
        }

        a(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, C4906q.h(list), executor, stateCallback));
        }
    }
}
