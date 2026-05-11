package Ua;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class c extends CodedException {
    public c(String str) {
        super("Cannot decode provided blurhash '" + str + "'", null, 2, null);
    }
}
