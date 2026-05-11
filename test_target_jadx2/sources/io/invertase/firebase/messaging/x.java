package io.invertase.firebase.messaging;

import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x implements v {

    /* renamed from: a, reason: collision with root package name */
    private final String f34399a = ",";

    private List d(String str) {
        return new ArrayList(Arrays.asList(str.split(",")));
    }

    private String e(String str, String str2) {
        return str2.replace(str + ",", BuildConfig.FLAVOR);
    }

    @Override // io.invertase.firebase.messaging.v
    public WritableMap a(String str) {
        String c10 = Zb.o.b().c(str, null);
        if (c10 != null) {
            try {
                WritableMap b10 = a.b(new JSONObject(c10));
                b10.putString("to", str);
                return b10;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.v
    public void b(String str) {
        Zb.o b10 = Zb.o.b();
        b10.d(str).apply();
        String c10 = b10.c("all_notification_ids", BuildConfig.FLAVOR);
        if (c10.isEmpty()) {
            return;
        }
        b10.e("all_notification_ids", e(str, c10));
    }

    @Override // io.invertase.firebase.messaging.v
    public void c(W w10) {
        try {
            String jSONObject = a.d(u.i(w10)).toString();
            Zb.o b10 = Zb.o.b();
            List d10 = d(b10.c("all_notification_ids", BuildConfig.FLAVOR));
            while (d10.size() > 99) {
                b((String) d10.get(0));
                d10.remove(0);
            }
            String c10 = b10.c("all_notification_ids", BuildConfig.FLAVOR);
            b10.e(w10.I(), jSONObject);
            b10.e("all_notification_ids", c10 + w10.I() + ",");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
