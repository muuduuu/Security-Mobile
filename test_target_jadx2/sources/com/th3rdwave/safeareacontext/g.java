package com.th3rdwave.safeareacontext;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f fVar, a aVar, c cVar) {
        Context context = fVar.getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = fVar.getId();
        EventDispatcher c10 = L0.c(reactContext, id2);
        if (c10 != null) {
            c10.c(new b(r.b(reactContext), id2, aVar, cVar));
        }
    }
}
