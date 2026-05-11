package t;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import s.C4301a;
import t.J0;
import t.K1;
import t.V1;
import v.AbstractC4893d;
import v.C4896g;
import v.C4899j;
import v.C4900k;
import v.C4906q;
import x.C5083A;

/* renamed from: t.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4527a1 implements InterfaceC4530b1 {

    /* renamed from: a, reason: collision with root package name */
    final Object f41999a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42000b;

    /* renamed from: c, reason: collision with root package name */
    private final d f42001c;

    /* renamed from: d, reason: collision with root package name */
    K1.a f42002d;

    /* renamed from: e, reason: collision with root package name */
    K1 f42003e;

    /* renamed from: f, reason: collision with root package name */
    androidx.camera.core.impl.V0 f42004f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f42005g;

    /* renamed from: h, reason: collision with root package name */
    List f42006h;

    /* renamed from: i, reason: collision with root package name */
    c f42007i;

    /* renamed from: j, reason: collision with root package name */
    h8.d f42008j;

    /* renamed from: k, reason: collision with root package name */
    c.a f42009k;

    /* renamed from: l, reason: collision with root package name */
    private Map f42010l;

    /* renamed from: m, reason: collision with root package name */
    private final x.w f42011m;

    /* renamed from: n, reason: collision with root package name */
    private final C5083A f42012n;

    /* renamed from: o, reason: collision with root package name */
    private final x.t f42013o;

    /* renamed from: p, reason: collision with root package name */
    private final C4896g f42014p;

    /* renamed from: q, reason: collision with root package name */
    private final x.z f42015q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f42016r;

    /* renamed from: t.a1$b */
    class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C4527a1.this.f41999a) {
                try {
                    androidx.camera.core.impl.V0 v02 = C4527a1.this.f42004f;
                    if (v02 == null) {
                        return;
                    }
                    androidx.camera.core.impl.T j10 = v02.j();
                    AbstractC0700h0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C4527a1 c4527a1 = C4527a1.this;
                    c4527a1.e(Collections.singletonList(c4527a1.f42012n.a(j10)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: t.a1$c */
    enum c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: t.a1$d */
    final class d extends K1.c {
        d() {
        }

        @Override // t.K1.c
        public void r(K1 k12) {
            synchronized (C4527a1.this.f41999a) {
                try {
                    switch (C4527a1.this.f42007i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C4527a1.this.f42007i);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            C4527a1.this.r();
                            break;
                        case RELEASED:
                            AbstractC0700h0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    AbstractC0700h0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C4527a1.this.f42007i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.K1.c
        public void s(K1 k12) {
            synchronized (C4527a1.this.f41999a) {
                try {
                    switch (C4527a1.this.f42007i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C4527a1.this.f42007i);
                        case OPENING:
                            C4527a1 c4527a1 = C4527a1.this;
                            c4527a1.f42007i = c.OPENED;
                            c4527a1.f42003e = k12;
                            AbstractC0700h0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C4527a1 c4527a12 = C4527a1.this;
                            c4527a12.x(c4527a12.f42004f);
                            C4527a1.this.w();
                            break;
                        case CLOSED:
                            C4527a1.this.f42003e = k12;
                            break;
                        case RELEASING:
                            k12.close();
                            break;
                    }
                    AbstractC0700h0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C4527a1.this.f42007i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.K1.c
        public void t(K1 k12) {
            synchronized (C4527a1.this.f41999a) {
                try {
                    if (C4527a1.this.f42007i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C4527a1.this.f42007i);
                    }
                    AbstractC0700h0.a("CaptureSession", "CameraCaptureSession.onReady() " + C4527a1.this.f42007i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.K1.c
        public void u(K1 k12) {
            synchronized (C4527a1.this.f41999a) {
                try {
                    if (C4527a1.this.f42007i == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C4527a1.this.f42007i);
                    }
                    AbstractC0700h0.a("CaptureSession", "onSessionFinished()");
                    C4527a1.this.r();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C4527a1(C4896g c4896g) {
        this(c4896g, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object B(c.a aVar) {
        String str;
        synchronized (this.f41999a) {
            y0.f.j(this.f42009k == null, "Release completer expected to be null");
            this.f42009k = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public h8.d A(List list, androidx.camera.core.impl.V0 v02, CameraDevice cameraDevice) {
        synchronized (this.f41999a) {
            try {
                int ordinal = this.f42007i.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        this.f42005g.clear();
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            this.f42005g.put((AbstractC1429c0) this.f42006h.get(i10), (Surface) list.get(i10));
                        }
                        this.f42007i = c.OPENING;
                        AbstractC0700h0.a("CaptureSession", "Opening capture session.");
                        K1.c w10 = V1.w(this.f42001c, new V1.a(v02.k()));
                        C4301a c4301a = new C4301a(v02.f());
                        T.a k10 = T.a.k(v02.j());
                        Map hashMap = new HashMap();
                        if (this.f42016r && Build.VERSION.SDK_INT >= 35) {
                            hashMap = q(u(v02.h()), this.f42005g);
                        }
                        ArrayList arrayList = new ArrayList();
                        String d02 = c4301a.d0(null);
                        for (V0.f fVar : v02.h()) {
                            C4900k c4900k = (!this.f42016r || Build.VERSION.SDK_INT < 35) ? null : (C4900k) hashMap.get(fVar);
                            if (c4900k == null) {
                                c4900k = s(fVar, this.f42005g, d02);
                                if (this.f42010l.containsKey(fVar.f())) {
                                    c4900k.h(((Long) this.f42010l.get(fVar.f())).longValue());
                                }
                            }
                            arrayList.add(c4900k);
                        }
                        C4906q f10 = this.f42002d.f(v02.l(), t(arrayList), w10);
                        if (v02.o() == 5 && v02.g() != null) {
                            f10.f(C4899j.b(v02.g()));
                        }
                        try {
                            CaptureRequest f11 = E0.f(k10.h(), cameraDevice, this.f42015q);
                            if (f11 != null) {
                                f10.g(f11);
                            }
                            return this.f42002d.l(cameraDevice, f10, this.f42006h);
                        } catch (CameraAccessException e10) {
                            return G.n.n(e10);
                        }
                    }
                    if (ordinal != 4) {
                        return G.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f42007i));
                    }
                }
                return G.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f42007i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback o(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(S0.a((AbstractC1450n) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return V.a(arrayList);
    }

    private static List p(List list, int i10) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i10));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            AbstractC0700h0.c("CaptureSession", "Failed to create instances for multi-resolution output, " + e10.getMessage());
            return null;
        }
    }

    private static Map q(Map map, Map map2) {
        HashMap hashMap = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (V0.f fVar : (List) map.get(num)) {
                SurfaceUtil.a a10 = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = a10.f14689a;
                }
                U0.a();
                int i11 = a10.f14690b;
                int i12 = a10.f14691c;
                String d10 = fVar.d();
                Objects.requireNonNull(d10);
                arrayList.add(T0.a(i11, i12, d10));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                AbstractC0700h0.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List p10 = p(arrayList, i10);
                if (p10 != null) {
                    for (V0.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) p10.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(fVar2.f()));
                        hashMap.put(fVar2, new C4900k(outputConfiguration));
                    }
                }
            }
        }
        return hashMap;
    }

    private C4900k s(V0.f fVar, Map map, String str) {
        long j10;
        DynamicRangeProfiles d10;
        Surface surface = (Surface) map.get(fVar.f());
        y0.f.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C4900k c4900k = new C4900k(fVar.g(), surface);
        if (str != null) {
            c4900k.g(str);
        } else {
            c4900k.g(fVar.d());
        }
        if (fVar.c() == 0) {
            c4900k.f(1);
        } else if (fVar.c() == 1) {
            c4900k.f(2);
        }
        if (!fVar.e().isEmpty()) {
            c4900k.b();
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((AbstractC1429c0) it.next());
                y0.f.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c4900k.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (d10 = this.f42014p.d()) != null) {
            A.B b10 = fVar.b();
            Long a10 = AbstractC4893d.a(b10, d10);
            if (a10 != null) {
                j10 = a10.longValue();
                c4900k.e(j10);
                return c4900k;
            }
            AbstractC0700h0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b10);
        }
        j10 = 1;
        c4900k.e(j10);
        return c4900k;
    }

    private List t(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4900k c4900k = (C4900k) it.next();
            if (!arrayList.contains(c4900k.d())) {
                arrayList.add(c4900k.d());
                arrayList2.add(c4900k);
            }
        }
        return arrayList2;
    }

    private static Map u(Collection collection) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            V0.f fVar = (V0.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(fVar.g()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(fVar.g()), list);
                }
                list.add(fVar);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.intValue();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f41999a) {
            try {
                if (this.f42007i == c.OPENED) {
                    x(this.f42004f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        synchronized (this.f41999a) {
            if (this.f42000b.isEmpty()) {
                return;
            }
            try {
                v(this.f42000b);
            } finally {
                this.f42000b.clear();
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public void a() {
        ArrayList<androidx.camera.core.impl.T> arrayList;
        synchronized (this.f41999a) {
            try {
                if (this.f42000b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f42000b);
                    this.f42000b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.T t10 : arrayList) {
                Iterator it = t10.c().iterator();
                while (it.hasNext()) {
                    ((AbstractC1450n) it.next()).a(t10.f());
                }
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public h8.d b(boolean z10) {
        synchronized (this.f41999a) {
            switch (this.f42007i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f42007i);
                case GET_SURFACE:
                    y0.f.h(this.f42002d, "The Opener shouldn't null in state:" + this.f42007i);
                    this.f42002d.stop();
                case INITIALIZED:
                    this.f42007i = c.RELEASED;
                    return G.n.p(null);
                case OPENED:
                case CLOSED:
                    K1 k12 = this.f42003e;
                    if (k12 != null) {
                        if (z10) {
                            try {
                                k12.a();
                            } catch (CameraAccessException e10) {
                                AbstractC0700h0.d("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f42003e.close();
                    }
                case OPENING:
                    this.f42007i = c.RELEASING;
                    this.f42013o.i();
                    y0.f.h(this.f42002d, "The Opener shouldn't null in state:" + this.f42007i);
                    if (this.f42002d.stop()) {
                        r();
                        return G.n.p(null);
                    }
                case RELEASING:
                    if (this.f42008j == null) {
                        this.f42008j = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.W0
                            @Override // androidx.concurrent.futures.c.InterfaceC0253c
                            public final Object a(c.a aVar) {
                                Object B10;
                                B10 = C4527a1.this.B(aVar);
                                return B10;
                            }
                        });
                    }
                    return this.f42008j;
                default:
                    return G.n.p(null);
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public List c() {
        List unmodifiableList;
        synchronized (this.f41999a) {
            unmodifiableList = Collections.unmodifiableList(this.f42000b);
        }
        return unmodifiableList;
    }

    @Override // t.InterfaceC4530b1
    public void close() {
        synchronized (this.f41999a) {
            try {
                int ordinal = this.f42007i.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f42007i);
                }
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        y0.f.h(this.f42002d, "The Opener shouldn't null in state:" + this.f42007i);
                        this.f42002d.stop();
                    } else if (ordinal == 3 || ordinal == 4) {
                        y0.f.h(this.f42002d, "The Opener shouldn't null in state:" + this.f42007i);
                        this.f42002d.stop();
                        this.f42007i = c.CLOSED;
                        this.f42013o.i();
                        this.f42004f = null;
                    }
                }
                this.f42007i = c.RELEASED;
            } finally {
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public h8.d d(final androidx.camera.core.impl.V0 v02, final CameraDevice cameraDevice, K1.a aVar) {
        synchronized (this.f41999a) {
            try {
                if (this.f42007i.ordinal() == 1) {
                    this.f42007i = c.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(v02.n());
                    this.f42006h = arrayList;
                    this.f42002d = aVar;
                    G.d f10 = G.d.a(aVar.m(arrayList, 5000L)).f(new G.a() { // from class: t.X0
                        @Override // G.a
                        public final h8.d apply(Object obj) {
                            h8.d A10;
                            A10 = C4527a1.this.A(v02, cameraDevice, (List) obj);
                            return A10;
                        }
                    }, this.f42002d.b());
                    G.n.j(f10, new a(), this.f42002d.b());
                    return G.n.B(f10);
                }
                AbstractC0700h0.c("CaptureSession", "Open not allowed in state: " + this.f42007i);
                return G.n.n(new IllegalStateException("open() should not allow the state: " + this.f42007i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public void e(List list) {
        synchronized (this.f41999a) {
            try {
                switch (this.f42007i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f42007i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f42000b.addAll(list);
                        break;
                    case OPENED:
                        this.f42000b.addAll(list);
                        w();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public androidx.camera.core.impl.V0 f() {
        androidx.camera.core.impl.V0 v02;
        synchronized (this.f41999a) {
            v02 = this.f42004f;
        }
        return v02;
    }

    @Override // t.InterfaceC4530b1
    public void g(androidx.camera.core.impl.V0 v02) {
        synchronized (this.f41999a) {
            try {
                switch (this.f42007i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f42007i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f42004f = v02;
                        break;
                    case OPENED:
                        this.f42004f = v02;
                        if (v02 != null) {
                            if (!this.f42005g.keySet().containsAll(v02.n())) {
                                AbstractC0700h0.c("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                AbstractC0700h0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                x(this.f42004f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // t.InterfaceC4530b1
    public boolean h() {
        boolean z10;
        synchronized (this.f41999a) {
            try {
                c cVar = this.f42007i;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z10;
    }

    @Override // t.InterfaceC4530b1
    public void i(Map map) {
        synchronized (this.f41999a) {
            this.f42010l = map;
        }
    }

    void r() {
        c cVar = this.f42007i;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            AbstractC0700h0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f42007i = cVar2;
        this.f42003e = null;
        c.a aVar = this.f42009k;
        if (aVar != null) {
            aVar.c(null);
            this.f42009k = null;
        }
    }

    int v(List list) {
        J0 j02;
        ArrayList arrayList;
        boolean z10;
        synchronized (this.f41999a) {
            try {
                if (this.f42007i != c.OPENED) {
                    AbstractC0700h0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    j02 = new J0();
                    arrayList = new ArrayList();
                    AbstractC0700h0.a("CaptureSession", "Issuing capture request.");
                    Iterator it = list.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.T t10 = (androidx.camera.core.impl.T) it.next();
                        if (t10.i().isEmpty()) {
                            AbstractC0700h0.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = t10.i().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AbstractC1429c0 abstractC1429c0 = (AbstractC1429c0) it2.next();
                                    if (!this.f42005g.containsKey(abstractC1429c0)) {
                                        AbstractC0700h0.a("CaptureSession", "Skipping capture request with invalid surface: " + abstractC1429c0);
                                        break;
                                    }
                                } else {
                                    if (t10.k() == 2) {
                                        z10 = true;
                                    }
                                    T.a k10 = T.a.k(t10);
                                    if (t10.k() == 5 && t10.d() != null) {
                                        k10.p(t10.d());
                                    }
                                    androidx.camera.core.impl.V0 v02 = this.f42004f;
                                    if (v02 != null) {
                                        k10.e(v02.j().g());
                                    }
                                    k10.e(t10.g());
                                    CaptureRequest e10 = E0.e(k10.h(), this.f42003e.j(), this.f42005g, false, this.f42015q);
                                    if (e10 == null) {
                                        AbstractC0700h0.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = t10.c().iterator();
                                    while (it3.hasNext()) {
                                        S0.b((AbstractC1450n) it3.next(), arrayList2);
                                    }
                                    j02.a(e10, arrayList2);
                                    arrayList.add(e10);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e11) {
                    AbstractC0700h0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    AbstractC0700h0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f42011m.a(arrayList, z10)) {
                    this.f42003e.d();
                    j02.c(new J0.a() { // from class: t.Z0
                        @Override // t.J0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z11) {
                            C4527a1.this.y(cameraCaptureSession, i10, z11);
                        }
                    });
                }
                if (this.f42012n.b(arrayList, z10)) {
                    j02.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                return this.f42003e.g(arrayList, j02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void w() {
        this.f42013o.e().e(new Runnable() { // from class: t.Y0
            @Override // java.lang.Runnable
            public final void run() {
                C4527a1.this.z();
            }
        }, F.c.b());
    }

    int x(androidx.camera.core.impl.V0 v02) {
        synchronized (this.f41999a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (v02 == null) {
                AbstractC0700h0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f42007i != c.OPENED) {
                AbstractC0700h0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            androidx.camera.core.impl.T j10 = v02.j();
            if (j10.i().isEmpty()) {
                AbstractC0700h0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f42003e.d();
                } catch (CameraAccessException e10) {
                    AbstractC0700h0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                AbstractC0700h0.a("CaptureSession", "Issuing request for session.");
                CaptureRequest e11 = E0.e(j10, this.f42003e.j(), this.f42005g, true, this.f42015q);
                if (e11 == null) {
                    AbstractC0700h0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f42003e.k(e11, this.f42013o.d(o(j10.c(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e12) {
                AbstractC0700h0.c("CaptureSession", "Unable to access camera: " + e12.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    C4527a1(C4896g c4896g, boolean z10) {
        this(c4896g, new androidx.camera.core.impl.P0(Collections.emptyList()), z10);
    }

    C4527a1(C4896g c4896g, androidx.camera.core.impl.P0 p02) {
        this(c4896g, p02, false);
    }

    C4527a1(C4896g c4896g, androidx.camera.core.impl.P0 p02, boolean z10) {
        this.f41999a = new Object();
        this.f42000b = new ArrayList();
        this.f42005g = new HashMap();
        this.f42006h = Collections.emptyList();
        this.f42007i = c.UNINITIALIZED;
        this.f42010l = new HashMap();
        this.f42011m = new x.w();
        this.f42012n = new C5083A();
        this.f42007i = c.INITIALIZED;
        this.f42014p = c4896g;
        this.f42001c = new d();
        this.f42013o = new x.t(p02.a(CaptureNoResponseQuirk.class));
        this.f42015q = new x.z(p02);
        this.f42016r = z10;
    }

    /* renamed from: t.a1$a */
    class a implements G.c {
        a() {
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            synchronized (C4527a1.this.f41999a) {
                try {
                    C4527a1.this.f42002d.stop();
                    int ordinal = C4527a1.this.f42007i.ordinal();
                    if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th instanceof CancellationException)) {
                        AbstractC0700h0.m("CaptureSession", "Opening session with fail " + C4527a1.this.f42007i, th);
                        C4527a1.this.r();
                    }
                } finally {
                }
            }
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
