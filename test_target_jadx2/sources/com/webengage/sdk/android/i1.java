package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public class i1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final a f30643a;

    public enum a {
        FOUND_SEMICOLON_WHEN_READING_PROPERTY_NAME,
        FOUND_END_BRACKET_BEFORE_SEMICOLON,
        FOUND_COLON_WHEN_READING_SELECTOR_NAME,
        FOUND_COLON_WHILE_READING_VALUE
    }

    i1(a aVar, String str) {
        super(str + " Line number " + w.f31080i + ".");
        this.f30643a = aVar;
    }
}
