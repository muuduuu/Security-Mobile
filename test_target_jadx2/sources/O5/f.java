package o5;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends ClickableSpan implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f37943a;

    public f(int i10) {
        this.f37943a = i10;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher c10 = L0.c(reactContext, this.f37943a);
        if (c10 != null) {
            c10.c(new com.facebook.react.views.view.l(L0.e(reactContext), this.f37943a));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
    }
}
