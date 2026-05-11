package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import v4.AbstractC4929e;

/* renamed from: com.facebook.react.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1994w {

    /* renamed from: c, reason: collision with root package name */
    private static final Map f22999c = AbstractC4929e.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(86, "stop").b(87, "next").b(88, "previous").b(19, "up").b(22, "right").b(20, "down").b(21, "left").b(165, "info").b(82, "menu").a();

    /* renamed from: a, reason: collision with root package name */
    private int f23000a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final Z f23001b;

    C1994w(Z z10) {
        this.f23001b = z10;
    }

    private void b(String str, int i10) {
        c(str, i10, -1);
    }

    private void c(String str, int i10, int i11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i11);
        if (i10 != -1) {
            writableNativeMap.putInt("tag", i10);
        }
        this.f23001b.r("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i10 = this.f23000a;
        if (i10 != -1) {
            b("blur", i10);
        }
        this.f23000a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map map = f22999c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c((String) map.get(Integer.valueOf(keyCode)), this.f23000a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f23000a == view.getId()) {
            return;
        }
        int i10 = this.f23000a;
        if (i10 != -1) {
            b("blur", i10);
        }
        this.f23000a = view.getId();
        b("focus", view.getId());
    }
}
