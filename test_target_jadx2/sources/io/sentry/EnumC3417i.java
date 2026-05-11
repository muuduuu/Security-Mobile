package io.sentry;

import co.hyperverge.hypersnapsdk.utils.AppConstants;

/* renamed from: io.sentry.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3417i {
    All("__all__"),
    Default("default"),
    Error(AppConstants.VIDEO_RECORDING_ERROR),
    Session("session"),
    Attachment("attachment"),
    Profile("profile"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC3417i(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
