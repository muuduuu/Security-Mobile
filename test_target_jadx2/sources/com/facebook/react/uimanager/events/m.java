package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.events.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public class m extends d {

    /* renamed from: g, reason: collision with root package name */
    private static final String f22382g = "m";

    /* renamed from: h, reason: collision with root package name */
    private static final y0.e f22383h = new y0.e(6);

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f22384a;

    /* renamed from: b, reason: collision with root package name */
    private String f22385b;

    /* renamed from: c, reason: collision with root package name */
    private short f22386c = -1;

    /* renamed from: d, reason: collision with root package name */
    private List f22387d;

    /* renamed from: e, reason: collision with root package name */
    private b f22388e;

    /* renamed from: f, reason: collision with root package name */
    private d.b f22389f;

    class a implements d.b {
        a() {
        }

        @Override // com.facebook.react.uimanager.events.d.b
        public boolean a(int i10, String str) {
            if (!str.equals(m.this.f22385b)) {
                return false;
            }
            if (!n.f(str)) {
                return m.this.getViewTag() == i10;
            }
            Iterator it = m.this.f22388e.e().iterator();
            while (it.hasNext()) {
                if (((G0.b) it.next()).b() == i10) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f22391a;

        /* renamed from: b, reason: collision with root package name */
        private int f22392b;

        /* renamed from: c, reason: collision with root package name */
        private int f22393c;

        /* renamed from: d, reason: collision with root package name */
        private int f22394d;

        /* renamed from: e, reason: collision with root package name */
        private Map f22395e;

        /* renamed from: f, reason: collision with root package name */
        private Map f22396f;

        /* renamed from: g, reason: collision with root package name */
        private Map f22397g;

        /* renamed from: h, reason: collision with root package name */
        private Map f22398h;

        /* renamed from: i, reason: collision with root package name */
        private Set f22399i;

        public b(int i10, int i11, int i12, int i13, Map map, Map map2, Map map3, Map map4, Set set) {
            this.f22391a = i10;
            this.f22392b = i11;
            this.f22393c = i12;
            this.f22394d = i13;
            this.f22395e = map;
            this.f22396f = map2;
            this.f22397g = map3;
            this.f22398h = map4;
            this.f22399i = new HashSet(set);
        }

        public int b() {
            return this.f22392b;
        }

        public final Map c() {
            return this.f22397g;
        }

        public final Map d() {
            return this.f22396f;
        }

        public final List e() {
            return (List) this.f22396f.get(Integer.valueOf(this.f22392b));
        }

        public Set f() {
            return this.f22399i;
        }

        public int g() {
            return this.f22393c;
        }

        public final Map h() {
            return this.f22395e;
        }

        public int i() {
            return this.f22391a;
        }

        public final Map j() {
            return this.f22398h;
        }

        public int k() {
            return this.f22394d;
        }

        public boolean l(int i10) {
            return this.f22399i.contains(Integer.valueOf(i10));
        }
    }

    private m() {
    }

    private void c(WritableMap writableMap, int i10) {
        writableMap.putBoolean("ctrlKey", (i10 & 4096) != 0);
        writableMap.putBoolean("shiftKey", (i10 & 1) != 0);
        writableMap.putBoolean("altKey", (i10 & 2) != 0);
        writableMap.putBoolean("metaKey", (i10 & 65536) != 0);
    }

    private List d() {
        int actionIndex;
        actionIndex = this.f22384a.getActionIndex();
        String str = this.f22385b;
        str.hashCode();
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerDown":
            case "topPointerOver":
            case "topPointerUp":
            case "topClick":
            case "topPointerOut":
                return Arrays.asList(e(actionIndex));
            case "topPointerMove":
            case "topPointerCancel":
                return f();
            default:
                return null;
        }
    }

    private WritableMap e(int i10) {
        WritableMap createMap = Arguments.createMap();
        int pointerId = this.f22384a.getPointerId(i10);
        createMap.putDouble("pointerId", pointerId);
        String e10 = n.e(this.f22384a.getToolType(i10));
        createMap.putString("pointerType", e10);
        createMap.putBoolean("isPrimary", !h() && (this.f22388e.l(pointerId) || pointerId == this.f22388e.f22391a));
        float[] fArr = (float[]) this.f22388e.c().get(Integer.valueOf(pointerId));
        double e11 = C1944g0.e(fArr[0]);
        double e12 = C1944g0.e(fArr[1]);
        createMap.putDouble("clientX", e11);
        createMap.putDouble("clientY", e12);
        float[] fArr2 = (float[]) this.f22388e.j().get(Integer.valueOf(pointerId));
        double e13 = C1944g0.e(fArr2[0]);
        double e14 = C1944g0.e(fArr2[1]);
        createMap.putDouble("screenX", e13);
        createMap.putDouble("screenY", e14);
        createMap.putDouble("x", e11);
        createMap.putDouble("y", e12);
        createMap.putDouble("pageX", e11);
        createMap.putDouble("pageY", e12);
        float[] fArr3 = (float[]) this.f22388e.h().get(Integer.valueOf(pointerId));
        createMap.putDouble("offsetX", C1944g0.e(fArr3[0]));
        createMap.putDouble("offsetY", C1944g0.e(fArr3[1]));
        createMap.putInt("target", getViewTag());
        createMap.putDouble("timestamp", getTimestampMs());
        createMap.putInt("detail", 0);
        createMap.putDouble("tiltX", 0.0d);
        createMap.putDouble("tiltY", 0.0d);
        createMap.putInt("twist", 0);
        if (e10.equals("mouse") || h()) {
            createMap.putDouble("width", 1.0d);
            createMap.putDouble("height", 1.0d);
        } else {
            double e15 = C1944g0.e(this.f22384a.getTouchMajor(i10));
            createMap.putDouble("width", e15);
            createMap.putDouble("height", e15);
        }
        int buttonState = this.f22384a.getButtonState();
        createMap.putInt("button", n.a(e10, this.f22388e.g(), buttonState));
        createMap.putInt("buttons", n.b(this.f22385b, e10, buttonState));
        createMap.putDouble("pressure", h() ? 0.0d : n.d(createMap.getInt("buttons"), this.f22385b));
        createMap.putDouble("tangentialPressure", 0.0d);
        c(createMap, this.f22384a.getMetaState());
        return createMap;
    }

    private List f() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f22384a.getPointerCount(); i10++) {
            arrayList.add(e(i10));
        }
        return arrayList;
    }

    private void g(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        super.init(bVar.k(), i10, motionEvent.getEventTime());
        this.f22385b = str;
        this.f22384a = MotionEvent.obtain(motionEvent);
        this.f22386c = s10;
        this.f22388e = bVar;
    }

    private boolean h() {
        return this.f22385b.equals("topClick");
    }

    public static m i(String str, int i10, b bVar, MotionEvent motionEvent) {
        m mVar = (m) f22383h.b();
        if (mVar == null) {
            mVar = new m();
        }
        mVar.g(str, i10, bVar, (MotionEvent) AbstractC4012a.c(motionEvent), (short) 0);
        return mVar;
    }

    public static m j(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        m mVar = (m) f22383h.b();
        if (mVar == null) {
            mVar = new m();
        }
        mVar.g(str, i10, bVar, (MotionEvent) AbstractC4012a.c(motionEvent), s10);
        return mVar;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.f22384a == null) {
            ReactSoftExceptionLogger.logSoftException(f22382g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f22387d == null) {
            this.f22387d = d();
        }
        List list = this.f22387d;
        if (list == null) {
            return;
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMap : this.f22387d) {
            if (z10) {
                writableMap = writableMap.copy();
            }
            rCTEventEmitter.receiveEvent(getViewTag(), this.f22385b, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (this.f22384a == null) {
            ReactSoftExceptionLogger.logSoftException(f22382g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f22387d == null) {
            this.f22387d = d();
        }
        List list = this.f22387d;
        if (list == null) {
            return;
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMap : this.f22387d) {
            if (z10) {
                writableMap = writableMap.copy();
            }
            WritableMap writableMap2 = writableMap;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this.f22385b;
            short s10 = this.f22386c;
            rCTModernEventEmitter.receiveEvent(surfaceId, viewTag, str, s10 != -1, s10, writableMap2, n.c(str));
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f22386c;
    }

    @Override // com.facebook.react.uimanager.events.d
    public d.b getEventAnimationDriverMatchSpec() {
        if (this.f22389f == null) {
            this.f22389f = new a();
        }
        return this.f22389f;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f22385b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f22387d = null;
        MotionEvent motionEvent = this.f22384a;
        this.f22384a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f22383h.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f22382g, e10);
        }
    }
}
