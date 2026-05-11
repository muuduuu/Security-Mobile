package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class v extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f36564a;

    public v(p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f36564a = null;
    }

    public k a() {
        return new k(getMessage());
    }
}
