package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Field f28449a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f28449a = field;
    }

    public String toString() {
        return this.f28449a.toString();
    }
}
