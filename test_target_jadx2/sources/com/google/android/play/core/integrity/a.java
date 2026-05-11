package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import d8.AbstractC2999a;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a extends S6.b {

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f27825b;

    a(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), AbstractC2999a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f27825b = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f27825b;
    }
}
