package he;

import Td.B;
import android.util.Log;
import de.C3049f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f34086a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f34087b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f34088c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = B.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = B.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C3049f.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = Zd.d.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f34088c = G.t(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f34087b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f34089a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f34088c.get(str);
        return str2 == null ? StringsKt.W0(str, 23) : str2;
    }

    public final void a(String loggerName, int i10, String message, Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String d10 = d(loggerName);
        if (Log.isLoggable(d10, i10)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int W10 = StringsKt.W(message, '\n', i11, false, 4, null);
                if (W10 == -1) {
                    W10 = length;
                }
                while (true) {
                    min = Math.min(W10, i11 + 4000);
                    String substring = message.substring(i11, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Log.println(i10, d10, substring);
                    if (min >= W10) {
                        break;
                    } else {
                        i11 = min;
                    }
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f34088c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
