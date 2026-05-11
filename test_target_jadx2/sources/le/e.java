package le;

import Td.v;
import Wd.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f37213g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37214a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f37215b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37216c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f37217d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37218e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37219f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(v responseHeaders) {
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer num = null;
            boolean z11 = false;
            Integer num2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.r(responseHeaders.h(i10), "Sec-WebSocket-Extensions", true)) {
                    String v10 = responseHeaders.v(i10);
                    int i11 = 0;
                    while (i11 < v10.length()) {
                        int l10 = m.l(v10, ',', i11, 0, 4, null);
                        int j10 = m.j(v10, ';', i11, l10);
                        String I10 = m.I(v10, i11, j10);
                        int i12 = j10 + 1;
                        if (StringsKt.r(I10, "permessage-deflate", true)) {
                            if (z10) {
                                z13 = true;
                            }
                            i11 = i12;
                            while (i11 < l10) {
                                int j11 = m.j(v10, ';', i11, l10);
                                int j12 = m.j(v10, '=', i11, j11);
                                String I11 = m.I(v10, i11, j12);
                                String q02 = j12 < j11 ? StringsKt.q0(m.I(v10, j12 + 1, j11), "\"") : null;
                                i11 = j11 + 1;
                                if (StringsKt.r(I11, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z13 = true;
                                    }
                                    num = q02 != null ? StringsKt.toIntOrNull(q02) : null;
                                    if (num == null) {
                                        z13 = true;
                                    }
                                } else if (StringsKt.r(I11, "client_no_context_takeover", true)) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (q02 != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else if (StringsKt.r(I11, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z13 = true;
                                    }
                                    num2 = q02 != null ? StringsKt.toIntOrNull(q02) : null;
                                    if (num2 == null) {
                                        z13 = true;
                                    }
                                } else if (StringsKt.r(I11, "server_no_context_takeover", true)) {
                                    if (z12) {
                                        z13 = true;
                                    }
                                    if (q02 != null) {
                                        z13 = true;
                                    }
                                    z12 = true;
                                } else {
                                    z13 = true;
                                }
                            }
                            z10 = true;
                        } else {
                            i11 = i12;
                            z13 = true;
                        }
                    }
                }
            }
            return new e(z10, num, z11, num2, z12, z13);
        }

        private a() {
        }
    }

    public e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f37214a = z10;
        this.f37215b = num;
        this.f37216c = z11;
        this.f37217d = num2;
        this.f37218e = z12;
        this.f37219f = z13;
    }

    public final boolean a(boolean z10) {
        return z10 ? this.f37216c : this.f37218e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37214a == eVar.f37214a && Intrinsics.b(this.f37215b, eVar.f37215b) && this.f37216c == eVar.f37216c && Intrinsics.b(this.f37217d, eVar.f37217d) && this.f37218e == eVar.f37218e && this.f37219f == eVar.f37219f;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f37214a) * 31;
        Integer num = this.f37215b;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f37216c)) * 31;
        Integer num2 = this.f37217d;
        return ((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f37218e)) * 31) + Boolean.hashCode(this.f37219f);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f37214a + ", clientMaxWindowBits=" + this.f37215b + ", clientNoContextTakeover=" + this.f37216c + ", serverMaxWindowBits=" + this.f37217d + ", serverNoContextTakeover=" + this.f37218e + ", unknownValues=" + this.f37219f + ')';
    }
}
