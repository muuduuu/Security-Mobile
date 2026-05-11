package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public enum Channel {
    PUSH("push", g4.f30601l.toString()),
    SMS("sms", g4.f30602m.toString()),
    EMAIL("email", g4.f30603n.toString()),
    IN_APP("in_app", "opt_in_inapp"),
    WHATSAPP("whatsapp", g4.f30604o.toString()),
    VIBER("viber", g4.f30605p.toString());

    private String channel;
    private String userAttributesKey;

    Channel(String str, String str2) {
        this.channel = str;
        this.userAttributesKey = str2;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUserAttributeKey() {
        return this.userAttributesKey;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.userAttributesKey;
    }
}
