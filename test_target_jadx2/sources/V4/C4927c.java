package v4;

import android.net.Uri;
import c3.AbstractC1721a;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4927c extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public static final a f43921b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f43922c = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";

    /* renamed from: a, reason: collision with root package name */
    private final String f43923a;

    /* renamed from: v4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String str) {
            List j10;
            List f10 = new Regex("/").f(str, 0);
            if (!f10.isEmpty()) {
                ListIterator listIterator = f10.listIterator(f10.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        j10 = CollectionsKt.G0(f10, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            j10 = CollectionsKt.j();
            return (String) AbstractC3574i.T((String[]) j10.toArray(new String[0]));
        }

        public final C4927c a(String url, String reason, String extra, Throwable th) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(extra, "extra");
            return new C4927c(reason + StringsKt.z(C4927c.f43922c, "<PORT>", String.valueOf(Uri.parse(url).getPort()), false, 4, null) + extra, th);
        }

        public final C4927c b(String url, String reason, Throwable th) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return a(url, reason, BuildConfig.FLAVOR, th);
        }

        public final C4927c c(String str, String str2) {
            if (str2 != null && str2.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString("message");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Intrinsics.d(string);
                    return new C4927c(string2, d(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), null);
                } catch (JSONException e10) {
                    AbstractC1721a.K("ReactNative", "Could not parse DebugServerException from: " + str2, e10);
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ C4927c(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11);
    }

    public static final C4927c b(String str, String str2, String str3, Throwable th) {
        return f43921b.a(str, str2, str3, th);
    }

    public static final C4927c c(String str, String str2, Throwable th) {
        return f43921b.b(str, str2, th);
    }

    public static final C4927c d(String str, String str2) {
        return f43921b.c(str, str2);
    }

    private C4927c(String str, String str2, int i10, int i11) {
        super(str + "\n  at " + str2 + ":" + i10 + ":" + i11);
        this.f43923a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4927c(String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
        this.f43923a = description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4927c(String detailMessage, Throwable th) {
        super(detailMessage, th);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.f43923a = detailMessage;
    }
}
