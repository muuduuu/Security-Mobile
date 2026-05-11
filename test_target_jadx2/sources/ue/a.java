package ue;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f43765a = StandardCharsets.ISO_8859_1;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f43766b = StandardCharsets.US_ASCII;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f43767c = StandardCharsets.UTF_16;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f43768d = StandardCharsets.UTF_16BE;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f43769e = StandardCharsets.UTF_16LE;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f43770f = StandardCharsets.UTF_8;

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
