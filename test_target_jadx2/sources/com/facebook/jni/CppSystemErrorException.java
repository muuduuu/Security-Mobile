package com.facebook.jni;

/* loaded from: classes.dex */
public class CppSystemErrorException extends CppException {
    int errorCode;

    public CppSystemErrorException(String str, int i10) {
        super(str);
        this.errorCode = i10;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
