package expo.modules.clipboard;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lexpo/modules/clipboard/SetStringOptions;", "LAb/c;", "<init>", "()V", "Lexpo/modules/clipboard/StringFormat;", "inputFormat", "Lexpo/modules/clipboard/StringFormat;", "getInputFormat", "()Lexpo/modules/clipboard/StringFormat;", "setInputFormat", "(Lexpo/modules/clipboard/StringFormat;)V", "getInputFormat$annotations", "expo-clipboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetStringOptions implements c {
    private StringFormat inputFormat = StringFormat.PLAIN;

    @b
    public static /* synthetic */ void getInputFormat$annotations() {
    }

    public final StringFormat getInputFormat() {
        return this.inputFormat;
    }

    public final void setInputFormat(StringFormat stringFormat) {
        Intrinsics.checkNotNullParameter(stringFormat, "<set-?>");
        this.inputFormat = stringFormat;
    }
}
