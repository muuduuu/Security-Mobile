package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public class T {

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f22287e;

    /* renamed from: a, reason: collision with root package name */
    private int f22283a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f22284b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    private boolean f22285c = false;

    /* renamed from: d, reason: collision with root package name */
    private long f22286d = Long.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    private final com.facebook.react.uimanager.events.q f22288f = new com.facebook.react.uimanager.events.q();

    public T(ViewGroup viewGroup) {
        this.f22287e = viewGroup;
    }

    private void a(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f22283a == -1) {
            AbstractC1721a.J("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        AbstractC4012a.b(!this.f22285c, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) AbstractC4012a.c(eventDispatcher);
        int f10 = L0.f(this.f22287e);
        int i10 = this.f22283a;
        com.facebook.react.uimanager.events.r rVar = com.facebook.react.uimanager.events.r.CANCEL;
        long j10 = this.f22286d;
        float[] fArr = this.f22284b;
        eventDispatcher2.c(com.facebook.react.uimanager.events.p.h(f10, i10, rVar, motionEvent, j10, fArr[0], fArr[1], this.f22288f));
    }

    private int b(MotionEvent motionEvent) {
        return G0.c(motionEvent.getX(), motionEvent.getY(), this.f22287e, this.f22284b, null);
    }

    private void e(int i10, int i11, ReactContext reactContext) {
        UIManager g10;
        if (!G4.a.e() || reactContext == null || (g10 = L0.g(reactContext, 2)) == null) {
            return;
        }
        g10.markActiveTouchForTag(i10, i11);
    }

    private void h(int i10, int i11, ReactContext reactContext) {
        UIManager g10;
        if (!G4.a.e() || reactContext == null || (g10 = L0.g(reactContext, 2)) == null) {
            return;
        }
        g10.sweepActiveTouchForTag(i10, i11);
    }

    public void c(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        d(motionEvent, eventDispatcher, null);
    }

    public void d(MotionEvent motionEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f22283a != -1) {
                AbstractC1721a.m("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f22285c = false;
            this.f22286d = motionEvent.getEventTime();
            this.f22283a = b(motionEvent);
            e(L0.f(this.f22287e), this.f22283a, reactContext);
            int f10 = L0.f(this.f22287e);
            int i10 = this.f22283a;
            com.facebook.react.uimanager.events.r rVar = com.facebook.react.uimanager.events.r.START;
            long j10 = this.f22286d;
            float[] fArr = this.f22284b;
            eventDispatcher.c(com.facebook.react.uimanager.events.p.h(f10, i10, rVar, motionEvent, j10, fArr[0], fArr[1], this.f22288f));
            return;
        }
        if (this.f22285c) {
            return;
        }
        if (this.f22283a == -1) {
            AbstractC1721a.m("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            b(motionEvent);
            int f11 = L0.f(this.f22287e);
            int i11 = this.f22283a;
            com.facebook.react.uimanager.events.r rVar2 = com.facebook.react.uimanager.events.r.END;
            long j11 = this.f22286d;
            float[] fArr2 = this.f22284b;
            eventDispatcher.c(com.facebook.react.uimanager.events.p.h(f11, i11, rVar2, motionEvent, j11, fArr2[0], fArr2[1], this.f22288f));
            h(f11, this.f22283a, reactContext);
            this.f22283a = -1;
            this.f22286d = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            b(motionEvent);
            int f12 = L0.f(this.f22287e);
            int i12 = this.f22283a;
            com.facebook.react.uimanager.events.r rVar3 = com.facebook.react.uimanager.events.r.MOVE;
            long j12 = this.f22286d;
            float[] fArr3 = this.f22284b;
            eventDispatcher.c(com.facebook.react.uimanager.events.p.h(f12, i12, rVar3, motionEvent, j12, fArr3[0], fArr3[1], this.f22288f));
            return;
        }
        if (action == 5) {
            int f13 = L0.f(this.f22287e);
            int i13 = this.f22283a;
            com.facebook.react.uimanager.events.r rVar4 = com.facebook.react.uimanager.events.r.START;
            long j13 = this.f22286d;
            float[] fArr4 = this.f22284b;
            eventDispatcher.c(com.facebook.react.uimanager.events.p.h(f13, i13, rVar4, motionEvent, j13, fArr4[0], fArr4[1], this.f22288f));
            return;
        }
        if (action == 6) {
            int f14 = L0.f(this.f22287e);
            int i14 = this.f22283a;
            com.facebook.react.uimanager.events.r rVar5 = com.facebook.react.uimanager.events.r.END;
            long j14 = this.f22286d;
            float[] fArr5 = this.f22284b;
            eventDispatcher.c(com.facebook.react.uimanager.events.p.h(f14, i14, rVar5, motionEvent, j14, fArr5[0], fArr5[1], this.f22288f));
            return;
        }
        if (action == 3) {
            if (this.f22288f.c(motionEvent.getDownTime())) {
                a(motionEvent, eventDispatcher);
            } else {
                AbstractC1721a.m("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            h(L0.f(this.f22287e), this.f22283a, reactContext);
            this.f22283a = -1;
            this.f22286d = Long.MIN_VALUE;
            return;
        }
        AbstractC1721a.J("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f22283a);
    }

    public void f(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        this.f22285c = false;
    }

    public void g(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f22285c) {
            return;
        }
        a(motionEvent, eventDispatcher);
        this.f22285c = true;
        this.f22283a = -1;
    }
}
