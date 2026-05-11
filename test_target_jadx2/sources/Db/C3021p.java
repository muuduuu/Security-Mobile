package db;

import expo.modules.imagepicker.ImagePickerOptions;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3021p {

    /* renamed from: a, reason: collision with root package name */
    private final List f31432a;

    /* renamed from: b, reason: collision with root package name */
    private final ImagePickerOptions f31433b;

    public C3021p(List data, ImagePickerOptions options) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f31432a = data;
        this.f31433b = options;
    }

    public final List a() {
        return this.f31432a;
    }

    public final ImagePickerOptions b() {
        return this.f31433b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3021p)) {
            return false;
        }
        C3021p c3021p = (C3021p) obj;
        return Intrinsics.b(this.f31432a, c3021p.f31432a) && Intrinsics.b(this.f31433b, c3021p.f31433b);
    }

    public int hashCode() {
        return (this.f31432a.hashCode() * 31) + this.f31433b.hashCode();
    }

    public String toString() {
        return "PendingMediaPickingResult(data=" + this.f31432a + ", options=" + this.f31433b + ")";
    }
}
