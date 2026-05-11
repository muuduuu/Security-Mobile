package M0;

import I0.C0844j;
import I0.E;
import I0.InterfaceC0843i;
import I0.o;
import Jd.N;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5967a = new e();

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f5968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f5968a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f5968a.invoke();
            if (Intrinsics.b(kotlin.io.j.u(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final InterfaceC0843i a(E storage, J0.b bVar, List migrations, N scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(C0844j.f4049a.a(storage, bVar, migrations, scope));
    }

    public final InterfaceC0843i b(J0.b bVar, List migrations, N scope, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new d(a(new o(h.f5970a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}
