package Hb;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public abstract class b {
    public static final byte[] a(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public static final UUID b(UUID namespace, String name) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(a(namespace));
        byte[] bytes = name.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        digest[6] = (byte) ((digest[6] & 15) | 80);
        digest[8] = (byte) ((digest[8] & 63) | 128);
        ByteBuffer wrap = ByteBuffer.wrap(digest);
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
