package io.sentry;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum J1 implements InterfaceC3421j0 {
    Session("session"),
    Event(Keys.EVENT),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    CheckIn("check_in"),
    Unknown("__unknown__");

    private final String itemType;

    static final class a implements Z {
        a() {
        }

        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public J1 a(C3409f0 c3409f0, ILogger iLogger) {
            return J1.valueOfLabel(c3409f0.x().toLowerCase(Locale.ROOT));
        }
    }

    J1(String str) {
        this.itemType = str;
    }

    public static J1 resolve(Object obj) {
        return obj instanceof A1 ? Event : obj instanceof io.sentry.protocol.y ? Transaction : obj instanceof Z1 ? Session : obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static J1 valueOfLabel(String str) {
        for (J1 j12 : values()) {
            if (j12.itemType.equals(str)) {
                return j12;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.b(this.itemType);
    }
}
