package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/text/MatchResult;", BuildConfig.FLAVOR, "Lkotlin/ranges/IntRange;", "d", "()Lkotlin/ranges/IntRange;", "range", "Lkotlin/text/f;", "c", "()Lkotlin/text/f;", "groups", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$b;", C4870a.f43493a, "()Lkotlin/text/MatchResult$b;", "destructured", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MatchResult {

    public static final class a {
        public static b a(MatchResult matchResult) {
            return new b(matchResult);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MatchResult f36802a;

        public b(MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.f36802a = match;
        }

        public final MatchResult a() {
            return this.f36802a;
        }
    }

    b a();

    List b();

    f c();

    IntRange d();
}
