package A9;

import kotlin.coroutines.d;
import v9.EnumC4972a;
import v9.g;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: A9.a$a, reason: collision with other inner class name */
    public static final class C0005a {
        public static /* synthetic */ Object a(a aVar, String str, byte[] bArr, g gVar, EnumC4972a enumC4972a, Long l10, boolean z10, d dVar, int i10, Object obj) {
            if (obj == null) {
                return aVar.a(str, bArr, gVar, enumC4972a, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? false : z10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
        }
    }

    Object a(String str, byte[] bArr, g gVar, EnumC4972a enumC4972a, Long l10, boolean z10, d dVar);

    boolean b(String str);

    boolean c(String str);
}
