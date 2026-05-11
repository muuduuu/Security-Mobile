package bb;

import expo.modules.kotlin.exception.CodedException;

/* renamed from: bb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1667b extends CodedException {
    public C1667b(String str, Exception exc) {
        super("Cannot decode provided thumbhash '" + str + "' " + exc, null, 2, null);
    }
}
