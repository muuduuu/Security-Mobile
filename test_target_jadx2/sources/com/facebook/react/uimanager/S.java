package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c3.AbstractC1721a;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.m;
import com.facebook.react.uimanager.events.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public class S {

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f22273j = {0, 0};

    /* renamed from: a, reason: collision with root package name */
    private Map f22274a;

    /* renamed from: b, reason: collision with root package name */
    private Map f22275b;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f22282i;

    /* renamed from: d, reason: collision with root package name */
    private Set f22277d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private int f22278e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f22279f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f22280g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f22281h = 0;

    /* renamed from: c, reason: collision with root package name */
    private Map f22276c = new HashMap();

    public S(ViewGroup viewGroup) {
        this.f22282i = viewGroup;
    }

    private MotionEvent a(View view, MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f22282i.getLocationOnScreen(new int[2]);
        obtain.setLocation(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
        return obtain;
    }

    private m.b b(int i10, MotionEvent motionEvent) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            float[] fArr = new float[2];
            float[] fArr2 = {motionEvent.getX(i11), motionEvent.getY(i11)};
            List b10 = G0.b(fArr2[0], fArr2[1], this.f22282i, fArr);
            int pointerId = motionEvent.getPointerId(i11);
            hashMap.put(Integer.valueOf(pointerId), fArr);
            hashMap2.put(Integer.valueOf(pointerId), b10);
            hashMap3.put(Integer.valueOf(pointerId), fArr2);
            hashMap4.put(Integer.valueOf(pointerId), e(fArr2));
        }
        return new m.b(this.f22279f, i10, this.f22281h, L0.f(this.f22282i), hashMap, hashMap2, hashMap3, hashMap4, this.f22277d);
    }

    private void c(View view, m.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        AbstractC4012a.b(this.f22278e == -1, "Expected to not have already sent a cancel for this gesture");
        List list = (List) bVar.d().get(Integer.valueOf(bVar.b()));
        if (list.isEmpty() || view == null) {
            return;
        }
        if (m(list, n.b.CANCEL, n.b.CANCEL_CAPTURE)) {
            int b10 = ((G0.b) list.get(0)).b();
            int[] h10 = h(view);
            ((EventDispatcher) AbstractC4012a.c(eventDispatcher)).c(com.facebook.react.uimanager.events.m.i("topPointerCancel", b10, n(bVar, h10[0], h10[1]), motionEvent));
        }
        l();
        this.f22279f = -1;
    }

    private static void d(String str, m.b bVar, MotionEvent motionEvent, List list, EventDispatcher eventDispatcher) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eventDispatcher.c(com.facebook.react.uimanager.events.m.i(str, ((G0.b) it.next()).b(), bVar, motionEvent));
        }
    }

    private float[] e(float[] fArr) {
        this.f22282i.getLocationOnScreen(f22273j);
        return new float[]{fArr[0] + r1[0], fArr[1] + r1[1]};
    }

    private static List f(List list, n.b bVar, n.b bVar2, boolean z10) {
        ArrayList arrayList = new ArrayList(list);
        if (z10) {
            return arrayList;
        }
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View a10 = ((G0.b) list.get(size)).a();
            if (!z11 && !com.facebook.react.uimanager.events.n.h(a10, bVar2) && !com.facebook.react.uimanager.events.n.h(a10, bVar)) {
                arrayList.remove(size);
            } else if (!z11 && com.facebook.react.uimanager.events.n.h(a10, bVar2)) {
                z11 = true;
            }
        }
        return arrayList;
    }

    private static List g(List list, List list2) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list2.isEmpty()) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            G0.b bVar = (G0.b) it.next();
            if (hashSet.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private int[] h(View view) {
        Rect rect = new Rect(0, 0, 1, 1);
        this.f22282i.offsetDescendantRectToMyCoords(view, rect);
        return new int[]{rect.top, rect.left};
    }

    private short i() {
        return (short) (65535 & this.f22280g);
    }

    private void j(int i10, m.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int b10 = bVar.b();
        List arrayList = i10 != -1 ? (List) bVar.d().get(Integer.valueOf(b10)) : new ArrayList();
        Map map = this.f22274a;
        List arrayList2 = (map == null || !map.containsKey(Integer.valueOf(b10))) ? new ArrayList() : (List) this.f22274a.get(Integer.valueOf(b10));
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i11 < Math.min(arrayList.size(), arrayList2.size()) && ((G0.b) arrayList.get((arrayList.size() - 1) - i11)).equals(arrayList2.get((arrayList2.size() - 1) - i11))) {
            View a10 = ((G0.b) arrayList.get((arrayList.size() - 1) - i11)).a();
            if (!z10 && com.facebook.react.uimanager.events.n.h(a10, n.b.ENTER_CAPTURE)) {
                z10 = true;
            }
            if (!z11 && com.facebook.react.uimanager.events.n.h(a10, n.b.LEAVE_CAPTURE)) {
                z11 = true;
            }
            i11++;
        }
        if (i11 < Math.max(arrayList.size(), arrayList2.size())) {
            l();
            if (arrayList2.size() > 0) {
                int b11 = ((G0.b) arrayList2.get(0)).b();
                if (m(arrayList2, n.b.OUT, n.b.OUT_CAPTURE)) {
                    eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topPointerOut", b11, bVar, motionEvent));
                }
                List f10 = f(arrayList2.subList(0, arrayList2.size() - i11), n.b.LEAVE, n.b.LEAVE_CAPTURE, z11);
                if (f10.size() > 0) {
                    d("topPointerLeave", bVar, motionEvent, f10, eventDispatcher);
                }
            }
            if (m(arrayList, n.b.OVER, n.b.OVER_CAPTURE)) {
                eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topPointerOver", i10, bVar, motionEvent));
            }
            List f11 = f(arrayList.subList(0, arrayList.size() - i11), n.b.ENTER, n.b.ENTER_CAPTURE, z10);
            if (f11.size() > 0) {
                Collections.reverse(f11);
                d("topPointerEnter", bVar, motionEvent, f11, eventDispatcher);
            }
        }
        HashMap hashMap = new HashMap(bVar.d());
        if (i10 == -1) {
            hashMap.remove(Integer.valueOf(b10));
        }
        this.f22274a = hashMap;
    }

    private void l() {
        this.f22280g = (this.f22280g + 1) % Integer.MAX_VALUE;
    }

    private static boolean m(List list, n.b bVar, n.b bVar2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G0.b bVar3 = (G0.b) it.next();
            if (com.facebook.react.uimanager.events.n.h(bVar3.a(), bVar) || com.facebook.react.uimanager.events.n.h(bVar3.a(), bVar2)) {
                return true;
            }
        }
        return false;
    }

    private m.b n(m.b bVar, float f10, float f11) {
        HashMap hashMap = new HashMap(bVar.h());
        HashMap hashMap2 = new HashMap(bVar.c());
        HashMap hashMap3 = new HashMap(bVar.j());
        float[] fArr = {f10, f11};
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((Map.Entry) it.next()).setValue(fArr);
        }
        float[] fArr2 = {0.0f, 0.0f};
        Iterator it2 = hashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).setValue(fArr2);
        }
        float[] e10 = e(fArr);
        Iterator it3 = hashMap3.entrySet().iterator();
        while (it3.hasNext()) {
            ((Map.Entry) it3.next()).setValue(e10);
        }
        return new m.b(bVar.i(), bVar.b(), bVar.g(), bVar.k(), hashMap, new HashMap(bVar.d()), hashMap2, hashMap3, new HashSet(bVar.f()));
    }

    private void q(int i10, m.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List list = (List) bVar.d().get(Integer.valueOf(bVar.b()));
        l();
        if (!this.f22277d.contains(Integer.valueOf(bVar.b()))) {
            if (m(list, n.b.OVER, n.b.OVER_CAPTURE)) {
                eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topPointerOver", i10, bVar, motionEvent));
            }
            List f10 = f(list, n.b.ENTER, n.b.ENTER_CAPTURE, false);
            Collections.reverse(f10);
            d("topPointerEnter", bVar, motionEvent, f10, eventDispatcher);
        }
        if (m(list, n.b.CLICK, n.b.CLICK_CAPTURE)) {
            this.f22276c.put(Integer.valueOf(bVar.b()), new ArrayList(list));
        }
        if (m(list, n.b.DOWN, n.b.DOWN_CAPTURE)) {
            eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topPointerDown", i10, bVar, motionEvent));
        }
    }

    private void r(int i10, m.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (m((List) bVar.d().get(Integer.valueOf(bVar.b())), n.b.MOVE, n.b.MOVE_CAPTURE)) {
            eventDispatcher.c(com.facebook.react.uimanager.events.m.j("topPointerMove", i10, bVar, motionEvent, i()));
        }
    }

    private void s(int i10, m.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int b10 = bVar.b();
        List list = (List) bVar.d().get(Integer.valueOf(b10));
        if (m(list, n.b.UP, n.b.UP_CAPTURE)) {
            eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topPointerUp", i10, bVar, motionEvent));
        }
        if (!this.f22277d.contains(Integer.valueOf(b10))) {
            if (m(list, n.b.OUT, n.b.OUT_CAPTURE)) {
                eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topPointerOut", i10, bVar, motionEvent));
            }
            d("topPointerLeave", bVar, motionEvent, f(list, n.b.LEAVE, n.b.LEAVE_CAPTURE, false), eventDispatcher);
        }
        List list2 = (List) this.f22276c.remove(Integer.valueOf(b10));
        if (list2 != null && m(list, n.b.CLICK, n.b.CLICK_CAPTURE)) {
            List g10 = g(list2, list);
            if (!g10.isEmpty()) {
                eventDispatcher.c(com.facebook.react.uimanager.events.m.i("topClick", ((G0.b) g10.get(0)).b(), bVar, motionEvent));
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f22279f = -1;
        }
        this.f22277d.remove(Integer.valueOf(b10));
    }

    private static boolean t(float[] fArr, float[] fArr2) {
        return Math.abs(fArr2[0] - fArr[0]) > 0.1f || Math.abs(fArr2[1] - fArr[1]) > 0.1f;
    }

    public void k(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z10) {
        int b10;
        View a10;
        if (this.f22278e != -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (actionMasked == 0) {
            this.f22279f = motionEvent.getPointerId(0);
        } else if (actionMasked == 7) {
            this.f22277d.add(Integer.valueOf(pointerId));
        }
        m.b b11 = b(pointerId, motionEvent);
        boolean z11 = z10 && motionEvent.getActionMasked() == 10;
        if (z11) {
            Map map = this.f22274a;
            List list = map != null ? (List) map.get(Integer.valueOf(b11.b())) : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            G0.b bVar = (G0.b) list.get(list.size() - 1);
            b10 = bVar.b();
            a10 = bVar.a();
            b11.d().put(Integer.valueOf(pointerId), new ArrayList());
        } else {
            List list2 = (List) b11.d().get(Integer.valueOf(pointerId));
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            G0.b bVar2 = (G0.b) list2.get(0);
            b10 = bVar2.b();
            a10 = bVar2.a();
        }
        j(b10, b11, motionEvent, eventDispatcher);
        switch (actionMasked) {
            case 0:
            case 5:
                q(b10, b11, motionEvent, eventDispatcher);
                break;
            case 1:
            case 6:
                l();
                s(b10, b11, motionEvent, eventDispatcher);
                break;
            case 2:
                r(b10, b11, motionEvent, eventDispatcher);
                break;
            case 3:
                c(a10, b11, motionEvent, eventDispatcher);
                j(-1, b11, motionEvent, eventDispatcher);
                break;
            case 4:
            case 8:
            default:
                AbstractC1721a.J("ReactNative", "Motion Event was ignored. Action=" + actionMasked + " Target=" + b10);
                return;
            case 7:
                float[] fArr = (float[]) b11.c().get(Integer.valueOf(pointerId));
                Map map2 = this.f22275b;
                if (t(fArr, (map2 == null || !map2.containsKey(Integer.valueOf(pointerId))) ? new float[]{0.0f, 0.0f} : (float[]) this.f22275b.get(Integer.valueOf(pointerId)))) {
                    r(b10, b11, motionEvent, eventDispatcher);
                    break;
                } else {
                    return;
                }
                break;
            case 9:
                return;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (z11) {
                    r(b10, b11, motionEvent, eventDispatcher);
                    break;
                }
                break;
        }
        this.f22275b = new HashMap(b11.c());
        this.f22281h = motionEvent.getButtonState();
        this.f22277d.retainAll(this.f22275b.keySet());
    }

    public void o() {
        this.f22278e = -1;
    }

    public void p(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f22278e != -1 || view == null) {
            return;
        }
        MotionEvent a10 = a(view, motionEvent);
        a10.setAction(3);
        k(a10, eventDispatcher, false);
        this.f22278e = view.getId();
    }
}
