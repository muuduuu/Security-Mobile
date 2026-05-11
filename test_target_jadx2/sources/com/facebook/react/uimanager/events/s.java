package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import s5.C4313a;

/* loaded from: classes.dex */
public abstract class s {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22411a;

        static {
            int[] iArr = new int[r.values().length];
            f22411a = iArr;
            try {
                iArr[r.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22411a[r.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22411a[r.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22411a[r.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static WritableMap[] a(p pVar) {
        MotionEvent c10 = pVar.c();
        WritableMap[] writableMapArr = new WritableMap[c10.getPointerCount()];
        float x10 = c10.getX() - pVar.e();
        float y10 = c10.getY() - pVar.f();
        for (int i10 = 0; i10 < c10.getPointerCount(); i10++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", C1944g0.e(c10.getX(i10)));
            createMap.putDouble("pageY", C1944g0.e(c10.getY(i10)));
            float x11 = c10.getX(i10) - x10;
            float y11 = c10.getY(i10) - y10;
            createMap.putDouble("locationX", C1944g0.e(x11));
            createMap.putDouble("locationY", C1944g0.e(y11));
            createMap.putInt("targetSurface", pVar.getSurfaceId());
            createMap.putInt("target", pVar.getViewTag());
            createMap.putDouble("timestamp", pVar.getTimestampMs());
            createMap.putDouble("identifier", c10.getPointerId(i10));
            writableMapArr[i10] = createMap;
        }
        return writableMapArr;
    }

    private static WritableArray b(boolean z10, WritableMap... writableMapArr) {
        WritableArray createArray = Arguments.createArray();
        for (WritableMap writableMap : writableMapArr) {
            if (writableMap != null) {
                if (z10) {
                    writableMap = writableMap.copy();
                }
                createArray.pushMap(writableMap);
            }
        }
        return createArray;
    }

    static void c(RCTModernEventEmitter rCTModernEventEmitter, p pVar) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        C4313a.c(0L, "TouchesHelper.sentTouchEventModern(" + pVar.getEventName() + ")");
        try {
            r d10 = pVar.d();
            MotionEvent c10 = pVar.c();
            if (c10 == null) {
                ReactSoftExceptionLogger.logSoftException("TouchesHelper", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
                return;
            }
            WritableMap[] a10 = a(pVar);
            int i10 = a.f22411a[d10.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    int actionIndex = c10.getActionIndex();
                    WritableMap writableMap = a10[actionIndex];
                    a10[actionIndex] = null;
                    writableMapArr2 = new WritableMap[]{writableMap};
                } else if (i10 == 3) {
                    writableMapArr2 = new WritableMap[a10.length];
                    for (int i11 = 0; i11 < a10.length; i11++) {
                        writableMapArr2[i11] = a10[i11].copy();
                    }
                } else if (i10 != 4) {
                    writableMapArr = a10;
                    a10 = null;
                } else {
                    writableMapArr = new WritableMap[0];
                }
                a10 = writableMapArr2;
                writableMapArr = a10;
            } else {
                writableMapArr = a10;
                a10 = new WritableMap[]{a10[c10.getActionIndex()].copy()};
            }
            if (a10 != null) {
                for (WritableMap writableMap2 : a10) {
                    WritableMap copy = writableMap2.copy();
                    WritableArray b10 = b(true, a10);
                    WritableArray b11 = b(true, writableMapArr);
                    copy.putArray("changedTouches", b10);
                    copy.putArray("touches", b11);
                    rCTModernEventEmitter.receiveEvent(pVar.getSurfaceId(), pVar.getViewTag(), pVar.getEventName(), pVar.canCoalesce(), 0, copy, pVar.getEventCategory());
                }
            }
        } finally {
            C4313a.i(0L);
        }
    }

    static void d(RCTEventEmitter rCTEventEmitter, p pVar) {
        r d10 = pVar.d();
        WritableArray b10 = b(false, a(pVar));
        MotionEvent c10 = pVar.c();
        WritableArray createArray = Arguments.createArray();
        if (d10 == r.MOVE || d10 == r.CANCEL) {
            for (int i10 = 0; i10 < c10.getPointerCount(); i10++) {
                createArray.pushInt(i10);
            }
        } else {
            if (d10 != r.START && d10 != r.END) {
                throw new RuntimeException("Unknown touch type: " + d10);
            }
            createArray.pushInt(c10.getActionIndex());
        }
        rCTEventEmitter.receiveTouches(r.getJSEventName(d10), b10, createArray);
    }
}
