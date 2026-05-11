package be;

import Td.C;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19074d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C f19075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19077c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String statusLine) {
            C c10;
            int i10;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.F(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    c10 = C.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    c10 = C.HTTP_1_1;
                }
            } else if (StringsKt.F(statusLine, "ICY ", false, 2, null)) {
                c10 = C.HTTP_1_0;
                i10 = 4;
            } else {
                if (!StringsKt.F(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                c10 = C.HTTP_1_1;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String substring = statusLine.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Integer intOrNull = StringsKt.toIntOrNull(substring);
            if (intOrNull == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int intValue = intOrNull.intValue();
            if (statusLine.length() <= i11) {
                str = BuildConfig.FLAVOR;
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                str = statusLine.substring(i10 + 4);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            return new k(c10, intValue, str);
        }

        private a() {
        }
    }

    public k(C protocol, int i10, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f19075a = protocol;
        this.f19076b = i10;
        this.f19077c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f19075a == C.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f19076b);
        sb2.append(' ');
        sb2.append(this.f19077c);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
