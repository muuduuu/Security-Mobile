package com.facebook.react.bridge;

import c3.AbstractC1721a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e10) {
                AbstractC1721a.n("ReactCxxErrorHandler", "Failed to invoke error handler function", e10);
            }
        }
    }

    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
