package Sc;

import id.C3367b;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface p {
    Zc.g a(a aVar);

    Set b(id.c cVar);

    Zc.u c(id.c cVar, boolean z10);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3367b f9045a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f9046b;

        /* renamed from: c, reason: collision with root package name */
        private final Zc.g f9047c;

        public a(C3367b classId, byte[] bArr, Zc.g gVar) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f9045a = classId;
            this.f9046b = bArr;
            this.f9047c = gVar;
        }

        public final C3367b a() {
            return this.f9045a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f9045a, aVar.f9045a) && Intrinsics.b(this.f9046b, aVar.f9046b) && Intrinsics.b(this.f9047c, aVar.f9047c);
        }

        public int hashCode() {
            int hashCode = this.f9045a.hashCode() * 31;
            byte[] bArr = this.f9046b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            Zc.g gVar = this.f9047c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f9045a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f9046b) + ", outerClass=" + this.f9047c + ')';
        }

        public /* synthetic */ a(C3367b c3367b, byte[] bArr, Zc.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c3367b, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
