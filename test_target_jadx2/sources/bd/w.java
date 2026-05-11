package bd;

import gd.AbstractC3218a;
import hd.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19048b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f19049a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new w(name + '#' + desc, null);
        }

        public final w b(hd.d signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof d.b) {
                return d(signature.c(), signature.b());
            }
            if (signature instanceof d.a) {
                return a(signature.c(), signature.b());
            }
            throw new lc.m();
        }

        public final w c(fd.c nameResolver, AbstractC3218a.c signature) {
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(signature, "signature");
            return d(nameResolver.getString(signature.u()), nameResolver.getString(signature.t()));
        }

        public final w d(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new w(name + desc, null);
        }

        public final w e(w signature, int i10) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new w(signature.a() + '@' + i10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ w(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f19049a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.b(this.f19049a, ((w) obj).f19049a);
    }

    public int hashCode() {
        return this.f19049a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f19049a + ')';
    }

    private w(String str) {
        this.f19049a = str;
    }
}
