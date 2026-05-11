package io.sentry;

import java.util.Locale;

/* renamed from: io.sentry.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3430m0 {

    /* renamed from: io.sentry.m0$a */
    public enum a implements InterfaceC3430m0 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.InterfaceC3430m0
        public /* bridge */ /* synthetic */ String apiName() {
            return super.apiName();
        }
    }

    default String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    String name();
}
