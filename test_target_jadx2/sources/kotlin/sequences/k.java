package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k {

    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f36773a;

        public a(Function2 function2) {
            this.f36773a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return k.a(this.f36773a);
        }
    }

    public static final Iterator a(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        h hVar = new h();
        hVar.j(AbstractC3868b.a(block, hVar, hVar));
        return hVar;
    }

    public static Sequence b(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(block);
    }
}
