package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class l0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f16418a;

    public l0(P p10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f16418a = null;
    }

    public C1558z a() {
        return new C1558z(getMessage());
    }
}
