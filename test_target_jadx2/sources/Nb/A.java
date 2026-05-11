package Nb;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class A extends CodedException {
    public A() {
        super("Permissions module is null. Are you sure all the installed Expo modules are properly linked?", null, 2, null);
    }
}
