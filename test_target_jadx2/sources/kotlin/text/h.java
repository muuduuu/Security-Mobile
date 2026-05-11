package kotlin.text;

import java.util.regex.Matcher;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new g(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new g(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange g(java.util.regex.MatchResult matchResult) {
        return kotlin.ranges.d.p(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange h(java.util.regex.MatchResult matchResult, int i10) {
        return kotlin.ranges.d.p(matchResult.start(i10), matchResult.end(i10));
    }
}
