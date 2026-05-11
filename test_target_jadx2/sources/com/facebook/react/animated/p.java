package com.facebook.react.animated;

import a5.C1351a;
import android.util.SparseArray;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes.dex */
public class p implements com.facebook.react.uimanager.events.h {

    /* renamed from: e, reason: collision with root package name */
    private final ReactApplicationContext f21323e;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f21319a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f21320b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f21321c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final List f21322d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private int f21324f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final List f21325g = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f21326h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21327i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21328j = false;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f21329a;

        a(com.facebook.react.uimanager.events.d dVar) {
            this.f21329a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.n(this.f21329a);
        }
    }

    public p(ReactApplicationContext reactApplicationContext) {
        this.f21323e = reactApplicationContext;
    }

    private void C(List list) {
        int i10 = this.f21324f;
        int i11 = i10 + 1;
        this.f21324f = i11;
        if (i11 == 0) {
            this.f21324f = i10 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i13 = bVar.f21266c;
            int i14 = this.f21324f;
            if (i13 != i14) {
                bVar.f21266c = i14;
                i12++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.f21264a != null) {
                for (int i15 = 0; i15 < bVar2.f21264a.size(); i15++) {
                    b bVar3 = (b) bVar2.f21264a.get(i15);
                    bVar3.f21265b++;
                    int i16 = bVar3.f21266c;
                    int i17 = this.f21324f;
                    if (i16 != i17) {
                        bVar3.f21266c = i17;
                        i12++;
                        arrayDeque.add(bVar3);
                    }
                }
            }
        }
        int i18 = this.f21324f;
        int i19 = i18 + 1;
        this.f21324f = i19;
        if (i19 == 0) {
            this.f21324f = i18 + 2;
        }
        Iterator it2 = list.iterator();
        int i20 = 0;
        while (it2.hasNext()) {
            b bVar4 = (b) it2.next();
            if (bVar4.f21265b == 0) {
                int i21 = bVar4.f21266c;
                int i22 = this.f21324f;
                if (i21 != i22) {
                    bVar4.f21266c = i22;
                    i20++;
                    arrayDeque.add(bVar4);
                }
            }
        }
        int i23 = 0;
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            try {
                bVar5.h();
                if (bVar5 instanceof r) {
                    ((r) bVar5).m();
                }
            } catch (JSApplicationCausedNativeException e10) {
                AbstractC1721a.n("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e10);
            }
            if (bVar5 instanceof x) {
                ((x) bVar5).m();
            }
            if (bVar5.f21264a != null) {
                for (int i24 = 0; i24 < bVar5.f21264a.size(); i24++) {
                    b bVar6 = (b) bVar5.f21264a.get(i24);
                    int i25 = bVar6.f21265b - 1;
                    bVar6.f21265b = i25;
                    int i26 = bVar6.f21266c;
                    int i27 = this.f21324f;
                    if (i26 != i27 && i25 == 0) {
                        bVar6.f21266c = i27;
                        i20++;
                        arrayDeque.add(bVar6);
                    } else if (i26 == i27) {
                        i23++;
                    }
                }
            }
        }
        if (i12 == i20) {
            this.f21328j = false;
            return;
        }
        if (this.f21328j) {
            return;
        }
        this.f21328j = true;
        AbstractC1721a.m("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            AbstractC1721a.m("NativeAnimatedNodesManager", ((b) it3.next()).f());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i23 > 0 ? "cycles (" + i23 + ")" : "disconnected regions") + ", there are " + i12 + " but toposort visited only " + i20);
        boolean z10 = this.f21326h;
        if (z10 && i23 == 0) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z10) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.facebook.react.uimanager.events.d dVar) {
        ReactApplicationContext reactApplicationContext;
        if (this.f21322d.isEmpty() || (reactApplicationContext = this.f21323e) == null || L0.g(reactApplicationContext, C1351a.b(dVar.getViewTag(), dVar.getSurfaceId())) == null) {
            return;
        }
        d.b eventAnimationDriverMatchSpec = dVar.getEventAnimationDriverMatchSpec();
        boolean z10 = false;
        for (EventAnimationDriver eventAnimationDriver : this.f21322d) {
            if (eventAnimationDriverMatchSpec.a(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                z(eventAnimationDriver.valueNode);
                dVar.dispatchModern(eventAnimationDriver);
                this.f21325g.add(eventAnimationDriver.valueNode);
                z10 = true;
            }
        }
        if (z10) {
            C(this.f21325g);
            this.f21325g.clear();
        }
    }

    private String q(String str) {
        if (!str.startsWith("on")) {
            return str;
        }
        return "top" + str.substring(2);
    }

    private void z(b bVar) {
        WritableArray writableArray = null;
        int i10 = 0;
        while (i10 < this.f21320b.size()) {
            e eVar = (e) this.f21320b.valueAt(i10);
            if (bVar.equals(eVar.f21269b)) {
                if (eVar.f21270c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    createMap.putDouble("value", eVar.f21269b.f21376f);
                    eVar.f21270c.invoke(createMap);
                } else if (this.f21323e != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("animationId", eVar.f21271d);
                    createMap2.putBoolean("finished", false);
                    createMap2.putDouble("value", eVar.f21269b.f21376f);
                    if (writableArray == null) {
                        writableArray = Arguments.createArray();
                    }
                    writableArray.pushMap(createMap2);
                }
                this.f21320b.removeAt(i10);
                i10--;
            }
            i10++;
        }
        if (writableArray != null) {
            this.f21323e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
        }
    }

    public void A(int i10) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar != null && (bVar instanceof x)) {
            ((x) bVar).n(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void B(int i10, ReadableMap readableMap) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i10 + "] does not exist");
        }
        if (bVar instanceof d) {
            z(bVar);
            ((d) bVar).a(readableMap);
            this.f21321c.put(i10, bVar);
        }
    }

    public void b(int i10, String str, ReadableMap readableMap) {
        int i11 = readableMap.getInt("animatedValueTag");
        b bVar = (b) this.f21319a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i11 + "] does not exist");
        }
        if (!(bVar instanceof x)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i10 + "] connected to event handler (" + str + ") should be of type " + x.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i12 = 0; i12 < array.size(); i12++) {
            arrayList.add(array.getString(i12));
        }
        String q10 = q(str);
        this.f21322d.add(new EventAnimationDriver(q10, i10, arrayList, (x) bVar));
        if (q10.equals("topScroll")) {
            b(i10, "topScrollEnded", readableMap);
        }
    }

    public void c(int i10, int i11) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i10 + "] does not exist");
        }
        if (!(bVar instanceof r)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i11 + "] should be of type " + r.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.f21323e;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i11);
        }
        UIManager i12 = L0.i(reactApplicationContext, i11);
        if (i12 != null) {
            ((r) bVar).i(i11, i12);
            this.f21321c.put(i10, bVar);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i11));
        }
    }

    public void d(int i10, int i11) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
        }
        b bVar2 = (b) this.f21319a.get(i11);
        if (bVar2 != null) {
            bVar.b(bVar2);
            this.f21321c.put(i11, bVar2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
    }

    public void e(int i10, ReadableMap readableMap) {
        b qVar;
        if (this.f21319a.get(i10) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i10 + "] already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            qVar = new t(readableMap, this);
        } else if ("value".equals(string)) {
            qVar = new x(readableMap);
        } else if ("color".equals(string)) {
            qVar = new f(readableMap, this, this.f21323e);
        } else if ("props".equals(string)) {
            qVar = new r(readableMap, this);
        } else if ("interpolation".equals(string)) {
            qVar = new k(readableMap);
        } else if ("addition".equals(string)) {
            qVar = new com.facebook.react.animated.a(readableMap, this);
        } else if ("subtraction".equals(string)) {
            qVar = new u(readableMap, this);
        } else if ("division".equals(string)) {
            qVar = new i(readableMap, this);
        } else if ("multiplication".equals(string)) {
            qVar = new m(readableMap, this);
        } else if ("modulus".equals(string)) {
            qVar = new l(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            qVar = new h(readableMap, this);
        } else if ("transform".equals(string)) {
            qVar = new w(readableMap, this);
        } else if ("tracking".equals(string)) {
            qVar = new v(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            qVar = new q(readableMap, this);
        }
        qVar.f21267d = i10;
        this.f21319a.put(i10, qVar);
        this.f21321c.put(i10, qVar);
    }

    public void f(int i10, int i11) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i10 + "] does not exist");
        }
        if (bVar instanceof r) {
            ((r) bVar).j(i11);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i11 + "] should be of type " + r.class.getName());
    }

    public void g(int i10, int i11) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
        }
        b bVar2 = (b) this.f21319a.get(i11);
        if (bVar2 != null) {
            bVar.g(bVar2);
            this.f21321c.put(i11, bVar2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
    }

    public void h(int i10) {
        this.f21319a.remove(i10);
        this.f21321c.remove(i10);
    }

    public void i(int i10) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar != null && (bVar instanceof x)) {
            ((x) bVar).i();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public void j(int i10) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar != null && (bVar instanceof x)) {
            ((x) bVar).j();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public b k(int i10) {
        return (b) this.f21319a.get(i10);
    }

    Set l(int i10, String str) {
        int i11;
        List list;
        HashSet hashSet = new HashSet();
        ListIterator listIterator = this.f21322d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (eventAnimationDriver != null && str.equals(eventAnimationDriver.eventName) && i10 == (i11 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i11));
                x xVar = eventAnimationDriver.valueNode;
                if (xVar != null && (list = xVar.f21264a) != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((b) it.next()).f21267d));
                    }
                }
            }
        }
        return hashSet;
    }

    public void m(int i10, Callback callback) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == null || !(bVar instanceof x)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i10 + "] does not exist or is not a 'value' node");
        }
        double l10 = ((x) bVar).l();
        if (callback != null) {
            callback.invoke(Double.valueOf(l10));
        } else {
            if (this.f21323e == null) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", i10);
            createMap.putDouble("value", l10);
            this.f21323e.emitDeviceEvent("onNativeAnimatedModuleGetValue", createMap);
        }
    }

    public boolean o() {
        return this.f21320b.size() > 0 || this.f21321c.size() > 0;
    }

    @Override // com.facebook.react.uimanager.events.h
    public void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
        if (UiThreadUtil.isOnUiThread()) {
            n(dVar);
        } else {
            UiThreadUtil.runOnUiThread(new a(dVar));
        }
    }

    public void p(int i10) {
        if (i10 == 2) {
            if (this.f21326h) {
                return;
            }
        } else if (this.f21327i) {
            return;
        }
        UIManager g10 = L0.g(this.f21323e, i10);
        if (g10 != null) {
            g10.getEventDispatcher().b(this);
            if (i10 == 2) {
                this.f21326h = true;
            } else {
                this.f21327i = true;
            }
        }
    }

    public void r(int i10, String str, int i11) {
        String q10 = q(str);
        ListIterator listIterator = this.f21322d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (q10.equals(eventAnimationDriver.eventName) && i10 == eventAnimationDriver.viewTag && i11 == eventAnimationDriver.valueNode.f21267d) {
                listIterator.remove();
                return;
            }
        }
    }

    public void s(int i10) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar == null) {
            return;
        }
        if (bVar instanceof r) {
            ((r) bVar).l();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + r.class.getName());
    }

    public void t(long j10) {
        UiThreadUtil.assertOnUiThread();
        for (int i10 = 0; i10 < this.f21321c.size(); i10++) {
            this.f21325g.add((b) this.f21321c.valueAt(i10));
        }
        this.f21321c.clear();
        boolean z10 = false;
        for (int i11 = 0; i11 < this.f21320b.size(); i11++) {
            e eVar = (e) this.f21320b.valueAt(i11);
            eVar.b(j10);
            this.f21325g.add(eVar.f21269b);
            if (eVar.f21268a) {
                z10 = true;
            }
        }
        C(this.f21325g);
        this.f21325g.clear();
        if (z10) {
            WritableArray writableArray = null;
            for (int size = this.f21320b.size() - 1; size >= 0; size--) {
                e eVar2 = (e) this.f21320b.valueAt(size);
                if (eVar2.f21268a) {
                    if (eVar2.f21270c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        createMap.putDouble("value", eVar2.f21269b.f21376f);
                        eVar2.f21270c.invoke(createMap);
                    } else if (this.f21323e != null) {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putInt("animationId", eVar2.f21271d);
                        createMap2.putBoolean("finished", true);
                        createMap2.putDouble("value", eVar2.f21269b.f21376f);
                        if (writableArray == null) {
                            writableArray = Arguments.createArray();
                        }
                        writableArray.pushMap(createMap2);
                    }
                    this.f21320b.removeAt(size);
                }
            }
            if (writableArray != null) {
                this.f21323e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
            }
        }
    }

    public void u(int i10, double d10) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar != null && (bVar instanceof x)) {
            ((x) bVar).f21377g = d10;
            this.f21321c.put(i10, bVar);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
    }

    public void v(int i10, double d10) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar != null && (bVar instanceof x)) {
            z(bVar);
            ((x) bVar).f21376f = d10;
            this.f21321c.put(i10, bVar);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
    }

    public void w(int i10, int i11, ReadableMap readableMap, Callback callback) {
        e gVar;
        b bVar = (b) this.f21319a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] does not exist");
        }
        if (!(bVar instanceof x)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] should be of type " + x.class.getName());
        }
        e eVar = (e) this.f21320b.get(i10);
        if (eVar != null) {
            eVar.a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            gVar = new j(readableMap);
        } else if ("spring".equals(string)) {
            gVar = new s(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i11 + "]: " + string);
            }
            gVar = new g(readableMap);
        }
        gVar.f21271d = i10;
        gVar.f21270c = callback;
        gVar.f21269b = (x) bVar;
        this.f21320b.put(i10, gVar);
    }

    public void x(int i10, c cVar) {
        b bVar = (b) this.f21319a.get(i10);
        if (bVar != null && (bVar instanceof x)) {
            ((x) bVar).n(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public void y(int i10) {
        WritableArray writableArray;
        int i11 = 0;
        while (true) {
            writableArray = null;
            if (i11 >= this.f21320b.size()) {
                break;
            }
            e eVar = (e) this.f21320b.valueAt(i11);
            if (eVar.f21271d == i10) {
                if (eVar.f21270c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    createMap.putDouble("value", eVar.f21269b.f21376f);
                    eVar.f21270c.invoke(createMap);
                } else if (this.f21323e != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("animationId", eVar.f21271d);
                    createMap2.putBoolean("finished", false);
                    createMap2.putDouble("value", eVar.f21269b.f21376f);
                    writableArray = Arguments.createArray();
                    writableArray.pushMap(createMap2);
                }
                this.f21320b.removeAt(i11);
            } else {
                i11++;
            }
        }
        if (writableArray != null) {
            this.f21323e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
        }
    }
}
