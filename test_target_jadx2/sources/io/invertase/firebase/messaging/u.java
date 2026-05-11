package io.invertase.firebase.messaging;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class u {
    public static Zb.b a(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        createMap.putMap(AppConstants.VIDEO_RECORDING_ERROR, Zb.m.b(exc));
        return new Zb.b("messaging_message_send_error", createMap);
    }

    public static Zb.b b(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        return new Zb.b("messaging_message_sent", createMap);
    }

    public static Zb.b c() {
        return new Zb.b("messaging_message_deleted", Arguments.createMap());
    }

    public static Zb.b d(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("token", str);
        return new Zb.b("messaging_token_refresh", createMap);
    }

    static W e(ReadableMap readableMap) {
        W.b bVar = new W.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.f(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.d(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.e(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.c(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey("data")) {
            ReadableMap map = readableMap.getMap("data");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                bVar.a(nextKey, map.getString(nextKey));
            }
        }
        return bVar.b();
    }

    public static Zb.b f(WritableMap writableMap, Boolean bool) {
        return new Zb.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", writableMap);
    }

    static WritableMap g(W.c cVar) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (cVar.o() != null) {
            createMap.putString("title", cVar.o());
        }
        if (cVar.q() != null) {
            createMap.putString("titleLocKey", cVar.q());
        }
        if (cVar.p() != null) {
            createMap.putArray("titleLocArgs", Arguments.fromJavaArgs(cVar.p()));
        }
        if (cVar.a() != null) {
            createMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            createMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            createMap.putArray("bodyLocArgs", Arguments.fromJavaArgs(cVar.b()));
        }
        if (cVar.d() != null) {
            createMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            createMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            createMap2.putString("color", cVar.f());
        }
        if (cVar.g() != null) {
            createMap2.putString("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            createMap2.putString("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            createMap2.putString("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            createMap2.putInt("count", cVar.k().intValue());
        }
        if (cVar.l() != null) {
            createMap2.putInt("priority", cVar.l().intValue());
        }
        if (cVar.m() != null) {
            createMap2.putString("sound", cVar.m());
        }
        if (cVar.n() != null) {
            createMap2.putString("ticker", cVar.n());
        }
        if (cVar.r() != null) {
            createMap2.putInt("visibility", cVar.r().intValue());
        }
        createMap.putMap("android", createMap2);
        return createMap;
    }

    public static Zb.b h(W w10, Boolean bool) {
        return new Zb.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", i(w10));
    }

    static WritableMap i(W w10) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (w10.j() != null) {
            createMap.putString("collapseKey", w10.j());
        }
        if (w10.F() != null) {
            createMap.putString("from", w10.F());
        }
        if (w10.o1() != null) {
            createMap.putString("to", w10.o1());
        }
        if (w10.I() != null) {
            createMap.putString("messageId", w10.I());
        }
        if (w10.Z0() != null) {
            createMap.putString("messageType", w10.Z0());
        }
        if (w10.u().size() > 0) {
            for (Map.Entry entry : w10.u().entrySet()) {
                createMap2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        createMap.putMap("data", createMap2);
        createMap.putDouble("ttl", w10.t1());
        createMap.putDouble("sentTime", w10.m1());
        createMap.putInt("priority", w10.i1());
        createMap.putInt("originalPriority", w10.g1());
        if (w10.a1() != null) {
            createMap.putMap("notification", g(w10.a1()));
        }
        return createMap;
    }
}
